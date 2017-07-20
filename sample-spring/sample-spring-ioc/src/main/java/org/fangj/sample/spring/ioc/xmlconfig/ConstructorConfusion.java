package org.fangj.sample.spring.ioc.xmlconfig;

public class ConstructorConfusion {
	private String someValue;
	public ConstructorConfusion(String someValue) {
        System.out.println("ConstructorConfusion(String) called");
        this.someValue = someValue;
    }
 
    public ConstructorConfusion(int someValue) {
        System.out.println("ConstructorConfusion(int) called");
        this.someValue = "Number: " + Integer.toString(someValue);
    }
    public String toString() {
        return someValue;
    }
}
