package com.nt.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.command.RegisterCommand;

public class RegCmdValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(RegisterCommand.class);
	}

	@Override
	public void validate(Object cmd, Errors errors) {
		RegisterCommand command=null;
		//typecasting
		command=(RegisterCommand)cmd;
		if(command.getName().length()==0)
			errors.rejectValue("name","name.required");
		if(command.getAddrs().length()==0)
			errors.rejectValue("addrs","addrs.required");
		if(command.getCountry().length()==0)
			errors.rejectValue("country","country.required");
		if(command.getCourses()==null ||command.getCourses().length==0)
			errors.rejectValue("courses","courses.required");
	}

}
