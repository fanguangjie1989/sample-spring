package org.fangj.sample.spring.helloworld;

public class HelloWorldDecoupled {
	public static void main(String[] args) {
		 MessageRenderer mr = new StandardOutMessageRenderer();
	     MessageProvider mp = new HelloWorldMessageProvider();
	     mr.setMessageProvider(mp);
	     mr.render();
	}
}