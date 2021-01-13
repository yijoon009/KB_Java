--pt 118 DML, epdlxj whwkrdj

create table emp03(
    empno number(4),
    ename varchar2(10),
    job varchar2(9),
    hiredate date
);
insert into emp03 values (101, '����','���','2021/01/05');

--���� ��¥�� ������ ����
insert into emp03 values (102, '���ϳ�','���',sysdate);

select * from emp03;
select * from dept;
--������ �����ϱ� UPDATE
update dept set dname='�����' where deptno=30;
update dept set loc = '����';

--����1
CREATE TABLE employee03(
    empno  NUMBER(4) not null,
    eNAME VARCHAR2(20),
    job VARCHAR2(20),
    sal NUMBER(7,3)
);
desc employee03;

--2. ������ ���̺� ������ ���� ������(�� 5��)�� �߰��մϴ�. �߰��� �����͸� ���� NULL���� ���� ���ڸ� ���� ���� �������� Ȯ���� �� �ֽ��ϴ�.
INSERT INTO employee03 VALUES (1000,'ȫ�浿','���',100);
INSERT INTO employee03 VALUES (1010,'�̼���','�븮',150);
INSERT INTO employee03 VALUES (1020,'ȫ����','����',200);
INSERT INTO employee03 VALUES (1030,'�ڰ��','�븮',150);
INSERT INTO employee03 VALUES (1040,'�躴��',null,50);
INSERT INTO employee03 VALUES (1050,'���μ�',null,35);
--����3
update employee3 set sal=sal+50 where sal<200;
--����4
DELETE FROM employee03 WHERE job=null;

desc user_constraints

--primary ��������
create table emp05(
    empno number(4) CONSTRAINT emp05_empno_PK PRIMARY key,
    ename varchar2(10) CONSTRAINT emp05_ename_NN not null,
    job varchar2(9),
    doptno NUMBER(2)
);
insert into emp05 values (10,'����','���',20);

--�������� ���� ����(���̺� �� �빮�ڷ�)
select constraint_name, constraint_type, table_name
from user_constraints where table_name in ('EMP05');

desc emp05
select * from user_constraints where table_name in('DEPT');

create table emp06(
     empno number(4) constraint emp06_empno_pk primary key,
     ename varchar2(10) constraint emp06_ename_nn not null,
     job varchar2(9),
     deptno number(2) constraint emp
);

--��ü ��ȸ
select constraint_name, table_name, column_name from user_cons_columns;
--���� ��ȸ
select constraint_name, table_name, column_name from user_cons_columns where table_name = 'DEPT';

--check ���� ����
create table emp07(
    
);

--�⺻Ű�� ����Ű�� �����ϴ� ���
--�̸��� ��ȭ��ȣ�� �����Ͽ� �⺻Ű�� ����
create table member01(
    name varchar2(10),
    address varchar2(30),
    phone varchar2(16),
    constraint member01_name_phone_pk primary key(name, phone)
);

--�Է��ϱ�
insert into member01 values ('a','seoul','123');
















--���Ͻ�
--ppt 118 DML ������  ���۾�
CREATE TABLE dept01 (
   deptno number(4),
   dname varchar2(14),
   loc varchar2(13) );
-- ��ü ���� �� �Է��ϱ�
INSERT INTO dept01 (deptno, dname, loc) VALUES (10, '�渮��','����');
INSERT INTO dept01 (loc, dname, deptno) VALUES('��õ','�����',20);
INSERT INTO dept01 (loc, dname, deptno) VALUES(10,'�����','100');

-- �����ϱ� : ���� ������� �ڷḦ �ֱ�
INSERT INTO dept01 VALUES(30, '������','�λ�');
-- INSERT INTO dept01 VALUES('��õ','�����',20);(X)

SELECT * from dept01;

--NULL�� ���Ͽ� �Է��ϱ�
INSERT INTO dept01 VALUES(40,'�λ��', NULL);
INSERT INTO dept01 VALUES(50,'�λ��','');
INSERT INTO dept01(deptno, dname) VALUES(50,'�λ��');

--���̺� �����
drop table emp02;
--���̺� �����
CREATE TABLE emp02(
   empno number(4), 
   ename varchar2(10),
   job varchar2(9),
   hiredate date,
   deptno number(2) );
--���̺��� ��������
DESC  emp02;
-- ������ �����ϱ�
INSERT INTO emp02 VALUES ( 1001, '����','���','2021/01/05', 20);
INSERT INTO emp02 VALUES ( 1002, '�ѿ���','�븮', to_date('2021/01/10','YYYY/MM/DD'), 10);
--�ý��ۿ��� ���ó�¥�� ��¥�� �ڷḦ �ֱ�
INSERT INTO emp02 VALUES (1003, '�ְ���','���', SYSDATE, 30);

