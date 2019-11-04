package com.plag;

import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class Auth
 */
@WebServlet("/Auth")
public class Auth {
	 public static boolean isAllowed(String username, String password) {
		    return username.contentEquals("admin") && password.contentEquals("password");
		  }

}
