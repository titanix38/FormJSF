package com.m2i.formation.jsf.managedBeans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "bookController")
public class BookController
{
	private BookBean book = new BookBean();
	
	public BookBean getBook()
	{
		return book;
	}

	public void setBook(BookBean book)
	{
		this.book = book;
	}

	public String getSampleBook()
	{
		book = new BookBean();
		book.setId(1);
		book.setTitle("Sample");
		book.setPrice(9.99);
		return BookControllerEnum.showBook.toString();
	}
	
	public String insertBook()
	{
		// insert dans la BdD
		return BookControllerEnum.showBook.toString();
	}
}
