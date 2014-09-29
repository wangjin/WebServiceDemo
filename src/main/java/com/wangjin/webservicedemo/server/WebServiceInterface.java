package com.wangjin.webservicedemo.server;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.soap.SOAPBinding;

/**
 * Created by wangjin on 14-9-29.
 */
@javax.jws.WebService(name="DEMO_WEBSERVICE",targetNamespace = "http://demo.webservice.com")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface WebServiceInterface {

    @WebMethod(operationName = "DEMO_METHOD")
    public void demoMethod();

    @WebMethod(operationName = "DEMO_METHOD2")
    @WebResult(name="DEMO_MEHTOD_Return",targetNamespace = "http://demo.webservice.com",partName = "DEMO_MEHTOD_Return")
    public String demoMethod2();
}
