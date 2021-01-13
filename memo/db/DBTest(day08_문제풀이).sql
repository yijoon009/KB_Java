-- �μ� ���̺� �����ϱ�

DROP TABLE EMP;

-- ��� ���̺� �����ϱ�

DROP TABLE DEPT;
update dept set loc ='����' where deptno = 40;
select * from dept;
select * from emp;
-- �޿� ���̺� �����ϱ�

DROP TABLE SALGRADE;

-- �μ� ���̺� �����ϱ�

DROP TABLE EMPLOYEE;

-- ��� ���̺� �����ϱ�

DROP TABLE DEPARTMENT;

-- �޿� ���̺� �����ϱ�

DROP TABLE SALGRADE;

?

-- �μ� ���̺� �����ϱ�

create TABLE DEPT(

DEPTNO NUMBER(2) CONSTRAINT PK_DEPT PRIMARY KEY,

DNAME VARCHAR2(14),

LOC VARCHAR2(13) ) ;

?

-- ��� ���̺� �����ϱ�

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

-- �޿� ���̺� �����ϱ�

CREATE TABLE SALGRADE(

GRADE NUMBER,

LOSAL NUMBER,

HISAL NUMBER );

?

-- ��� ���̺� ���� ������ �߰��ϱ�

INSERT INTO DEPT VALUES(10, '�渮��', '����');

INSERT INTO DEPT VALUES(20, '�λ��', '��õ');

INSERT INTO DEPT VALUES(30, '������', '����'); 

INSERT INTO DEPT VALUES(40, '�����', '����');

?

-- �μ� ���̺� ���� ������ �߰��ϱ�

INSERT INTO EMP VALUES(1001, '����', '���', 1013, to_date('2007-03-01','yyyy-mm-dd'), 300, NULL, 20);

INSERT INTO EMP VALUES(1002, '�ѿ���', '�븮', 1005, to_date('2007-04-02','yyyy-mm-dd'), 250, 80, 30);

INSERT INTO EMP VALUES(1003, '����ȣ', '����', 1005, to_date('2005-02-10','yyyy-mm-dd'), 500, 100, 30);

INSERT INTO EMP VALUES(1004, '�̺���', '����', 1008, to_date('2003-09-02','yyyy-mm-dd'), 600, NULL, 20);

INSERT INTO EMP VALUES(1005, '�ŵ���', '����', 1005, to_date('2005-04-07','yyyy-mm-dd'), 450, 200, 30);

INSERT INTO EMP VALUES(1006, '�嵿��', '����', 1008, to_date('2003-10-09','yyyy-mm-dd'), 480, NULL, 30);

INSERT INTO EMP VALUES(1007, '�̹���', '����', 1008, to_date('2004-01-08','yyyy-mm-dd'), 520, NULL, 10);

INSERT INTO EMP VALUES(1008, '���켺', '����', 1003, to_date('2004-03-08','yyyy-mm-dd'), 500, 0, 30);

INSERT INTO EMP VALUES(1009, '�ȼ���', '����', NULL, to_date('1996-10-04','yyyy-mm-dd'),1000, NULL, 20);

INSERT INTO EMP VALUES(1010, '�̺���', '����', 1003, to_date('2005-04-07','yyyy-mm-dd'), 500, NULL, 10);

INSERT INTO EMP VALUES(1011, '�����', '���', 1007, to_date('2007-03-01','yyyy-mm-dd'), 280, NULL, 30);

INSERT INTO EMP VALUES(1012, '������', '���', 1006, to_date('2007-08-09','yyyy-mm-dd'), 300, NULL, 20);

INSERT INTO EMP VALUES(1013, '������', '����', 1003, to_date('2002-10-09','yyyy-mm-dd'), 560, NULL, 20);

INSERT INTO EMP VALUES(1014, '���μ�', '���', 1006, to_date('2007-11-09','yyyy-mm-dd'), 250, NULL, 10);

?

-- �޿� ���̺� ���� ������ �߰��ϱ�

INSERT INTO SALGRADE VALUES (1, 700,1200);

INSERT INTO SALGRADE VALUES (2, 1201,1400);

INSERT INTO SALGRADE VALUES (3, 1401,2000);

INSERT INTO SALGRADE VALUES (4, 2001,3000);

INSERT INTO SALGRADE VALUES (5, 3001,9999);

COMMIT;

--join����
--2�� �渮�ο��� �ٹ��ϴ� ����� �̸��� �Ի����� ����ϱ�
select ename, hiredate from emp where deptno = 10;

