package spring2;

public class MessageBeanImplDI implements MessageBeanDI {
	
	//DI를 이용해서 객체를 가져와서 넣어주는 방법(맴버변수)
	private String name1, name2; //생성자를 통해서 저장(constructor injection)
	private String greeting; //Setter Method (Setter Injection)
	
	//*****----------- has 관계 (의존관계) ----------------
	private OutFile outF; //private OutFileImpl outF;(X)
	//수정 => 연결된 다른 클래스 내용을 가능한 덜 수정할수 있도록 인터페이스를 사용하기 때문에
	public void setOutF(OutFile outF) { //OutFileImpl(객체형변환)
		this.outF = outF;
		System.out.println("setOutF()호출됨=>" +outF);
	}
	
	//1.<constructor-arg>태그를 이용해서 값을 임의로 지정해서 저장
	public MessageBeanImplDI(String name1, String name2) {
		
		this.name1 = name1;
		this.name2 = name2;
		System.out.println("MessageBeanImplDI 생성자호출됨");
	}


	//2.<property>태그를 이용해서 호출->임의 값을 전달
	public void setGreeting(String greeting) {
		this.greeting = greeting;
		System.out.println("setGreeting() 호출됨!");
	}
	
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		String message = greeting + name1 + "," + name2 + "!";
		System.out.println("message=>" + message);
		//OutF객체를 이용해서 out(message)호출
		try {
			outF.out(message); //c:/webtest/good.txt
		} catch(Exception e) {
			e.printStackTrace();
		}
		//---------------------------
	}



}
