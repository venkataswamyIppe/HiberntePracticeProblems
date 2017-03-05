package com.hibernate;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;

public class Pagination extends HttpServlet {
	private SessionFactory factory;

	// init method started
	public void init(ServletConfig config) throws ServletException {
		factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		System.out.println("Factory has been created....");
	}
	//init method end
	//service method start
	public void service(ServletRequest req, ServletResponse res)throws ServletException,IOException
	{
		int pageIndex = 0;
		int totalNumberOfRecords = 0;
		int numberOfRecordsPerPage =2;
		String sPageIndex = req.getParameter("pageIndex");

		if(sPageIndex ==null)
		{
			pageIndex = 1;
		}
		else
		{
			pageIndex = Integer.parseInt(sPageIndex);
		}
		Session ses = factory.openSession();
		int s = (pageIndex*numberOfRecordsPerPage) -numberOfRecordsPerPage;

		Criteria crit = ses.createCriteria(Product.class);
		crit.setFirstResult(s);
		crit.setMaxResults(numberOfRecordsPerPage);
		List l = crit.list();
		Iterator it = l.iterator();
		PrintWriter pw = res.getWriter();
		pw.println("<body>");
		pw.println("<center>");
		pw.println("<table border=1>");
		pw.println("<tr>");
		pw.println("<th>PID</th><th>PNAME</th><th>PRICE</th>");
		pw.println("</tr>");
		while(it.hasNext())
		{
			Product p = (Product)it.next();
			pw.println("<tr>");
			pw.println("<td>"+p.getProductId()+"</td>");
			pw.println("<td>"+p.getProName()+"</td>");
			pw.println("<td>"+p.getPrice()+"</td>");
			pw.println("</tr>");
		}
		pw.println("</center>");
		pw.println("</body>");
		pw.println("<table>");
		Criteria crit1 = ses.createCriteria(Product.class);
		crit1.setProjection(Projections.rowCount());

		List ls=crit1.list();
		//pw.println(ls.size());
		//returns 1, as list() is used to execute the query if true will returns 1
		Iterator itr = ls.iterator();
		if(itr.hasNext())
		{
			Object o=itr.next();
			totalNumberOfRecords = Integer.parseInt(o.toString());
		}
		int noOfPages = totalNumberOfRecords/numberOfRecordsPerPage;
		if(totalNumberOfRecords > (noOfPages * numberOfRecordsPerPage))
		{
			noOfPages = noOfPages + 1;
		}
		for(int i=1;i<=noOfPages;i++)
		{
			String myurl = "ind?pageIndex="+i;
			pw.println("<a href="+myurl+"> "+i+" </a>");
		}
		ses.close();
		pw.close();
	}
	//service method end

	//destroy method start
	public void destroy()
	{
		factory.close();
	}
	//destroy end
}