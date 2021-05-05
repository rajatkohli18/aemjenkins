package com.aem.demo.core.config;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "Orchard Factory Service Configuration", description = "Orchard Factory Service Configuration")
public @interface ObjectFactoryConfig {
	
	@AttributeDefinition(name = "Name" , description ="name of student", type = AttributeType.STRING)
	String name();
	
	@AttributeDefinition(name = "Password" , description ="password of student", type = AttributeType.PASSWORD)
	String password();
}
