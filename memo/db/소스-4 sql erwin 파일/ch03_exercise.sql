--ù ��° �̼� �ذ��ϱ�
--�ϳ�. SUBSTR �Լ��� ����Ͽ� 9���� �Ի��� ����� ����ϱ�
SELECT *
FROM emp
WHERE SUBSTR(hiredate, 4, 2)='09';
--��. SUBSTR �Լ��� �̿��Ͽ� 2003�⵵�� �Ի��� ����� �˻��ϱ�
SELECT *
FROM emp
WHERE SUBSTR(hiredate, 1, 2)='03';
--��.  SUBSTR �Լ��� �̿��Ͽ� ���⡱�� ������ ����� �˻��ϱ�
SELECT *
FROM emp
WHERE SUBSTR(ename, -1, 1)='��';  
--��. �̸��� �� ��° ���ڰ� �������� �ִ� ����� �˻��ϱ�
SELECT empno, ename
FROM emp
WHERE INSTR(ename, '��', 2, 1)=2;  
--�� ��° �̼� �ذ��ϱ�
--�ϳ�. ���޿� ���� ������ '����'�� ����� 5%, '����'�� ����� 10%, '�븮'�� ����� 15%, '���'�� ����� 20% �޿� �λ��ϱ�
SELECT empno, ename, job, sal,
       DECODE(job, '����', sal*1.05,                         
                   '����', sal*1.10,
                   '�븮', sal*1.15,
                   '���', sal*1.20, 
                    sal) Upsal
FROM emp;

--�� ��° �̼� �ذ��ϱ�
--�ϳ�. �Ի����� ������ 2�ڸ�(YY), ���� ����(MON)�� ǥ���ϰ� ������ ���(DY)�� �����Ͽ� ����ϱ�
SELECT  hiredate, 
        TO_CHAR (hiredate, 'YY/MON/DD DY')  
FROM emp;

SELECT *
FROM emp
WHERE MOD(empno, 2)=1;

SELECT hiredate, SUBSTR(hiredate, 7, 4) �⵵, 
       SUBSTR(hiredate, 4, 2) ��, SUBSTR(hiredate, 1, 2) ��
FROM emp



SELECT ROUND(SYSDATE-hiredate) �ٹ��ϼ�
FROM emp;

SELECT hiredate, ROUND (hiredate, 'MONTH') 
FROM emp;
    

SELECT empno, ename, NVL(TO_CHAR(mgr, '9999'), ' C E O ') as "���� ���"
FROM emp
WHERE mgr IS NULL;

