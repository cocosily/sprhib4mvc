package com.zhongrun.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface HelloWorldService {

	@WebMethod  
	public String syaHello(@WebParam(name="userName")String userName);
}
