package score;

import java.util.Scanner;

public class ScoreTask {
	public static void main(String[] args) {
		//����ǥ
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.print("�л� ���� �Է��ϼ���: ");
		num=sc.nextInt();
		int[][] score = new int[num][6];
		int[] arr = new int[2];
		
		for (int i = 0; i < score.length; i++) {
				score[i][0] = i+1;	//��ȣ �ϰ� �Է�
				
				System.out.print(i+1+"�� ����������? ");
				score[i][1]=sc.nextInt();
				arr[0]+=score[i][1];
				
				
				System.out.print(i+1+"�� ����������? ");
				score[i][2]=sc.nextInt();
				arr[1]+=score[i][2];
				
				score[i][3]=score[i][1]+score[i][2];	//�հ�
				score[i][4]=score[i][3]/2;				//���
		}
		
		//�������ϱ�
		for (int i = 0; i < score.length; i++) {
			score[i][5]=1;
			for (int j = 0; j < score.length; j++) {
				if(score[i][3]<score[j][3]) {
					score[i][5]++;
				}
			}
		}
		
		//���
		System.out.println("��ȣ  ����  ����  �հ�  ���  ����");
		for (int i = 0; i < score.length; i++) {
			for (int k = 0; k < score[i].length; k++) {
				System.out.print(score[i][k] +" ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println("���� �հ�: " +arr[i]+" ���� ���: "+(arr[i]/num));
		}
		
		
		
		
		
	}
}
