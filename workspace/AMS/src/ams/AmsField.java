package ams;

public class AmsField {

	//항공사, 상공기번호, 최대승객수, 출발지, 도착지
	String[][] arrPlane = new String[100][5];
	int cnt;	//전역변수는 초기화 필요없어. 전역변수는 자동초기화
	int showCnt;
	int cLength = arrPlane[0].length;
	String result = "";
	
	
	//추가하기
	void insert(String[] arPlane) {
		arrPlane[cnt] = arPlane;
		cnt++;
	}
	//검색하기
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
	//수정하기
	void update() {}
	//삭제하기
	void delete(String keyword) {
		for (int i = 0; i < cnt; i++) {
			if(arrPlane[i][1].equals(keyword)) {
				for (int j = i; j < cnt-1; j++) {
					 
				}
			}
		}
		
	}
	
	//목록보기
	String show() {
		 String result = "항공사, 항공기번호, 최대승객수(명), 출발지, 도착지\n";
		
		for (int i = 0; i < cnt; i++) {
			result += "♣ ";
			for (int j = 0; j < cLength; j++) {
				
				result += j==cLength-1 ? arrPlane[i][j]: arrPlane[i][j]+",  ";
			}
			result += "\n";
		}
		if(cnt==0) result = "목록이 비었습니다.";
		return result;
		
	}
	
	//검색결과 보기
	String show(int[] arIndex) {
		String result = "항공사, 항공기번호, 최대승객수(명), 출발지, 도착지\n";
		
		for (int i = 0; i < arIndex.length; i++) {
			result += "♣ ";
			for (int j = 0; j < cLength; j++) {
				result += arrPlane[arIndex[i]][j];
				result += j==cLength-1 ? "" : ",  ";
			}
			result += "\n";
		}
		if(arIndex.length == 0) result = "검색 결과 없음";
		return result;
	}
}






