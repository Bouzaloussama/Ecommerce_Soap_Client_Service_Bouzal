/**
 * CManagerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws;

public class CManagerServiceLocator extends org.apache.axis.client.Service implements ws.CManagerService {

    public CManagerServiceLocator() {
    }


    public CManagerServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CManagerServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Service_ManagerPort
    private java.lang.String Service_ManagerPort_address = "http://localhost:8583/";

    public java.lang.String getService_ManagerPortAddress() {
        return Service_ManagerPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Service_ManagerPortWSDDServiceName = "Service_ManagerPort";

    public java.lang.String getService_ManagerPortWSDDServiceName() {
        return Service_ManagerPortWSDDServiceName;
    }

    public void setService_ManagerPortWSDDServiceName(java.lang.String name) {
        Service_ManagerPortWSDDServiceName = name;
    }

    public ws.Service_Manager getService_ManagerPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Service_ManagerPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getService_ManagerPort(endpoint);
    }

    public ws.Service_Manager getService_ManagerPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ws.Service_ManagerPortBindingStub _stub = new ws.Service_ManagerPortBindingStub(portAddress, this);
            _stub.setPortName(getService_ManagerPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setService_ManagerPortEndpointAddress(java.lang.String address) {
        Service_ManagerPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ws.Service_Manager.class.isAssignableFrom(serviceEndpointInterface)) {
                ws.Service_ManagerPortBindingStub _stub = new ws.Service_ManagerPortBindingStub(new java.net.URL(Service_ManagerPort_address), this);
                _stub.setPortName(getService_ManagerPortWSDDServiceName());
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
        if ("Service_ManagerPort".equals(inputPortName)) {
            return getService_ManagerPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws/", "CManagerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws/", "Service_ManagerPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Service_ManagerPort".equals(portName)) {
            setService_ManagerPortEndpointAddress(address);
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
