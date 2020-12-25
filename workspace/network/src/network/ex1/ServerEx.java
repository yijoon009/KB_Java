package network.ex1;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

//서버 프로그램
public class ServerEx {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();
			//1단계. 포트번호 바인딩
			serverSocket.bind(new InetSocketAddress("localhost", 5001));
			while(true) {
				//2단계 accept() 기다리기
				System.out.println("[연결 기다림]");
				Socket socket = serverSocket.accept();
				//3단계 ServerSocket을 만들고 리턴 (다운캐스팅)
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[연결 수락함] " + isa.getHostName());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
