package org.fangj.sample.spring.ioc.xmlconfig;

public class TomLockOpener implements LockOpener {
	
	private KeyHelper  keyHelper;
	
	public void setKeyHelper(KeyHelper keyHelper) {
		this.keyHelper = keyHelper;
	}

	public KeyHelper getKeyHelper() {
		return keyHelper;
	}

	@Override
	public void openLock() {
		keyHelper.open();
	}

}
