package com.dfs.almrally.testresults.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

		@JsonInclude(JsonInclude.Include.NON_NULL)
		@JsonPropertyOrder({
		"screenshot"
		})
		
		
public class Screenshot {

	@JsonProperty("screenshot")
	public String screenshots;

}