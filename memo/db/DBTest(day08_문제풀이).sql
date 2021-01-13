-- 부서 테이블 제거하기

DROP TABLE EMP;

-- 사원 테이블 제거하기

DROP TABLE DEPT;
update dept set loc ='수원' where deptno = 40;
select * from dept;
select * from emp;
-- 급여 테이블 제거하기

DROP TABLE SALGRADE;

-- 부서 테이블 제거하기

DROP TABLE EMPLOYEE;

-- 사원 테이블 제거하기

DROP TABLE DEPARTMENT;

-- 급여 테이블 제거하기

DROP TABLE SALGRADE;

?

-- 부서 테이블 생성하기

create TABLE DEPT(

DEPTNO NUMBER(2) CONSTRAINT PK_DEPT PRIMARY KEY,

DNAME VARCHAR2(14),

LOC VARCHAR2(13) ) ;

?

-- 사원 테이블 생성하기

CREATE TABLE EMP( 

EMPNO NUMBER(4) CONSTRAINT PK_EMP PRIMARY KEY,

ENAME VARCHAR2(10),

JOB VARCHAR2(9),

MGR NUMBER(4),

HIREDATE DATE,

SAL NUMBER(7,2),

COMM NUMBER(7,2),

DEPTNO NUMBER(2) CONSTRAINT FK_DEPTNO REFERENCES DEPT);

?

-- 급여 테이블 생성하기

CREATE TABLE SALGRADE(

GRADE NUMBER,

LOSAL NUMBER,

HISAL NUMBER );

?

-- 사원 테이블에 샘플 데이터 추가하기

INSERT INTO DEPT VALUES(10, '경리부', '서울');

INSERT INTO DEPT VALUES(20, '인사부', '인천');

INSERT INTO DEPT VALUES(30, '영업부', '용인'); 

INSERT INTO DEPT VALUES(40, '전산부', '수원');

?

-- 부서 테이블에 샘플 데이터 추가하기

INSERT INTO EMP VALUES(1001, '김사랑', '사원', 1013, to_date('2007-03-01','yyyy-mm-dd'), 300, NULL, 20);

INSERT INTO EMP VALUES(1002, '한예슬', '대리', 1005, to_date('2007-04-02','yyyy-mm-dd'), 250, 80, 30);

INSERT INTO EMP VALUES(1003, '오지호', '과장', 1005, to_date('2005-02-10','yyyy-mm-dd'), 500, 100, 30);

INSERT INTO EMP VALUES(1004, '이병헌', '부장', 1008, to_date('2003-09-02','yyyy-mm-dd'), 600, NULL, 20);

INSERT INTO EMP VALUES(1005, '신동협', '과장', 1005, to_date('2005-04-07','yyyy-mm-dd'), 450, 200, 30);

INSERT INTO EMP VALUES(1006, '장동건', '부장', 1008, to_date('2003-10-09','yyyy-mm-dd'), 480, NULL, 30);

INSERT INTO EMP VALUES(1007, '이문세', '부장', 1008, to_date('2004-01-08','yyyy-mm-dd'), 520, NULL, 10);

INSERT INTO EMP VALUES(1008, '감우성', '차장', 1003, to_date('2004-03-08','yyyy-mm-dd'), 500, 0, 30);

INSERT INTO EMP VALUES(1009, '안성기', '사장', NULL, to_date('1996-10-04','yyyy-mm-dd'),1000, NULL, 20);

INSERT INTO EMP VALUES(1010, '이병헌', '과장', 1003, to_date('2005-04-07','yyyy-mm-dd'), 500, NULL, 10);

INSERT INTO EMP VALUES(1011, '조향기', '사원', 1007, to_date('2007-03-01','yyyy-mm-dd'), 280, NULL, 30);

INSERT INTO EMP VALUES(1012, '강혜정', '사원', 1006, to_date('2007-08-09','yyyy-mm-dd'), 300, NULL, 20);

INSERT INTO EMP VALUES(1013, '박중훈', '부장', 1003, to_date('2002-10-09','yyyy-mm-dd'), 560, NULL, 20);

INSERT INTO EMP VALUES(1014, '조인성', '사원', 1006, to_date('2007-11-09','yyyy-mm-dd'), 250, NULL, 10);

?

-- 급여 테이블에 샘플 데이터 추가하기

INSERT INTO SALGRADE VALUES (1, 700,1200);

INSERT INTO SALGRADE VALUES (2, 1201,1400);

INSERT INTO SALGRADE VALUES (3, 1401,2000);

INSERT INTO SALGRADE VALUES (4, 2001,3000);

INSERT INTO SALGRADE VALUES (5, 3001,9999);

COMMIT;

--join문제
--2번 경리부에서 근무하는 사원의 이름과 입사일을 출력하기
select ename, hiredate from emp where deptno = 10;

