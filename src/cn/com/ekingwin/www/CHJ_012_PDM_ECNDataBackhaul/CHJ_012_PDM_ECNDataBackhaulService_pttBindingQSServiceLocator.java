/**
 * CHJ_012_PDM_ECNDataBackhaulService_pttBindingQSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.ekingwin.www.CHJ_012_PDM_ECNDataBackhaul;

public class CHJ_012_PDM_ECNDataBackhaulService_pttBindingQSServiceLocator extends org.apache.axis.client.Service implements cn.com.ekingwin.www.CHJ_012_PDM_ECNDataBackhaul.CHJ_012_PDM_ECNDataBackhaulService_pttBindingQSService {

/**
 * OSB Service
 */
	public CHJ_012_PDM_ECNDataBackhaulService_pttBindingQSServiceLocator(String url){
		this.CHJ_012_PDM_ECNDataBackhaulService_pttBindingQSPort_address=url;
	}

    public CHJ_012_PDM_ECNDataBackhaulService_pttBindingQSServiceLocator() {
    }


    public CHJ_012_PDM_ECNDataBackhaulService_pttBindingQSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CHJ_012_PDM_ECNDataBackhaulService_pttBindingQSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CHJ_012_PDM_ECNDataBackhaulService_pttBindingQSPort
    private java.lang.String CHJ_012_PDM_ECNDataBackhaulService_pttBindingQSPort_address = "http://10.254.210.5:80/WP_CHJ/APP_PDM_SERVICES/Proxy_Services/TA_BOM/CHJ_012_PDM_ECNDataBackhaul_PS";

    public java.lang.String getCHJ_012_PDM_ECNDataBackhaulService_pttBindingQSPortAddress() {
        return CHJ_012_PDM_ECNDataBackhaulService_pttBindingQSPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CHJ_012_PDM_ECNDataBackhaulService_pttBindingQSPortWSDDServiceName = "CHJ_012_PDM_ECNDataBackhaulService_ptt-bindingQSPort";

    public java.lang.String getCHJ_012_PDM_ECNDataBackhaulService_pttBindingQSPortWSDDServiceName() {
        return CHJ_012_PDM_ECNDataBackhaulService_pttBindingQSPortWSDDServiceName;
    }

    public void setCHJ_012_PDM_ECNDataBackhaulService_pttBindingQSPortWSDDServiceName(java.lang.String name) {
        CHJ_012_PDM_ECNDataBackhaulService_pttBindingQSPortWSDDServiceName = name;
    }

    public cn.com.ekingwin.www.CHJ_012_PDM_ECNDataBackhaul.CHJ_012_PDM_ECNDataBackhaulService_ptt getCHJ_012_PDM_ECNDataBackhaulService_pttBindingQSPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CHJ_012_PDM_ECNDataBackhaulService_pttBindingQSPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCHJ_012_PDM_ECNDataBackhaulService_pttBindingQSPort(endpoint);
    }

    public cn.com.ekingwin.www.CHJ_012_PDM_ECNDataBackhaul.CHJ_012_PDM_ECNDataBackhaulService_ptt getCHJ_012_PDM_ECNDataBackhaulService_pttBindingQSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cn.com.ekingwin.www.CHJ_012_PDM_ECNDataBackhaul.CHJ_012_PDM_ECNDataBackhaulService_pttBindingStub _stub = new cn.com.ekingwin.www.CHJ_012_PDM_ECNDataBackhaul.CHJ_012_PDM_ECNDataBackhaulService_pttBindingStub(portAddress, this);
            _stub.setPortName(getCHJ_012_PDM_ECNDataBackhaulService_pttBindingQSPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCHJ_012_PDM_ECNDataBackhaulService_pttBindingQSPortEndpointAddress(java.lang.String address) {
        CHJ_012_PDM_ECNDataBackhaulService_pttBindingQSPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cn.com.ekingwin.www.CHJ_012_PDM_ECNDataBackhaul.CHJ_012_PDM_ECNDataBackhaulService_ptt.class.isAssignableFrom(serviceEndpointInterface)) {
                cn.com.ekingwin.www.CHJ_012_PDM_ECNDataBackhaul.CHJ_012_PDM_ECNDataBackhaulService_pttBindingStub _stub = new cn.com.ekingwin.www.CHJ_012_PDM_ECNDataBackhaul.CHJ_012_PDM_ECNDataBackhaulService_pttBindingStub(new java.net.URL(CHJ_012_PDM_ECNDataBackhaulService_pttBindingQSPort_address), this);
                _stub.setPortName(getCHJ_012_PDM_ECNDataBackhaulService_pttBindingQSPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CHJ_012_PDM_ECNDataBackhaulService_ptt-bindingQSPort".equals(inputPortName)) {
            return getCHJ_012_PDM_ECNDataBackhaulService_pttBindingQSPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.ekingwin.com.cn/CHJ_012_PDM_ECNDataBackhaul", "CHJ_012_PDM_ECNDataBackhaulService_ptt-bindingQSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.ekingwin.com.cn/CHJ_012_PDM_ECNDataBackhaul", "CHJ_012_PDM_ECNDataBackhaulService_ptt-bindingQSPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CHJ_012_PDM_ECNDataBackhaulService_pttBindingQSPort".equals(portName)) {
            setCHJ_012_PDM_ECNDataBackhaulService_pttBindingQSPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
