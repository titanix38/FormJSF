package com.m2i.formation.jsf.managedBeans;

import java.util.*;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.swing.Spring;

import com.m2i.formation.media.entities.Media;
import com.m2i.formation.media.ioc.ConstructObject;
import com.m2i.formation.media.repositories.MediaRepository;
import com.m2i.formation.media.services.MainService;
import com.m2i.formation.test.EMFAlone;

@ManagedBean(name = "booksController")
public class BooksController
{
	private List<BookBean> listbooks = new ArrayList<BookBean>();
	
	public String getAllBooks()
	{
//		Media b = (Media)ConstructObject.getInstance().getBean("media");
		BookBean b = new BookBean();
		b.adaptMedia2BookBean();
		listbooks = b.adaptMedia2BookBean();
		
		return BookControllerEnum.showBooks.toString();
	}

	public List<BookBean> getListbooks()
	{
		listbooks.clear();
		
		getAllBooks();
//		for (int i=1;i<4;i++)
//		{
//			BookBean b = new BookBean();
//			b.setId(i);
//			b.setTitle("Star Wars "+i);
//			b.setPrice(9.99+i);
//			
//			listbooks.add(b);
//		}
		return listbooks;
	}

	public void setListbooks(List<BookBean> listbooks)
	{
		listbooks.clear();
		BookBean b = new BookBean();
		
		for (int i=1;i<4;i++)
		{
			b.setId(i);
			b.setTitle("Star Wars "+i);
			b.setPrice(9.99);
			
			listbooks.add(b);
		}
		this.listbooks = listbooks;
	}
	
}
