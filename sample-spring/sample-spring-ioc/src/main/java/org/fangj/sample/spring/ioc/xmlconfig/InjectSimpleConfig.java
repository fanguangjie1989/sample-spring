package org.fangj.sample.spring.ioc.xmlconfig;

import org.springframework.stereotype.Component;

@SuppressWarnings("unused")
public class InjectSimpleConfig {
	private String name = "Chris Schaefer";;
    private int age = 12;
    private float height = 1.78f;
    private boolean programmer = true;
    private Long ageInSeconds = 1009843200L;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public boolean isProgrammer() {
		return programmer;
	}
	public void setProgrammer(boolean programmer) {
		this.programmer = programmer;
	}
	public Long getAgeInSeconds() {
		return ageInSeconds;
	}
	public void setAgeInSeconds(Long ageInSeconds) {
		this.ageInSeconds = ageInSeconds;
	}
    
}
