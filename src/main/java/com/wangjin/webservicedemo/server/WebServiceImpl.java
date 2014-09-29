package com.wangjin.webservicedemo.server;

import org.springframework.stereotype.Component;

import javax.jws.WebService;

/**
 * Created by wangjin on 14-9-29.
 */
@Component("DemoWebserviceImpl")
@WebService(name="DEMO_WEBSERVICE",targetNamespace = "http://demo.webservice.com")
public class WebServiceImpl implements WebServiceInterface {

    @Override
    public void demoMethod() {
        System.out.println("demo method!!!");
    }

    @Override
    public String demoMethod2() {
        return "this is the demo method 2!!!";
    }
}
