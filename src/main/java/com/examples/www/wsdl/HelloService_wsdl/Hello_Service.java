/**
 * Hello_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Nov 07, 2023 (07:57:58 UTC) WSDL2Java emitter.
 */

package com.examples.www.wsdl.HelloService_wsdl;

public interface Hello_Service extends javax.xml.rpc.Service {

/**
 * WSDL File for HelloService
 */
    public java.lang.String getHello_PortAddress();

    public com.examples.www.wsdl.HelloService_wsdl.Hello_PortType getHello_Port() throws javax.xml.rpc.ServiceException;

    public com.examples.www.wsdl.HelloService_wsdl.Hello_PortType getHello_Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
