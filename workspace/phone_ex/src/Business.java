
import java.util.Scanner;

public class Business {
	Scanner sc = new Scanner(System.in);
	
	PhoneSystem[] sys = new PhoneSystem[10];
	int act;
	int i;
	
	public void view() {
		
		while(true) {
			System.out.print("1. �Է� 2. ��� 3. ���� ->");
			act = sc.nextInt();
			switch(act) {
			case 1:
				input();
				break;
			case 2:
				output(i);
				break;
			case 3:
				System.exit(0);
			}
		}
	}//end view
	
	public void input() {
		PhoneSystem ps = new PhoneSystem();
		System.out.print("���� ->");
		ps.name = sc.next();
		System.out.print("��� -> ");
		ps.gradeCode = sc.next();
		if("A".equals(ps.gradeCode) || "a".equals(ps.gradeCode)) {
			PhoneSystem ag = new Agrade();
			ag.name = ps.name;
			ag.gradeCode = ps.gradeCode;
			System.out.print("���ð� -> ");
			ag.useTime = sc.nextInt();
			ag = new Agrade(ag.name, ag.gradeCode, 86, 10000, ag.useTime, 1000, totalMethod(ag.gradeCode,ag.useTime));
			sys[i++] = ag;
		}else if("B".equals(ps.gradeCode) || "b".equals(ps.gradeCode)) {
			PhoneSystem ag = new Bgrade();
			ag.name = ps.name;
			ag.gradeCode = ps.gradeCode;
			System.out.print("���ð� -> ");
			ag.useTime = sc.nextInt();
			ag = new Bgrade(ag.name, ag.gradeCode, 81, 12000, ag.useTime, 1200, totalMethod(ag.gradeCode,ag.useTime));
			sys[i++] = ag;
		}else if("C".equals(ps.gradeCode) || "c".equals(ps.gradeCode)) {
			PhoneSystem ag = new Cgrade();
			ag.name = ps.name;
			ag.gradeCode = ps.gradeCode;
			System.out.print("���ð� -> ");
			ag.useTime = sc.nextInt();
			ag = new Cgrade(ag.name, ag.gradeCode, 104, 15000, ag.useTime, 1500, totalMethod(ag.gradeCode,ag.useTime));
			sys[i++] = ag;
		}else if("D".equals(ps.gradeCode) || "d".equals(ps.gradeCode)) {
			PhoneSystem ag = new Dgrade();
			ag.name = ps.name;
			ag.gradeCode = ps.gradeCode;
			System.out.print("���ð� -> ");
			ag.useTime = sc.nextInt();
			ag = new Dgrade(ag.name, ag.gradeCode, 52, 20000, ag.useTime, 2000, totalMethod(ag.gradeCode,ag.useTime));
			sys[i++] = ag;
		}
	}
	
	//�ð���ܰ� * ���ð� + �⺻��� - ���ο��
	public int totalMethod(String grade, int useTime) {
		int total = 0;
		if("A".equals(grade) || "a".equals(grade)) {
			total = 86*useTime + 10000-1000;
		}else if("B".equals(grade) || "b".equals(grade)) {
			total = 81*useTime + 12000-1200;
		}else if("C".equals(grade) || "c".equals(grade)) {
			total = 104*useTime + 15000-1500;
		}else if("D".equals(grade) || "d".equals(grade)) {
			total = 52*useTime + 20000-2000;
		}
		return total;
	}
	
	public void output(int i) {
		System.out.println("========================");
		System.out.print("|\t����\t|\t����ڵ�\t|\t�ð���ܰ�\t|\t�⺻���\t|\t���ð�\t|\t���ο��\t|"
				+ "\t�̹��� ��ź�\t|\n");
		System.out.println("========================");
		for (int z = 0; z < i; z++) {
			System.out.println("|\t"+sys[z].name+"\t|\t"+sys[z].gradeCode.toUpperCase()+"\t|\t"
					+sys[z].unitPrice+"\t|\t"+sys[z].basicPrice+"\t|\t"+sys[z].useTime+"\t|\t"+sys[z].discountRate
					+"\t|\t"+sys[z].total+"\t|");
		}
	}
	
	
}
