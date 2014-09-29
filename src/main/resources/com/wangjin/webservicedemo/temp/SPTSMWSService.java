
package com.wangjin.webservicedemo.temp;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SP_TSM_WSService", targetNamespace = "http://tsm.sp.com", wsdlLocation = "http://202.102.101.62:8080/TSMServer/SP_TSM_WS?wsdl")
public class SPTSMWSService
    extends Service
{

    private final static URL SPTSMWSSERVICE_WSDL_LOCATION;
    private final static WebServiceException SPTSMWSSERVICE_EXCEPTION;
    private final static QName SPTSMWSSERVICE_QNAME = new QName("http://tsm.sp.com", "SP_TSM_WSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://202.102.101.62:8080/TSMServer/SP_TSM_WS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SPTSMWSSERVICE_WSDL_LOCATION = url;
        SPTSMWSSERVICE_EXCEPTION = e;
    }

    public SPTSMWSService() {
        super(__getWsdlLocation(), SPTSMWSSERVICE_QNAME);
    }

    public SPTSMWSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SPTSMWSSERVICE_QNAME, features);
    }

    public SPTSMWSService(URL wsdlLocation) {
        super(wsdlLocation, SPTSMWSSERVICE_QNAME);
    }

    public SPTSMWSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SPTSMWSSERVICE_QNAME, features);
    }

    public SPTSMWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SPTSMWSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SPTSMWS
     */
    @WebEndpoint(name = "SP_TSM_WS")
    public SPTSMWS getSPTSMWS() {
        return super.getPort(new QName("http://tsm.sp.com", "SP_TSM_WS"), SPTSMWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SPTSMWS
     */
    @WebEndpoint(name = "SP_TSM_WS")
    public SPTSMWS getSPTSMWS(WebServiceFeature... features) {
        return super.getPort(new QName("http://tsm.sp.com", "SP_TSM_WS"), SPTSMWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SPTSMWSSERVICE_EXCEPTION!= null) {
            throw SPTSMWSSERVICE_EXCEPTION;
        }
        return SPTSMWSSERVICE_WSDL_LOCATION;
    }

}
