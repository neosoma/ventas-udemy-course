package com.ventas.ventas.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * This class avoids the blank error page that is shown when the url requested has not assigned any mapping.
 * 
 * 
 * @author francisco
 * @see <a href="https://www.yawintutor.com/application-has-no-explicit-mapping-for-error-whitelabel-error-page-with-status-404/">Whitelabel error page</a>
 */
@RestController
public class ErrorHandlerController implements ErrorController{

	@Override
	@RequestMapping("/error")
	@ResponseBody
	public String getErrorPath() {
		return "<center><h1>Something went wrong</h1></center>";
	}
}
