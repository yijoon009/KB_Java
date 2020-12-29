create table group_star (
    name VARCHAR(8)
);
insert into group_star values('A');
insert into group_star values('B');
insert into group_star values('C');
insert into group_star values('D');
insert into group_star values('E');
insert into group_star values('F');
insert into group_star values('G');
insert into group_star values('H');

select * from group_star;

create table single_star (name varchar2(8));
insert into single_star values('E');
insert into single_star values('F');
insert into single_star values('G');
insert into single_star values('H');
insert into single_star values('I');
insert into single_star values('J');
insert into single_star values('K');
insert into single_star values('L');
select * from single_star;

--합집합 ppt47
--union : 중복은 한번만
--union all : 중복도 전부 출력
select * from group_star union select * from single_star;
select * from group_star union all select * from single_star;

--교집합
select * from group_star INTERSECT select * from single_star;

--차집합
select * from group_star minus select * from single_star;

--3장 오라클 함수 ppt49
select 24*43 from dual;

select 'welcome to oracle', upper('welcome to oracle'), lower('welcome to oracle'),
initcap('welcome to oracle') from dual;

select length('welcome to oracle 한글')from dual;
select concat ('hello',' world') from dual;
select substrb('가나다라마',7,6)from dual;

--날짜형 <-> 문자형
select SYSDATE, to_char(sysdate, 'yyyy-mm-dd, am hh:mi:ss') FROM DUAL;
select to_date('2020/12/29','yyyy-mm-dd') from dual;

--숫자형 <-> 문자형
select to_char(122330) from dual;
select TO_CHAR('0111022','L999,999,999') FROM DUAL;
select TO_CHAR(0111022.444,'L999,999,999.99') FROM DUAL;
select to_char(123400,'L000,000,000.00') from dual;
--뒤부터 들어가
select to_number ('555') from dual;
--앞부터 들어가
select to_char (555) from dual;

--날짜
select to_char(sysdate,'yyyy-mm-dd') from dual;
select to_char(sysdate) from dual;
select to_char(hiredate, 'yyyy-mm-dd') as 입사일1,
    to_char(trunc(hiredate, 'month'), 'yyyy/mm/dd') as 입사일2,
    to_char(round(hiredate, 'month'), 'yyyy/mm/dd') 입사일3,
    to_char(round(hiredate, 'day'), 'yyyy/mm/dd') 입사일4
from emp;


select ename, sysdate 오늘, to_char(hiredate, 'yyyy-dd-mm') 입사일,
    trunc(months_between(sysdate, hiredate)) 근무달수
from emp;

select ename,hiredate,  to_char(add_months(hiredate, 6), 'yyyy-mm-dd') 입사6개월후 from emp;


select to_char(sysdate, 'yyyy/mm/dd') 오늘,
       to_char(next_day(sysdate,'수요일'), 'yyyy/mm/dd') 수요일
from dual;

select to_char(hiredate, 'yyyy/mm/dd') 입사일,
       to_char(last_day(hiredate), 'yyyy/mm/dd') 마지막날짜
from emp;

--nvl 함수
select comm, nvl(comm,0) from emp;
select hiredate, nvl(hiredate, to_date(sysdate, 'yyyy-mm-dd')) from emp;
select ename ,nvl(ename, '아무개'), job, nvl(job, '사원') from emp;

--nvl2 함수
select ename, sal, comm, nvl2(comm, sal*12+comm, sal*12) 연봉 from emp;
--nullif 함수
select nullif('a','a'), nullif('a','b') from dual;

select ename, deptno, decode(deptno, 10, '경리부',
    20, '인사과',
    30, '영업부',
    40, '전산부') dname from emp;

select ename, deptno,-- 조건식 참이면 
    case
    when deptno = 10 then '경리부'-- 이거 이거 
    when deptno = 20 then '인사부'-- 이거 이거 
    end as dname --end 
from emp;

--실습
-- 문자 조작함수를 시용하여 특정 행만 조회하라
select ename from emp;
--DECODE함수를 사용하여 조건에 따른 서로 다른 결과를 구하라
select ename, deptno, decode(deptno, 10, '경리부',
    20, '인사과',
    30, '영업부',
    40, '전산부') dname from emp;
--형변환 함수를 사용하여 원하는 형태로 출력하라
select to_char(122330) from dual;
--9월에 입사한 사원을 출력해 보세요 (SUBSTR)함수를 사용한다.
select * from emp where substr(hiredate, 4,2)='09';
--2003년도에 입사한 사원을 알아내기 위한 쿼리문은 다음과 같이 작성할 수 있습니다.
SELECT * from emp where hiredate >= to_date('2003/01/01', 'yyyy/mm/dd')
 and  hiredate <= to_date('2003/12/31', 'yyyy/mm/dd');

