
--===============================
create table emp_copy
as
select * from emp;  --������ ���̺�

create view emp_view30
as
--dempno�� 30�� ����� ���, �̸�, �μ���ȣ

select empno, ename, deptno from emp where deptno=30;

select * from emp_view30;

create view course_view_20 (cou_id, cou_name)
as
select cou_id, cou_name from course where cou_id = 20;

select * from course_view_20;

desc user_views;

select view_name, text from user_views;

--���� ���� ����
--1. ��� ���� ���� : select * from course_view_20;
--2. ���� text�÷� �ȿ� �ڷ��� select���� ����
--3. �������� ������ ��ȸ
--4. �������� ������ ��ȸ�� ���� ��� ����
--5. 1�� ����� ������

--�並 ����ϴ� ����
--1. �� ������, ���̾��� �������� ��� �����
--2. ���ȿ� ����

--�並 ����� ���
--1. select��
--2. insert������ �� �ȿ� ������ �߰�

select * from emp_view30;
insert into emp_view30 values(1111,'aaaa',30);
--������ �����ʹ�? �߰��Ǿ���.
select * from emp;
--view�� ������ �����ϱ�
--aaaa�� ����� sal 500 �ֱ�
update emp_view30 set deptno = 40 where ename = 'aaaa';
--aaaa�� ��� ����
delete from emp_view30 where empno = 1111;

create view emp_view_dept
as
select e.empno, e.ename, e.sal, e.deptno, d.dname, d.loc from emp_copy e, dept d
where e.deptno = d.deptno;

select * from emp_view_dept;

--view ���̺��� text���� ����
desc user_views;
select * from user_views where view_name = 'EMP_VIEW_DEPT';

create view emp_view
as
select empno, ename, job, mgr, hiredate, deptno from emp;

--���� �����ͺ��̽����� ��� �� ����
select * from user_views;

--�並 ����
drop view course_view_20;

create or replace view emp_view30
as
select empno, ename, sal, comm, deptno from emp_copy where deptno=30;

--���� ���� ����
desc emp_view30;

-- FORCE �������̺��� ��� �並 ���� �� ���� ������� �ʴ´�. 
-- NOFORCE ���������̺��� �־�� �並 ����� �� default �Դϴ�.
--���� ���̺�
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


--�ζ��� ��� �Ի����� ���� ��� 5�� ����ϱ�
--������ from �ڸ� view�� ������ �ϴµ� �����ݾ� ����,,,
select rownum, we.empno, we.ename, we.hiredate
    from (select empno, ename, hiredate from emp order by hiredate ) we
    where rownum <=5;


--1�� ��� ���̺��� �⺻ ���̺�� �Ͽ� �μ��� �ִ� �޿��� �ּұ޿��� ����ϴ� �並 SAL_VIEW�� �̸����� �ۼ��Ͻÿ�
create or replace view sal_view
as
select d.dname, max(e.sal) as max_sal, min(e.sal) as min_sal
from emp e, dept d
where e.deptno = d.deptno group by d.dname;

--2. �ζ��� �並 ����Ͽ� �޿��� ���� �޴� ������� 3�� ����Ͻÿ�
select rownum as ranking, empno, ename, sal
from
(select empno, ename, sal from emp_copy where sal is not null order by sal desc)
where rownum <=3;

--3. professor���̺�� department���̺��� �����Ͽ� ������ȣ�� �����̸�, �Ҽ� �а��̸��� ��ȸ�ϴ� view�� �����Ͻÿ�. view �̸��� v_prof_dept2�� �ϼ���
create or replace view v_prof_dept2
as
select p.profno, p.name, d.dname from professor p, department d where p.deptno = d.deptno;

select * from v_prof_dept2;

--3. inline view�� ����Ͽ� student���̺�� departmant���̺��� ����Ͽ�
--�а����� �л����� �ִ�Ű�� �ִ� ������, �а� �̸��� ����ϼ���.
select d.dname, s.max_height, s.max_weight
from ( select deptno1, max(height) as max_height, max(weight) as max_weight from student
group by deptno1 ) s, department d
where s.deptno1 = d.deptno;

--4. student���̺�� departmemt���̺��� ����Ͽ�
--�а� �̸�, �а��� �ִ�Ű, �а����� ���� Ű�� ū �л����� �̸��� Ű�� inline view�� ����Ͽ� ����ϼ���.
select d.dname �а���, m.height �а�_�ִ�Ű, s.NAME �л���, s.HEIGHT Ű
from (select deptno1, max(height) height from STUDENT group by deptno1) m, -- �л��߿��� �ִ� Ű�� ���� ����� �а���ȣ�� �׷��� ���´�.
     STUDENT s, DEPARTMENT d
where s.DEPTNO1=d.DEPTNO
and m.height=s.HEIGHT
and s.DEPTNO1=m.DEPTNO1;

-- 5. student���̺��� �л��� Ű�� ���� �г��� ��� Ű���� ū �л����� �г��
-- �̸� Ű, �ش� �г��� ���Ű�� ����ϵ� inline view�� ����ؼ� ����ϼ���.
-- (�г� �÷����� �������� �����ؼ� ����ϼ���)
select s.grade, s.name, s.height, a.avg_height
from (select grade, avg(height) as avg_height from student group by grade ) a, student s
where s.grade = a.grade and s.height>a.avg_height
order by grade;

-- 6. professor���̺��� ��ȸ�Ͽ� �������� �޿� ������ �̸��� �޿��� ����Ͻÿ�.
-- �� �޿� ������ �޿��� ���� ������� 1~5������ ����ϼ���
-- �ι�° �÷��� pay�ϱ� order by 2�� �ص� ��
select rownum as "ranking", name, pay
from (select name, pay from professor order by 2 desc)
where rownum between 1 and 5;

-- 7. �Ʒ� ȭ��� ���� ���� ���̺��� ���� ��ȣ�� �����ϵ�
-- 3�Ǿ� �и��ؼ� �޿� �հ�� �޿� ����� ����ϼ���
--�ݿø��ؼ� �Ҽ��� 1�ڸ�
--rollup () -> �Ұ�
--rollup (()) -> �Ѱ�
select profno, name, pay, sum(pay), round(avg(pay), 1) 
from (select profno, name, pay, rownum num from professor)
group by ceil(num/3), rollup((profno, name, pay, num))
order by ceil(num/3);
--ceil �ø� �Լ�

--ROLLUP �Լ�
ROLLUP �� ������ Grouping Columns �� List �� Subtotal �� �����ϱ� ���� ���Ǿ����ϴ�.
Grouping Columns �� ���� N �̶�� ���� �� N + 1 Level �� Subtotal �� �����˴ϴ�.

--ǥ�� ���� ��ü �࿡ ���ؼ�
SELECT dname, job, count(*), sum(sal) from emp, dept
   where dept.deptno = emp.deptno group by dname, job;

-- dname���� ��� job�� subtotal  
SELECT dname, job, count(*), sum(sal) from emp, dept
   where dept.deptno = emp.deptno group by dname, job
    order by dname, job;

--�׷캰�� subtotal�� ���� �� �ִ�. 
SELECT dname, job, count(*), sum(sal) from emp, dept
   where dept.deptno = emp.deptno group by rollup(dname, job); 
