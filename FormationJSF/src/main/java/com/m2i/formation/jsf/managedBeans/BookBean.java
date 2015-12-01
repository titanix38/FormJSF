package com.m2i.formation.jsf.managedBeans;

import java.awt.print.Book;
import java.util.*;

import javax.faces.bean.ManagedBean;

import com.m2i.formation.media.entities.*;
import com.m2i.formation.media.ioc.ConstructObject;
import com.m2i.formation.media.repositories.*;

@ManagedBean(name = "bookBean")
public class BookBean
{
	private int id;
	private String title;
	private double price;

	private MediaRepository mr = (MediaRepository) ConstructObject.getInstance().getBean("mediaRepository");
	private List<Media> lm = new ArrayList<Media>();

	public List<BookBean> adaptMedia2BookBean()
	{
		lm = mr.getAllBooks();
		List<BookBean> lb = new ArrayList<BookBean>();
		BookBean bb;
		
		for (Media m : lm)
		{
			bb = new BookBean();
			bb.setId(m.getId());
			bb.setTitle(m.getTitle());
			bb.setPrice(m.getPrice());
			lb.add(bb);
		}
		return lb;
	}

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

		return (double) Math.round(price * 105) / 100;
	}
}
