package org.fangj.sample.spring.ioc.base;

import org.fangj.sample.spring.helloworld.MessageRenderer;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public interface XmlConfigWithBeanFactory {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader rd =  new XmlBeanDefinitionReader(factory);
		rd.loadBeanDefinitions(new ClassPathResource("META-INF/spring/app-context.xml"));
		MessageRenderer mr = factory.getBean("renderer", MessageRenderer.class);
		mr.render();
	}
}
