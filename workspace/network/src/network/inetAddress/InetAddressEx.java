package network.inetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress local = InetAddress.getLocalHost();
		String ip = local.getHostAddress();
		System.out.println(ip);
		
		InetAddress[] iaAr = InetAddress.getAllByName("www.naver.com");
		for(int i=0;i<iaAr.length;i++) {
			System.out.println(iaAr[i].getHostAddress());
		}
//		for(InetAddress iaar:iaAr) {
//			System.out.println(iaar.getHostAddress());
//		}
		
		
		
	}

}
