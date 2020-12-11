package list.vector;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorEx01 {
	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		
		//�ֱ�
		list.add(new Board("����1","����1","�۾���1"));
		list.add(new Board("����2","����2","�۾���2"));
		list.add(new Board("����3","����3","�۾���3"));
		list.add(new Board("����4","����4","�۾���4"));
		list.add(new Board("����5","����5","�۾���5"));
		
		//�����ϱ�
		list.set(3, new Board("����6","����6","�۾���6"));
		
		//�߰� �����ϱ�
		list.add(2, new Board("����7","����7","�۾���7"));
		
		//����2�� �ִ��� Ȯ���ϱ�
		boolean b = list.get(1).subject.equals("����2");
		if(b) {
			System.out.println("����2 ����");
		}else {
			System.out.println("����2 ����");
		}
		
		//4�� �ε��� �����ϱ�
		list.remove(4);
		Iterator<Board> iter = list.iterator();
		while(iter.hasNext()) {
			Board board = iter.next();
			System.out.println(board.toString());
		}
		
		//���������� ���ǵǾ��־ �θ�(List)�� �޼ҵ常 �����ֵ�. �׷��Ƿ� down-casting �ϱ�
		Vector<Board> vlist = (Vector)list;
		//�뷮ũ��, ����� ���� ����, trim
		int ca = vlist.capacity();
		System.out.println(ca);
		vlist.trimToSize();
		//Ʈ���� �⺻ ��� �뷮
		System.out.println(vlist.capacity());
	
		
		Vector<String> v1 = new Vector<>();
		Vector<String> v2 = new Vector<>(15);
		ca = v1.capacity();
		System.out.println("v1 �⺻ ���뷮 "+ ca);
		ca = v2.capacity();
		System.out.println("v2 �⺻ ���뷮 "+ ca);
		
		
		
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