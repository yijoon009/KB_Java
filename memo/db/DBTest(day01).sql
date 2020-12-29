
--�μ� ���̺� ����
create table dept(
    deptno number(2) CONSTRAINT pk_dept PRIMARY key,
    dname varchar2(14),
    loc varchar2(13)
    
);

--������̺� ����
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

--�޿����̺�
--�޿�, �޿����Ѱ�, �޿����Ѱ�

create table salgrade(
    grade number,
    losal number,
    highsal number

);

--��� ���̺� ���� ������ �ֱ�
insert into dept (deptno,dname,loc)
values(10, '�渮��','seoul');

insert into dept (deptno,dname,loc)
values(20, '�λ��','��õ');

insert into dept values(30, '������','����');
insert into dept values(40, '�����','����');

--������̺� �ȿ��ִ� ���ڵ�(��)�� �˻��ϱ�
select * from SALGRADE;

INSERT INTO EMP VALUES(1001, '����', '���', 1013, to_date('2007-03-01','yyyy-mm-dd'), 300, NULL, 20);
INSERT INTO EMP VALUES(1002, '�ѿ���', '�븮', 1005, to_date('2007-04-02','yyyy-mm-dd'), 250,   80, 30);
INSERT INTO EMP VALUES(1003, '����ȣ', '����', 1005, to_date('2005-02-10','yyyy-mm-dd'), 500,  100, 30);
INSERT INTO EMP VALUES(1004, '�̺���', '����', 1008, to_date('2003-09-02','yyyy-mm-dd'), 600, NULL, 20);
INSERT INTO EMP VALUES(1005, '�ŵ���', '����', 1005, to_date('2005-04-07','yyyy-mm-dd'), 450,  200, 30);
INSERT INTO EMP VALUES(1006, '�嵿��', '����', 1008, to_date('2003-10-09','yyyy-mm-dd'), 480, NULL, 30);
INSERT INTO EMP VALUES(1007, '�̹���', '����', 1008, to_date('2004-01-08','yyyy-mm-dd'), 520, NULL, 10);
INSERT INTO EMP VALUES(1008, '���켺', '����', 1003, to_date('2004-03-08','yyyy-mm-dd'), 500,    0, 30);
INSERT INTO EMP VALUES(1009, '�ȼ���', '����', NULL, to_date('1996-10-04','yyyy-mm-dd'),1000, NULL, 20);
INSERT INTO EMP VALUES(1010, '�̺���', '����', 1003, to_date('2005-04-07','yyyy-mm-dd'), 500, NULL, 10);
INSERT INTO EMP VALUES(1011, '�����', '���', 1007, to_date('2007-03-01','yyyy-mm-dd'), 280, NULL, 30);
INSERT INTO EMP VALUES(1012, '������', '���', 1006, to_date('2007-08-09','yyyy-mm-dd'), 300, NULL, 20);
INSERT INTO EMP VALUES(1013, '������', '����', 1003, to_date('2002-10-09','yyyy-mm-dd'), 560, NULL, 20);
INSERT INTO EMP VALUES(1014, '���μ�', '���', 1006, to_date('2007-11-09','yyyy-mm-dd'), 250, NULL, 10);
INSERT INTO EMP VALUES(1015, '���̼�', '���', 1006, to_date('2007-11-09','yyyy-mm-dd'), 250, NULL, 10);
INSERT INTO EMP VALUES(1018, '��Ƽ�', '���', 1006, to_date('2020-12-29','yyyy-mm-dd'), 250, NULL, 10);
-- comm�� null
INSERT INTO EMP VALUES(1020, '���̼�', '���', 1006, to_date('2020-12-29','yyyy-mm-dd'), 250, NULL, 10);
-- ��¥�� null
INSERT INTO EMP VALUES(1021, '���̼�', '���', 1006, NULL, 250, 500, 10);
-- ���ڰ� null
INSERT INTO EMP VALUES(1022, NULL, '���', 1006, to_date('2020-12-29','yyyy-mm-dd'), 250, 500, 10);
INSERT INTO EMP VALUES(1023, '���̼�', NULL, 1006, to_date('2020-12-29','yyyy-mm-dd'), 250, 500, 10);


INSERT INTO SALGRADE VALUES (1, 700,1200);
INSERT INTO SALGRADE VALUES (2, 1201,1400);
INSERT INTO SALGRADE VALUES (3, 1401,2000);
INSERT INTO SALGRADE VALUES (4, 2001,3000);
INSERT INTO SALGRADE VALUES (5, 3001,9999);


commit;

--��� �ܾ� ����
select distinct job as ���� from emp;

