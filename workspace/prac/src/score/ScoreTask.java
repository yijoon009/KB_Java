package score;

import java.util.Scanner;

public class ScoreTask {
	public static void main(String[] args) {
		//성적표
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.print("학생 수를 입력하세요: ");
		num=sc.nextInt();
		int[][] score = new int[num][6];
		int[] arr = new int[2];
		
		for (int i = 0; i < score.length; i++) {
				score[i][0] = i+1;	//번호 일괄 입력
				
				System.out.print(i+1+"번 국어점수는? ");
				score[i][1]=sc.nextInt();
				arr[0]+=score[i][1];
				
				
				System.out.print(i+1+"번 영어점수는? ");
				score[i][2]=sc.nextInt();
				arr[1]+=score[i][2];
				
				score[i][3]=score[i][1]+score[i][2];	//합계
				score[i][4]=score[i][3]/2;				//평균
		}
		
		//석차구하기
		for (int i = 0; i < score.length; i++) {
			score[i][5]=1;
			for (int j = 0; j < score.length; j++) {
				if(score[i][3]<score[j][3]) {
					score[i][5]++;
				}
			}
		}
		
		//출력
		System.out.println("번호  국어  영어  합계  평균  석차");
		for (int i = 0; i < score.length; i++) {
			for (int k = 0; k < score[i].length; k++) {
				System.out.print(score[i][k] +" ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println("과목별 합계: " +arr[i]+" 과목별 평균: "+(arr[i]/num));
		}
		
		
		
		
		
	}
}
