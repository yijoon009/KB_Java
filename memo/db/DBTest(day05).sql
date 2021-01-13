--pt 118 DML, epdlxj whwkrdj

create table emp03(
    empno number(4),
    ename varchar2(10),
    job varchar2(9),
    hiredate date
);
insert into emp03 values (101, '김사랑','사원','2021/01/05');

--오늘 날짜로 데이터 삽입
insert into emp03 values (102, '김하나','사원',sysdate);

select * from emp03;
select * from dept;
--데이터 수정하기 UPDATE
update dept set dname='생산부' where deptno=30;
update dept set loc = '서울';

--문제1
CREATE TABLE employee03(
    empno  NUMBER(4) not null,
    eNAME VARCHAR2(20),
    job VARCHAR2(20),
    sal NUMBER(7,3)
);
desc employee03;

--2. 생성된 테이블에 다음과 같은 데이터(총 5개)를 추가합니다. 추가된 데이터를 보면 NULL값과 공백 문자를 갖는 행이 존재함을 확인할 수 있습니다.
INSERT INTO employee03 VALUES (1000,'홍길동','사원',100);
INSERT INTO employee03 VALUES (1010,'이순신','대리',150);
INSERT INTO employee03 VALUES (1020,'홍명진','과장',200);
INSERT INTO employee03 VALUES (1030,'박경미','대리',150);
INSERT INTO employee03 VALUES (1040,'김병진',null,50);
INSERT INTO employee03 VALUES (1050,'박인수',null,35);
--문제3
update employee3 set sal=sal+50 where sal<200;
--문제4
DELETE FROM employee03 WHERE job=null;

desc user_constraints

--primary 제약조건
create table emp05(
    empno number(4) CONSTRAINT emp05_empno_PK PRIMARY key,
    ename varchar2(10) CONSTRAINT emp05_ename_NN not null,
    job varchar2(9),
    doptno NUMBER(2)
);
insert into emp05 values (10,'이준','사원',20);

--제약조건 상태 보기(테이블 명 대문자로)
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

--전체 조회
select constraint_name, table_name, column_name from user_cons_columns;
--지정 조회
select constraint_name, table_name, column_name from user_cons_columns where table_name = 'DEPT';

--check 제약 조건
create table emp07(
    
);

--기본키를 복합키로 지정하는 방버
--이름과 전화번호를 결합하여 기본키로 지정
create table member01(
    name varchar2(10),
    address varchar2(30),
    phone varchar2(16),
    constraint member01_name_phone_pk primary key(name, phone)
);

--입력하기
insert into member01 values ('a','seoul','123');
















--혀니쌤
--ppt 118 DML 데이터  조작어
CREATE TABLE dept01 (
   deptno number(4),
   dname varchar2(14),
   loc varchar2(13) );
-- 전체 형식 다 입력하기
INSERT INTO dept01 (deptno, dname, loc) VALUES (10, '경리부','서울');
INSERT INTO dept01 (loc, dname, deptno) VALUES('인천','전산부',20);
INSERT INTO dept01 (loc, dname, deptno) VALUES(10,'전산부','100');

-- 생략하기 : 구조 순서대로 자료를 넣기
INSERT INTO dept01 VALUES(30, '영업부','부산');
-- INSERT INTO dept01 VALUES('인천','전산부',20);(X)

SELECT * from dept01;

--NULL에 대하여 입력하기
INSERT INTO dept01 VALUES(40,'인사부', NULL);
INSERT INTO dept01 VALUES(50,'인사부','');
INSERT INTO dept01(deptno, dname) VALUES(50,'인사부');

--테이블 지우기
drop table emp02;
--테이블 만들기
CREATE TABLE emp02(
   empno number(4), 
   ename varchar2(10),
   job varchar2(9),
   hiredate date,
   deptno number(2) );
--테이블의 구조보기
DESC  emp02;
-- 데이터 삽입하기
INSERT INTO emp02 VALUES ( 1001, '김사랑','사원','2021/01/05', 20);
INSERT INTO emp02 VALUES ( 1002, '한예슬','대리', to_date('2021/01/10','YYYY/MM/DD'), 10);
--시스템에서 오늘날짜로 날짜의 자료를 넣기
INSERT INTO emp02 VALUES (1003, '최경희','사원', SYSDATE, 30);

