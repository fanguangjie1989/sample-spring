package org.fangj.sample.spring.ioc.annotation;

import org.fangj.sample.spring.helloworld.MessageProvider;
import org.fangj.sample.spring.helloworld.MessageRenderer;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:META-INF/spring/app-context-annotation.xml");
		ctx.refresh();
		MessageProvider messageProvider = ctx.getBean("helloWorldMessageProvider", MessageProvider.class);
		System.out.println(messageProvider.getMessage());
		MessageProvider configurableMessageProvider = ctx.getBean("configurableMessageProvider", MessageProvider.class);
		System.out.println(configurableMessageProvider.getMessage());
		MessageRenderer render = ctx.getBean("standardOutMessageRenderer", MessageRenderer.class);
		render.render();
		InjectSimple simple = (InjectSimple)ctx.getBean("injectSimple");
		System.out.println(simple);
		InjectSimpleSpel simpleSpel = (InjectSimpleSpel)ctx.getBean("injectSimpleSpel");
		System.out.println(simpleSpel);
		CollectionInjection collectionInjection = ctx.getBean("collectionInjection", CollectionInjection.class);
		collectionInjection.displayInfo();
		ctx.close();
	}
}
