package org.fangj.sample.spring.ioc.concept;
/**
 * 
 * @author pro spring
 * 组件管理器
 * 解耦容器和组件
 */
public interface ManagedComponent {
	/**
	 * 根据key从container中获取依赖组件需要的依赖
	 * @param key
	 * @param container
	 */
	void performLookup(String key,Container container);
}
