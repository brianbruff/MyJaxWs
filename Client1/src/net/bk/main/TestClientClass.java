package net.bk.main;

import java.util.Map;

import javax.xml.ws.BindingProvider;

import net.bk.PersonInfo;
import net.bk.PersonInfoService;

public class TestClientClass {
	
	PersonInfoService service;
	
	public static void main(String... args){
		new TestClientClass().run();
	}
	
	public void run(){
		service = new PersonInfoService();
		PersonInfo port = service.getPersonInfoPort();
		
		//Add authorization
		BindingProvider binding = (BindingProvider)port;
		Map<String, Object> context = binding.getRequestContext();
		context.put("javax.xml.ws.security.auth.username", "admin");
		context.put("javax.xml.ws.security.auth.password", "admin");
				
		System.out.println(port.getName());
		
	}

}
