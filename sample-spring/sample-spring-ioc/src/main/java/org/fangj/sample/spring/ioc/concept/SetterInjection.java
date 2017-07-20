package org.fangj.sample.spring.ioc.concept;
/**
 * 
 * @author pro spring
 * 
 * Setter Dependency Injection
 * 
 * In Setter Dependency Injection , the IoC container injects a component’s dependencies via JavaBean-style setter 
 * methods. A component’s setters expose the dependencies the IoC container can manage. 
 *
 */
public class SetterInjection {
	private Dependency dependency;
	public void setDependency(Dependency dependency) {
        this.dependency = dependency;
    }
 
    @Override
    public String toString() {
        return dependency.toString();
    }
}
