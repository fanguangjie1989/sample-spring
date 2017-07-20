package org.fangj.sample.spring.ioc.xmlconfig;

import org.fangj.sample.spring.helloworld.MessageProvider;

public class ConfigurableMessageProvider implements MessageProvider{
	private String message;
	public ConfigurableMessageProvider(String message) {
        this.message = message;
    }
	@Override
	public String getMessage() {
		return message;
	}

}
