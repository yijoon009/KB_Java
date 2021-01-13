
--===============================
create table emp_copy
as
select * from emp;  --물리적 테이블

create view emp_view30
as
--dempno가 30인 사원의 사번, 이름, 부서번호

select empno, ename, deptno from emp where deptno=30;

select * from emp_view30;

create view course_view_20 (cou_id, cou_name)
as
select cou_id, cou_name from course where cou_id = 20;

select * from course_view_20;

desc user_views;

select view_name, text from user_views;

--뷰의 동작 순서
--1. 사람 쿼리 수행 : select * from course_view_20;
--2. 뷰의 text컬럼 안에 자료인 select문을 수행
--3. 물리적인 데이터 조회
--4. 물리적인 데이터 조회에 의한 결과 수행
--5. 1로 결과를 리턴함

--뷰를 사용하는 이유
--1. 긴 쿼리문, 많이쓰는 쿼리문을 뷰로 만들기
--2. 보안에 유리

--뷰를 만드는 방법
--1. select문
--2. insert문으로 뷰 안에 데이터 추가

select * from emp_view30;
insert into emp_view30 values(1111,'aaaa',30);
--물리적 데이터는? 추가되었음.
select * from emp;
--view로 데이터 수정하기
--aaaa인 사람의 sal 500 넣기
update emp_view30 set deptno = 40 where ename = 'aaaa';
--aaaa인 사람 삭제
delete from emp_view30 where empno = 1111;

create view emp_view_dept
as
select e.empno, e.ename, e.sal, e.deptno, d.dname, d.loc from emp_copy e, dept d
where e.deptno = d.deptno;

select * from emp_view_dept;

--view 테이블에서 text내용 보기
desc user_views;
select * from user_views where view_name = 'EMP_VIEW_DEPT';

create view emp_view
as
select empno, ename, job, mgr, hiredate, deptno from emp;

--현재 데이터베이스에서 모든 뷰 보기
select * from user_views;

--뷰를 삭제
drop view course_view_20;

create or replace view emp_view30
as
select empno, ename, sal, comm, deptno from emp_copy where deptno=30;

--뷰의 구조 보기
desc emp_view30;

-- FORCE 기존테이블이 없어도 뷰를 만들 때 거의 사용하지 않는다. 
-- NOFORCE 물리적테이블이 있어야 뷰를 만드는 것 default 입니다.
--없는 테이블
desc emplyees

CREATE OR REPLACE FORCE view employees_view
as
SELECT empno, ename, deptno from employees where deptno=30;

select * from user_views;
select * from employees_view;

CREATE OR REPLACE NOFORCE view emp_view
as
SELECT empno, ename, deptno from emp where deptno=30;

create or replace view view_member_a1234
as
select no, name, passwd, id from member where passwd = 'a1234';


--인라인 뷰로 입사일이 빠른 사람 5명만 출력하기
--원래는 from 뒤를 view로 만들어야 하는데 귀찮잖아 ㅎㅎ,,,
select rownum, we.empno, we.ename, we.hiredate
    from (select empno, ename, hiredate from emp order by hiredate ) we
    where rownum <=5;


--1번 사원 테이블을 기본 테이블로 하여 부서별 최대 급여와 최소급여을 출력하는 뷰를 SAL_VIEW란 이름으로 작성하시오
create or replace view sal_view
as
select d.dname, max(e.sal) as max_sal, min(e.sal) as min_sal
from emp e, dept d
where e.deptno = d.deptno group by d.dname;

--2. 인라인 뷰를 사용하여 급여를 많이 받는 순서대로 3명만 출력하시오
select rownum as ranking, empno, ename, sal
from
(select empno, ename, sal from emp_copy where sal is not null order by sal desc)
where rownum <=3;

--3. professor테이블과 department테이블을 조인하여 교수번호와 교수이름, 소속 학과이름을 조회하는 view를 생성하시오. view 이름은 v_prof_dept2로 하세요
create or replace view v_prof_dept2
as
select p.profno, p.name, d.dname from professor p, department d where p.deptno = d.deptno;

select * from v_prof_dept2;

--3. inline view를 사용하여 student테이블과 departmant테이블을 사용하여
--학과별로 학생들의 최대키와 최대 몸무게, 학과 이름을 출력하세요.
select d.dname, s.max_height, s.max_weight
from ( select deptno1, max(height) as max_height, max(weight) as max_weight from student
group by deptno1 ) s, department d
where s.deptno1 = d.deptno;

--4. student테이블과 departmemt테이블을 사용하여
--학과 이름, 학과별 최대키, 학과별로 가장 키가 큰 학생들의 이름과 키를 inline view를 사용하여 출력하세요.
select d.dname 학과명, m.height 학과_최대키, s.NAME 학생명, s.HEIGHT 키
from (select deptno1, max(height) height from STUDENT group by deptno1) m, -- 학생중에서 최대 키를 가진 사람을 학과번호로 그룹을 짓는다.
     STUDENT s, DEPARTMENT d
where s.DEPTNO1=d.DEPTNO
and m.height=s.HEIGHT
and s.DEPTNO1=m.DEPTNO1;

-- 5. student테이블에서 학생의 키가 동일 학년의 평균 키보다 큰 학생들의 학년과
-- 이름 키, 해당 학년의 평균키를 출력하되 inline view를 사용해서 출력하세요.
-- (학년 컬럼으로 오름차순 정렬해서 출력하세요)
select s.grade, s.name, s.height, a.avg_height
from (select grade, avg(height) as avg_height from student group by grade ) a, student s
where s.grade = a.grade and s.height>a.avg_height
order by grade;

-- 6. professor테이블을 조회하여 교수들의 급여 순위와 이름과 급여을 출력하시오.
-- 단 급여 순위는 급여가 많은 사람부터 1~5위까지 출력하세요
-- 두번째 컬럼이 pay니까 order by 2로 해도 돼
select rownum as "ranking", name, pay
from (select name, pay from professor order by 2 desc)
where rownum between 1 and 5;

-- 7. 아래 화면과 같이 교수 테이블을 교수 번호로 정렬하되
-- 3건씩 분리해서 급여 합계와 급여 평균을 출력하세요
--반올림해서 소수점 1자리
--rollup () -> 소계
--rollup (()) -> 총계
select profno, name, pay, sum(pay), round(avg(pay), 1) 
from (select profno, name, pay, rownum num from professor)
group by ceil(num/3), rollup((profno, name, pay, num))
order by ceil(num/3);
--ceil 올림 함수

--ROLLUP 함수
ROLLUP 에 지정된 Grouping Columns 의 List 는 Subtotal 을 생성하기 위해 사용되어집니다.
Grouping Columns 의 수를 N 이라고 했을 때 N + 1 Level 의 Subtotal 이 생성됩니다.

--표준 집계 전체 행에 대해서
SELECT dname, job, count(*), sum(sal) from emp, dept
   where dept.deptno = emp.deptno group by dname, job;

-- dname별로 모든 job의 subtotal  
SELECT dname, job, count(*), sum(sal) from emp, dept
   where dept.deptno = emp.deptno group by dname, job
    order by dname, job;

--그룹별로 subtotal을 구할 수 있다. 
SELECT dname, job, count(*), sum(sal) from emp, dept
   where dept.deptno = emp.deptno group by rollup(dname, job); 
