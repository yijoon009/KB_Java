package ams;

public class AmsField {

	//�װ���, ������ȣ, �ִ�°���, �����, ������
	String[][] arrPlane = new String[100][5];
	int cnt;	//���������� �ʱ�ȭ �ʿ����. ���������� �ڵ��ʱ�ȭ
	int showCnt;
	int cLength = arrPlane[0].length;
	String result = "";
	
	
	//�߰��ϱ�
	void insert(String[] arPlane) {
		arrPlane[cnt] = arPlane;
		cnt++;
	}
	//�˻��ϱ�
	String search(String keyword) {
		int arIndex[];
		String result="";
		int saerchCnt = 0;
		for (int i = 0; i < cnt; i++) {
			if(keyword.equals(arrPlane[i][0])){
				saerchCnt++;
				result += ""+i+",";
			}
		}
		arIndex =  new int[saerchCnt];
		for (int j = 0; j < arIndex.length; j++) {
			arIndex[j] = Integer.parseInt(result.split(",")[j]);
		}
		 return show(arIndex);
	}
	//�����ϱ�
	void update() {}
	//�����ϱ�
	void delete(String keyword) {
		for (int i = 0; i < cnt; i++) {
			if(arrPlane[i][1].equals(keyword)) {
				for (int j = i; j < cnt-1; j++) {
					 
				}
			}
		}
		
	}
	
	//��Ϻ���
	String show() {
		 String result = "�װ���, �װ����ȣ, �ִ�°���(��), �����, ������\n";
		
		for (int i = 0; i < cnt; i++) {
			result += "�� ";
			for (int j = 0; j < cLength; j++) {
				
				result += j==cLength-1 ? arrPlane[i][j]: arrPlane[i][j]+",  ";
			}
			result += "\n";
		}
		if(cnt==0) result = "����� ������ϴ�.";
		return result;
		
	}
	
	//�˻���� ����
	String show(int[] arIndex) {
		String result = "�װ���, �װ����ȣ, �ִ�°���(��), �����, ������\n";
		
		for (int i = 0; i < arIndex.length; i++) {
			result += "�� ";
			for (int j = 0; j < cLength; j++) {
				result += arrPlane[arIndex[i]][j];
				result += j==cLength-1 ? "" : ",  ";
			}
			result += "\n";
		}
		if(arIndex.length == 0) result = "�˻� ��� ����";
		return result;
	}
}






