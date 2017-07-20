package org.fangj.sample.spring.ioc.xmlconfig;

import org.springframework.context.support.GenericXmlApplicationContext;

public class LookUpMethedApp {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:META-INF/spring/app-context.xml");
		ctx.refresh();
		LockOpener lockOpenerNamedTom =  ctx.getBean("tomLockOpener", LockOpener.class);
		LockOpener abstractLockOpener =  ctx.getBean("abstractLockOpener", LockOpener.class);
		KeyHelper key1 = lockOpenerNamedTom.getKeyHelper();
		System.out.println(key1 == lockOpenerNamedTom.getKeyHelper());
		KeyHelper key2 = abstractLockOpener.getKeyHelper();
		System.out.println("Helper Instances the Same?:" + (key1 == key2) );
		System.out.println(key2 == lockOpenerNamedTom.getKeyHelper());
		ctx.close();
	}
}
