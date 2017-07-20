package org.fangj.sample.spring.ioc.concept;
/**
 * 
 * @author pro spring
 * 
 * Constructor Dependency Injection
 *
 */
public class ConstructorInjection {
	private Dependency dependency;
	public ConstructorInjection(Dependency dependency) {
        this.dependency = dependency;
    }
	@Override
    public String toString() {
        return dependency.toString();
    }
}
