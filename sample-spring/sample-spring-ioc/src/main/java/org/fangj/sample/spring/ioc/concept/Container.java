package org.fangj.sample.spring.ioc.concept;

import java.util.List;
/**
 * 
 * @author pro spring
 * 
 * 依赖容器
 * 
 * The container is usually provided by 
 * the underlying application server or framework 
 * (for example, Tomcat or JBoss) or framework (for example, Spring)
 *
 */
public interface Container {
	/**
	 * 
	 * @param key
	 * @return
	 */
	Dependency getDependency(String key);
}
