package demo;

import org.springframework.beans.factory.annotation.Autowired;

public class DemoService {

	@Autowired
	private DemoService2 demoService2;

	public void demo() {
		demoService2.demo();
		System.out.println("this is demo!!");
	}
}