SELECT * from emp where hiredate between  to_date('2003/01/01', 'yyyy/mm/dd')
 and  to_date('2003/12/31', 'yyyy/mm/dd');
 
select * from emp where substr(hiredate, 1,2)='03';
 
-- 다음은 이름이 '기'로 끝나는 사람을 검색해 보도록 합시다.
SELECT * FROM emp WHERE  ename LIKE '%기';
select * from emp where substr(ename, -1, 1)='기';

--이번에는 이름의 두번째 글자에 '동'이 있는 사원을 검색해 보세요
select empno, ename from emp where ename like '_동%';
select empno, ename from emp where instr(ename, '동', 2,1)=2;

--DECODE함수를 사용하여 조건에 따른 서로 다른 결과를 구하라
--직급에 따라 급여를 인상하도록 합시다. 직급이 '부장'인 사원은 5%, '과장'인 사원은 10%, '대리'인 사원은 13%, '사원'인 사원은 20%인상합니다.
select empno, ename, job, sal,
    decode (job, '부장', sal*1.05,
                '과장',sal*1.1,
                    '대리', sal*1.13,
                    '사원', sal*1.2,
                    sal) upsal
    from emp;

--형변환 함수를 사용하여 원하는 형태로 출력하라
--입사일 연도는 2자리(YY), 월은 숫자(MON)으로 표시하고, 요일은 약어(DY)로 지정하여 출력하시오
select hiredate, to_char(hiredate, 'yy-mon-dd dy') from emp;
?

--4장 ppt81
-- -2이면 10의 자리에서 올림
--round(숫자, 반올림하여 나오는 자릿수) round(sal,3) 12300.7886 -> 12300.7900
select sal, round(sal,-2) from emp;
select round(12300.7876, -3) from dual;

--그룹함수
--count는 null 제외
select count(sal) from emp;
--select ename, max(sal) from emp;(X) 
--단일행 컬럼과 그룹 함수를 같이 출력할 수 없다.
--부속질의어를 사용하여 구해야 한다.
select * from emp;


--group by 절
select deptno, sum(sal) from emp group by deptno;
select deptno, sum(sal) from emp where job = '사원' group by deptno;
select job, avg(sal) from emp where ename like '김%' group by job;
--2000~2003년 사이 입사한 사람
select job, avg(sal) from emp where substr(hiredate, 1,2) in('00','01','02', '03') group by job;

--순서: select from where group by;
select deptno, max(sal), min(sal) from emp group by deptno order by deptno;
--순서: select from where group by having order by;
select deptno, avg(sal), max(sal), min(sal) from emp group by deptno having avg(sal) >=500;

--실습
--모든 사원의 급여최고액, 최저액, 총액 및 평균 급여를 출력하시오.  평균에 대해서는 정수로 반올림하시오
select max(sal) as Maximum , min(sal) as Minimun, sum(sal) as Sum, round(avg(sal)) as Average from emp;
--각 담당 업무 유형별로 급여 최고액, 최저액, 총액 및 평균액을 출력하시오. 
select job, max(sal), min(sal), sum(sal), round(avg(sal)) from emp group by job;
?--count(*)함수를 이용하여 담당 업무별 사원수를 출력하시오
select job, count(*) from emp group by job order by job;
--과장 수를 나열하시오
select count(*) from emp where job = '과장';
--급여 최고액, 급여 최저액의 차액을 출력하시오.
select max(sal), min(sal), max(sal) - min(sal) 차액 from emp;
--직급별 사원의 최저 급여을 출력하시오. 최저 급여가 500미만인 그룹은 제외시키고, 결과를 급여에 대한 내림차순으로 정렬하여 출력하시오
select job, min(sal) from emp  group by job having min(sal) >=500 order by min(sal) desc;
--각 부서에 대하 부서번호, 사원수, 부서내의 모든 사원 평균 급여를 출력하시오. 평균 급여는 소수점 둘째자리로 반올림하시오
select deptno, count(*), round(avg(sal),1) from emp group by deptno order by count(*);
--각 부서에 대해 부서번호 이름, 지역명, 사원수, 부서 내의 모든 사원의 평균 급여를 출력하시오. 평균 급여는 정수로 소수점 둘째 자리로 반올림하시오.
select decode( deptno, 10, '경리부',
                        20, '인사부',
                        30, '영업부',
                        40, '전산부') as dname,
            decode(deptno, 10, '서울',
            20, '인천', 30, '용인', 40, '수원') as 지역,
count(*), round(avg(sal),1) from emp group by deptno;












