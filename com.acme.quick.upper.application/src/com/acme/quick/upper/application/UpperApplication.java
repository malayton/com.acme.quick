package com.acme.quick.upper.application;

import org.osgi.service.component.annotations.Component;

import osgi.enroute.configurer.api.RequireConfigurerExtender;
import osgi.enroute.google.angular.capabilities.RequireAngularWebResource;
import osgi.enroute.rest.api.REST;
import osgi.enroute.rest.api.RESTRequest;
import osgi.enroute.twitter.bootstrap.capabilities.RequireBootstrapWebResource;
import osgi.enroute.webserver.capabilities.RequireWebServerExtender;

@RequireAngularWebResource(resource = { "angular.js", "angular-resource.js", "angular-route.js" }, priority = 1000)
@RequireBootstrapWebResource(resource = "css/bootstrap.css")
@RequireWebServerExtender
@RequireConfigurerExtender
@Component(name = "com.acme.quick.upper.application")
public class UpperApplication implements REST {

	public String getUpper(RESTRequest req, String string) {
		return string.toUpperCase();
	}

	public String getLower(RESTRequest req, String string) {
		return string.toLowerCase();
	}

	public String getStripSpaces(RESTRequest req, String string) {
		return string.replaceAll("\\s+", "");
	}

}
