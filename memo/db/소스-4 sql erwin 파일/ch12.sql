select avg(salary)
from emp;

select round(avg(sal)) "��� �޿�"
from emp;


select ename, sal
from emp 
where sal > ( select avg(sal)
              from emp );

select distinct deptno 
from emp 
where sal>500;

select ename, sal, deptno 
from emp 
where deptno = ( select distinct deptno 
                  from emp 
                  where sal>500);


select ename, sal, deptno 
from emp 
where deptno IN ( select distinct deptno 
                    from emp 
                    where sal > 500 );

select max(sal) "�ִ� �޿�"
from emp 
where deptno = 30

select ename, sal 
from emp 
where sal > ( select max(sal) 
                 from emp 
                 where deptno=30);
                 
select round(avg(sal)) "��� �޿�"
from emp;


select ename, sal
from emp 
where sal > ( select avg(sal)
              from emp );

select distinct deptno 
from emp 
where sal>500;

select ename, sal, deptno 
from emp 
where deptno = ( select distinct deptno 
                  from emp 
                  where sal>500);


select ename, sal, deptno 
from emp 
where deptno IN ( select distinct deptno 
                    from emp 
                    where sal > 500 );

select max(sal) "�ִ� �޿�"
from emp 
where deptno = 30;


select ename, sal 
from emp 
where sal > ( select max(sal) 
                 from emp 
                 where deptno=30); 

select sal
from emp
where deptno = 30;

select ename, sal 
from emp 
where sal >  ( select sal
                from emp
                where deptno=30 );

select ename, sal 
from emp 
where sal > ALL ( select sal
                     from emp
                     where deptno=30);

select min(sal) 
from emp 
where deptno = 30;

select ename, sal 
from emp 
where sal > ( select min(sal) 
                 from emp 
                 where deptno=30);


select * 
from dept 
where EXISTS ( select *  
                 from emp 
                 where deptno = 10);

select * 
from dept 
where EXISTS ( select *  
               from emp 
               where emp.deptno = dept.deptno);
               
drop table emp02;

create table emp02 
as 
select * from emp;

desc emp02
               
select * from emp02;

drop table emp03;

create table emp03 
as 
select empno, ename from emp;

select * from emp03;          

drop table emp05;
create table emp05
as
select * from emp
where deptno=10;
select * from emp05;

drop table emp06;

create table emp06
as 
select * from emp where 1=0;

create table emp06
as 
select * from emp where 1=0;

select * from emp06;
desc EMP06;
create table dept02 
as 
select * from dept where 1=0;

drop table dept01;

create table dept01 
as 
select * from dept where 1=0;

desc dept01

insert into dept01
select * from dept; 

select *
from dept01;
  
commit             

update dept01
set loc = ( select loc 
            from dept01
            where deptno = 40)
where deptno= 20;

select * from dept01;

delete from emp02;

insert into emp02
select * from emp ;

select * from emp02;

desc emp06

delete from emp02 
where deptno = ( select deptno
                   from dept
                    where dname='������' );

select * from emp06 ;

select deptno
from dept
where dname='������';

select ename, sal
from emp 
where deptno = 30;

select ename, sal
from emp 
where deptno = ( select deptno
                  from dept
                  where  dname = '������' );





select ename, deptno
from emp
where deptno = ( select deptno
                  from emp 
                  where  ename='�̹���')
and ename<>'�̹���';



select *
from emp
where job = ( select job
               from emp 
               where  ename='�̹���')
and ename<>'�̹���';

8.

insert into emp06
select * from emp ;

select * from emp06;

8.
���� :
select ename, sal
from emp
where sal > any ( select sal 
                     from emp
                     where job='����')
and job <> '����';


9.
update emp06 
set sal=sal+100
where deptno=(select deptno
               from dept
               where loc='��õ');

select * from emp06 order by deptno;


select * from emp06;

10.
delete from emp06 
where deptno=(select deptno
               from dept
               where dname='�渮��');

12. 
���� :
select *
from emp
where job = ( select job
               from emp 
               where  ename='�̹���')
and ename<>'�̹���';

13. 
���� :
select ename, sal
from emp
where sal >=  ( select sal
                 from emp 
                 where  ename='�̹���')
and ename<>'�̹���';

14. 
���� :
select ename, deptno
from emp
where deptno = ( select deptno
                  from dept
                  where loc='��õ');
15. 
���� :
select ename, sal, mgr
from emp
where mgr= ( select empno
              from emp 
              where ename='���켺');

16.
���� :
select empno, ename, sal, deptno
from emp e
where sal = ( select max(sal) 
             from emp 
             where deptno=e.deptno)
order by deptno;

17.
���� :
select *
from dept
where deptno in (select deptno
               from emp
               where job='����');

18.
���� :
select ename, sal, job
from emp
where sal > all ( select sal 
                       from emp 
                       where job='����');


               