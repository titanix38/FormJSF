package com.m2i.formation.jsf.managedBeans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="bookBean")
public class BookBean
{
	private int id;
	private String title;
	private double price;
	
	
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public double getPriceVAT()
	{
		
		return (double)Math.round(price*105)/100;
	}
}
