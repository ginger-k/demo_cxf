package com.ceair.cxf.ws.java.client.stub;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2016-03-02T09:35:31.086+08:00
 * Generated source version: 2.7.18
 * 
 */
@WebServiceClient(name = "MobileAddressService", 
                  wsdlLocation = "http://127.0.0.1:8888/mobile?wsdl",
                  targetNamespace = "http://server.java.ws.cxf.ceair.com/") 
public class MobileAddressService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://server.java.ws.cxf.ceair.com/", "MobileAddressService");
    public final static QName MobileAddressPort = new QName("http://server.java.ws.cxf.ceair.com/", "MobileAddressPort");
    static {
        URL url = null;
        try {
            url = new URL("http://127.0.0.1:8888/mobile?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(MobileAddressService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://127.0.0.1:8888/mobile?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public MobileAddressService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MobileAddressService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MobileAddressService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public MobileAddressService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public MobileAddressService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public MobileAddressService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns MobileAddress
     */
    @WebEndpoint(name = "MobileAddressPort")
    public MobileAddress getMobileAddressPort() {
        return super.getPort(MobileAddressPort, MobileAddress.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MobileAddress
     */
    @WebEndpoint(name = "MobileAddressPort")
    public MobileAddress getMobileAddressPort(WebServiceFeature... features) {
        return super.getPort(MobileAddressPort, MobileAddress.class, features);
    }

}
