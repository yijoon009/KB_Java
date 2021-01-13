select empno, ename
from emp  
order by empno desc;

--ù ��° �̼��ذ��ϱ�
--�ϳ�. ����� �̸��� �޿��� �Ի����ڸ��� ����ϱ�
select deptno, dname
from dept;
--��. �÷� �̸��� ��Ī�� �����ϱ�
select deptno �μ���ȣ, dname as �μ���
from dept;
--��. ������ �ߺ����� �ʰ� �� ���� �����ϱ�
select distinct job
from emp;

--�� ��° �̼� �ذ��ϱ�
--�ϳ�. �޿��� 300 ������ ����� �����ȣ, ��� �̸�, �޿��� ����ϱ�
select empno, ename, sal
from emp
where sal<=300;
--��. �̸��� ������ȣ���� ����� �����ȣ, �����, �޿��� ����ϱ�
select empno, ename, sal
from emp
where ename='����ȣ'
--��. �޿��� 250�̰ų� 300�̰ų� 500�� ������� ��� ��ȣ�� ������ �޿��� �˻��ϱ�
select empno, ename, sal 
from emp
where sal=250 or sal=300 or sal=500; 

select empno, ename, sal 
from emp
where sal IN (250, 300, 500);

--��. �޿��� 250�̰ų� 300�̰ų� 500�� �ƴ� ������� �˻��ϱ�
select empno, ename, sal 
from emp
where sal <> 250 and sal <> 300 and sal <> 500; 

select empno, ename, sal 
from emp
where sal not IN (250, 300, 500);


--�� ��° �̼� �ذ��ϱ�
--�ϳ�.  LIKE �����ڿ� ���ϵ� ī�带 ����Ͽ� ����� �߿��� �̸��� ���衱���� �����ϴ� ����� �̸� �߿� ���⡱�� �����ϴ� ����� �����ȣ�� ����̸��� ����ϱ�
select empno, ename 
from emp 
where ename  like '��%'
or ename like '%��%';
--��. ����� ���� ���(������ �ǰ�����!)�� �˻��ϱ�
select *
from emp 
where mgr IS NULL;
--��. ��� ���̺��� �ֱ� �Ի��� ���� ������ �����ȣ, �����, ����, �Ի��� �÷��� ����ϱ�
select empno, ename, job, to_char(hiredate, 'YYYY/MM/DD')
from emp  
order by hiredate desc

--��. �μ� ��ȣ�� ���� ������� ����ϵ� ���� �μ����� ����� ����� ��� �Ի����� ���� ������ ������� ����ϱ�
select deptno, empno, ename, job, to_char(hiredate, 'YYYY/MM/DD')
from emp  
order by deptno asc, hiredate asc
