package com.acme.quick.upper.provider;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.acme.quick.upper.provider.UpperImpl;

/*
 * Example JUNit test case
 *
 */

public class ProviderImplTest {

	/*
	 * Example test method
	 */

	@Test
	public void simple() {
		UpperImpl impl = new UpperImpl();
		assertNotNull(impl);
	}

}
