package org.fangj.sample.spring.ioc.annotation;

import org.fangj.sample.spring.helloworld.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
@Service("configurableMessageProvider")
public class ConfigurableMessageProvider implements MessageProvider {
	
	private String message;
    
    @Autowired
    public ConfigurableMessageProvider(@Value("Configurable message") String message) {
        this.message = message;
    }
 
    @Override
    public String getMessage() {
        return this.message;
    }

}