--3�� ANSI JOIN�� ����Ͽ� ��õ���� �ٹ��ϴ� ����̸��� �޿��� ����ϱ�
select e.ename, e.sal from emp e , dept d where e.deptno = d.deptno and loc='��õ';
select e.ename, e.sal from emp e inner join dept d on e.deptno = d.deptno and d.loc = '��õ';

--4�� ��� ���̺�� �μ� ���̺��� �����Ͽ� ����̸��� �μ���ȣ, �μ����� ����Ͻÿ�
select e.ename, e.deptno, d.dname from emp e join dept d on e.deptno=d.deptno;


--5. �渮�� �μ� �Ҽ� ����� �̸��� �Ի����� ����Ͻÿ�
select e.ename, e.hiredate from emp e, dept d where  e.deptno = d.deptno and d.dname='�渮��';

--6. ������ ������ ����� �̸�, �μ����� ����Ͻÿ�
select e.ename, d.dname from emp e , dept d where  e.job='����' and e.deptno=d.deptno;

--7. ���ӻ���� ���켺�� ������� �̸��� ������ ����Ͻÿ�
--???
select e.empno, e.ename, e2.ename from emp e, emp e2 where e.ename = '���켺' and e2.mgr = e2.emptno;

select worker.ename, worker.job, manager.ename from emp worker, emp manager
    where worker.mgr = manager.empno and manager.ename = '���켺';

--8. ���켺�� ������ �ٹ������� �ٹ��ϴ� ����� �̸��� ����Ͻÿ�
--??????????????
select e.ename from emp e, emp e2 where e.deptno=e2.deptno and e2.ename = '���켺' and e.ename <> '���켺';





--��������1
--1. ���� ������ �̿��Ͽ� "������"���� �ٹ��ϴ� ��� ����� �̸��� �޿��� ����϶�.
select e.ename, e.sal from emp e 
    where deptno = (select deptno from dept where dname = '�����');

--2. ���������� ����Ͽ� emp06�� emp���̺��� ��� �����͸� �߰��մϴ�.
create table emp06
as
select * from emp;
select * from emp06

insert into emp06
select * from emp;
--3. emp06���̺� ����� ��� ���� �� ������� �ּ� �޿����� ���� �޿��� �޴� ������� 
--�̸��� �޿��� ������ ����ϵ� ������ ������� ���� SQL���� �ۼ��Ͻÿ�
select ename, sal, job from emp where job='����' and 

--�������̴ϱ� �ٷ� �ε�ȣ ���� �ȵ�
select ename, sal from emp
    where sal > (select sal from emp where job='����');

--any �߰�
select ename, sal, job from emp
    where sal > any (select sal from emp where job='����') and job <> '����';


--4. emp06 ���̺� ����� ��� ���� �� ��õ�� ��ġ�� �μ��� �Ҽӵ� ������� �޿���
--100 �λ��ϴ� SQL���� �ۼ��Ͻÿ�
select * from emp06 where deptno = 20;
update emp06 set sal = sal+100
    where deptno = (select deptno from dept where loc = '��õ');

--5. emp06���̺��� �渮�ο� �Ҽӵ� ����鸸 �����ϴ� SQL���� �ۼ��Ͻÿ�
--�������̴ϱ� where deptno=  ��� ����
delete from emp06 where deptno=(select deptno from dept where dname='�渮��');

--6. '�̹���'�� ���� �μ��� �ٹ��ϴ� ����� �̸��� �μ���ȣ�� ����ϴ� SQL���� �ۼ��Ͻÿ�
select ename, deptno from emp where deptno =(select deptno from emp where ename ='�̹���') 
    and  ename <> '�̹���;
    
--7. '�̹���'�� ������ ������ ���� ����� ����ϴ� SQL���� �ϼ��Ͻÿ�.
select * from emp where job = (select job from emp where ename = '�̹���')
    and ename <> '�̹���';
?
--8. '�̹���'�� �޿��� �����ϰų� �� ���� �޴� ������ �޿��� ����ϴ� SQL���� �ϼ��Ͻÿ�
select ename, sal from emp where sal >= (select sal from emp where ename = '�̹���');
?
--9. '��õ'���� �ٹ��ϴ� ����� �̸�, �μ���ȣ�� ����ϴ� SQL���� �ϼ��Ͻÿ�.
select ename, deptno from emp where deptno = (select deptno from dept where loc='��õ');

