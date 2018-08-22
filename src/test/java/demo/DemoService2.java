package demo;

import org.springframework.beans.factory.annotation.Autowired;

public class DemoService2 {
	@Autowired
	private DemoService demoService;

	public void demo(){
		System.out.println(demoService);
	}
}
