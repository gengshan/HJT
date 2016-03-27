

<%@page import="com.hibernate.util.HibernateUtil"%>
<%@page import="com.model.TbTaobao"%>
<%@page import="com.model.TbWkind"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    This is my JSP page. <br>
	<%
	                    	TbWkind tbw = new TbWkind();
				    		HibernateUtil hb = new HibernateUtil();
	                    	List listtbwf = hb.findTaobaoWkind();
	                    	String tbwk[][] = new String[3][4];
	                    	if(listtbwf!=null && !listtbwf.isEmpty()){                 	//判断list是否为空
								for(int i=0;i<listtbwf.size()&&i<3;i++){					//循环遍历集合
									tbw = (TbWkind)listtbwf.get(i);						//获得遍历网站种类信息
									tbwk[i][0] = tbw.getKindNo().toString();
									tbwk[i][1] = tbw.getName();
									tbwk[i][2] = tbw.getLink();
									tbwk[i][3] = tbw.getNot();
								}
							}
	                     %>
	                     
	                      <%
				    	TbTaobao tb = new TbTaobao();
				    	List listfood1 = hb.findTaobaoAll1();
				    	if(listfood1!=null && !listfood1.isEmpty()){                 	//判断list是否为空
							for(int i=0;i<listfood1.size()&&i<4;i++){					//循环遍历集合
								tb = (TbTaobao)listfood1.get(i);
								%>
								<li>
			                        <img src=<%=tb.getImg() %>/>
			                        <h1><%=tb.getTit() %></h1>
					<% 		}
						}
					%>
</html>
