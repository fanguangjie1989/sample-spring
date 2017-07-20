package org.fangj.sample.spring.ioc.concept;


public class ContextualizedDependencyLookup implements ManagedComponent {
	private Dependency dependences;
	@Override
	public void performLookup(String key, Container container) {
		this.dependences=container.getDependency(key);
	}
}
