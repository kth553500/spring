package spring6;

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
		//spring2.5방식(객체를 가져오고나서 원하는 자료형으로 형변환시켜서 사용)
		//->spring3.x ~ spring 5.x (처음부터 형변환시켜서 객체를 가져오는 방식)
		
		/* 2.5방식
		PerformanceMoniter moniter = (PerformanceMoniter)context.getBean("performanceMoniter");
		*/
		//3이후부터의 방식
		//형식) ~getBean("의존성객체를얻어올 id",형변환을 할 클래스명.class)
		PerformanceMoniter moniter = context.getBean("performanceMoniter", PerformanceMoniter.class);
		PerformanceMoniter moniter2 = context.getBean("performanceMoniter", PerformanceMoniter.class);
		PerformanceMoniter moniter3 = context.getBean("performanceMoniter", PerformanceMoniter.class);

		System.out.println("moniter=>" + moniter);
		System.out.println("moniter2=>" + moniter2);
		System.out.println("moniter3=>" + moniter3);
		System.out.println("moniter2==moniter3->" + (moniter2==moniter3));
		moniter.toString();
		
		//5.Context도 종료
		context.close();//메모리에 올려놓은 모든 빈즈객체 -> 메모리해제
	}

}
