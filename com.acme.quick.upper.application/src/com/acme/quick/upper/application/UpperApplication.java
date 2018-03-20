package com.acme.quick.upper.application;

import org.osgi.service.component.annotations.Component;
import osgi.enroute.configurer.api.RequireConfigurerExtender;
import osgi.enroute.google.angular.capabilities.RequireAngularWebResource;
import osgi.enroute.rest.api.REST;
import osgi.enroute.twitter.bootstrap.capabilities.RequireBootstrapWebResource;
import osgi.enroute.webserver.capabilities.RequireWebServerExtender;
import org.osgi.service.component.annotations.Reference;
import com.acme.quick.upper.api.Upper;


@RequireAngularWebResource(resource = { "angular.js", "angular-resource.js", "angular-route.js" }, priority = 1000)
@RequireBootstrapWebResource(resource = "css/bootstrap.css")
@RequireWebServerExtender
@RequireConfigurerExtender
@Component(name = "com.acme.quick.upper.application")
public class UpperApplication implements REST {

	@Reference
	Upper upper;

	public String getUpper(String string) {
		return upper.upper(string);
	}

	public String getLower(String string) {
		return upper.lower(string);
	}

	public String getStripSpaces(String string) {
		return upper.removeSpaces(string);
	}

}
