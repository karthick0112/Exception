package gsm_mob;

interface Sim{
	String dailCall(long mobile_no);
	String sendSms(long mobile_no,String msg);
}
class Airtel implements Sim{
	public String dailCall(long mobile_no) {
		return "Airtel no busy plz try again";
	}
	public String sendSms(long mobile_no,String msg) {
		return "Airtel massage sent";
	}
}
class VI implements Sim{
	public String dailCall(long mobile_no) {
		return "VI no busy plz try again";
	}
	public String sendSms(long mobile_no,String msg) {
		return "VI massage sent";
	}
}
class Mobile{
	private Sim s;
	public void insertSim(Sim s) {
		this.s=s;
	}public String dailCall(long mobile_no) {
		return s.dailCall(mobile_no);
	}
	public String sendSms(long mobile_no,String msg) {
		return s.sendSms(mobile_no,msg);
	}
}

public class MobileUser {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile iphone=new Mobile();
		iphone.insertSim(new VI());
		String res=iphone.dailCall(987445544);
		System.out.println(res);
	}

}
