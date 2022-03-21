package week1.day1;

public class MyMobile {
	
	static long mobileNumber = 9976127557L;
	int emiNumber=123456;
	
	public void makeCall() {
		System.out.println("mobile Number");
	}
	
	public void sendMsg () {
		System.out.println("emi Number");
		
	}
	
	private void payBill () {
		System.out.println("pay");
		
		System.out.println(emiNumber);
		
		
		
	}


	
	public static void main(String[] args) {
		
		MyMobile sanjay = new MyMobile();
		sanjay.sendMsg();
		sanjay.payBill();
		sanjay.makeCall();
		System.out.println("emiNumber");
		
		
		

	}

}
