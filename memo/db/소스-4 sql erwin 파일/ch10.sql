select ename, deptno
from emp
order by deptno;

select deptno, dname
from dept;

select deptno
from emp
where ename='�̹���';

select dname
from dept
where deptno=10;

select *
from emp, dept;

select *
from emp, dept
where emp.deptno = dept.deptno;

select emp.ename, dept.dname, emp.deptno              
from  emp, dept             
where emp.deptno = dept.deptno 
and ename='�̹���';


select * from salgrade;

select ename, sal, grade
from emp, salgrade 
where sal between LOSAL and HISAL
order by grade;

select e.ename, d.dname, e.sal, s.grade
from emp e, dept d, salgrade s
where e.deptno = d.deptno
and e.sal between s.LOSAL  and s.HISAL
order by grade;

select ename, mgr
from emp; 


select empno, ename
from emp;


select employee.ename as "����̸�", manager.ename as "���ӻ���̸�"
from emp employee, emp manager
where employee.mgr = manager.empno;

select * 
from emp cross join dept;

select ename, dname 
from emp, dept
where emp.deptno=dept.deptno;

select ename, dname 
from emp INNER JOIN dept
ON emp.deptno=dept.deptno;


select ename, dname, dept.deptno 
from emp INNER JOIN dept
ON emp.deptno=dept.deptno 
where ename='�̹���';

select member.ename as "����̸�", manager.ename as "���ӻ���̸�"
from emp member LEFT OUTER JOIN emp manager
ON member.mgr = manager.empno;


drop table dept01;

CREATE TABLE DEPT01(
	 DEPTNO NUMBER(2),
	 DNAME VARCHAR2(14),
	 LOC   VARCHAR2(13)
);

drop table dept02;

CREATE TABLE DEPT02(
	 DEPTNO NUMBER(2),
	 DNAME VARCHAR2(14),
	 LOC   VARCHAR2(13)
) ;


-- ��� ���̺� ���� ������ �߰��ϱ�
INSERT INTO dept01 VALUES(10, '�渮��', '����');
INSERT INTO dept01 VALUES(20, '�λ��', '��õ');

INSERT INTO dept02 VALUES(10, '�渮��', '����');
INSERT INTO dept02 VALUES(30, '������', '����'); 
commit;


select e.ename, d.deptno, d.dname
from emp e INNER JOIN dept d
ON e.deptno = d.deptno 
order by d.deptno;


select *
from dept01 LEFT OUTER JOIN dept02
ON dept01.deptno = dept02.deptno;

select *
from dept01 RIGHT OUTER JOIN dept02
ON dept01.deptno = dept02.deptno;

select *
from dept01 FULL OUTER JOIN dept02
ON dept01.deptno = dept02.deptno;


select e.ename, d.deptno, d.dname
from emp e INNER JOIN dept d
ON e.deptno = d.deptno 
order by d.deptno;


select e.ename, e.hiredate
from emp e, dept d 
where e.deptno =d.deptno                    
and d.dname='�渮��';

select e.ename, d.dname
from emp e, dept d                          
where e.deptno =d.deptno                                           
and e.job='����';

select work.ename, work.job
from emp work, emp manager                          
where work.mgr=manager.empno                                                
and manager.ename='���켺';


select work.ename, friend.ename
from emp work, emp friend                           
where work.deptno=friend.deptno
and work.ename='���켺'                         
and friend.ename<>'���켺;


select e.ename, e.sal
from emp e INNER JOIN dept d
ON e.deptno = d.deptno
and d.loc='��õ'; 
