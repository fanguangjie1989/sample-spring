package org.fangj.sample.spring.ioc.xmlconfig;

public abstract class AbstractLockOpener implements LockOpener {
	private KeyHelper  keyHelper;
	public KeyHelper getKeyHelper() {
		return keyHelper;
	}
	@Override
	public void openLock() {
		keyHelper.open();
	}

}
