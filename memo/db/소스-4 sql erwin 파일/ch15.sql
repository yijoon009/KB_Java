SET SERVEROUTPUT ON
BEGIN
  DBMS_OUTPUT.PUT_LINE('Hello World!'); 
END;
/

select * from emp;

DECLARE
  VEMPNO NUMBER(4);
  VENAME VARCHAR2(10);
BEGIN
  VEMPNO := 1001;
  VENAME := '����';   
  DBMS_OUTPUT.PUT_LINE('   ���    �̸�'); 
  DBMS_OUTPUT.PUT_LINE('  ---------------');
  DBMS_OUTPUT.PUT_LINE('   ' || VEMPNO || '   ' || VENAME); 
END;
/


DECLARE
  VEMPNO EMP.EMPNO%TYPE;
  VENAME EMP.ENAME%TYPE;
BEGIN
  SELECT EMPNO, ENAME INTO VEMPNO, VENAME
  FROM EMP
  WHERE ENAME='����';
  DBMS_OUTPUT.PUT_LINE('   ���    �̸�'); 
  DBMS_OUTPUT.PUT_LINE('  ---------------');
  DBMS_OUTPUT.PUT_LINE('   ' || VEMPNO || '   ' || VENAME); 
END;
/

DECLARE
   VEMPNO 	 EMP.EMPNO%TYPE;
   VENAME 	 EMP.ENAME%TYPE;
   VDEPTNO   EMP.DEPTNO%TYPE;
   VDNAME 	 VARCHAR2(20) := NULL;
BEGIN
   SELECT EMPNO, ENAME, DEPTNO 
   INTO VEMPNO, VENAME, VDEPTNO 
   FROM  EMP
   WHERE EMPNO=1001;
   
   IF (VDEPTNO = 10)  THEN
      VDNAME := 'ACCOUNTING';
   END IF;
   IF (VDEPTNO = 20)  THEN
     VDNAME := 'RESEARCH';
   END IF;
   IF (VDEPTNO = 30)  THEN
      VDNAME := 'SALES';
   END IF;
   IF (VDEPTNO = 40) THEN  
      VDNAME := 'OPERATIONS';
   END IF;

   DBMS_OUTPUT.PUT_LINE('   ���     �̸�      �μ���');
   DBMS_OUTPUT.PUT_LINE('  ---------------------------');
   DBMS_OUTPUT.PUT_LINE('   ' || VEMPNO||'    '
                ||VENAME||'    '||VDNAME);
END;
/


DECLARE
  VEMP EMP%ROWTYPE;
  ANNSAL NUMBER(7,2);
BEGIN    
  SELECT * INTO VEMP
  FROM EMP
  WHERE ENAME='����';

  IF (VEMP.COMM IS NULL) THEN 
    ANNSAL:=VEMP.SAL*12;       
  ELSE     
    ANNSAL:=VEMP.SAL*12+VEMP.COMM; 
  END IF;

  DBMS_OUTPUT.PUT_LINE('  ���    �̸�    ����'); 
  DBMS_OUTPUT.PUT_LINE('--------------------------');
  DBMS_OUTPUT.PUT_LINE('  '||VEMP.EMPNO||'   '
         ||VEMP.ENAME||'   '||ANNSAL); 
END;
/

DECLARE
  VEMP EMP%ROWTYPE;
  VDNAME VARCHAR2(14);
BEGIN  
  SELECT * INTO VEMP
  FROM EMP
  WHERE ENAME='����';

  IF (VEMP.DEPTNO = 10)  THEN
    VDNAME := 'ACCOUNTING';
  ELSIF (VEMP.DEPTNO = 20)  THEN
    VDNAME := 'RESEARCH';
  ELSIF (VEMP.DEPTNO = 30)  THEN
    VDNAME := 'SALES';
  ELSIF (VEMP.DEPTNO = 40) THEN  
    VDNAME := 'OPERATIONS';
  END IF;

  DBMS_OUTPUT.PUT_LINE('  ���    �̸�     �μ���'); 
  DBMS_OUTPUT.PUT_LINE('------------------------------');

  DBMS_OUTPUT.PUT_LINE('  '||VEMP.EMPNO
        ||'    '||VEMP.ENAME||'   '||VDNAME); 
