package com.plag;

import io.joshworks.restclient.http.HttpResponse;
import io.joshworks.restclient.http.Unirest;

public class PlagServletAPI {

	public HttpResponse<String> plagcheck(String concept1, String concept2) {
	HttpResponse<String> response = Unirest.get("https://twinword-text-similarity-v1.p.rapidapi.com/similarity/?text1=" + concept1 +" & text2= "+ concept2 +"")
			.header("x-rapidapi-host", "twinword-text-similarity-v1.p.rapidapi.com")
			.header("x-rapidapi-key", "e80ef4cb87mshfed4d976ce92e7ep1e2f3fjsne5fd5b2baffe")
			.asString();
	return  response;
	}
	
	}
