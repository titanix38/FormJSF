package com.m2i.formation.jsf.managedBeans;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloServiceOld
{

	@WebMethod
	public String getHello()
	{
		return "Hello World from Service";
	}
	
	public BookBean getBook(int id, String title, double price)
	{
		BookBean bb = new BookBean();
		bb.setId(id);
		bb.setTitle(title);
		bb.setPrice(price);
		return bb;
	}

}
