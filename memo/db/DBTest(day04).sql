CREATE TABLE specialty ( emp_no number(4) not null,
                         specialty varchar2(20) not null,
                        
                        CONSTRAINT specialty_PK PRIMARY KEY(emp_no, specialty),
                        CONSTRAINT spcialty_FK FOREIGN KEY (emp_no) REFERENCES employee(emp_no) ) ;
                        
drop table specialty;

--두개의 primary key 가질 경우
CREATE TABLE employee (emp_no number(4) not null, 
                       emp_name varchar2(20) not null,
                       salary number(6),
                       birthday date,
                       
                       CONSTRAINT employee_PK PRIMARY KEY(emp_no) );
                       
CREATE TABLE project ( pro_no number(4) not null,
                       pro_content varchar2(100) not null,
                       start_date date,
                       finish_date date, 
                       CONSTRAINT project_PK PRIMARY KEY(pro_no) );
                       
--assign테이블 만들기
CREATE TABLE assign ( emp_no number(4) not null,
                      pro_no number(4) not null,
                      CONSTRAINT assign_PK primary key(emp_no, pro_no), 
                      CONSTRAINT assign_FK FOREIGN KEY (emp_no) REFERENCES employee(emp_no),
                      CONSTRAINT assign_FK1 FOREIGN KEY ( pro_no) REFERENCES project(pro_no) );
create table emp01 (    empno number(4),
                        ename varchar2(14),
                        sal number (7,3)
                        );
--만든 테이블의 구조 보기
desc emp01

--테이블 수정(추가-add, 변경-modify, 삭제-drop column)
--테이블의 컬럼 추가
alter table emp01
add (birth date);

alter table emp01
add (memo varchar2(100));

--데이블의 컬럼 변경하기
alter table emp01
modify ename varchar2(30);

alter table emp01
modify memo varchar2(50);

alter table emp02
drop column birth;

alter table emp01
set unused (empno);

alter table emp01
drop unused columns;

--rename
rename emp01 to emp02;

desc emp02

insert into emp02(ename, sal) values ('홍길동', 100);
insert into emp02(ename, sal) values ('홍길동', 200);

select * from emp02;

--테이블의 자료(레코드) 지우기
truncate table emp02;

--테이블 딕셔너리
select table_name from user_tables;






