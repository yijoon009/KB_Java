create table employee03(    
   empno number(4),
   ename varchar(20),
   job varchar(20),
   sal number(7, 3)
);
desc employee03
insert into employee03 values(1000, '�ѿ��', '�·�', 100);
insert into employee03 values(1010, '����', '�ǰ�', 150);
insert into employee03 values(1020, '�ֽð�', '��������', 250);
insert into employee03 values(1030, '���', NULL, 250);
insert into employee03 values(1040, '��������', '', 200);

update employee03 set sal=sal+50
where sal<200;

commit;

delete employee03
where job is null; 

create table dept02 
as select * from dept where 1=0

select * from dept01
