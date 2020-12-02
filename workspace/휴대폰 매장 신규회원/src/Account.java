

public class Account {
	int customerCategory;	//고객 구분,
	int specification; // 1.이메일,2.모바일,3.우편
	boolean emailApply; // e-mail 명세서 신청 유/무
	boolean automaticPaymen; // 요금 자동 납부 유/무
	private String customerName,socialNumber; // 주민번호는 851213-2 까지만 입력

	private String email,contact,address; // email,연락처,주소
	private String modelName,modelSerial;//모델명, 일련번호 ex)삼성,LG -
	private int cashAdvance; // 선납
	int shippingPrice,purchasePrice;//출고가 구입가
	float discountRate;// 요금 할인율 백분율 %
	int priceDc; // 요금할인 
	
	public String getCustomerName() {return customerName;}
	public void setCustomerName(String customerName) {this.customerName = customerName;}
	public String getSocialNumber() {return socialNumber;	}
	public void setSocialNumber(String socialNumber) {this.socialNumber = socialNumber;	}
	public String getEmail() {return email;	}
	public void setEmail(String email) {this.email = email;}
	public String getContact() {return contact;}
	public void setContact(String contact) {this.contact = contact;}
	public String getAddress() {return address;}
	public void setAddress(String address) {this.address = address;}
	public String getModelName() {return modelName;	}
	public void setModelName(String modelName) {this.modelName = modelName;}
	public String getModelSerial() {return modelSerial;	}
	public void setModelSerial(String modelSerial) {this.modelSerial = modelSerial;	}
	public int getCashAdvance() {return cashAdvance;}
	public void setCashAdvance(int cashAdvance) {this.cashAdvance = cashAdvance;}

	public String toString() {
		String str = String.format("이름:%s\n주민번호:%s\n연락처:%s\n이메일:%s\n주소:%s\n", 
				customerName,socialNumber,contact,email,address);
		
		return str;
	}
	
	
}
