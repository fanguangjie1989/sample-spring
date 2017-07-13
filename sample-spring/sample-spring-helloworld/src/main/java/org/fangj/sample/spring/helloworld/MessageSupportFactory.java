package org.fangj.sample.spring.helloworld;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MessageSupportFactory {
	private Properties props;
	private MessageRenderer renderer;
	private MessageProvider provider;

	private MessageSupportFactory() {
		init();
	}

	private void init() {
		props = new Properties();
		try {
			props.load(MessageSupportFactory.class.getResourceAsStream("msf.properties"));
			String rendererClass = props.getProperty("renderer.class");
			String providerClass = props.getProperty("provider.class");
			renderer = (MessageRenderer) Class.forName(rendererClass).newInstance();
			provider = (MessageProvider) Class.forName(providerClass).newInstance();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Provides the lazy-loaded Singleton instance.
	 */
	private static class HelperHolder {
		private static final MessageSupportFactory INSTANCE = new MessageSupportFactory();
	}

	public static MessageSupportFactory getInstance() {
		return HelperHolder.INSTANCE;
	}

	public MessageRenderer getMessageRenderer() {
		return renderer;
	}

	public MessageProvider getMessageProvider() {
		return provider;
	}

}
