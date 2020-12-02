package studentScore_JOption;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Field {
	ArrayList<Account> acList = new ArrayList<>();
	WrongInputException wi = new WrongInputException();
	Account ac;
	Student st = new Student();
	
	Matcher m;
	int cnt;
	
	//È¸¿ø°¡ÀÔ
	public void setUser() throws AuthenticationException_mine{
		
		boolean id = true, pw = true, data = true;
		
		//È¸¿ø°¡ÀÔid
		do {
//			
			String input = JOptionPane.showInputDialog("¾ÆÀÌµð¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä. (8ÀÚ ÀÌ³», ¿µ¹® + ¼ýÀÚ Á¶ÇÕ  °¡´É)");
			if(input.length()==0) {
				JOptionPane.showMessageDialog(null, "¾ÆÀÌµð¸¦ ÀÔ·ÂÇØÁÖ½Ã±æ ¹Ù¶ø´Ï´Ù.");
				continue;
			}
			if(input.length()>=8) {
				JOptionPane.showMessageDialog(null, "8ÀÚ ÀÌ³»·Î ÀÔ·ÂÇØÁÖ½Ã±æ ¹Ù¶ø´Ï´Ù.");
				continue;
			}
			if(input.matches("^[a-zA-Z]{1}[a-zA-Z0-9]+$")) {
				//Ã¹ È¸¿ø°¡ÀÔÀÏ °æ¿ì, Áßº¹°Ë»ç ÇÊ¿ä ¾øÀ½
				if(acList.size()==0) {
					ac = new Account();
					ac.setId(input);
					id = false;
				}else {
					//idÁßº¹°Ë»ç
					for(Account alid : acList) {
						if((input.equals(alid.getId()))){
							//					if((user.getId()).equals(input)){
							JOptionPane.showMessageDialog(null, "ÀÌ¹Ì Á¸ÀçÇÏ´Â IDÀÔ´Ï´Ù.");
						}else {
							ac = new Account();
							ac.setId(input);
							id = false;
						}
					}
				}
			}else {
				JOptionPane.showMessageDialog(null, "¾ÆÀÌµð´Â ¿µ¹® (¼ýÀÚ °¡´É)À¸·Î¸¸ ÀÔ·ÂÇØ¾ß ÇÕ´Ï´Ù.");
			}
		}while(id);
		
		//È¸¿ø°¡ÀÔpw
		do {
			String input = JOptionPane.showInputDialog("ºñ¹Ð¸ÕÈ£¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä. (¼ýÀÚ¸¸ °¡´É)");
			if(input.length()==0) {
				JOptionPane.showMessageDialog(null, "ºñ¹Ð¹øÈ£¸¦ ÀÔ·ÂÇØÁÖ½Ã±æ ¹Ù¶ø´Ï´Ù.");
				continue;
			}
			Pattern p = Pattern.compile("[A-Z,a-z,&%$#@!()*^]");
			m = p.matcher(input);
			if(m.find()) {
				JOptionPane.showMessageDialog(null, "ºñ¹Ð¹øÈ£´Â ¼ýÀÚ·Î¸¸ ÀÔ·ÂÇØ¾ß ÇÕ´Ï´Ù.");
			}else {
				ac.setPw(input);
				pw = false;
			}
		}while(pw);
		
		//Ã¹È­¸é ÇÐ±³,ÇÐ³â,¹Ý ÀÔ·Â
		do {
			//¾ÆÁ÷ ÇÐ±³¸í À¯È¿¼º°Ë»ç ¾ÈÇÔ.
			ac.setSchool(JOptionPane.showInputDialog("ÇÐ±³ ÀÌ¸§À» ÀÔ·ÂÇÏ¼¼¿ä."));
			ac.setClass_name(JOptionPane.showInputDialog("¹ÝÀ» ÀÔ·ÂÇÏ¼¼¿ä."));
			ac.setGrade(JOptionPane.showInputDialog("ÇÐ³âÀ» ÀÔ·ÂÇÏ¼¼¿ä."));
			data = false;
		}while(data);
		
		acList.add(ac);
		
	}//end setUser
	
	//·Î±×ÀÎ
	public void login() {
		String id = JOptionPane.showInputDialog("¾ÆÀÌµð¸¦ ÀÔ·ÂÇÏ¼¼¿ä.");
		for(Account data : acList) {
			if(id.equals(data.getId())) {
				String pw = JOptionPane.showInputDialog("ºñ¹Ð¹øÈ£¸¦ ÀÔ·ÂÇÏ¼¼¿ä.");
				if(pw.equals(data.getPw())) {
					input();
				}
			}
		}
	}//end login
	
	//ÇÐ»ý¼ºÀûÀÔ·Â
	public void input() {
		String name = JOptionPane.showInputDialog("ÇÐ»ý ÀÌ¸§À» ÀÔ·ÂÇÏ¼¼¿ä");
		if(name.length()==0) {
			JOptionPane.showMessageDialog(null, "ÀÌ¸§À» ÀÔ·ÂÇØ ÁÖ½Ã±æ ¹Ù¶ø´Ï´Ù.");
		}
		if(name.matches("^[°¡-ÆR]{2,4}$")) {
			
		}
	}//end input
}
















