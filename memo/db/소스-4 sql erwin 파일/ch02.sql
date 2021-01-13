SELECT  * 
FROM  emp;

SELECT  * 
FROM  dept;

SELECT  empno, ename 
FROM  emp;

SELECT ename, sal, sal*12
FROM emp;

SELECT ename, sal, job, sal*12, sal*12+comm,  comm, deptno
FROM emp;

SELECT ename, comm, sal*12+comm, 
       nvl(comm, 0), sal*12+nvl(comm, 0)
FROM emp;

SELECT ename, sal*12+nvl(comm, 0)
FROM emp;

SELECT ename, sal*12+nvl(comm, 0) as Annsal
FROM emp;

SELECT ename, sal*12+nvl(comm, 0) Annsal
FROM emp;

SELECT ename �����, sal*12+nvl(comm, 0) ����
FROM emp;

SELECT ename, sal*12+nvl(comm, 0)  "A n n s a l"
FROM emp;

SELECT ename || '�� ������ ' || job || '�Դϴ�.' as ����
FROM emp;

SELECT deptno
FROM emp;

SELECT distinct deptno
FROM emp;

SELECT *
FROM  emp
WHERE sal >= 500;

SELECT *
FROM  emp
WHERE deptno = 10

SELECT *
FROM  emp
WHERE ename=�̹���

SELECT *
FROM  emp
WHERE ename='�̹���'

SELECT *
FROM  emp
WHERE hiredate<to_date('2005/01/01', 'YYYY/MM/DD')

SELECT *
FROM emp
WHERE deptno=10 and job='����'


SELECT *
FROM emp
WHERE deptno=10 or job='����'


SELECT *
FROM  emp
WHERE not deptno = 10

SELECT *
FROM  emp
WHERE deptno <> 10


SELECT *
FROM  emp
WHERE sal<400 or sal>500

SELECT *
FROM  emp
WHERE comm=80 or comm=100 or comm=200

SELECT *
FROM  emp
WHERE sal between 400 and 500




SELECT *
FROM  emp
WHERE hiredate between to_date('2003/01/01', 'YYYY/MM/DD') and to_date('2003/12/31', 'YYYY/MM/DD')

SELECT *
FROM emp
WHERE comm in(80, 100, 200)


SELECT *
FROM emp
WHERE comm<>80 and comm<>100 and comm<>200


SELECT *
FROM emp
WHERE comm not in(80, 100, 200)


SELECT *
FROM emp
WHERE ename = '��'


SELECT *
FROM emp
WHERE ename like '��%'

SELECT *
FROM  emp
WHERE ename like '%��%'


SELECT *
FROM  emp
WHERE ename like '%��'


SELECT *
FROM  emp
WHERE ename like '_��%'

SELECT *
FROM  emp
WHERE ename like '__��%'

SELECT *
FROM emp
WHERE ename  not like '%��%'


SELECT ename, deptno, comm
FROM emp


SELECT *
FROM emp
WHERE comm=null


SELECT *
FROM emp
WHERE comm is null

SELECT *
FROM emp
WHERE  comm is not null


SELECT *
FROM emp
WHERE 


SELECT *
FROM emp
ORDER BY sal ASC


SELECT *
FROM emp
ORDER BY sal 

SELECT *
FROM emp
ORDER BY sal DESC


SELECT *
FROM emp
ORDER BY ename


SELECT *
FROM emp
ORDER BY hiredate DESC, ename ASC




SELECT *
FROM GROUP_STAR 
UNION
SELECT *
FROM SINGLE_STAR


SELECT *
FROM GROUP_STAR 
UNION ALL
SELECT *
FROM SINGLE_STAR

SELECT *
FROM GROUP_STAR 
INTERSECT
SELECT *
FROM SINGLE_STAR


SELECT *
FROM GROUP_STAR 
MINUS
SELECT *
FROM SINGLE_STAR


SELECT *
FROM SINGLE_STAR
MINUS
SELECT *
FROM GROUP_STAR 