-- 테이블의 자료 검색하기
SELECT * FROM emp02;
SELECT * FROM dept01;

-- 데이터 수정하기 UPDATE
UPDATE dept01 
   SET dname='생산부'
   WHERE deptno = 10;
   
--deptno 50인 경우 '총무부', 지역 '서울'
UPDATE dept01
   SET dname='총무부',loc='서울'
   WHERE deptno=50;
   
-- loc를 모두 서울로 바꾸기
UPDATE  dept01 
   SET  loc='서울' ;

UPDATE dept01 
   SET  deptno = deptno + 1000;

-- 제일 처음으로 되돌아 감 처음에 insert했던 자료 상태 
rollback;
-- DB에 쓰기(완전히) rollback이 안됨 
commit;

SELECT  * FROM dept01;

-- 데이터 삭제하기 (행, 레코드, 튜플)
DELETE dept01 where loc='부산';
--전산부 1020인 레코드 삭제하기
DELETE dept01 where deptno=1020 and dname='전산부';
DELETE dept01;

rollback;

DESC USER_CONSTRAINTS;

--ppt 126
--해당 DB안의 테이블에 대한 제약조건 상황등을 보기
SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE FROM   USER_CONSTRAINTS;  

SELECT * FROM   USER_CONSTRAINTS; 

--NOT NULL제약조건
insert into emp02
  values (null, null, '사원',sysdate, 20);

desc emp02;

drop table emp02;

CREATE TABLE emp02 (
  empno number(4) not null,
  ename varchar2(10) not null,
  job varchar2(9),
  hiredate date,
  deptno number(2) );
-- 맞게 데이터 넣은 예제
insert into emp02
  values (1010, '인사부', '사원',sysdate, 20);  
--틀리게 데이터 넣기 예제
insert into emp02
  values (1010, '', '사원',sysdate, 20); (X)
 
insert into emp02
  values (1010, NULL, '사원',sysdate, 20);    

insert into emp02 (empno , job , hiredate, deptno) 
  values (1020, '사원',sysdate, 20);  
  
--  
insert into emp02
  values (1010, '인사부', null, null, null); 
  
select * from emp02; 


-- 유일한 값만 허용하는 UNIQUE제약 조건
CREATE TABLE emp03 (
   empno number(4) UNIQUE,
   ename varchar2(10) not null,
   job varchar2(9),
   deptno number(2) );
   
desc emp03;
SELECT * FROM   USER_CONSTRAINTS WHERE TABLE_NAME='EMP03';
select * from user_constraints where table_name = 'EMP03';

-- 정상적으로 데이터를 삽입하기
INSERT INTO emp03 VALUES(1010, '홍길동','사원',10);
INSERT INTO emp03 VALUES(1020, '이순신','사원',20);
INSERT INTO emp03 VALUES(null, '이순신','사원',20);
-- 유일키 위배로 입력 안되게 하기
INSERT INTO emp03 VALUES(1020, '정현희','대리',30);
select * from emp03;

--제약 조건에 명칭을 부여하기
--이용분야 : 제약조건의 복합으로 사용해야 되는 경우, 제약조건 일시정지

CREATE TABLE emp04(
   empno number(4) CONSTRAINT emp04_empno_UK UNIQUE,
   ename varchar2(10) CONSTRAINT emp04_ename_NN NOT null,
   job varchar2(9),
   deptno number(2) ); 
   

select * from user_constraints where table_name = 'EMP04' ;
select * from user_constraints where table_name = 'EMP03';

--PRIMARY 제약조건
CREATE TABLE emp05( 
   empno number(4) CONSTRAINT emp05_empno_PK primary key,
   ename varchar2(10) CONSTRAINT emp05_ename_NN Not null,
   job varchar2(9),
   deptno number(2) );
   
--정상으로 데이터 넣기
INSERT INTO emp05 VALUES (1010, 'a', '사원',10);

--Primary key에 위배되게 입력하기
--UNiQUE위배
INSERT INTO emp05 VALUES (1010, 'a', '사원',10);
--Not null위배
INSERT INTO emp05 VALUES (null, 'a', '사원',10);

--제약 조건 상태 보기
SELECT CONSTRAINT_NAME, CONSTRAINT_TYPE, R_CONSTRAINT_NAME,TABLE_NAME 
 FROm USER_CONSTRAINTS WHERE TABLE_NAME in ('EMP05'); 

