package org.fangj.sample.spring.ioc.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("injectSimple")
public class InjectSimple {
	@Value("Tomcat")
	private String name;
	@Value("12")
    private int age;
	@Value("1.78")
    private float height;
	@Value("true")
    private boolean programmer;
	@Value("1009843200")
    private Long ageInSeconds;
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
	@Override
	public String toString() {
		return "InjectSimple [name=" + name + ", age=" + age + ", height=" + height + ", programmer=" + programmer
				+ ", ageInSeconds=" + ageInSeconds + "]";
	}
}
