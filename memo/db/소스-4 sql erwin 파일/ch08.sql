CREATE TABLE DEPT01(
  DEPTNO NUMBER(2),
  DNAME VARCHAR2(14),
  LOC   VARCHAR2(13) 
);

desc DEPT01

insert into dept01
values(10, '�渮��', '����');

select * from dept01;

commit;

insert into dept01
(DEPTNO, loc, dname)
values(20, '��õ', '�λ��');

insert into dept01
(deptno , dname)
values(30, '������');

insert into dept01
values(40, '�����', NULL);

insert into dept01
values(50, '��ȹ��', '');

drop  table emp02;

create table emp02( 
   empno number(4),
   ename varchar2(10),
   job   varchar2(9),
   hiredate date,
   deptno number(2)
);   
 
desc emp02
insert into emp02
values(1001, '����', '���', '2015/03/01', 20);
 
insert into emp02select * from emp02;
values(1002, '�ѿ���', '�븮', to_date('2014, 05, 01', 'YYYY, MM, DD'), 20);

insert into emp02
values(1003, '����ȣ', '����', SYSDATE, 30);

update dept01
set dname='�����'
where deptno=10;

update dept01
set dname='�����2', loc='�λ�'
where deptno=20;
 
update dept01
set dname='�����3';

delete dept01
where deptno=10; 
commit;

delete dept01;

delete emp02;

ROLLBACK;

delete emp02
where deptno=20; 
