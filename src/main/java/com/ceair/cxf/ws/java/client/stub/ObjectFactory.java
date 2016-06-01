
package com.ceair.cxf.ws.java.client.stub;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ceair.cxf.ws.java.client.stub package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAddressByMobileResponse_QNAME = new QName("http://server.java.ws.cxf.ceair.com/", "getAddressByMobileResponse");
    private final static QName _GetAddressByMobile_QNAME = new QName("http://server.java.ws.cxf.ceair.com/", "getAddressByMobile");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ceair.cxf.ws.java.client.stub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAddressByMobile }
     * 
     */
    public GetAddressByMobile createGetAddressByMobile() {
        return new GetAddressByMobile();
    }

    /**
     * Create an instance of {@link GetAddressByMobileResponse }
     * 
     */
    public GetAddressByMobileResponse createGetAddressByMobileResponse() {
        return new GetAddressByMobileResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAddressByMobileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.java.ws.cxf.ceair.com/", name = "getAddressByMobileResponse")
    public JAXBElement<GetAddressByMobileResponse> createGetAddressByMobileResponse(GetAddressByMobileResponse value) {
        return new JAXBElement<GetAddressByMobileResponse>(_GetAddressByMobileResponse_QNAME, GetAddressByMobileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAddressByMobile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.java.ws.cxf.ceair.com/", name = "getAddressByMobile")
    public JAXBElement<GetAddressByMobile> createGetAddressByMobile(GetAddressByMobile value) {
        return new JAXBElement<GetAddressByMobile>(_GetAddressByMobile_QNAME, GetAddressByMobile.class, null, value);
    }

}