-- ���̺��� �ڷ� �˻��ϱ�
SELECT * FROM emp02;
SELECT * FROM dept01;

-- ������ �����ϱ� UPDATE
UPDATE dept01 
   SET dname='�����'
   WHERE deptno = 10;
   
--deptno 50�� ��� '�ѹ���', ���� '����'
UPDATE dept01
   SET dname='�ѹ���',loc='����'
   WHERE deptno=50;
   
-- loc�� ��� ����� �ٲٱ�
UPDATE  dept01 
   SET  loc='����' ;

UPDATE dept01 
   SET  deptno = deptno + 1000;

-- ���� ó������ �ǵ��� �� ó���� insert�ߴ� �ڷ� ���� 
rollback;
-- DB�� ����(������) rollback�� �ȵ� 
commit;

SELECT  * FROM dept01;

-- ������ �����ϱ� (��, ���ڵ�, Ʃ��)
DELETE dept01 where loc='�λ�';
--����� 1020�� ���ڵ� �����ϱ�
DELETE dept01 where deptno=1020 and dname='�����';
DELETE dept01;

rollback;

DESC USER_CONSTRAINTS;

--ppt 126
--�ش� DB���� ���̺� ���� �������� ��Ȳ���� ����
SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE FROM   USER_CONSTRAINTS;  

SELECT * FROM   USER_CONSTRAINTS; 

--NOT NULL��������
insert into emp02
  values (null, null, '���',sysdate, 20);

desc emp02;

drop table emp02;

CREATE TABLE emp02 (
  empno number(4) not null,
  ename varchar2(10) not null,
  job varchar2(9),
  hiredate date,
  deptno number(2) );
-- �°� ������ ���� ����
insert into emp02
  values (1010, '�λ��', '���',sysdate, 20);  
--Ʋ���� ������ �ֱ� ����
insert into emp02
  values (1010, '', '���',sysdate, 20); (X)
 
insert into emp02
  values (1010, NULL, '���',sysdate, 20);    

insert into emp02 (empno , job , hiredate, deptno) 
  values (1020, '���',sysdate, 20);  
  
--  
insert into emp02
  values (1010, '�λ��', null, null, null); 
  
select * from emp02; 


-- ������ ���� ����ϴ� UNIQUE���� ����
CREATE TABLE emp03 (
   empno number(4) UNIQUE,
   ename varchar2(10) not null,
   job varchar2(9),
   deptno number(2) );
   
desc emp03;
SELECT * FROM   USER_CONSTRAINTS WHERE TABLE_NAME='EMP03';
select * from user_constraints where table_name = 'EMP03';

-- ���������� �����͸� �����ϱ�
INSERT INTO emp03 VALUES(1010, 'ȫ�浿','���',10);
INSERT INTO emp03 VALUES(1020, '�̼���','���',20);
INSERT INTO emp03 VALUES(null, '�̼���','���',20);
-- ����Ű ����� �Է� �ȵǰ� �ϱ�
INSERT INTO emp03 VALUES(1020, '������','�븮',30);
select * from emp03;

--���� ���ǿ� ��Ī�� �ο��ϱ�
--�̿�о� : ���������� �������� ����ؾ� �Ǵ� ���, �������� �Ͻ�����

CREATE TABLE emp04(
   empno number(4) CONSTRAINT emp04_empno_UK UNIQUE,
   ename varchar2(10) CONSTRAINT emp04_ename_NN NOT null,
   job varchar2(9),
   deptno number(2) ); 
   

select * from user_constraints where table_name = 'EMP04' ;
select * from user_constraints where table_name = 'EMP03';

--PRIMARY ��������
CREATE TABLE emp05( 
   empno number(4) CONSTRAINT emp05_empno_PK primary key,
   ename varchar2(10) CONSTRAINT emp05_ename_NN Not null,
   job varchar2(9),
   deptno number(2) );
   
--�������� ������ �ֱ�
INSERT INTO emp05 VALUES (1010, 'a', '���',10);

--Primary key�� ����ǰ� �Է��ϱ�
--UNiQUE����
INSERT INTO emp05 VALUES (1010, 'a', '���',10);
--Not null����
INSERT INTO emp05 VALUES (null, 'a', '���',10);

--���� ���� ���� ����
SELECT CONSTRAINT_NAME, CONSTRAINT_TYPE, R_CONSTRAINT_NAME,TABLE_NAME 
 FROm USER_CONSTRAINTS WHERE TABLE_NAME in ('EMP05'); 

--FOREIGN KEY��������
CREATE TABLE emp06(
   empno number(4)  CONSTRAINT emp06_empno_PK Primary key,
   ename varchar2(10) CONSTRAINT emp06_ename_NN NOT null,
   job varchar2(9),
   deptno number(2) CONSTRAINT emp06_deptno_FK REFERENCES DEPT(deptno) );
   
