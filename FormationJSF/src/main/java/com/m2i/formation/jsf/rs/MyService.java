package com.m2i.formation.jsf.rs;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

import com.m2i.formation.jsf.managedBeans.BookBean;
import com.m2i.formation.jsf.managedBeans.PhoneBean;
import com.m2i.formation.media.entities.Media;
import com.m2i.formation.media.ioc.ConstructObject;
import com.m2i.formation.media.repositories.MediaRepository;
import com.m2i.formation.media.services.MainService;

@Path("/item")
public class MyService
{
	@GET
	@Path("/hello")
	@Produces(MediaType.TEXT_PLAIN)
	public String getHello()
	{
		return "Hello anonymous person !!!";
	}

	@GET
	@Path("/hello/{param}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getHello(@PathParam("param") String param)
	{
		return "Hello " + param + " !!!";
	}

	@GET
	@Path("/booksample")
	@Produces(MediaType.APPLICATION_JSON)
	public BookBean getBookSample()
	{
		BookBean bb = new BookBean();
		bb.setId(1);
		bb.setTitle("J'aurais voulu etre un artiste...");
		bb.setPrice(19.99);
		return bb;
	}

	@GET
	@Path("/bookbyid/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public BookBean getBookById(@PathParam("id") int id)
	{
		Media m = ConstructObject.getInstance().getBean(MainService.class).getMediaRepository().getById(id);
		BookBean bb = new BookBean();
		bb.setId(m.getId());
		bb.setTitle(m.getTitle());
		bb.setPrice(m.getPrice());
		
		return bb;
	}

	@GET
	@Path("/bookall")
	@Produces(MediaType.APPLICATION_JSON)
	public List<BookBean> getBookAll()
	{
		List<Media> lm = ConstructObject.getInstance().getBean(MainService.class).getMediaRepository().getAllBooks();
//		List<Media> lm = ConstructObject.getInstance().getBean(MainService.class).
		
		List<BookBean> lb = new ArrayList<BookBean>();
		
		for(Media m:lm)
		{
			BookBean bb = new BookBean();
			bb.setId(m.getId());
			bb.setTitle(m.getTitle());
			bb.setPrice(m.getPrice());
			lb.add(bb);
		}
		
		return lb;
	}
	
	@GET
	@Path("/phone")
	@Produces(MediaType.APPLICATION_JSON)
	public List<PhoneBean> getPhoneAll()
	{
		PhoneBean pb1 = new PhoneBean();
		
		
		return null;
	}

}
