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

--������ ppt47
--union : �ߺ��� �ѹ���
--union all : �ߺ��� ���� ���
select * from group_star union select * from single_star;
select * from group_star union all select * from single_star;

--������
select * from group_star INTERSECT select * from single_star;

--������
select * from group_star minus select * from single_star;

--3�� ����Ŭ �Լ� ppt49
select 24*43 from dual;

select 'welcome to oracle', upper('welcome to oracle'), lower('welcome to oracle'),
initcap('welcome to oracle') from dual;

select length('welcome to oracle �ѱ�')from dual;
select concat ('hello',' world') from dual;
select substrb('�����ٶ�',7,6)from dual;

--��¥�� <-> ������
select SYSDATE, to_char(sysdate, 'yyyy-mm-dd, am hh:mi:ss') FROM DUAL;
select to_date('2020/12/29','yyyy-mm-dd') from dual;

--������ <-> ������
select to_char(122330) from dual;
select TO_CHAR('0111022','L999,999,999') FROM DUAL;
select TO_CHAR(0111022.444,'L999,999,999.99') FROM DUAL;
select to_char(123400,'L000,000,000.00') from dual;
--�ں��� ��
select to_number ('555') from dual;
--�պ��� ��
select to_char (555) from dual;

--��¥
select to_char(sysdate,'yyyy-mm-dd') from dual;
select to_char(sysdate) from dual;
select to_char(hiredate, 'yyyy-mm-dd') as �Ի���1,
    to_char(trunc(hiredate, 'month'), 'yyyy/mm/dd') as �Ի���2,
    to_char(round(hiredate, 'month'), 'yyyy/mm/dd') �Ի���3,
    to_char(round(hiredate, 'day'), 'yyyy/mm/dd') �Ի���4
from emp;


select ename, sysdate ����, to_char(hiredate, 'yyyy-dd-mm') �Ի���,
    trunc(months_between(sysdate, hiredate)) �ٹ��޼�
from emp;

select ename,hiredate,  to_char(add_months(hiredate, 6), 'yyyy-mm-dd') �Ի�6������ from emp;


select to_char(sysdate, 'yyyy/mm/dd') ����,
       to_char(next_day(sysdate,'������'), 'yyyy/mm/dd') ������
from dual;

select to_char(hiredate, 'yyyy/mm/dd') �Ի���,
       to_char(last_day(hiredate), 'yyyy/mm/dd') ��������¥
from emp;

--nvl �Լ�
select comm, nvl(comm,0) from emp;
select hiredate, nvl(hiredate, to_date(sysdate, 'yyyy-mm-dd')) from emp;
select ename ,nvl(ename, '�ƹ���'), job, nvl(job, '���') from emp;

--nvl2 �Լ�
select ename, sal, comm, nvl2(comm, sal*12+comm, sal*12) ���� from emp;
--nullif �Լ�
select nullif('a','a'), nullif('a','b') from dual;

select ename, deptno, decode(deptno, 10, '�渮��',
    20, '�λ��',
    30, '������',
    40, '�����') dname from emp;

select ename, deptno,-- ���ǽ� ���̸� 
    case
    when deptno = 10 then '�渮��'-- �̰� �̰� 
    when deptno = 20 then '�λ��'-- �̰� �̰� 
    end as dname --end 
from emp;

--�ǽ�
-- ���� �����Լ��� �ÿ��Ͽ� Ư�� �ุ ��ȸ�϶�
select ename from emp;
--DECODE�Լ��� ����Ͽ� ���ǿ� ���� ���� �ٸ� ����� ���϶�
select ename, deptno, decode(deptno, 10, '�渮��',
    20, '�λ��',
    30, '������',
    40, '�����') dname from emp;
--����ȯ �Լ��� ����Ͽ� ���ϴ� ���·� ����϶�
select to_char(122330) from dual;
--9���� �Ի��� ����� ����� ������ (SUBSTR)�Լ��� ����Ѵ�.
select * from emp where substr(hiredate, 4,2)='09';
--2003�⵵�� �Ի��� ����� �˾Ƴ��� ���� �������� ������ ���� �ۼ��� �� �ֽ��ϴ�.
SELECT * from emp where hiredate >= to_date('2003/01/01', 'yyyy/mm/dd')
 and  hiredate <= to_date('2003/12/31', 'yyyy/mm/dd');

SELECT * from emp where hiredate between  to_date('2003/01/01', 'yyyy/mm/dd')
 and  to_date('2003/12/31', 'yyyy/mm/dd');
 
select * from emp where substr(hiredate, 1,2)='03';
 
