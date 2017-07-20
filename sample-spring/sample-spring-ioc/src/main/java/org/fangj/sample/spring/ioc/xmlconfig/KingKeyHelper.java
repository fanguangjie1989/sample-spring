package org.fangj.sample.spring.ioc.xmlconfig;

public class KingKeyHelper implements KeyHelper {

	@Override
	public void open() {
		System.out.println("[ KingKeyHelper.class.open() ]");
	}

}
