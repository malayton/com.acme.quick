package com.acme.quick.upper.api;

import org.osgi.annotation.versioning.ProviderType;

/**
 * This is an example OSGi enRoute bundle that has a component that implements an
 * API.
 */

@ProviderType
public interface Upper {

	/**
	 * Convert to uppercase.
	 *
	 * @param input the message convert to uppercase
	 * @return the string converted to uppercase
	 */
	String upper(String input);

	/**
	 * Convert to lowercase.
	 *
	 * @param input the message convert to lowercase
	 * @return the string converted to lowercase
	 */
	String lower(String input);

	/**
	 * Remove whitespace.
	 *
	 * @param input the message remove whitespace
	 * @return the string with whitespace removed
	 */
	String removeSpaces(String input);

}
