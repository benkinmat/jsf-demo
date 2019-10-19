package benkinmat.github.io.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import benkinmat.github.io.service.HelloService;

@ManagedBean
@SessionScoped
public class HelloBean {

	@ManagedProperty(value = "#{helloService}")
	HelloService helloService;

	private String name;
	
	public void initPage() {
		name = "http://google.com";
	}

	public String sayHello() {
		this.name = helloService.convert(this.name);
		return "hello";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HelloService getHelloService() {
		return helloService;
	}

	public void setHelloService(HelloService helloService) {
		this.helloService = helloService;
	}

}
