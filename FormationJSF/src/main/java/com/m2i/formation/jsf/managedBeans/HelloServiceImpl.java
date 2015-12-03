package com.m2i.formation.jsf.managedBeans;
import java.rmi.RemoteException;

import com.m2i.formation.jsf.managedBeans.BookBean;
import com.m2i.formation.jsf.managedBeans.HelloService;

public class HelloServiceImpl implements HelloService
{

	@Override
	public BookBean getBook(int id, String title, double price, int category) throws RemoteException
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getHello() throws RemoteException
	{
		// TODO Auto-generated method stub
		return null;
	}

}
