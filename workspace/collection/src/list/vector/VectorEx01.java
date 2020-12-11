package list.vector;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorEx01 {
	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		
		//넣기
		list.add(new Board("제목1","내용1","글쓴이1"));
		list.add(new Board("제목2","내용2","글쓴이2"));
		list.add(new Board("제목3","내용3","글쓴이3"));
		list.add(new Board("제목4","내용4","글쓴이4"));
		list.add(new Board("제목5","내용5","글쓴이5"));
		
		//수정하기
		list.set(3, new Board("제목6","내용6","글쓴이6"));
		
		//중간 삽입하기
		list.add(2, new Board("제목7","내용7","글쓴이7"));
		
		//제목2가 있는지 확인하기
		boolean b = list.get(1).subject.equals("제목2");
		if(b) {
			System.out.println("제목2 있음");
		}else {
			System.out.println("지목2 없음");
		}
		
		//4번 인덱스 삭제하기
		list.remove(4);
		Iterator<Board> iter = list.iterator();
		while(iter.hasNext()) {
			Board board = iter.next();
			System.out.println(board.toString());
		}
		
		//다형성으로 정의되어있어서 부모(List)의 메소드만 쓸수있따. 그러므로 down-casting 하기
		Vector<Board> vlist = (Vector)list;
		//용량크기, 저장된 값의 개수, trim
		int ca = vlist.capacity();
		System.out.println(ca);
		vlist.trimToSize();
		//트림한 기본 기억 용량
		System.out.println(vlist.capacity());
	
		
		Vector<String> v1 = new Vector<>();
		Vector<String> v2 = new Vector<>(15);
		ca = v1.capacity();
		System.out.println("v1 기본 기억용량 "+ ca);
		ca = v2.capacity();
		System.out.println("v2 기본 기억용량 "+ ca);
		
		
		
	}
}

class Board{
	String subject;
	String content;
	String writer;
	public Board() {}
	public Board(String subject, String content, String writer) {
		super();
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	@Override
	public String toString() {
		return "Board [subject=" + subject + ", content=" + content + ", writer=" + writer + "]";
	}
	
	
	
}