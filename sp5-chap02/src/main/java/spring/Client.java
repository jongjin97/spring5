package spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Client implements DisposableBean{
	private String host;
	public void setHost(String host) {
		this.host = host;
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("client.destroy() 실행");
	}
	
	public void send() {
		System.out.println("Client.send() to " + host);
	}
	
	public void afterPropertiesSet(){
		// TODO Auto-generated method stub
		System.out.println("Client.affetPropertiesSet() 실행");
	}
}
