package spring5;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.메모리관리 ->xml파일이 여러개  -> 배열로 관리-> 파일명부여
		String[] configLocation = new String[] {"applicationContext.xml"};
		
		//2. xml파일을 메모리에 올려줄 수 있는 클래스를 통해서 객체를 생성
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		
		//3.자바프로그램이 종료->자동적으로 context객체도 같이 종료 설정
		context.registerShutdownHook();
		
		//4.xml에서 만들어진 객체를 가져와서 처리
		SystemMoniter moniter = (SystemMoniter)context.getBean("moniter3");
		System.out.println("moniter=>" + moniter);//SmsSender
		moniter.toString();
		
		//5.Context도 종료
		context.close();//메모리에 올려놓은 모든 빈즈객체 -> 메모리해제
	}

}
