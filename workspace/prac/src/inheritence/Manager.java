package inheritence;

import java.util.Scanner;

public class Manager {
	Elementaryschool[] elementary = new Elementaryschool[10];
	Middleschool[] middle = new Middleschool[10];
	Highschool[] high = new Highschool[10];
	Scanner sc = new Scanner(System.in);
	int choice = 0;
	int i=0, j=0, k=0;
	
	String subname, teacher;
	int mid, final_test, suhang, realScore, attend, service;
	double pyojun;
	
	public void view() {
		
		while(true) {
			System.out.print("1. 입력 2. 출력 3. 종료 -> ");
			choice = sc.nextInt();
			if(choice==1) {
				input();
			}else if(choice==2) {
				output();
			}else {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
	}
	
	public void input() {
		System.out.print("1. 초등학생 2. 중학생 3. 고등학생 ->");
		choice = sc.nextInt();
		inputSC(choice);
	}
	
	public void inputSC(int choice) {
		double avg, bunsan = 0.0;
			
			System.out.print("과목명 ->");
			subname = sc.next();
			System.out.println("차례대로 중간고사, 기말고사, 수행평가 점수를 입력하세요");
			mid = sc.nextInt();
			final_test = sc.nextInt();
			suhang = sc.nextInt();
			realScore = mid+final_test+suhang+attend+service;
			if(choice==1) {
				Elementaryschool elestu = new Elementaryschool(subname, mid, final_test,suhang,realScore);
				elementary[i++] = elestu;
			}else {
				System.out.println("차례대로 출석점수, 봉사점수를 입력하세요");
				attend = sc.nextInt();
				service = sc.nextInt();
				System.out.print("선생님 성함 -> ");
				teacher = sc.next();
				realScore = mid+final_test+suhang+attend+service;
				if(choice==2) {
					Middleschool midstu = new Middleschool(subname,teacher,mid, final_test,suhang, realScore,attend,service);
					middle[j++] = midstu;
				}if(choice==3) {
					avg = realScore/5.0;
					bunsan = (Math.pow(mid-avg, 2)+Math.pow(final_test-avg, 2)+Math.pow(suhang-avg, 2)
					+Math.pow(attend-avg, 2)+Math.pow(service-avg, 2))/5.0;
					pyojun = Math.sqrt(bunsan);
					Highschool highstu = new Highschool(subname,teacher, mid, final_test,suhang,realScore,attend,
							service,pyojun);
					high[k++] = highstu;
					
				}
			}
	}
	/*public void input/Elementary() {
		System.out.print("과목명 ->");
		subname = sc.next();
		System.out.println("차례대로 중간고사, 기말고사, 수행평가 점수를 입력하세요");
		mid = sc.nextInt();
		final_test = sc.nextInt();
		suhang = sc.nextInt();
		realScore = mid+final_test+suhang;
	}
	
	public void inputMiddle() {
		System.out.print("과목명 ->");
		subname = sc.next();
		System.out.print("선생님 성함 -> ");
		teacher = sc.next();
		System.out.println("차례대로 중간고사, 기말고사, 수행평가, 출석점수, 봉사점수를 입력하세요");
		mid = sc.nextInt();
		final_test = sc.nextInt();
		suhang = sc.nextInt();
		attend = sc.nextInt();
		service = sc.nextInt();
		realScore = mid+final_test+suhang+attend+service;
		Middleschool midstu = new Middleschool(subname,teacher,mid, final_test,suhang, realScore,attend,service);
		middle[j++] = midstu;
	}
	
	public void inputHigh() {
		double avg, bunsan = 0.0;
		System.out.print("과목명 ->");
		subname = sc.next();
		System.out.print("선생님 성함 -> ");
		teacher = sc.next();
		System.out.println("차례대로 중간고사, 기말고사, 수행평가, 출석점수, 봉사점수를 입력하세요");
		mid = sc.nextInt();
		final_test = sc.nextInt();
		suhang = sc.nextInt();
		attend = sc.nextInt();
		service = sc.nextInt();
		realScore = mid+final_test+suhang+attend+service;
		avg = realScore/5.0;
		bunsan = (Math.pow(mid-avg, 2)+Math.pow(final_test-avg, 2)+Math.pow(suhang-avg, 2)
				+Math.pow(attend-avg, 2)+Math.pow(service-avg, 2))/5.0;
		pyojun = Math.sqrt(bunsan);
		Highschool highstu = new Highschool(subname,teacher, mid, final_test,suhang,realScore,attend,
				service,pyojun);
		high[k++] = highstu;
		
	}*/
	
	public String output() {
		String result = "";
			if(i>=0) {
				System.out.println("=========================");
				System.out.println("     초등학생 성적입니다.");
				System.out.println("=========================");
				System.out.println("|\t과목명\t|\t담임\t|\t중간고사\t|\t기말고사\t|\t수행평가\t|"
						+ "\t점수\t|");
				for (int z = 0; z < elementary.length; z++) {
				if(elementary[z]==null)break;
					System.out.println("|\t"+elementary[z].subname+"\t|\t"+elementary[z].mid+"\t|\t"+
						elementary[z].final_test+"\t|\t"+elementary[z].suhang+"\t|\t"+elementary[z].realScore+"\t|");
				}
			}if(j>=0) {
				System.out.println("================1=========");
				System.out.println("     중학생 성적입니다.");
				System.out.println("=========================");
				System.out.println("|\t과목명\t|\t담임\t|\t중간고사\t|\t기말고사\t|\t수행평가\t|"
						+ "\t출석점수\t|\t봉사점수\t|\t점수\t|");
				for (int z = 0; z < middle.length; z++) {
				if(middle[z]==null)break;
					System.out.println("|\t"+middle[z].subname+"\t|\t"+middle[z].teacher+"\t|\t"+middle[z].mid+"\t|\t"+
						middle[z].final_test+"\t|\t"+middle[z].suhang+"\t|\t"+middle[z].realScore+"\t|\t"+middle[z].attend
						+"\t|\t"+middle[z].service+"\t|\t"+middle[z].realScore);
				}
			}if(k!=0) {
				System.out.println("=========================");
				System.out.println("     고등학생 성적입니다.");
				System.out.println("=========================");
				System.out.println("|\t과목명\t|\t담임\t|\t중간고사\t|\t기말고사\t|\t수행평가\t|"
						+ "\t출석점수\t|\t봉사점수\t|\t표준편차\t|\t점수\t|");
				for (int z = 0; z < high.length; z++) {
				if(high[z]==null)break;
					System.out.println("|\t"+high[z].subname+"\t|\t"+high[z].teacher+"\t|\t"+high[z].mid+"\t|\t"+
							high[z].final_test+"\t|\t"+high[z].suhang+"\t|\t"+high[z].realScore+"\t|\t"+high[z].attend
						+"\t|\t"+high[z].service+"\t|\t"+high[z].pyojun+"\t|\t"+high[z].realScore);
				}
			}
		return result;
	}
}