select sal from emp;
--����
select sal as ����, sal*0.03 as ���� from emp;

--nvl : null �̸� 0���� ��ü�ض�
select ename, comm, sal*12+comm as ����, nvl(comm,0) from emp;
--null�� �������� �ƴ϶� ��Ȯ��, �˼����� ���� �ǹ�
--0 �Ǵ� ���Ѵ븦 �ǹ� 
--����, �Ҵ�, �� �Ұ�

--|| concatentation ������ ����Ͽ� �÷� ���� �� �� �ִ�.
select ename || '�� ������ ' || job || '�Դϴ�.' as ���� from emp;

--where�� ������
select * from emp where sal>500;
select * from emp where deptno = 10;
--���ڰ˻�
select * from emp where ename = '�ѿ���';
--��¥ �˻� (2005�� 1�� ������ �Ի��� ���)
select * from emp where hiredate < to_date('2005/01/01', 'yyyy/mm/dd');
select * from emp where hiredate >= to_date('2005/01/01', 'yyyy/mm/dd');

--�μ���ȣ�� 10 �̰� ������ ������ ���
select * from emp where deptno=10 and job='����';

--�޿��� 400~500�� ��� and
select * from emp where sal >= 400 and sal<=500;
--�޿��� 400 �̸��̰ų� 500 �ʰ��� ���
select * from emp where sal < 400 or sal>500;

--between and
--�޿��� 400~500�� ���
select * from emp where sal between 400 and 500;

--in ~�ȿ�
--comm�� 80�̰ų� 100 �̰ų� 200�λ��
select * from emp where comm=80 or comm=100 or comm=200;
select * from emp where comm in (80,100,200);

--comm�� 80�� �ƴϰų� 100�� �ƴϰų� 200�� �ƴ� ���
select * from emp where comm != 80 and comm!=100 and comm!=200;
select * from emp where comm not in (80,100,200);

--������ġ(����ϰ� ��ġ�ϴ� �� �˻�) like
--�达�� ���, ���￡ ��»��
--���ϵ� ī�� : % _
-- % : ���ڰ� ���ų�, �ϳ� �̻��� ���ڰ� � ���� �͵� �������
-- _ : �ϳ��� ���ڰ� � ���� �͵� �������
select * from emp where ename like '%��%';
select * from emp where ename like '__��';
--job���� '��'�� �����ϴ°͸� ã��
select * from emp where job like '��%';
--job���� '��'�� �������� �ʴ°� ã��
select * from emp where job not like '��%';

--comm�� null�λ�� ã��
select * from emp where comm is null;

--����
select * from emp order by sal desc, deptno desc;
select * from emp where job='���' order by sal;

--�ֱٿ� �Ի��� ��� ������� ���� ������ ������
select * from emp where job != '����' order by hiredate desc;

--��� �̸��� �޿� �Ի����ڸ� ���
select ename, sal, hiredate from emp;
--�μ���ȣ�� dno�� �μ����� �μ������� ��Ī(as)�� �ٿ��� ���
select deptno as dno, dname as �μ��� from dept;
--������̺� �����ϴ� ������ ������ ����غ�����.
select distinct job from emp;
--�޿��� 300������ ����� �����ȣ, ����̸�, �޿��� ���
select empno, ename, sal from emp where sal<=300;
-- �̸��� '����ȣ'�� ����� �����ȣ, �����, �޿��� ����ϼ���
select empno, ename, sal from emp where ename='����ȣ';
-- �޿��� 250�̰ų� 300�̰ų� 500�� ������� �����ȣ, �����, �޿��� ���
select empno, ename, sal from emp where sal in (250, 300, 500);
-- �޿��� 250�� 300�� 500�� �ƴ� ������� �˻��ϼ���
select empno, ename, sal from emp where sal not in (250, 300, 500);
-- ����߿��� �̸��� '��'���� �����ϴ� ����� �̸��߿� '��'�� �����ϴ� ����� �����ȣ�� ����̸��� ����ϼ���
select empno, ename from emp where ename like '��%' or ename like '%��%';
-- ����ڰ� ���� ����� �˻��ϼ��� 
select * from emp where mgr is null;
-- ������̺��� �ڷḦ �Ի����� �������� �����Ͽ� �ֱٿ� �Ի��� ������ ���� ���� ����ϼ���
--  (��, �����ȣ, �����, ����, �Ի���) �÷��� ���
select empno, ename, job, hiredate from emp order by hiredate desc;
-- �μ���ȣ�� ���� �����ȣ���� ����ϵ� ���� �μ� ���� ����� ����� ��� �Ի����� ���� ������ ������� ����ϼ���
select * from emp order by deptno asc, hiredate asc;








