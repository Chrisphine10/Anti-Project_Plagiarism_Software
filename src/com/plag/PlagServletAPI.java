package com.plag;

import io.joshworks.restclient.http.HttpResponse;
import io.joshworks.restclient.http.Unirest;

public class PlagServletAPI {

	public HttpResponse<String> plagcheck(String concept1, String concept2) {
	HttpResponse<String> response = Unirest.get("https://twinword-text-similarity-v1.p.rapidapi.com/similarity/?text1=?.&text2=?")
			.header("x-rapidapi-host", "twinword-text-similarity-v1.p.rapidapi.com")
			.header("x-rapidapi-key", "SIGN-UP-FOR-KEY")
			.asString();
	return response;
	}
	
	}
