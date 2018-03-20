package com.acme.quick.upper.provider;

import org.osgi.service.component.annotations.Component;
import com.acme.quick.upper.api.Upper;

@Component(name="com.acme.quick.upper.provider")
public class UpperImpl implements Upper {

	@Override
	public String upper(String input) {
		return input.toUpperCase();
	}

	@Override
	public String lower(String input) {
		return input.toLowerCase();
	}

	@Override
	public String removeSpaces(String input) {
		return input.replaceAll("\\s+", "");
	}

}