--3번 ANSI JOIN을 사용하여 인천에서 근무하는 사원이름과 급여을 출력하기
select e.ename, e.sal from emp e , dept d where e.deptno = d.deptno and loc='인천';
select e.ename, e.sal from emp e inner join dept d on e.deptno = d.deptno and d.loc = '인천';

--4번 사원 테이블과 부서 테이블을 조인하여 사원이름과 부서번호, 부서명을 출력하시오
select e.ename, e.deptno, d.dname from emp e join dept d on e.deptno=d.deptno;


--5. 경리부 부서 소속 사원의 이름과 입사일을 출력하시오
select e.ename, e.hiredate from emp e, dept d where  e.deptno = d.deptno and d.dname='경리부';

--6. 직급이 과장인 사원이 이름, 부서명을 출력하시오
select e.ename, d.dname from emp e , dept d where  e.job='과장' and e.deptno=d.deptno;

--7. 직속상관이 감우성인 사원들의 이름과 직급을 출력하시오
--???
select e.empno, e.ename, e2.ename from emp e, emp e2 where e.ename = '감우성' and e2.mgr = e2.emptno;

select worker.ename, worker.job, manager.ename from emp worker, emp manager
    where worker.mgr = manager.empno and manager.ename = '감우성';

--8. 감우성과 동일한 근무지에서 근무하는 사원의 이름을 출력하시오
--??????????????
select e.ename from emp e, emp e2 where e.deptno=e2.deptno and e2.ename = '감우성' and e.ename <> '감우성';





--서브쿼리1
--1. 서브 쿼리를 이용하여 "영업부"에서 근무하는 모든 사원의 이름과 급여을 출력하라.
select e.ename, e.sal from emp e 
    where deptno = (select deptno from dept where dname = '생산부');

--2. 서브쿼리를 사용하여 emp06에 emp테이블의 모든 데이터를 추가합니다.
create table emp06
as
select * from emp;
select * from emp06

insert into emp06
select * from emp;
--3. emp06테이블에 저장된 사원 정보 중 과장들의 최소 급여보다 많은 급여을 받는 사원들의 
--이름과 급여과 직급을 출력하되 과장은 출력하지 않은 SQL문을 작성하시오
select ename, sal, job from emp where job='과장' and 

--다중행이니까 바로 부등호 쓰면 안돼
select ename, sal from emp
    where sal > (select sal from emp where job='과장');

--any 추가
select ename, sal, job from emp
    where sal > any (select sal from emp where job='과장') and job <> '과장';


--4. emp06 테이블에 저장된 사원 정보 중 인천에 위치한 부서에 소속된 사원들의 급여를
--100 인상하는 SQL문을 작성하시오
select * from emp06 where deptno = 20;
update emp06 set sal = sal+100
    where deptno = (select deptno from dept where loc = '인천');

--5. emp06테이블에서 경리부에 소속된 사원들만 삭제하는 SQL문을 작성하시오
--단일행이니까 where deptno=  사용 가능
delete from emp06 where deptno=(select deptno from dept where dname='경리부');

--6. '이문세'와 같은 부서에 근무하는 사원의 이름과 부서번호를 출력하는 SQL문을 작성하시오
select ename, deptno from emp where deptno =(select deptno from emp where ename ='이문세') 
    and  ename <> '이문세;
    
--7. '이문세'와 동일한 직급을 가진 사원을 출력하는 SQL문을 완성하시오.
select * from emp where job = (select job from emp where ename = '이문세')
    and ename <> '이문세';
?
--8. '이문세'의 급여와 동일하거나 더 많이 받는 사원명과 급여을 출력하는 SQL문을 완성하시오
select ename, sal from emp where sal >= (select sal from emp where ename = '이문세');
?
--9. '인천'에서 근무하는 사원의 이름, 부서번호를 출력하는 SQL문을 완성하시오.
select ename, deptno from emp where deptno = (select deptno from dept where loc='인천');

--10. 직속상관이 감우성인 사원의 이름과 급여을 출력하는 SQL문을 완성하시오
select ename, sal, mgr from emp where mgr = (select empno from emp where ename = '감우성');
?

--11. 부서별로 가장 급여를 많이 받는 사원의 정보(사원번호, 사원이름, 급여, 부서번호)를 출력하는 SQL문을 완성하시오.
--where deptno = e.deptno
--앞 deptno는 현재 쿼리문의 deptno이고 뒤에 e.deptno는 왼쪽에 있는 쿼리문의 deptno
select empno, ename, sal, deptno from emp e where sal=(select max(sal) from emp where deptno = e.deptno)
    order by deptno;
?

