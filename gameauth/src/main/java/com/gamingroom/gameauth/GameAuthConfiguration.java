package com.gamingroom.gameauth;

import io.dropwizard.Configuration;
import io.dropwizard.client.HttpClientConfiguration;
import io.dropwizard.client.JerseyClientConfiguration;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class GameAuthConfiguration extends Configuration {

	    @Valid
	    @NotNull
	    private JerseyClientConfiguration httpClient = new JerseyClientConfiguration();
	
	    @JsonProperty("httpClient")
	    public JerseyClientConfiguration getHttpClientConfiguration() {
	        return httpClient;
	    }
	
	    @JsonProperty("httpClient")
	    public void setHttpClientConfiguration(JerseyClientConfiguration httpClient) {
	        this.httpClient = httpClient;
	    }
}