END;
/

DECLARE
  N  NUMBER := 1;
BEGIN
  LOOP
    DBMS_OUTPUT.PUT_LINE( N );
    N := N + 1;
    IF N > 5 THEN
      EXIT;
    END IF;
  END LOOP;
END;
/

DECLARE
BEGIN
  FOR N IN 1..5 LOOP
    DBMS_OUTPUT.PUT_LINE( N );
  END LOOP;
END;
/

DECLARE
  N NUMBER := 1;
BEGIN
  WHILE N <= 5 LOOP
    DBMS_OUTPUT.PUT_LINE( N );
    N := N + 1;
  END LOOP;
END;
/
drop table s_emp 
create table s_emp 
as
select * from emp;

select ENAME, sal from s_emp
WHERE ENAME='����';

DECLARE
   VEMP 	   s_emp%ROWTYPE;   
   VDEPTNO   s_emp.DEPTNO%TYPE;   
   VPERCENT  NUMBER(2);
BEGIN
   select deptno into vdeptno
   from dept
   where dname like '%����%';
   
   SELECT * INTO VEMP
   FROM s_emp
   WHERE ENAME='����';
  
   IF VEMP.deptno  =  vdeptno THEN
      VPERCENT := 10;
   ELSE
      VPERCENT := 5;
   END IF;
   
   update s_emp
   set sal = sal + sal*VPERCENT/100
   where ENAME='����';
   commit;
   END;
/


DECLARE
 -- %ROWTYPE�� ������θ� �����ϴ� ���۷��� ���� ���� 
  VEMP EMP%ROWTYPE; 
  ANNSAL NUMBER(7,2);
BEGIN
 -- ���� ����� ��ü ������ �� ������ VEMP�� �����Ѵ�.  
  SELECT * INTO VEMP
  FROM EMP
  WHERE ENAME='����';

 -- Ŀ�̼��� NULL�� ��� 0���� �����ؾ� �ùٸ� ���� ���
  IF (VEMP.COMM IS NULL)  THEN
   VEMP.COMM := 0;
  END IF;                      
 -- ��Į�� ������ ������ ����� ����� �����Ѵ�.
  ANNSAL:=VEMP.SAL*12+VEMP.COMM ; 

-- ��� ��� 
  DBMS_OUTPUT.PUT_LINE('��� / �̸� / ����'); 
  DBMS_OUTPUT.PUT_LINE('------------------------');
  DBMS_OUTPUT.PUT_LINE(VEMP.EMPNO||' /' 
               ||VEMP.ENAME||' /'||ANNSAL); 
END;
/

DECLARE
  DAN  NUMBER := 5;
  I  NUMBER := 1;
BEGIN
  LOOP
    DBMS_OUTPUT.PUT_LINE(
        DAN || ' * ' || I ||' = '|| (DAN*I) );
    I := I + 1;  
    IF I > 9          THEN
       EXIT;   
    END IF;
  END LOOP;             
END;
/

DECLARE
   VDEPT DEPT%ROWTYPE;                        
BEGIN
  DBMS_OUTPUT.PUT_LINE('�μ���ȣ / �μ��� / ������'); 
  DBMS_OUTPUT.PUT_LINE('-----------------------');
  -- CNT�� 1���� 1�� �����ϴٰ� 4�� �Ǹ� �ݺ����� ���
   FOR CNT IN 1..4 LOOP                        
    SELECT * INTO VDEPT
    FROM DEPT
    WHERE DEPTNO=10*CNT;

    DBMS_OUTPUT.PUT_LINE(VDEPT.DEPTNO || '      / ' 
      || VDEPT.DNAME || ' / ' || VDEPT.LOC); 
  END LOOP;
END;
/

DECLARE
  V_CNT  NUMBER := 1;
  V_STR  VARCHAR2(10) := NULL;
BEGIN
  WHILE V_CNT <= 5           LOOP
    V_STR := V_STR || '*';
    DBMS_OUTPUT.PUT_LINE(V_STR);
     V_CNT := V_CNT + 1;                   
  END LOOP;             
END;
/

