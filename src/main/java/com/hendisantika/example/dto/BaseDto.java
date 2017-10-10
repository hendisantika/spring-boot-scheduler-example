package com.hendisantika.example.dto;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JSR310Module;
/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-scheduler-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 08/10/17
 * Time: 05.52
 * To change this template use File | Settings | File Templates.
 */
/* 
 * used mainly for common serialization
 */
public class BaseDto {

	@Override
	public String toString() {
		try {
			return toJsonString(this);
		} catch (Exception e) {
			return super.toString();
		}
	}
	
	protected static String toJsonString(Object r) throws Exception {
		ObjectMapper map = new ObjectMapper();
		map.registerModule(new Jdk8Module());
		map.registerModule(new JSR310Module());
		return map.writeValueAsString(r);
	}
}
