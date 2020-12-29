
--부서 테이블 생성
create table dept(
    deptno number(2) CONSTRAINT pk_dept PRIMARY key,
    dname varchar2(14),
    loc varchar2(13)
    
);

--사원테이블 생성
create table emp(
    empno number(4) CONSTRAINT pk_emp primary key,
    ename varchar2(10),
    job varchar2(9),
    mgr number(4),
    hiredate date,
    sal number(7,2),
    comm number (7,2),
    deptno number(2) CONSTRAINT fk_deptno REFERENCES dept

);

--급여테이블
--급여, 급여하한가, 급여상한가

create table salgrade(
    grade number,
    losal number,
    highsal number

);

--사원 테이블에 샘플 데이터 넣기
insert into dept (deptno,dname,loc)
values(10, '경리부','seoul');

insert into dept (deptno,dname,loc)
values(20, '인사부','인천');

insert into dept values(30, '영업부','용인');
insert into dept values(40, '전산부','수원');

--사원테이블 안에있는 레코드(행)을 검색하기
select * from SALGRADE;

INSERT INTO EMP VALUES(1001, '김사랑', '사원', 1013, to_date('2007-03-01','yyyy-mm-dd'), 300, NULL, 20);
INSERT INTO EMP VALUES(1002, '한예슬', '대리', 1005, to_date('2007-04-02','yyyy-mm-dd'), 250,   80, 30);
INSERT INTO EMP VALUES(1003, '오지호', '과장', 1005, to_date('2005-02-10','yyyy-mm-dd'), 500,  100, 30);
INSERT INTO EMP VALUES(1004, '이병헌', '부장', 1008, to_date('2003-09-02','yyyy-mm-dd'), 600, NULL, 20);
INSERT INTO EMP VALUES(1005, '신동협', '과장', 1005, to_date('2005-04-07','yyyy-mm-dd'), 450,  200, 30);
INSERT INTO EMP VALUES(1006, '장동건', '부장', 1008, to_date('2003-10-09','yyyy-mm-dd'), 480, NULL, 30);
INSERT INTO EMP VALUES(1007, '이문세', '부장', 1008, to_date('2004-01-08','yyyy-mm-dd'), 520, NULL, 10);
INSERT INTO EMP VALUES(1008, '감우성', '차장', 1003, to_date('2004-03-08','yyyy-mm-dd'), 500,    0, 30);
INSERT INTO EMP VALUES(1009, '안성기', '사장', NULL, to_date('1996-10-04','yyyy-mm-dd'),1000, NULL, 20);
INSERT INTO EMP VALUES(1010, '이병헌', '과장', 1003, to_date('2005-04-07','yyyy-mm-dd'), 500, NULL, 10);
INSERT INTO EMP VALUES(1011, '조향기', '사원', 1007, to_date('2007-03-01','yyyy-mm-dd'), 280, NULL, 30);
INSERT INTO EMP VALUES(1012, '강혜정', '사원', 1006, to_date('2007-08-09','yyyy-mm-dd'), 300, NULL, 20);
INSERT INTO EMP VALUES(1013, '박중훈', '부장', 1003, to_date('2002-10-09','yyyy-mm-dd'), 560, NULL, 20);
INSERT INTO EMP VALUES(1014, '조인성', '사원', 1006, to_date('2007-11-09','yyyy-mm-dd'), 250, NULL, 10);
INSERT INTO EMP VALUES(1015, '조이성', '사원', 1006, to_date('2007-11-09','yyyy-mm-dd'), 250, NULL, 10);
INSERT INTO EMP VALUES(1018, '김아성', '사원', 1006, to_date('2020-12-29','yyyy-mm-dd'), 250, NULL, 10);
-- comm이 null
INSERT INTO EMP VALUES(1020, '조이성', '사원', 1006, to_date('2020-12-29','yyyy-mm-dd'), 250, NULL, 10);
-- 날짜가 null
INSERT INTO EMP VALUES(1021, '조이성', '사원', 1006, NULL, 250, 500, 10);
-- 문자가 null
INSERT INTO EMP VALUES(1022, NULL, '사원', 1006, to_date('2020-12-29','yyyy-mm-dd'), 250, 500, 10);
INSERT INTO EMP VALUES(1023, '조이성', NULL, 1006, to_date('2020-12-29','yyyy-mm-dd'), 250, 500, 10);


INSERT INTO SALGRADE VALUES (1, 700,1200);
INSERT INTO SALGRADE VALUES (2, 1201,1400);
INSERT INTO SALGRADE VALUES (3, 1401,2000);
INSERT INTO SALGRADE VALUES (4, 2001,3000);
INSERT INTO SALGRADE VALUES (5, 3001,9999);