--10. ���ӻ���� ���켺�� ����� �̸��� �޿��� ����ϴ� SQL���� �ϼ��Ͻÿ�
select ename, sal, mgr from emp where mgr = (select empno from emp where ename = '���켺');
?

--11. �μ����� ���� �޿��� ���� �޴� ����� ����(�����ȣ, ����̸�, �޿�, �μ���ȣ)�� ����ϴ� SQL���� �ϼ��Ͻÿ�.
--where deptno = e.deptno
--�� deptno�� ���� �������� deptno�̰� �ڿ� e.deptno�� ���ʿ� �ִ� �������� deptno
select empno, ename, sal, deptno from emp e where sal=(select max(sal) from emp where deptno = e.deptno)
    order by deptno;
?

--12. ����(JOB)�� ������ ����� ���� �μ��� �μ���ȣ�� �μ���, ������ ����Ͻÿ�
select deptno, dname, loc from dept where deptno in (select deptno from emp where job='����');
?
--13. ���庸�� �޿��� ���� ���� ������� �̸��� �޿��� ������ ����ϵ� ������ ������� �ʴ� SQL���� �ϼ��Ͻÿ�
select ename, sal, job from emp where sal > all (select sal from emp where job = '����');
?

--������������2

--1. Student ���̺�� department���̺��� ����Ͽ� 'Anthony  Hopkins'�л��� ����(deptno1)�� 
--������ �л����� �̸��� ����1 �̸��� ����Ͻÿ�
SELECT s.name "STUD_NAME" , d.dname "DEPT_NAME" FROM student s , department d
WHERE s.deptno1=d.deptno and s.deptno1 = ( SELECT deptno1 FROM student WHERE name='Anthony Hopkins') ;
select * from student;
?select * from department;
drop table department;

--2. professor���̺�� department���̺��� ��ȸ�Ͽ� 'Meg Ryan'�������� ���߿� �Ի��� ����� �̸��� �Ի��� �а����� ����ϼ���
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

--3. student ���̺��� ����1�� 201���� �а��� ��� �����Ժ��� �����԰� ���� �л����� �̸��� �����Ը� ����ϼ���
select name, weight from student
    where weight > (select avg(weight) from student where deptno1 = 201);
?

--4. emp2���̺��� ����Ͽ� ��ü ���� �� 'Section Head'������ �ּ� �����ں��� ������ ���� ����� �̸��� ���� ������ ����Ͻÿ�.
--�� ���� ��� ������ õ���� ���б�ȣ�� $ǥ�ø� �ϼ���.
select name, position, to_char(pay, '$999,999,999') as ���� from emp2
    where pay  > (select min(pay) from emp2 where position = 'Section head' );
?

--5. student���̺��� ��ȸ�Ͽ� ��ü �л� �߿��� ü���� 2�г� ü�߿��� ���� ���� ������ �л����� �����԰� ���� �л��� �̸��� �г�� �����Ը� ����ϼ���.
select name, grade, weight from student
    where weight < all (select weight from student where grade = 2);
?

--6. emp2���̺�� dept2���̺��� ��ȸ�Ͽ� �� �μ��� ��� ������ ���ϰ� ���߿��� ��� ������ ���� ���� �μ��� 
--��� �������� ���� �޴� �������� �μ���, ������, ������ ����ϼ���.
select d.dname, e.name, to_char(e.pay, '$999,999,999') from emp2 e, dept2 d
    where e.deptno = d.dcode
    and e.pay < all (select avg(pay) from emp2 group by deptno);
    
select * from emp2;
select * from professor;
?select * from department;

--7. professor���̺�� department���̺��� ��ȸ�Ͽ� �� �а����� �Ի����� 
--���� ������ ������ ������ȣ�� �̸�, �а����� ����ϼ���.(�Ի��� ������ �������� �����ϼ���)
SELECT  p.profno, p.name, p.hiredate,d.deptno, d.dname from professor p, department d 
  where p.deptno = d.deptno 
  and (p.deptno, p.hiredate)  in (select deptno, min(hiredate) from professor group by deptno )
order by p.hiredate;

    
?

--8. emp2 ���̺��� ��ȸ�Ͽ� ���޺��� �ش� ���޿��� �ִ� ������ �޴� ������ �̸��� ����, ������ ����ϼ���. 
--���������� �������� �����ϼ���.
SELECT name, position, to_char(pay, '$999,999,999')  from emp2
  where  (position, pay) in ( select position, max(pay) from emp2 group by position );

select name, position, pay from emp2
    where (position, pay) in (select position, max(pay) from emp2 group by position);
?

