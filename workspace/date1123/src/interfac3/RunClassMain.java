package interfac3;

interface Inter01 {
	   int x = 100;
	   int y = 200;
	   void inter01Method ();
	}


	 interface Inter0101 extends Inter01{
	   int z= 300;
	   void inter0101Method ();
	}
	 
	 
	 interface Inter0102 extends Inter01{
	      void inter0102Method();
	   }
	 
	 
	 class RunClassEx implements Inter0101, Inter0102 {

	   @Override
	   public void inter01Method() {
	      int r ;
	      r = x + y;
	      System.out.println(r);
	   }
	   @Override
	   public void inter0101Method() {
	      double r;
	      r = x + y + z;
	      System.out.println(r);
	   }

	   @Override
	   public void inter0102Method() {
//	      x = y;  // x�� ����̱� ������ ���� �ȉ�
	      double r ;
	      r = x + z;
	      System.out.println(r);
	   }
	}

	 
	public class RunClassMain {
	   public static void main(String[] args) {
	      //���� Ŭ������ ��üȭ �ϼ���
	      RunClassEx rce = new RunClassEx();
	      
	      rce.inter01Method();
	      rce.inter0101Method();
	      rce.inter0102Method();
	      
	      //������ ���� Ŭ������ ��üȭ �ϰ� �θ����������� Inter0102�� �ϼ���
	      Inter0102 inter0102 = new RunClassEx();
	      Inter0102.int
	      
	      inter0102.inter01Method();
	      inter0102.inter0102Method();
	      inter0101.inter01Method();
//	      inter0101.inter0102Method();
	      
//	      inter0102.inter0101Method();
	   }
	}



