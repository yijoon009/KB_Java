--���̺� ����
create table member(
    name varchar2(10) primary key,
    age number(3),
    weight number(3),
    height number(3),
    sex char(3)

);

--������ ����
insert into member values('������', 17, 50, 160, '��');
insert into member values('ȫ�浿', 20, 60, 175, '��');
insert into member values('�̼���', 20, 60, 180, '��');

--�����ͺ��̽��� Ȯ��(����)
commit;