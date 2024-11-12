/**
 * Hello_BindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Nov 07, 2023 (07:57:58 UTC) WSDL2Java emitter.
 */

package com.examples.www.wsdl.HelloService_wsdl;

public class Hello_BindingImpl implements com.examples.www.wsdl.HelloService_wsdl.Hello_PortType{
    public java.lang.String sayHello(java.lang.String firstName) throws java.rmi.RemoteException {
        return firstName + " -  фио студента";
    }

}
