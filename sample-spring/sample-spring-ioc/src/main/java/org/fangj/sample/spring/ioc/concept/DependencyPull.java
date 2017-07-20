package org.fangj.sample.spring.ioc.concept;

import org.fangj.sample.spring.helloworld.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 
 * @author pro spring
 * 
 * This kind of IoC is not only prevalent in JEE-based applications 
 * (using EJB 2.1 or prior versions), which make extensive use of JNDI lookups 
 * to obtain dependencies from a registry, 
 * but also pivotal to working with Spring in many environments
 *
 */
public class DependencyPull {
	public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext
           ("classpath:META-INF/spring/app-context.xml");
 
        MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
        mr.render();
    }
}
