
package com.jiangda.cust.integration.transport.gener.jdintegration;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.jiangda.cust.integration.transport.gener package. 
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

    private final static QName _Execute_QNAME = new QName("http://ws.integration.framework.jiangda.com/", "execute");
    private final static QName _ExecuteResponse_QNAME = new QName("http://ws.integration.framework.jiangda.com/", "executeResponse");
    private final static QName _AuthInfo_QNAME = new QName("http://ws.integration.framework.jiangda.com/", "authInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jiangda.cust.integration.transport.gener
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExecuteResponse }
     * 
     */
    public ExecuteResponse createExecuteResponse() {
        return new ExecuteResponse();
    }

    /**
     * Create an instance of {@link Execute }
     * 
     */
    public Execute createExecute() {
        return new Execute();
    }

    /**
     * Create an instance of {@link AuthInfo }
     * 
     */
    public AuthInfo createAuthInfo() {
        return new AuthInfo();
    }

    /**
     * Create an instance of {@link InputParameter }
     * 
     */
    public InputParameter createInputParameter() {
        return new InputParameter();
    }

    /**
     * Create an instance of {@link OutputParameter }
     * 
     */
    public OutputParameter createOutputParameter() {
        return new OutputParameter();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Execute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.integration.framework.jiangda.com/", name = "execute")
    public JAXBElement<Execute> createExecute(Execute value) {
        return new JAXBElement<Execute>(_Execute_QNAME, Execute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.integration.framework.jiangda.com/", name = "executeResponse")
    public JAXBElement<ExecuteResponse> createExecuteResponse(ExecuteResponse value) {
        return new JAXBElement<ExecuteResponse>(_ExecuteResponse_QNAME, ExecuteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.integration.framework.jiangda.com/", name = "authInfo")
    public JAXBElement<AuthInfo> createAuthInfo(AuthInfo value) {
        return new JAXBElement<AuthInfo>(_AuthInfo_QNAME, AuthInfo.class, null, value);
    }

}
