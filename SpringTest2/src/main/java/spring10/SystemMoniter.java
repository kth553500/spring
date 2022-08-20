package spring10;

public class SystemMoniter {

	private PhoneCall call;

	public void setCall(PhoneCall call) {
		this.call = call;
		System.out.println("setCall() call=>" + call);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[PhoneCall 객체]=>" + call;
	}
}