--12. 직급(JOB)이 과장인 사원이 속한 부서의 부서번호와 부서명, 지역을 출력하시오
select deptno, dname, loc from dept where deptno in (select deptno from emp where job='과장');
?
--13. 과장보다 급여을 많이 받은 사원들의 이름과 급여와 직급을 출력하되 과장은 출력하지 않는 SQL문을 완성하시오
select ename, sal, job from emp where sal > all (select sal from emp where job = '과장');
?

--서브쿼리문제2

--1. Student 테이블과 department테이블을 사용하여 'Anthony  Hopkins'학생과 전공(deptno1)이 
--동일한 학생들의 이름과 전공1 이름을 출력하시오
SELECT s.name "STUD_NAME" , d.dname "DEPT_NAME" FROM student s , department d
WHERE s.deptno1=d.deptno and s.deptno1 = ( SELECT deptno1 FROM student WHERE name='Anthony Hopkins') ;
select * from student;
?select * from department;
drop table department;

--2. professor테이블과 department테이블을 조회하여 'Meg Ryan'교수보다 나중에 입사한 사람의 이름과 입사일 학과명을 출력하세요
select p.name, p.hiredate, d.dname from professor p, department d
    where p.deptno = d.deptno and hiredate > (select hiredate from professor where name='Meg Ryan');
?
drop table department purge;
create table department
( deptno number(3) primary key ,
  dname varchar2(50) not null,
  part number(3),
  build  varchar2(30))tablespace users;

insert into department 
values (101,'Computer Engineering',100,'Information Bldg');

insert into department
values (102,'Multimedia Engineering',100,'Multimedia Bldg');

insert into department
values (103,'Software Engineering',100,'Software Bldg');

insert into department
values (201,'Electronic Engineering',200,'Electronic Control Bldg');

insert into department
values (202,'Mechanical Engineering',200,'Machining Experiment Bldg');

insert into department
values (203,'Chemical Engineering',200,'Chemical Experiment Bldg');

insert into department
values (301,'Library and Information science',300,'College of Liberal Arts');

insert into department
values (100,'Department of Computer Information',10,null);

insert into department
values (200,'Department of Mechatronics',10,null);

insert into department
values (300,'Department of Humanities and Society',20,null);

insert into department
values (10,'College of Engineering',null,null);

insert into department
values (20,'College of Liberal Arts',null,null);

commit;
?

--3. student 테이블에서 전공1이 201번인 학과의 평균 몸무게보다 몸무게가 많은 학생들의 이름과 몸무게를 출력하세요
select name, weight from student
    where weight > (select avg(weight) from student where deptno1 = 201);
?

--4. emp2테이블을 사용하여 전체 직원 중 'Section Head'직급의 최소 연봉자보다 연봉이 높은 사람의 이름과 직급 연봉을 출력하시오.
--단 연봉 출력 형식은 천단위 구분기호와 $표시를 하세요.
select name, position, to_char(pay, '$999,999,999') as 연봉 from emp2
    where pay  > (select min(pay) from emp2 where position = 'Section head' );
?

--5. student테이블을 조회하여 전체 학생 중에서 체중이 2학년 체중에서 가장 적게 나가는 학생보다 몸무게가 적은 학생의 이름과 학년과 몸무게를 출력하세요.
select name, grade, weight from student
    where weight < all (select weight from student where grade = 2);
?

--6. emp2테이블과 dept2테이블을 조회하여 각 부서별 평균 연봉을 구하고 그중에서 평균 연봉이 가장 적은 부서의 
--평균 연봉보다 적게 받는 직원들의 부서명, 직원명, 연봉을 출력하세요.
select d.dname, e.name, to_char(e.pay, '$999,999,999') from emp2 e, dept2 d
    where e.deptno = d.dcode
    and e.pay < all (select avg(pay) from emp2 group by deptno);
    
select * from emp2;
select * from professor;
?select * from department;

--7. professor테이블과 department테이블을 조회하여 각 학과별로 입사일이 
--가장 오래된 교수의 교수번호와 이름, 학과명을 출력하세요.(입사일 순으로 오름차순 정렬하세요)
SELECT  p.profno, p.name, p.hiredate,d.deptno, d.dname from professor p, department d 
  where p.deptno = d.deptno 
  and (p.deptno, p.hiredate)  in (select deptno, min(hiredate) from professor group by deptno )
order by p.hiredate;

    
?

--8. emp2 테이블을 조회하여 직급별로 해당 직급에서 최대 연봉을 받는 직원의 이름과 직급, 연봉을 출력하세요. 
--연봉순으로 오름차순 정렬하세요.
SELECT name, position, to_char(pay, '$999,999,999')  from emp2
  where  (position, pay) in ( select position, max(pay) from emp2 group by position );

select name, position, pay from emp2
    where (position, pay) in (select position, max(pay) from emp2 group by position);
?

