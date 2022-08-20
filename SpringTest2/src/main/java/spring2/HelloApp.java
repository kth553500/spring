package spring2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//스프링 방식=>객체를 생성 ->메서드 호출->처리방식을 xml파일로 설정(명세서)
public class HelloApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. xml 파일의 위치를 불러오는 방법 -> 상대경로
		Resource resource = new ClassPathResource
				("/spring2/InitContext.xml");
		//2. 빈즈공장을 불러와서 객체를 얻어오기 //xml 파일의 정보->메모리에 저장
		BeanFactory factory = new XmlBeanFactory(resource);
		
		//3.factory에서 getBean("불러올 객체를 가져올 id값")
		MessageBeanDI bean = (MessageBeanDI)factory.getBean("mBean");
		bean.sayHello(); //생성자, setGreeting(안녕) ->sayHello()
	}

}
