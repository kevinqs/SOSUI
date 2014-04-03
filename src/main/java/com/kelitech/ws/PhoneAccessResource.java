package com.kelitech.ws;

import java.util.Date;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hibernate.Session;

import com.kelitech.persistence.MobilePhoneAccess;
import com.kelitech.persistence.util.HibernateUtil;


// POJO, no interface no extends

//Sets the path to base URL + /hello
@Path("/phoneAccess")
public class PhoneAccessResource {
	
	@GET
	@Path("{phoneId}/{action}")
	@Produces(MediaType.TEXT_HTML)
	public String sayHtmlHello(
			@PathParam("phoneId") String phoneId,
			@PathParam("action") String action
			) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		 
	    session.beginTransaction();
	    MobilePhoneAccess phoneAccess = new MobilePhoneAccess();
	    phoneAccess.setAccessTime(new Date()); 
	    phoneAccess.setPhoneId(phoneId);
	    phoneAccess.setAction(action);
	    session.save(phoneAccess);
	    session.getTransaction().commit();	
	    
	    return "success1";
		
	}
}
