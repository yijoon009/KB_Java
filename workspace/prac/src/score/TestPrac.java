package score;

import java.util.Scanner;

public class TestPrac {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] stu = new int[5][6];
		String[] name = new String[5];
		
		while(true) {
			String msg = "1. �Է� 2. ���";
			int choice = 0;
			
			switch(choice) {
			case 1:
				for (int i = 0; i < name.length; i++) {
					System.out.println("�л� �̸��� �Է��ϼ���: ");
					name[i] = sc.next();
					stu[i][0] = i+1;
					System.out.print(i+"�� ���� ������? ");
					stu[i][1]=sc.nextInt();
					
					System.out.print(i+"�� ���� ������? ");
					stu[i][2]=sc.nextInt();
					stu[i][3] = stu[i][1]+stu[i][2];
					stu[i][4] = stu[i][3]/2;
					
				}
				for (int i = 0; i < stu.length; i++) {
					stu[i][5]=1;
					for (int j = 0; j < stu.length; j++) {
						if(stu[i][3]<stu[j][3]) {
							stu[i][5]++;
						}
					}
				}
				break;
			case 2:
				for (int i = 0; i < stu.length; i++) {
					System.out.println("�̸�: "+name[i]);
					System.out.println("�й�  ����  ����  �հ�  ���  ����");
					System.out.println();
				}
				break;
			case 3:
				break;
			}//end switch
			
		}
	}
}
