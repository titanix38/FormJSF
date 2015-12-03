/**
 * HelloServiceSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.m2i.formation.jsf.managedBeans;

public class HelloServiceSoapBindingImpl implements com.m2i.formation.jsf.managedBeans.HelloService{
    public com.m2i.formation.jsf.managedBeans.BookBean getBook(int id, java.lang.String title, double price) throws java.rmi.RemoteException {
        return null;
    }

	public com.m2i.formation.jsf.managedBeans.BookBean getBook(int id, java.lang.String title, double price, int category) throws java.rmi.RemoteException {
		BookBean bb = new BookBean();
		bb.setId(id);
		bb.setTitle(title);
		bb.setPrice(9.99);
		bb.setCategory(0);		
		
		return bb;
    }

    public java.lang.String getHello() throws java.rmi.RemoteException {
        return null;
    }

}
