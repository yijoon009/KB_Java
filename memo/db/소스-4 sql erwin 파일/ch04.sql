SELECT deptno, ROUND(sal, 3)
FROM emp;

SELECT SUM(sal)
FROM emp;

SELECT SUM(sal) as "�޿��Ѿ�",
       ROUND(AVG(sal)) as "�޿����",
       MAX(sal) as "�ִ�޿�",
       MIN(sal) as "�ּұ޿�"
FROM emp;


SELECT to_date(MAX(hiredate), 'YY/MM/DD'),
       to_date(MIN(hiredate), 'YY/MM/DD')
FROM emp;


SELECT SUM(comm) as "Ŀ�̼� �Ѿ�"
FROM emp;


SELECT MAX(sal)
FROM emp;


SELECT ename, MAX(sal)
FROM emp;


SELECT COUNT(comm) as "Ŀ�̼� �޴� ����� ��"
FROM emp;


SELECT COUNT(*) as "��ü ����� ��", 
       COUNT(comm) as "Ŀ�̼� �޴� ��� ��"
FROM emp


SELECT COUNT(job) as "������"
FROM emp


SELECT job FROM emp
ORDER BY job


SELECT COUNT(distinct job) as "������"
FROM emp

SELECT deptno 
FROM emp 
GROUP BY deptno;

SELECT AVG(sal) as "�޿� ���"
FROM emp
GROUP BY deptno;

SELECT deptno as "�μ� ��ȣ", AVG(sal) as "�޿� ���"
FROM emp
GROUP BY deptno;

SELECT deptno, ENAME, AVG(sal)
FROM emp
GROUP BY deptno;

SELECT deptno, SUM(sal) as "�޿� �Ѿ�", AVG(sal) as "�޿� ���"
FROM emp
GROUP BY deptno

SELECT deptno, MAX(sal) "�ִ� �޿�", MIN(sal) "�ּ� �޿�"
FROM emp  
GROUP BY deptno

SELECT deptno, COUNT(*) "�μ��� �����", COUNT(comm) "Ŀ�̼� �޴� �����"
FROM emp 
GROUP BY deptno

SELECT deptno, AVG(sal) 
FROM emp 
GROUP BY deptno
HAVING AVG(sal) >= 500

SELECT deptno, MAX(sal) "�ִ� �޿�", MIN(sal) "�ּұ޿�"
FROM emp 
GROUP BY deptno
HAVING  MAX(sal) > 500;


 SELECT job, COUNT(*), SUM(sal)
 FROM emp
 WHERE job NOT LIKE '%���%'
 GROUP BY job
 HAVING SUM(sal) >= 1000
 ORDER BY SUM(sal);


 SELECT MAX(AVG(sal))
 FROM emp
 GROUP BY deptno;
