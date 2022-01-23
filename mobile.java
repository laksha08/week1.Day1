package week1.day1;

public class mobile {
		
		public void sendMsg()
		{
			System.out.println("Hello");
		}
		public int makeCall() 
		{
			int phoneNum = 1234567899;
			return phoneNum;
		}
		public void saveContact()
		{
		    String name = "ABC";
			int phoneNum = 1234567899;
			System.out.println("contact saved :"+name + phoneNum);
			
		}
		public static void main(String[] args)
		{
        mobile objMobile = new  mobile();
        objMobile.sendMsg();
        objMobile.makeCall();
        int   makeCall = objMobile.makeCall();
        System.out.println(makeCall);
        objMobile.saveContact();
        
	}
}


