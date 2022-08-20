package spring9;

import java.util.Map;

class RestHandler{//var RestHandler={}
	//new RestHandler() -> public RestHandler(){} 기본생성자 호출
	
} 
class SoapHandler{}

public class ProtocolHanderFactory {
	//Map객체->HashMap,Hashtable
	private Map<String,Object> map;

	public void setMap(Map<String, Object> map) {
		this.map = map;
		System.out.println("setMap call->" + map);
	}
	
	
}