--dept���̺��� ���� ������
desc dept;
--dept���̺��� �������� ������
SELECT * FROM USER_CONSTRAINTS WHERE table_name in ('DEPT') ;
 
--dept ���̺��� �ڷ� �˻�
SELECT * FROM dept;
--emp06���̺� �ڷḦ ���� �Է��ϱ�
INSERT INTO emp06 VALUES (1010, 'ȫ�浿', '���', 10);
INSERT INTO emp06 VALUES (1020, 'ȫ�浿', '���', 30);

--�ܷ�Ű�� ����ǰ� �ڷ� �ֱ�
INSERT INTO emp06 VALUES (1030, 'ȫ�浿', '���', 60);
--������ : ����? dept ���̺� deptno�� ���� 60�� ��� �ֱ� ������ 


desc dept;


-- emp07���̺��� ����� �ܷ�Ű�� loc�� ��� - ���� ����? �θ����̺��� �⺻Ű�� �ƴϱ� ����
CREATE TABLE emp07 (
   empno number(4) CONSTRAINT emp07_empno_pk PRIMAry Key,
   ename varchar2(10) constraint emp07_ename_nn not null,
   job varchar2(9),
   deptno number(2),
   loc varchar2(13) CONSTRAINT emp07_loc_FK references dept(loc)  ) ;

select constraint_name, table_name, column_name from user_cons_columns;

--CHECK ���� ����
CREATE TABLE emp07 (
   empno number(4) CONSTRAINT emp07_empno_PK primary key,
   ename varchar2(10) CONSTRAINT emp07_ename_NN not null,
   sal number(7,2) CONSTRAINT emp07_sal_ck CHECK(sal between 500 and 5000), 
   gender varchar2(1) CONSTRAINT emp07_gender_ck CHECK(gender in ('M','m','F','f') ) );

-- ���� �Է�
INSERT INTO emp07 VALUES (1020, 'ȫ�浿', 1000, 'M' );
-- ���� �Է�
--sal���� ����
INSERT INTO emp07 VALUES (1030, 'ȫ�浿', 100, 'M' );
--gender���� ����
INSERT INTO emp07 VALUES (1030, 'ȫ�浿', 1000, 'K' );

--default ���� ����
create table dept01(
   deptno number(2) CONSTRAINT dept01_deptno_pk primary key,
   dname varchar2(14),
   loc varchar2(13)  default '����' ) ;

--�����Է�
insert into dept01 values(10 , '�λ��','��õ');
--loc �����ؼ� �Է��ϱ�
insert into dept01(deptno, dname) values (20,'�����');

select * from dept01;

-- ���� ���� ����� ��� : 1. �÷����� ��������, 2. ���̺� ���� ��� ��������(����Ű, alter table�� ���������� ���߿� �߰����ٶ�)

-- ��� �÷� ���� ���� ���ǰ� ������ ���� ����� ���� �����ϱ�
drop table emp01;
-- ��� �÷� ���� ���� ����
CREATE TABLE emp01(
   empno number(4) Primary key,
   ename varchar2(10) not null,
   job varchar2(9) Unique,
   deptno number(2) references dept(deptno) );
   
-- ������ ���� ����� ���� �����ϱ�
drop table emp02;

CREATE TABLE emp02 (
   empno number(4),
   ename varchar2(10) not null,
   job varchar2(9),
   deptno number(2),
   
   CONSTRAINT  emp02_empno_pk  PRIMARY KEY(empno), 
   CONSTRAINT emp02_job_uk UNIQUE(job),
   CONSTRAINT emp02_deptno_fk FOREIGN KEY(deptno) REFERENCES dept(deptno)  );

drop table emp03;

CREATE TABLE emp03 (
   empno number(4),
   ename varchar2(10) not null,
   job varchar2(9),
   deptno number(2),
   
   PRIMARY KEY(empno), 
   UNIQUE(job),
   FOREIGN KEY(deptno) REFERENCES dept(deptno)  );   
   
-- user_constraints ������ ��ųʸ��˻�
--emp01, emp02, emp03���̺��� ���������� �˻�
SELECT * FROM USER_CONSTRAINTS WHERE TABLE_NAME in ('EMP01','EMP02','EMP03');

--�⺻Ű�� ����Ű�� �����ϴ� ���
--�̸��� ��ȭ��ȣ�� �����Ͽ� �⺻Ű�� �����ϱ�
CREATE TABLE member01 (
   name varchar2(10),
   address varchar2(30),
   phone varchar2(16),
   CONSTRAINT member01_name_phone_pk PRIMARY KEY(name, phone) );
   
-- �Է��ϱ�
insert into member01 values ('a','seoul','123');

insert into member01 values ('a','seoul','1234');


select * from member01;