commit;

--출력 단어 변경
select distinct job as 직위 from emp;

select sal from emp;
--세금
select sal as 본봉, sal*0.03 as 세금 from emp;

--nvl : null 이면 0으로 대체해라
select ename, comm, sal*12+comm as 연봉, nvl(comm,0) from emp;
--null은 빙공간이 아니라 미확정, 알수없는 값을 의미
--0 또는 무한대를 의미 
--연산, 할당, 비교 불가

--|| concatentation 연산자 사용하여 컬럼 연결 할 수 있다.
select ename || '의 직급은 ' || job || '입니다.' as 직급 from emp;

--where절 조건절
select * from emp where sal>500;
select * from emp where deptno = 10;
--문자검색
select * from emp where ename = '한예슬';
--날짜 검색 (2005년 1월 이전에 입사한 사람)
select * from emp where hiredate < to_date('2005/01/01', 'yyyy/mm/dd');
select * from emp where hiredate >= to_date('2005/01/01', 'yyyy/mm/dd');

--부서번호가 10 이고 직급이 과장인 사람
select * from emp where deptno=10 and job='과장';

--급여가 400~500인 경우 and
select * from emp where sal >= 400 and sal<=500;
--급여가 400 미만이거나 500 초과인 경우
select * from emp where sal < 400 or sal>500;

--between and
--급여가 400~500인 경우
select * from emp where sal between 400 and 500;

--in ~안에
--comm이 80이거나 100 이거나 200인사람
select * from emp where comm=80 or comm=100 or comm=200;
select * from emp where comm in (80,100,200);

--comm이 80이 아니거나 100이 아니거나 200이 아닌 사원
select * from emp where comm != 80 and comm!=100 and comm!=200;
select * from emp where comm not in (80,100,200);

--유사일치(비슷하게 일치하는 것 검색) like
--김씨인 사람, 서울에 사는사람
--와일드 카드 : % _
-- % : 문자가 없거나, 하나 이상의 문자가 어떤 값이 와도 상관없다
-- _ : 하나의 문자가 어떤 값이 와도 상관없다
select * from emp where ename like '%이%';
select * from emp where ename like '__성';
--job에서 '사'로 시작하는것만 찾기
select * from emp where job like '사%';
--job에서 '사'로 시작하지 않는것 찾기
select * from emp where job not like '사%';

--comm이 null인사람 찾기
select * from emp where comm is null;

--정렬
select * from emp order by sal desc, deptno desc;
select * from emp where job='사원' order by sal;

--최근에 입사한 사람 순서대로 조건 사장을 제외함
select * from emp where job != '사장' order by hiredate desc;

--사원 이름과 급여 입사일자만 출력
select ename, sal, hiredate from emp;
--부서번호는 dno로 부서명은 부서명으로 별칭(as)를 붙여서 출력
select deptno as dno, dname as 부서명 from dept;
--사원테이블에 존재하는 직급의 종류만 출력해보세요.
select distinct job from emp;
--급여가 300이하인 사원의 사원번호, 사원이름, 급여를 출력
select empno, ename, sal from emp where sal<=300;
-- 이름이 '오지호'인 사원의 사원번호, 사원명, 급여를 출력하세요
select empno, ename, sal from emp where ename='오지호';
-- 급여가 250이거나 300이거나 500인 사원들의 사원번호, 사원명, 급여를 출력
select empno, ename, sal from emp where sal in (250, 300, 500);
-- 급여가 250도 300도 500도 아닌 사원들을 검색하세요
select empno, ename, sal from emp where sal not in (250, 300, 500);
-- 사원중에는 이름이 '김'으로 시작하는 사람과 이름중에 '기'를 포함하는 사원의 사원번호와 사원이름을 출력하세요
select empno, ename from emp where ename like '김%' or ename like '%기%';
-- 상급자가 없는 사원을 검색하세요 
select * from emp where mgr is null;
-- 사원테이블의 자료를 입사일을 기준으로 정렬하여 최근에 입사한 직원을 가장 먼저 출력하세요
--  (단, 사원번호, 사원명, 직급, 입사일) 컬럼만 출력
select empno, ename, job, hiredate from emp order by hiredate desc;
-- 부서번호가 빠른 사원번호부터 출력하되 같은 부서 내의 사원을 출력할 경우 입사한지 가장 오래된 사원부터 출력하세요
select * from emp order by deptno asc, hiredate asc;








