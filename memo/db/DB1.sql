show user;
create user stmanager IDENTIFIED by test09;
grant CONNECT, RESOURCE TO stmanager;
select username from dba_users;
