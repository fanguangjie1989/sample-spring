package org.fangj.sample.spring.ioc.annotation;

import org.fangj.sample.spring.helloworld.MessageProvider;
import org.springframework.stereotype.Service;

@Service("helloWorldMessageProvider")
public class HelloWorldMessageProvider implements MessageProvider {

	@Override
	public String getMessage() {
		return "Hello World!";
	}

}