--FOREIGN KEY제약조건
CREATE TABLE emp06(
   empno number(4)  CONSTRAINT emp06_empno_PK Primary key,
   ename varchar2(10) CONSTRAINT emp06_ename_NN NOT null,
   job varchar2(9),
   deptno number(2) CONSTRAINT emp06_deptno_FK REFERENCES DEPT(deptno) );
   
--dept테이블의 구조 보세요
desc dept;
--dept테이블의 제약조건 보세요
SELECT * FROM USER_CONSTRAINTS WHERE table_name in ('DEPT') ;
 
--dept 테이블의 자료 검색
SELECT * FROM dept;
--emp06테이블에 자료를 정상 입력하기
INSERT INTO emp06 VALUES (1010, '홍길동', '사원', 10);
INSERT INTO emp06 VALUES (1020, '홍길동', '사원', 30);

--외래키에 위배되게 자료 넣기
INSERT INTO emp06 VALUES (1030, '홍길동', '사원', 60);
--에러남 : 이유? dept 테이블에 deptno에 없는 60이 들어 있기 때문에 


desc dept;


-- emp07테이블을 만들기 외래키를 loc로 삼기 - 오류 이유? 부모테이블의 기본키가 아니기 때문
CREATE TABLE emp07 (
   empno number(4) CONSTRAINT emp07_empno_pk PRIMAry Key,
   ename varchar2(10) constraint emp07_ename_nn not null,
   job varchar2(9),
   deptno number(2),
   loc varchar2(13) CONSTRAINT emp07_loc_FK references dept(loc)  ) ;

select constraint_name, table_name, column_name from user_cons_columns;

--CHECK 제약 조건
CREATE TABLE emp07 (
   empno number(4) CONSTRAINT emp07_empno_PK primary key,
   ename varchar2(10) CONSTRAINT emp07_ename_NN not null,
   sal number(7,2) CONSTRAINT emp07_sal_ck CHECK(sal between 500 and 5000), 
   gender varchar2(1) CONSTRAINT emp07_gender_ck CHECK(gender in ('M','m','F','f') ) );

-- 정상 입력
INSERT INTO emp07 VALUES (1020, '홍길동', 1000, 'M' );
-- 위배 입력
--sal에서 위배
INSERT INTO emp07 VALUES (1030, '홍길동', 100, 'M' );
--gender에서 위배
INSERT INTO emp07 VALUES (1030, '홍길동', 1000, 'K' );

--default 제약 조건
create table dept01(
   deptno number(2) CONSTRAINT dept01_deptno_pk primary key,
   dname varchar2(14),
   loc varchar2(13)  default '서울' ) ;

--정상입력
insert into dept01 values(10 , '인사부','인천');
--loc 생략해서 입력하기
insert into dept01(deptno, dname) values (20,'생산부');

select * from dept01;

-- 제약 조건 만드는 방식 : 1. 컬럼레벨 제약조건, 2. 테이블 레벨 방식 제약조건(복합키, alter table로 제약조건을 나중에 추가해줄때)

-- 방식 컬럼 레벨 제약 조건과 데이터 레벨 방삭의 제약 조건하기
drop table emp01;
-- 방식 컬럼 레벨 제약 조건
CREATE TABLE emp01(
   empno number(4) Primary key,
   ename varchar2(10) not null,
   job varchar2(9) Unique,
   deptno number(2) references dept(deptno) );
   
-- 데이터 레벨 방식의 제약 조건하기
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
   
-- user_constraints 데이터 딕셔너리검색
--emp01, emp02, emp03테이블의 제약조건을 검색
SELECT * FROM USER_CONSTRAINTS WHERE TABLE_NAME in ('EMP01','EMP02','EMP03');

--기본키를 복합키로 지정하는 방법
--이름과 전화번호를 결합하여 기본키로 지정하기
CREATE TABLE member01 (
   name varchar2(10),
   address varchar2(30),
   phone varchar2(16),
   CONSTRAINT member01_name_phone_pk PRIMARY KEY(name, phone) );
   
-- 입력하기
insert into member01 values ('a','seoul','123');

insert into member01 values ('a','seoul','1234');


select * from member01;




