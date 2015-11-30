package com.m2i.formation.jsf.managedBeans;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.swing.Spring;

import com.m2i.formation.media.entities.Media;
import com.m2i.formation.media.ioc.ConstructObject;
import com.m2i.formation.media.repositories.MediaRepository;
import com.m2i.formation.media.services.MainService;
import com.m2i.formation.test.EMFAlone;

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
		return BookControllerEnum.bookByTemplate.toString();
	}
	
	public String insertBook()
	{
		// insert dans la BdD
		return BookControllerEnum.showBook.toString();
	}
		
	public String getBookById()
	{
		// Appel à la BdD
		
		EntityManagerFactory emf = EMFAlone.getInstance();
		EntityManager em = emf.createEntityManager();
		MediaRepository mr = new MediaRepository();
		
		mr.setEntityManager(em);
		
		Media m = mr.getById(book.getId());  
		book.setTitle(m.getTitle());
		book.setPrice(m.getPrice());
		
		
		return BookControllerEnum.bookByTemplate.toString();
		
	}
	
}
