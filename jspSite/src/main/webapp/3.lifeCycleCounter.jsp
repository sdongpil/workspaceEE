<%@ page contentType="text/html; charset=utf-8" %>
<%! int count = 0;
	

	public void jspInit(){
		System.out.println("1.jspInit 메소드호출[객체생성시 생성자 호출후 단한번 호출]");
	}
	
	public void jspDestroy(){
		System.out.println("3.jspDestroy 메소드호출[객체가 메모리에서 해지될때 호출]");
	}
	%>
	
	<% 
	System.out.println("2.jspService 메소드 요청시마다 호출");
	%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
			<body bgcolor=#40e0d0 style=font-size:9pt;line-height:140%;> 
			<center>		
				
			 현재까지의 요청은
			<font color=#0000FF>


			 <%
			 count++;
			 String countstr = count+"";
			 for(int i = 0; i<countstr.length(); i++){
				 char num =countstr.charAt(i);
				 out.print("<img width = '20' height = '20' src = 'images/"+num+".png' > ");
			 }
			 
			 
			 %>
			</font>
			 입니다 
			</center> 
			</body> 
</html> 
