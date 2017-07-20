package org.fangj.sample.spring.ioc.xmlconfig;

import org.fangj.sample.spring.helloworld.MessageProvider;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:META-INF/spring/app-context.xml");
		ctx.refresh();
		MessageProvider messageProvider = ctx.getBean("configurableMessageProvider", MessageProvider.class);
		System.out.println(messageProvider.getMessage());
		ConstructorConfusion intCC = ctx.getBean("intCC", ConstructorConfusion.class);
		System.out.println(intCC);
		ConstructorConfusion stringCC = ctx.getBean("stringCC", ConstructorConfusion.class);
		System.out.println(stringCC);
		InjectSimple simple = (InjectSimple)ctx.getBean("injectSimple");
		System.out.println(simple);
		InjectSimpleSpel simpleSpel = (InjectSimpleSpel)ctx.getBean("injectSimpleSpel");
		System.out.println(simpleSpel);
		CollectionInjection collectionInjection = ctx.getBean("collectionInjection", CollectionInjection.class);
		collectionInjection.displayInfo();
		
		String s1 = (String) ctx.getBean("name1");
        String s2 = (String) ctx.getBean("name2");
        String s3 = (String) ctx.getBean("name3");
        String s4 = (String) ctx.getBean("name4");
        String s5 = (String) ctx.getBean("name5");
        String s6 = (String) ctx.getBean("name6");
 
        System.out.println((s1 == s2));
        System.out.println((s2 == s3));
        System.out.println((s3 == s4));
        System.out.println((s4 == s5));
        System.out.println((s5 == s6));
		ctx.close();
	}
}
