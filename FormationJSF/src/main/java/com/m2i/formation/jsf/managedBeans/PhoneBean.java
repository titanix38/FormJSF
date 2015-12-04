package com.m2i.formation.jsf.managedBeans;

import java.io.Serializable;

public class PhoneBean implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;

	private double price;

	private double priceVAT;

	private String title;

	private int category;

	public PhoneBean() {}

	public PhoneBean(
           int id,
           double price,
           double priceVAT,
           String title,
           int category) 
    {
           this.id = id;
           this.price = price;
           this.priceVAT = priceVAT;
           this.title = title;
           this.category = category;
    }

	/**
	 * Gets the id value for this BookBean.
	 * 
	 * @return id
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Sets the id value for this BookBean.
	 * 
	 * @param id
	 */
	public void setId(int id)
	{
		this.id = id;
	}

	/**
	 * Gets the price value for this BookBean.
	 * 
	 * @return price
	 */
	public double getPrice()
	{
		return price;
	}

	/**
	 * Sets the price value for this BookBean.
	 * 
	 * @param price
	 */
	public void setPrice(double price)
	{
		this.price = price;
	}

	/**
	 * Gets the priceVAT value for this BookBean.
	 * 
	 * @return priceVAT
	 */
	public double getPriceVAT()
	{
		return priceVAT;
	}

	/**
	 * Sets the priceVAT value for this BookBean.
	 * 
	 * @param priceVAT
	 */
	public void setPriceVAT(double priceVAT)
	{
		this.priceVAT = priceVAT;
	}

	/**
	 * Gets the title value for this BookBean.
	 * 
	 * @return title
	 */
	public java.lang.String getTitle()
	{
		return title;
	}

	/**
	 * Sets the title value for this BookBean.
	 * 
	 * @param title
	 */
	public void setTitle(java.lang.String title)
	{
		this.title = title;
	}

	/**
	 * Gets the category value for this BookBean.
	 * 
	 * @return category
	 */
	public int getCategory()
	{
		return category;
	}

	/**
	 * Sets the category value for this BookBean.
	 * 
	 * @param category
	 */
	public void setCategory(int category)
	{
		this.category = category;
	}

}
