package com.wangjin.webservicedemo.server;

/**
 * Created by wangjin on 14-9-29.
 */
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
