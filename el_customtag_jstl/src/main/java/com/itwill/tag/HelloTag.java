package com.itwill.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class HelloTag extends TagSupport{
	public HelloTag() {
		System.out.println("1.helloTag기본생성자");
	}
	@Override
	public int doStartTag() throws JspException {
		System.out.println("doStartTag");
		try {
			JspWriter out=  pageContext.getOut();
			String id = (String) pageContext.getSession().getAttribute("sUserId");
			if(id == null) {
				id = "guest";
			}
			out.println(id +" hi <br>");
		} catch (IOException e) {
			throw new JspException(e.getMessage());
			
		}
		return SKIP_BODY;
	}
	@Override
	public int doEndTag() throws JspException {
		System.out.println("doEndTag");
		
		try {
			pageContext.getOut().print("<br>");
			
		}catch (Exception e) {
				throw new JspException(e.getMessage());
		}
		return EVAL_PAGE;
		
	}
	
}
