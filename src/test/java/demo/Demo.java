package demo;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
		Object bean = applicationContext.getBean("demoService");
		((DemoService) bean).demo();
	}

	@Test
	public void xmlbeanfactory() {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("application.xml"));
		Object bean = bf.getBean("demoService");
		((DemoService) bean).demo();
	}

	@Test
	public void defaultBeanFactory() {
		DefaultListableBeanFactory bf = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(bf);
		xmlBeanDefinitionReader.loadBeanDefinitions(new ClassPathResource("application.xml"));
		Object bean = bf.getBean("demoService");
		((DemoService) bean).demo();
	}
}
