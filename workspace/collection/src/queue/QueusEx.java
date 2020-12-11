package queue;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/*

큐 구조는 선착순으로 처리할 때 

선입 선출 (FIFO)

넣기 (offer) -> 빼기 (poll)
Last 	- -	- > First

하드웨어적으로 이 구조를 이용하는 분야 : 스레드풀, 버퍼메모리, 채널메모리 

// 동기화된 컬렉션과 병렬처리를 위한 컬렉션
 1) 개요 
 - 컬렉션 프레임워크의 대부분 클래스들은 싱글 스레드 환경에서 사용할 수 있도록 설계되었다.
 - 여러 스레드가 동시에 컬렉션에 접근한다면 의도하지 않게 요소가 변경될 수 있는 불안전한 상태가 된다.
 - Vector와 Hashtable은 동기화된 메소드로 구성돼 있기 때문에, 멀티 스레드 환경에서 안전하게 요소 처리가능
 - 하지만 ArrayList와 HashSet, HashMap은 동기화된 메소드로 구성되어 있지 않아 멀티 스레드 환경에서는 안전하지 않다.
 
// 병렬처리를 위한 컬렉션 
 1) 개요 
 - 동기화된 컬렉션은 멀티 스레드 환경에서 하나의 스레드가 요소를 안정하게 처리하도록 도와주지만 전체 요소를 빠르게 처리하지 못한다.
 - 하나의 스레드가 요소를 처리할 때 전체 잠금이 발생하여 다른 스레드는 대기 상태가 된다. 
 - 멀티 스레드가 병렬적으로 컬렉션의 요소들을 처리할 수 없다.
 - 자바는 멀티 스레드가 컬렉션의 요소를 병렬적으로 처리할 수 있도록 특별한 컬렉션을 제공하고 있다.
 - ConcurrentHashMap과 CouncurrentHashQueue 가 있다.
 - Map의 구현클래스 			Queue의 구현클래스 

// ConcurrentHashMap 
 * 스레드에 안전하면서도 멀티 스레드(Multi-Thread)가 요소를 병렬적으로 처리가능
 - 원리 
 * 부분 잠금을 사용한다. 예를 들어 컬렉션에 10개 요소가 저장되어 있을 경우 1개를 처리할 동안 전체 10개의 요소를
   다른 스레드가 처리하지 못하도록 하는 것이 전체 잠금이라면 처리하는 요소가 포함된 부분만 잠금하고 나머지 부분은 
   다른 스레드가 변경할 수 있도록 하는 것이 '부분 잠금'이다.
   
// ConcurrentLinkedQueue 
 * 락-프리(Lock-Free)알고리즘을 구현한 컬렉션이다. 
 * 락 프리 알고리즘은 여러개의 스레드가 동시에 접근할 경우 잠금을 사용하지 않고도 최소한 하나의 스레드가 안전하게 요소를
 * 저장하거나 알도록 해 준다.
 
*/
public class QueusEx {

	public static void main(String[] args) {
		Queue<Message> msg = new LinkedList<Message>();
		Set<Message> mset = new HashSet<Message>();
		Collection<Message> c = Collections.synchronizedCollection(msg);
		// 싱크로나이즈 어쩌구 메소드
		Collections.synchronizedSet(mset); // 동기화,

		Map<String, Integer> ccmap = new ConcurrentHashMap<>();
		//병렬처리될 스레드
		ccmap.put("hello", 10);
		ccmap.put("천사훈", 500);
		
		Queue<Message> ccLQ = new ConcurrentLinkedQueue<>();
		ccLQ.offer(new Message("sendPic", "김이준"));
		
		
		
		msg.offer(new Message("sendMail", "홍길동"));
		msg.offer(new Message("sendSMS", "신용권"));
		msg.offer(new Message("sendKakaoTalk", "홍두께"));

		while (!msg.isEmpty()) {
			Message message = msg.poll(); // poll 꺼내서 버린다. message에 담는다.
			switch (message.cmd) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에게 SMS를 보냅니다.");
				break;
			case "sendKakaoTalk":
				System.out.println(message.to + "님에게 카톡을 보냅니다.");
				break;
			}

		}
		// 들어간 순서대로 나온다.

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
		return "Message [전송 수단 =" + cmd + ", to=" + to + "]";
	}

}
