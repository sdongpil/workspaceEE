package com.itwill.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class HelloAttributeTag extends TagSupport {
	public HelloAttributeTag() {
		System.out.println("1.helloAttr");
	}

	String irum;

	public void setIrum(String irum) {
		System.out.println("2.setirum 메소드 호출");
		this.irum = irum;
	}

	@Override
	public int doStartTag() throws JspException {
		try {
			String msg = "";
			if (irum.equals("김경호")) {
				msg = irum+" hi~" +"<br>";

			} else {
				msg = irum+"bye";
			}
			pageContext.getOut().println(msg);

		} catch (IOException e) {

		}
		return SKIP_BODY;
	}

	@Override
	public int doEndTag() throws JspException {
		return super.doEndTag();
	}

}