-- ������ �̸��� '��'�� ������ ����� �˻��� ������ �սô�.
SELECT * FROM emp WHERE  ename LIKE '%��';
select * from emp where substr(ename, -1, 1)='��';

--�̹����� �̸��� �ι�° ���ڿ� '��'�� �ִ� ����� �˻��� ������
select empno, ename from emp where ename like '_��%';
select empno, ename from emp where instr(ename, '��', 2,1)=2;

--DECODE�Լ��� ����Ͽ� ���ǿ� ���� ���� �ٸ� ����� ���϶�
--���޿� ���� �޿��� �λ��ϵ��� �սô�. ������ '����'�� ����� 5%, '����'�� ����� 10%, '�븮'�� ����� 13%, '���'�� ����� 20%�λ��մϴ�.
select empno, ename, job, sal,
    decode (job, '����', sal*1.05,
                '����',sal*1.1,
                    '�븮', sal*1.13,
                    '���', sal*1.2,
                    sal) upsal
    from emp;

--����ȯ �Լ��� ����Ͽ� ���ϴ� ���·� ����϶�
--�Ի��� ������ 2�ڸ�(YY), ���� ����(MON)���� ǥ���ϰ�, ������ ���(DY)�� �����Ͽ� ����Ͻÿ�
select hiredate, to_char(hiredate, 'yy-mon-dd dy') from emp;
?

--4�� ppt81
-- -2�̸� 10�� �ڸ����� �ø�
--round(����, �ݿø��Ͽ� ������ �ڸ���) round(sal,3) 12300.7886 -> 12300.7900
select sal, round(sal,-2) from emp;
select round(12300.7876, -3) from dual;

--�׷��Լ�
--count�� null ����
select count(sal) from emp;
--select ename, max(sal) from emp;(X) 
--������ �÷��� �׷� �Լ��� ���� ����� �� ����.
--�μ����Ǿ ����Ͽ� ���ؾ� �Ѵ�.
select * from emp;


--group by ��
select deptno, sum(sal) from emp group by deptno;
select deptno, sum(sal) from emp where job = '���' group by deptno;
select job, avg(sal) from emp where ename like '��%' group by job;
--2000~2003�� ���� �Ի��� ���
select job, avg(sal) from emp where substr(hiredate, 1,2) in('00','01','02', '03') group by job;

--����: select from where group by;
select deptno, max(sal), min(sal) from emp group by deptno order by deptno;
--����: select from where group by having order by;
select deptno, avg(sal), max(sal), min(sal) from emp group by deptno having avg(sal) >=500;

--�ǽ�
--��� ����� �޿��ְ��, ������, �Ѿ� �� ��� �޿��� ����Ͻÿ�.  ��տ� ���ؼ��� ������ �ݿø��Ͻÿ�
select max(sal) as Maximum , min(sal) as Minimun, sum(sal) as Sum, round(avg(sal)) as Average from emp;
--�� ��� ���� �������� �޿� �ְ��, ������, �Ѿ� �� ��վ��� ����Ͻÿ�. 
select job, max(sal), min(sal), sum(sal), round(avg(sal)) from emp group by job;
?--count(*)�Լ��� �̿��Ͽ� ��� ������ ������� ����Ͻÿ�
select job, count(*) from emp group by job order by job;
--���� ���� �����Ͻÿ�
select count(*) from emp where job = '����';
--�޿� �ְ��, �޿� �������� ������ ����Ͻÿ�.
select max(sal), min(sal), max(sal) - min(sal) ���� from emp;
--���޺� ����� ���� �޿��� ����Ͻÿ�. ���� �޿��� 500�̸��� �׷��� ���ܽ�Ű��, ����� �޿��� ���� ������������ �����Ͽ� ����Ͻÿ�
select job, min(sal) from emp  group by job having min(sal) >=500 order by min(sal) desc;
--�� �μ��� ���� �μ���ȣ, �����, �μ����� ��� ��� ��� �޿��� ����Ͻÿ�. ��� �޿��� �Ҽ��� ��°�ڸ��� �ݿø��Ͻÿ�
select deptno, count(*), round(avg(sal),1) from emp group by deptno order by count(*);
--�� �μ��� ���� �μ���ȣ �̸�, ������, �����, �μ� ���� ��� ����� ��� �޿��� ����Ͻÿ�. ��� �޿��� ������ �Ҽ��� ��° �ڸ��� �ݿø��Ͻÿ�.
select decode( deptno, 10, '�渮��',
                        20, '�λ��',
                        30, '������',
                        40, '�����') as dname,
            decode(deptno, 10, '����',
            20, '��õ', 30, '����', 40, '����') as ����,
count(*), round(avg(sal),1) from emp group by deptno;












