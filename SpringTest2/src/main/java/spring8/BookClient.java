package spring8;

import java.util.Properties;

//서버에 접속=>ip주소, 접속시간제한 설정 => Properties객체
public class BookClient {
	
	private Properties prop;

	public void setProp(Properties prop) {
		this.prop = prop;
		System.out.println("setProps() call=>" + prop);
	}
	
	
}
