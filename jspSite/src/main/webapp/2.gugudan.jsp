<%@ page contentType="text/html; charset=utf-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<HTML>
<HEAD>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<TITLE>방가워요 JSP</TITLE>
</HEAD>
<BODY>
	<center>
		<H2>JSP 잘났어 정말 별꼴이야!!!!!!!!!</H2>
		
			<img src='tomcat.svg' />
				<H2>JSP구구단(스크립렛)</H2>
			<table border=1 width=600 bgcolor=#CCFF33  bordercolordark=#FF6600
				cellspacing=0>
					<%for(int j =2 ; j<=9; j++){ %>
				<tr>
					<%for(int i = 1; i<=9; i++){ 
					out.print("<td align=center>"+j+"*"+i+"="+j*i+"</td>");
					} %>
				</tr>
					<% }%>
			</table>
			<hr>
			
			
			<H2>JSP구구단(스크립렛)</H2>
			<table border=1 width=600 bgcolor=#CCFF33  bordercolordark=#FF6600
				cellspacing=0>
					<%for(int j =2 ; j<=9; j++){ %>
				<tr>
					<%for(int i = 1; i<=9; i++){ %>
					<td align=center><%out.print(j+"*"+i+"="+j*i);%></td>
					<% } %>
				</tr>
					<% }%>
			</table>
			<hr>
			
			
			<H2>JSP구구단(표현식)</H2>
			<table border=1 width=600 bgcolor=#CCFF33  bordercolordark=#FF6600
				cellspacing=0>
					<%for(int j =2 ; j<=9; j++){ %>
				<tr>
					<%for(int i = 1; i<=9; i++){ %>
					<td align=center><%=j%>*<%=i%>=<%=j*i %></td>
					<% } %>
				</tr>
					<% }%>
			</table>
	</center>		
			<br />
</BODY>
</HTML>
