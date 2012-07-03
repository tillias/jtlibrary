package org.services;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class TestService {

    @WebMethod
    public long foo() {
	return new Date().getTime();
    }

}
