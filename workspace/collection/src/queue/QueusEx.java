package queue;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/*

ť ������ ���������� ó���� �� 

���� ���� (FIFO)

�ֱ� (offer) -> ���� (poll)
Last 	- -	- > First

�ϵ���������� �� ������ �̿��ϴ� �о� : ������Ǯ, ���۸޸�, ä�θ޸� 

// ����ȭ�� �÷��ǰ� ����ó���� ���� �÷���
 1) ���� 
 - �÷��� �����ӿ�ũ�� ��κ� Ŭ�������� �̱� ������ ȯ�濡�� ����� �� �ֵ��� ����Ǿ���.
 - ���� �����尡 ���ÿ� �÷��ǿ� �����Ѵٸ� �ǵ����� �ʰ� ��Ұ� ����� �� �ִ� �Ҿ����� ���°� �ȴ�.
 - Vector�� Hashtable�� ����ȭ�� �޼ҵ�� ������ �ֱ� ������, ��Ƽ ������ ȯ�濡�� �����ϰ� ��� ó������
 - ������ ArrayList�� HashSet, HashMap�� ����ȭ�� �޼ҵ�� �����Ǿ� ���� �ʾ� ��Ƽ ������ ȯ�濡���� �������� �ʴ�.
 
// ����ó���� ���� �÷��� 
 1) ���� 
 - ����ȭ�� �÷����� ��Ƽ ������ ȯ�濡�� �ϳ��� �����尡 ��Ҹ� �����ϰ� ó���ϵ��� ���������� ��ü ��Ҹ� ������ ó������ ���Ѵ�.
 - �ϳ��� �����尡 ��Ҹ� ó���� �� ��ü ����� �߻��Ͽ� �ٸ� ������� ��� ���°� �ȴ�. 
 - ��Ƽ �����尡 ���������� �÷����� ��ҵ��� ó���� �� ����.
 - �ڹٴ� ��Ƽ �����尡 �÷����� ��Ҹ� ���������� ó���� �� �ֵ��� Ư���� �÷����� �����ϰ� �ִ�.
 - ConcurrentHashMap�� CouncurrentHashQueue �� �ִ�.
 - Map�� ����Ŭ���� 			Queue�� ����Ŭ���� 

// ConcurrentHashMap 
 * �����忡 �����ϸ鼭�� ��Ƽ ������(Multi-Thread)�� ��Ҹ� ���������� ó������
 - ���� 
 * �κ� ����� ����Ѵ�. ���� ��� �÷��ǿ� 10�� ��Ұ� ����Ǿ� ���� ��� 1���� ó���� ���� ��ü 10���� ��Ҹ�
   �ٸ� �����尡 ó������ ���ϵ��� �ϴ� ���� ��ü ����̶�� ó���ϴ� ��Ұ� ���Ե� �κи� ����ϰ� ������ �κ��� 
   �ٸ� �����尡 ������ �� �ֵ��� �ϴ� ���� '�κ� ���'�̴�.
   
// ConcurrentLinkedQueue 
 * ��-����(Lock-Free)�˰����� ������ �÷����̴�. 
 * �� ���� �˰����� �������� �����尡 ���ÿ� ������ ��� ����� ������� �ʰ� �ּ��� �ϳ��� �����尡 �����ϰ� ��Ҹ�
 * �����ϰų� �˵��� �� �ش�.
 
*/
public class QueusEx {

	public static void main(String[] args) {
		Queue<Message> msg = new LinkedList<Message>();
		Set<Message> mset = new HashSet<Message>();
		Collection<Message> c = Collections.synchronizedCollection(msg);
		// ��ũ�γ����� ��¼�� �޼ҵ�
		Collections.synchronizedSet(mset); // ����ȭ,

		Map<String, Integer> ccmap = new ConcurrentHashMap<>();
		//����ó���� ������
		ccmap.put("hello", 10);
		ccmap.put("õ����", 500);
		
		Queue<Message> ccLQ = new ConcurrentLinkedQueue<>();
		ccLQ.offer(new Message("sendPic", "������"));
		
		
		
		msg.offer(new Message("sendMail", "ȫ�浿"));
		msg.offer(new Message("sendSMS", "�ſ��"));
		msg.offer(new Message("sendKakaoTalk", "ȫ�β�"));

		while (!msg.isEmpty()) {
			Message message = msg.poll(); // poll ������ ������. message�� ��´�.
			switch (message.cmd) {
			case "sendMail":
				System.out.println(message.to + "�Կ��� ������ �����ϴ�.");
				break;
			case "sendSMS":
				System.out.println(message.to + "�Կ��� SMS�� �����ϴ�.");
				break;
			case "sendKakaoTalk":
				System.out.println(message.to + "�Կ��� ī���� �����ϴ�.");
				break;
			}

		}
		// �� ������� ���´�.

	}
}

class Message {
	String cmd;
	String to;

	public Message(String cmd, String to) {
		this.cmd = cmd;
		this.to = to;
	}

	@Override
	public String toString() {
		return "Message [���� ���� =" + cmd + ", to=" + to + "]";
	}

}
