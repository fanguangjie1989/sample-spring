package org.fangj.sample.spring.ioc.annotation;

import org.fangj.sample.spring.helloworld.MessageProvider;
import org.fangj.sample.spring.helloworld.MessageRenderer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("standardOutMessageRenderer")
public class StandardOutMessageRenderer implements MessageRenderer {
	 private MessageProvider messageProvider;
	@Override
	public void render() {
		if (messageProvider == null) {
            throw new RuntimeException(
            "You must set the property messageProvider of class:"
            + StandardOutMessageRenderer.class.getName());
        }
 
        System.out.println(messageProvider.getMessage());
	}

	@Override
	@Autowired
	public void setMessageProvider(@Qualifier("configurableMessageProvider") MessageProvider provider) {
		this.messageProvider = provider;
	}

	@Override
	public MessageProvider getMessageProvider() {
		return this.messageProvider;
	}

}
