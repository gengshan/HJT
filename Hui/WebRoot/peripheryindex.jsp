<%@page import="com.model.TbTake"%>
<%@page import="com.model.TbHotel"%>
<%@page import="com.model.TbKtv"%>
<%@page import="com.model.TbMovie"%>
<%@page import="com.model.TbWkind"%>
<%@page import="com.hibernate.util.HibernateUtil"%>
<%@page import="com.model.TbFood"%>
<%@ page language="java" import="java.util.*" import="servlets.*" import = "java.sql.*" import = "DAO.*" import = "form.*"  pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <script src="js/angular.js"></script>
    <script src="js/angular-animate.min.js"></script>
    <link rel="stylesheet" href="css/css.css" type="text/css"/>
    <title>INDEX</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body bgcolor="#FFFFFF" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
  	<div ng-app="lsyApp" class="lsyapp">
	  	<!--top-->
	    <div class="lsytop" ng-controller="ltop">
	        <div class="lsylogin">请登录  或  注册</div>
	        <ul>
	            <li>更多建议</li>
	            <li>关注我们</li>
	            <li class="fontred" ng-mouseover="wx=!wx" ng-mouseleave="wx=!wx">微信</li>
	        </ul>
	        <div class="lsywx" ng-class="{wx2:wx}"><img src="image/erweima.png" width="100%" height="100%"/></div>
	    </div>
    	
    	<div class="lsylogo">
    		<img src=""/>
    	</div>
    
    	<!--nav-->
    	<div id="nav" class="lsynav" ng-controller="lnav" ng-mouseleave="count=2">
    		<ul>
	            <li ng-class="{lsyhover:choose(count,1)}" ng-mouseover="count=1">惠购物</li>
	            <li ng-class="{lsyhover:choose(count,2)}" ng-mouseover="count=2">汇周边</li>
	            <li ng-class="{lsyhover:choose(count,3)}" ng-mouseover="count=3">慧小说</li>
	        </ul>
	        <div class="lsyuser">
	            <img src="image/2.jpg" width="100%" height="100%"/>
	            <div class="lsyname">这是只狗</div>
	            <div class="lsytrib">话题讨论</div>
	        </div>
	        
	        <div class="lsynav-s">
	             <ul ng-hide="!choose(count,1)">
	              <li>淘宝</li>
	              <li>淘宝</li>
	              <li>淘宝</li>
	              <li>淘宝</li>
	             </ul>
	             <ul ng-hide="!choose(count,2)">
	                 <li ng-click="goto(1)">美食</li>
	                 <li ng-click="goto(2)">电影</li>
	                 <li ng-click="goto(3)">ktv</li>
	                 <li ng-click="goto(4)">旅店</li>
	                 <li ng-click="goto(5)">外卖</li>
	             </ul>
	             <ul ng-hide="!choose(count,3)">
	                 <li>1</li>
	                 <li>2</li>
	                 <li>3</li>
	                 <li>4</li>
	             </ul>
	          <div class="lsymsg" ng-click="msgtoggle()">消息栏</div>
	          <div class="lsymsglist" ng-class="{msghide:msglist}"></div>
        	</div>
    	</div>
    	
    	<!--pic-->
    	<div class="lsypics" ng-controller="lpic">
        	<div class="lsypt">
        		<div class="lsyptype" ng-class="{lsyptype2:judgement(ptype,1)}" ng-click="ptype=1">今日美食</div>
	            <div class="lsyptype" ng-class="{lsyptype2:judgement(ptype,2)}" ng-click="ptype=2">热门电影</div>
	            <div class="lsyptype" ng-class="{lsyptype2:judgement(ptype,3)}" ng-click="ptype=3">娱乐 K歌</div>
	            <div class="lsyptype" ng-class="{lsyptype2:judgement(ptype,4)}" ng-click="ptype=4">住宿旅店</div>
	            <!--<div class="lsyptype" ng-class="{lsyptype2:judgement(ptype,5)}" ng-click="ptype=5">便利外卖</div>-->
	        </div>
	        
	        <!--meishipic-->
	        <div class="lsypi lsypms" ng-hide="!judgement(ptype,1)">
	            <div class="lsyp"  ng-class="{lsyphd:change(number,1)}"><img src="image/mtmsbg603171.jpg"/></div>
	            <div class="lsyp"  ng-class="{lsyphd:change(number,2)}"><img src="image/mtmsbg603172.jpg"/></div>
	            <div class="lsyp"  ng-class="{lsyphd:change(number,3)}"><img src="image/mtmsbg603173.jpg"/></div>
	            <div class="lsyp"  ng-class="{lsyphd:change(number,4)}"><img src="image/mtmsbg603174.jpg"/></div>
	            <div class="lsyp"  ng-class="{lsyphd:change(number,5)}"><img src="image/mtmsbg603175.jpg"/></div>
	            <div class="lsyp-s">
	                <div class="lsyp-sp" ng-class="{lsypsphd:!change(number,1)}" ng-mouseover="number=1"><img src="image/mtmsbg603171.jpg"/></div>
	                <div class="lsyp-sp" ng-class="{lsypsphd:!change(number,2)}" ng-mouseover="number=2"><img src="image/mtmsbg603172.jpg"/></div>
	                <div class="lsyp-sp" ng-class="{lsypsphd:!change(number,3)}" ng-mouseover="number=3"><img src="image/mtmsbg603173.jpg"/></div>
	                <div class="lsyp-sp" ng-class="{lsypsphd:!change(number,4)}" ng-mouseover="number=4"><img src="image/mtmsbg603174.jpg"/></div>
	                <div class="lsyp-sp" ng-class="{lsypsphd:!change(number,5)}" ng-mouseover="number=5"><img src="image/mtmsbg603175.jpg"/></div>
	                <div class="lsyp-st">【城西银泰城】金不换泰国餐厅</div>
	            </div>
	        </div>
	        
	        <!--dianyingpic-->
	        <div class="lsypi lsypdy" ng-hide="!judgement(ptype,2)">
	            <div class="lsyp"  ng-class="{lsyphd:change(number,1)}" ng-mouseover="number=1"><img src="image/mtdy603171.jpg" /></div>
	            <div class="lsyp"  ng-class="{lsyphd:change(number,2)}" ng-mouseover="number=2"><img src="image/mtdy603172.jpg"/></div>
	            <div class="lsyp"  ng-class="{lsyphd:change(number,3)}" ng-mouseover="number=3"><img src="image/mtdy603173.jpg"/></div>
	            <div class="lsyp-s">
	                <!--<div class="lsyp-sp" ng-class="{lsypsphd:!change(number,1)}" ng-click="number=1"><img src="image/mtdy603171.jpg" /></div>-->
	                <!--<div class="lsyp-sp" ng-class="{lsypsphd:!change(number,2)}" ng-click="number=2"><img src="image/mtdy603172.jpg" /></div>-->
	                <!--<div class="lsyp-sp" ng-class="{lsypsphd:!change(number,3)}" ng-click="number=3"><img src="image/mtdy603173.jpg" /></div>-->
	                <div class="lsyp-sp"></div>
	                <div class="lsyp-sp"></div>
	                <div class="lsyp-sp"></div>
	                <div class="lsyp-st" ng-class="{lsypsthd:change(number,1)}">荒野猎人</div>
	                <div class="lsyp-st" ng-class="{lsypsthd:change(number,2)}">疯狂动物城</div>
	                <div class="lsyp-st" ng-class="{lsypsthd:change(number,3)}">蝙蝠侠大战超人</div>
	            </div>
	        </div>
	        
	        <!--ktvpic-->
	        <div class="lsypi lsypktv" ng-hide="!judgement(ptype,3)">
	            <div class="lsyp"  ng-class="{lsyphd:change(number,1)}"><img src="image/mtbg60317k1.jpg"/></div>
	            <div class="lsyp"  ng-class="{lsyphd:change(number,2)}"><img src="image/mtbg60317k2.jpg"/></div>
	            <div class="lsyp"  ng-class="{lsyphd:change(number,3)}"><img src="image/mtbg60317k3.jpg"/></div>
	            <div class="lsyp-s">
	                <div class="lsyp-sp" ng-class="{lsypsphd:!change(number,1)}" ng-mouseover="number=1"><img src="image/mtbg60317k1.jpg"/></div>
	                <div class="lsyp-sp" ng-class="{lsypsphd:!change(number,2)}" ng-mouseover="number=2"><img src="image/mtbg60317k2.jpg"/></div>
	                <div class="lsyp-sp" ng-class="{lsypsphd:!change(number,3)}" ng-mouseover="number=3"><img src="image/mtbg60317k3.jpg"/></div>
	                <div class="lsyp-st">【下沙】格莱美Music Party</div>
	            </div>
	        </div>
	        
	        <!--hotelpic-->
	        <div class="lsypi lsypld" ng-hide="!judgement(ptype,4)">
	            <div class="lsyp"  ng-class="{lsyphd:change(number,1)}"><img src="image/mtldbg603171.jpg"/></div>
	            <div class="lsyp"  ng-class="{lsyphd:change(number,2)}"><img src="image/mtldbg603172.jpg"/></div>
	            <div class="lsyp"  ng-class="{lsyphd:change(number,3)}"><img src="image/mtldbg603173.jpg"/></div>
	            <div class="lsyp"  ng-class="{lsyphd:change(number,4)}"><img src="image/mtldbg603174.jpg"/></div>
	            <div class="lsyp-s">
	                <div class="lsyp-sp" ng-class="{lsypsphd:!change(number,1)}" ng-mouseover="number=1"><img src="image/mtldbg603171.jpg"/></div>
	                <div class="lsyp-sp" ng-class="{lsypsphd:!change(number,2)}" ng-mouseover="number=2"><img src="image/mtldbg603172.jpg"/></div>
	                <div class="lsyp-sp" ng-class="{lsypsphd:!change(number,3)}" ng-mouseover="number=3"><img src="image/mtldbg603173.jpg"/></div>
	                <div class="lsyp-sp" ng-class="{lsypsphd:!change(number,4)}" ng-mouseover="number=4"><img src="image/mtldbg603174.jpg"/></div>
	                <div class="lsyp-st">东天目琉璃阁 经济型</div>
	            </div>
	        </div>
	        
	        <!--waimaipic-->
	        <!--<div class="lsypi" ng-hide="!judgement(ptype,5)">-->
	            <!--<div class="lsyp"  ng-class="{lsyphd:change(number,1)}"><img src="image/2.jpg"/></div>-->
	            <!--<div class="lsyp"  ng-class="{lsyphd:change(number,2)}"><img src="image/1.jpg"/></div>-->
	            <!--<div class="lsyp"  ng-class="{lsyphd:change(number,3)}"><img src="image/3.jpg"/></div>-->
	            <!--<div class="lsyp-s">-->
	                <!--<div class="lsyp-sp" ng-class="{lsypsphd:!change(number,1)}" ng-mouseover="number=1"><img src="image/2.jpg"/></div>-->
	                <!--<div class="lsyp-sp" ng-class="{lsypsphd:!change(number,2)}" ng-mouseover="number=2"><img src="image/1.jpg"/></div>-->
	                <!--<div class="lsyp-sp" ng-class="{lsypsphd:!change(number,3)}" ng-mouseover="number=3"><img src="image/3.jpg"/></div>-->
	            <!--</div>-->
	        <!--</div>-->
    	</div>
    	
    	<!--model-->
    	<div class="lsymodel" ng-controller="lmodel">
    		<!--delicious-->
	        <div class="lsydel" id="meishi">
	            <div class="lmhead">
	                <div class="lmfont">今日美食</div>
	                <ul>
	                    <li>更多</li>
	                    <!-- 从数据库中读取美食网站分类 -->
	                    <%
	                    	TbWkind tbw = new TbWkind();
				    		HibernateUtil hb = new HibernateUtil();
	                    	List listtbwf = hb.findFoodWkind();
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
	                    <li ng-class="{lsyhov:!change(delcount,3)}" ng-click="delcount = 3"><%=tbwk[2][1] %></li>
	                    <li ng-class="{lsyhov:!change(delcount,2)}" ng-click="delcount = 2"><%=tbwk[1][1] %></li>
	                    <li ng-class="{lsyhov:!change(delcount,1)}" ng-click="delcount = 1"><%=tbwk[0][1] %></li>
	                </ul>
	            </div>
	            <div class="lmurl">以下链接来自于 </div>
	            <div class="lmbody">
	                <ul ng-hide="change(delcount,1)">
	                <!-- 从数据库中读取美食推荐前四 -->
	                <!-- 1 -->
	                <%
				    	TbFood food1 = new TbFood();
				    	List listfood1 = hb.findFoodAll1();
				    	if(listfood1!=null && !listfood1.isEmpty()){                 	//判断list是否为空
							for(int i=0;i<listfood1.size()&&i<4;i++){					//循环遍历集合
								food1 = (TbFood)listfood1.get(i);
								%>
								<li>
			                        <img src=<%=food1.getImg() %>/>
			                        <h1><%=food1.getNam() %></h1>
			                        <p><%=food1.getPla() %></p>
			                        <%if(food1.getLab()!=null){ %>
			                        <div class="lspan"><span><%=food1.getLab() %></span></div>
			                        <%} %>
			                        <div class="lprice">￥<%=food1.getPri() %><small>起</small></div>
			                        <div class="lnum"><%=food1.getCon() %></div>
			                    </li>
								<%
							}
						}
					%>
	                </ul>
	                <ul ng-hide="change(delcount,2)">
	                <!-- 2 -->
	                <%
				    	TbFood food2 = new TbFood();
				    	List listfood2 = hb.findFoodAll2();
				    	if(listfood2!=null && !listfood2.isEmpty()){                 	//判断list是否为空
							for(int i=0;i<listfood2.size()&&i<4;i++){					//循环遍历集合
								food2 = (TbFood)listfood2.get(i);
								%>
								<li>
			                        <img src=<%=food2.getImg() %>/>
			                        <h1><%=food2.getNam() %></h1>
			                        <p><%=food2.getPla() %></p>
			                        <%if(food2.getLab()!=null){ %>
			                        <div class="lspan"><span><%=food2.getLab() %></span></div>
			                        <%} %>
			                        <div class="lprice">￥<%=food2.getPri() %><small style="text-decoration:line-through;">¥<%=food2.getSpr() %></small></div>
			                        <div class="lnum"><%=food2.getCon() %></div>
			                    </li>
								<%
							}
						}
					%>
	                </ul>
	                <ul ng-hide="change(delcount,3)">
	                <!-- 3 -->
	                <%
				    	TbFood food3 = new TbFood();
				    	List listfood3 = hb.findFoodAll3();
				    	if(listfood3!=null && !listfood3.isEmpty()){                 	//判断list是否为空
							for(int i=0;i<listfood3.size()&&i<4;i++){					//循环遍历集合
								food3 = (TbFood)listfood3.get(i);
								%>
								<li>
			                        <img src=<%=food3.getImg() %>/>
			                        <h1><%=food3.getNam() %></h1>
			                        <p><%=food3.getPla() %></p>
			                        <%if(food3.getLab()!=null){ %>
			                        <div class="lspan"><span><%=food3.getLab() %></span></div>
			                        <%} %>
			                        <div class="lprice">￥<%=food3.getPri() %><small style="text-decoration:line-through;">价值¥<%=food3.getSpr() %></small></div>
			                        <div class="lnum"><%=food3.getCon() %></div>
			                    </li>
								<%
							}
						}
					%>
	                </ul>
	            </div>
	            <!--<div class="lmfoot">加载更多</div>-->
	        </div>
	        
	       	<!--movie-->
	        <div class="lsydel" id="dianying">
	            <div class="lmhead">
	                <div class="lmfont">热门电影</div>
	                <ul>
	                <!-- 从数据库中读取电影网站分类 -->
	                <%
	                    	List listtbwm = hb.findMovieWkind();
	                    	String tbwkm[][] = new String[3][4];
	                    	if(listtbwm!=null && !listtbwm.isEmpty()){                 	//判断list是否为空
								for(int i=0;i<listtbwm.size()&&i<3;i++){					//循环遍历集合
									tbw = (TbWkind)listtbwm.get(i);						//获得遍历网站种类信息
									tbwkm[i][0] = tbw.getKindNo().toString();
									tbwkm[i][1] = tbw.getName();
									tbwkm[i][2] = tbw.getLink();
									tbwkm[i][3] = tbw.getNot();
								}
							}
	                     %>
	                    <li>更多</li>
	                    <li ng-class="{lsyhov:!change(filmcount,3)}" ng-click="filmcount = 3"><%=tbwkm[2][1] %></li>
	                    <li ng-class="{lsyhov:!change(filmcount,2)}" ng-click="filmcount = 2"><%=tbwkm[1][1] %></li>
	                    <li ng-class="{lsyhov:!change(filmcount,1)}" ng-click="filmcount = 1"><%=tbwkm[0][1] %></li>
	                </ul>
	            </div>
	            <div class="lmurl">以下链接来自于 <a href="/">{{delurl}}...</a></div>
	            <div class="lmbody2">
	                <ul ng-hide="change(filmcount,1)">
	                <!-- 从数据库中读取电影推荐前四 -->
	                <!-- 1 -->
	                <%
				    	TbMovie movie1 = new TbMovie();
				    	List listmovie1 = hb.findMovieAll1();
				    	if(listmovie1!=null && !listmovie1.isEmpty()){                 	//判断list是否为空
							for(int i=0;i<listmovie1.size()&&i<4;i++){					//循环遍历集合
								movie1 = (TbMovie)listmovie1.get(i);
								%>
								<li>
			                        <img src=<%=movie1.getImg() %>/>
			                        <h1><%=movie1.getNam() %></h1>
			                        <%if(movie1.getLab()!=null){ %>
			                        <span><%=movie1.getLab() %></span>
			                        <%} %>
			                        <p><%=movie1.getGra() %></p>
			                    </li>
								<%
							}
						}
					%>
	                </ul>
	                <ul ng-hide="change(filmcount,2)">
	                <!-- 2 -->
	                <%
				    	TbMovie movie2 = new TbMovie();
				    	List listmovie2 = hb.findMovieAll2();
				    	if(listmovie2!=null && !listmovie2.isEmpty()){                 	//判断list是否为空
							for(int i=0;i<listmovie2.size()&&i<4;i++){					//循环遍历集合
								movie2 = (TbMovie)listmovie2.get(i);
								%>
								<li>
			                        <img src=<%=movie2.getImg() %>/>
			                        <h1><%=movie2.getNam() %></h1>
			                        <%if(movie2.getLab()!=null){ %>
			                        <span><%=movie2.getLab() %></span>
			                        <%} %>
			                        <p><%=movie2.getGra() %></p>
			                    </li>
								<%
							}
						}
					%>
	                </ul>
	                <ul ng-hide="change(filmcount,3)">
	                <!-- 3 -->
	                <%
				    	TbMovie movie3 = new TbMovie();
				    	List listmovie3 = hb.findMovieAll3();
				    	if(listmovie3!=null && !listmovie3.isEmpty()){                 	//判断list是否为空
							for(int i=0;i<listmovie3.size()&&i<4;i++){					//循环遍历集合
								movie3 = (TbMovie)listmovie3.get(i);
								%>
								<li>
			                        <img src=<%=movie3.getImg() %>/>
			                        <h1><%=movie3.getNam() %></h1>
			                        <%if(movie3.getLab()!=null){ %>
			                        <span><%=movie3.getLab() %></span>
			                        <%} %>
			                        <p><%=movie3.getGra() %></p>
			                    </li>
								<%
							}
						}
					%>
	                </ul>
	            </div>
	        </div> 

			<!--ktv-->
	        <div class="lsydel" id="kge">
	            <div class="lmhead">
	                <div class="lmfont">娱乐K歌</div>
	                <ul>
	                <!-- 从数据库中读取ktv网站分类 -->
	                <%
	                    	List listtbwk = hb.findKtvWkind();
	                    	String tbwkk[][] = new String[3][4];
	                    	if(listtbwm!=null && !listtbwm.isEmpty()){                 	//判断list是否为空
								for(int i=0;i<listtbwm.size()&&i<3;i++){					//循环遍历集合
									tbw = (TbWkind)listtbwm.get(i);						//获得遍历网站种类信息
									tbwkk[i][0] = tbw.getKindNo().toString();
									tbwkk[i][1] = tbw.getName();
									tbwkk[i][2] = tbw.getLink();
									tbwkk[i][3] = tbw.getNot();
								}
							}
	                     %>
	                    <li>更多</li>
	                    <li ng-class="{lsyhov:!change(ktvcount,3)}" ng-click="ktvcount = 3"><%=tbwkk[2][1] %></li>
	                    <li ng-class="{lsyhov:!change(ktvcount,2)}" ng-click="ktvcount = 2"><%=tbwkk[1][1] %></li>
	                    <li ng-class="{lsyhov:!change(ktvcount,1)}" ng-click="ktvcount = 1"><%=tbwkk[0][1] %></li>
	                </ul>
	            </div>
	            <div class="lmurl">以下链接来自于 <a href="/">{{delurl}}...</a></div>
	            <div class="lmbody3">
	                <ul ng-hide="change(ktvcount,1)">
	                <!-- 从数据库中读取ktv推荐前四 -->
	                <!-- 1 -->
	                <%
				    	TbKtv ktv1 = new TbKtv();
				    	List listktv1 = hb.findKtvAll1();
				    	if(listktv1!=null && !listktv1.isEmpty()){                 	//判断list是否为空
							for(int i=0;i<listktv1.size()&&i<4;i++){					//循环遍历集合
								ktv1 = (TbKtv)listktv1.get(i);
								%>
								<li>
			                        <img src=<%=ktv1.getImg() %>/>
			                        <h1><%=ktv1.getNam() %></h1>
			                        <p style="color:black;"><%=ktv1.getPla() %></p>
			                        <p><%=ktv1.getDes() %></p>
			                        <div class="lprice">¥<%=ktv1.getPri() %><small>起</small></div>
			                        <div class="lscore"><%=ktv1.getGra() %>分</div>
			                        <div class="lnum"><%=ktv1.getSal() %></div>
			                    </li>
								<%
							}
						}
					%>
	                </ul>
	                <ul ng-hide="change(ktvcount,2)">
	                <!-- 2 -->
	                <%
				    	TbKtv ktv2 = new TbKtv();
				    	List listktv2 = hb.findKtvAll2();
				    	if(listktv2!=null && !listktv2.isEmpty()){                 	//判断list是否为空
							for(int i=0;i<listktv2.size()&&i<4;i++){					//循环遍历集合
								ktv2 = (TbKtv)listktv2.get(i);
								%>
								<li>
			                        <img src=<%=ktv2.getImg() %>/>
			                        <h1><%=ktv2.getNam() %></h1>
			                        <p style="color:black;"><%=ktv2.getPla() %></p>
			                        <p><%=ktv2.getDes() %></p>
			                        <div class="lprice">¥<%=ktv2.getPri() %><small style="text-decoration: line-through"> ¥<%=ktv2.getSpr() %></small></div>
			                        <div class="lscore"><%=ktv2.getGra() %>分</div>
			                        <div class="lnum"><%=ktv2.getSal() %></div>
			                    </li>
								<%
							}
						}
					%>
	                </ul>
	                <ul ng-hide="change(ktvcount,3)">
	                <!-- 3 -->
	                <%
				    	TbKtv ktv3 = new TbKtv();
				    	List listktv3 = hb.findKtvAll3();
				    	if(listktv3!=null && !listktv3.isEmpty()){                 	//判断list是否为空
							for(int i=0;i<listktv3.size()&&i<4;i++){					//循环遍历集合
								ktv3 = (TbKtv)listktv3.get(i);
								%>
								<li>
			                        <img src=<%=ktv3.getImg() %>/>
			                        <h1><%=ktv3.getNam() %></h1>
			                        <p style="color:black;"><%=ktv3.getPla() %></p>
			                        <p><%=ktv3.getDes() %></p>
			                        <div class="lprice">¥<%=ktv3.getPri() %><small style="text-decoration: line-through"> ¥<%=ktv3.getSpr() %></small></div>
			                        <div class="lscore"><%=ktv3.getGra() %>分</div>
			                        <div class="lnum"><%=ktv3.getSal() %></div>
			                    </li>
								<%
							}
						}
					%>
	                </ul>
	            </div>
	        </div>

			<!--hotel-->
	        <div class="lsydel" id="zhusu">
	            <div class="lmhead">
	                <div class="lmfont">旅店住宿</div>
	                <ul>
	                <!-- 从数据库中读取hotel网站分类 -->
	                <%
	                    	List listtbwh = hb.findHotelWkind();
	                    	String tbwkh[][] = new String[3][4];
	                    	if(listtbwh!=null && !listtbwh.isEmpty()){                 	//判断list是否为空
								for(int i=0;i<listtbwh.size()&&i<3;i++){					//循环遍历集合
									tbw = (TbWkind)listtbwh.get(i);						//获得遍历网站种类信息
									tbwkh[i][0] = tbw.getKindNo().toString();
									tbwkh[i][1] = tbw.getName();
									tbwkh[i][2] = tbw.getLink();
									tbwkh[i][3] = tbw.getNot();
								}
							}
	                     %>
	                    <li>更多</li>
	                    <li ng-class="{lsyhov:!change(hotelcount,3)}" ng-click="hotelcount = 3"><%=tbwkh[2][1] %></li>
	                    <li ng-class="{lsyhov:!change(hotelcount,2)}" ng-click="hotelcount = 2"><%=tbwkh[1][1] %></li>
	                    <li ng-class="{lsyhov:!change(hotelcount,1)}" ng-click="hotelcount = 1"><%=tbwkh[0][1] %></li>
	                </ul>
	            </div>
	            <div class="lmurl">以下链接来自于 <a href="/">{{delurl}}...</a></div>
	            <div class="lmbody4">
	                <ul ng-hide="change(hotelcount,1)">
	                <!-- 从数据库中读取hotel推荐前四 -->
	                <!-- 1 -->
	                <%
				    	TbHotel hotel1 = new TbHotel();
				    	List listhotel1 = hb.findHotelAll1();
				    	if(listhotel1!=null && !listhotel1.isEmpty()){                 	//判断list是否为空
							for(int i=0;i<listhotel1.size()&&i<4;i++){					//循环遍历集合
								hotel1 = (TbHotel)listhotel1.get(i);
								%>
								<li>
			                        <img src=<%=hotel1.getImg() %>/>
			                        <h1><%=hotel1.getNam() %></h1>
			                        <p style="color:black;"><%=hotel1.getDes() %></p>
			                        <div class="lprice">¥<%=hotel1.getPri() %><small>起</small></div>
			                        <div class="lscore"><%=hotel1.getGra() %>/5分</div>
			                        <div class="lnum"></div>
			                    </li>
								<%
							}
						}
					%>
	                </ul>
	                <ul ng-hide="change(hotelcount,2)">
	                <!-- 2 -->
	                <%
				    	TbHotel hotel2 = new TbHotel();
				    	List listhotel2 = hb.findHotelAll2();
				    	if(listhotel2!=null && !listhotel2.isEmpty()){                 	//判断list是否为空
							for(int i=0;i<listhotel2.size()&&i<4;i++){					//循环遍历集合
								hotel2 = (TbHotel)listhotel2.get(i);
								%>
								<li>
			                        <img src=<%=hotel2.getImg() %>/>
			                        <h1><%=hotel2.getNam() %></h1>
			                        <p style="color:black;"><%=hotel2.getDes() %></p>
			                        <div class="lprice">¥<%=hotel2.getPri() %><small style="text-decoration:line-through;"><%=hotel2.getSpr() %></small></div>
			                        <div class="lscore"><%=hotel2.getSal() %></div>
			                        <div class="lnum">已售2350</div>
			                    </li>
								<%
							}
						}
					%>
	                </ul>
	                <ul ng-hide="change(hotelcount,3)">
	                <!-- 3 -->
	                <%
				    	TbHotel hotel3 = new TbHotel();
				    	List listhotel3 = hb.findHotelAll3();
				    	if(listhotel3!=null && !listhotel3.isEmpty()){                 	//判断list是否为空
							for(int i=0;i<listhotel3.size()&&i<4;i++){					//循环遍历集合
								hotel3 = (TbHotel)listhotel3.get(i);
								%>
								<li>
			                        <img src=<%=hotel3.getImg() %>/>
			                        <h1><%=hotel3.getNam() %></h1>
			                        <p style="color:black;"><%=hotel3.getDes() %></p>
			                        <div class="lprice">¥<%=hotel3.getPri() %><small style="text-decoration:line-through;"><%=hotel3.getSpr() %></small></div>
			                        <div class="lscore"><%=hotel3.getSal() %></div>
			                        <div class="lnum">已售2350</div>
			                    </li>
								<%
							}
						}
					%>
	                </ul>
	            </div>
	        </div>

			<!--waimai-->
	        <div class="lsydel" id="waimai">
	            <div class="lmhead">
	                <div class="lmfont">便利外卖</div>
	                <ul>
	                <!-- 从数据库中读取take网站分类 -->
	                <%
	                    	List listtbwt = hb.findTakeWkind();
	                    	String tbwkt[][] = new String[3][4];
	                    	if(listtbwt!=null && !listtbwt.isEmpty()){                 	//判断list是否为空
								for(int i=0;i<listtbwt.size()&&i<3;i++){					//循环遍历集合
									tbw = (TbWkind)listtbwt.get(i);						//获得遍历网站种类信息
									tbwkt[i][0] = tbw.getKindNo().toString();
									tbwkt[i][1] = tbw.getName();
									tbwkt[i][2] = tbw.getLink();
									tbwkt[i][3] = tbw.getNot();
								}
							}
	                     %>
	                    <li>更多</li>
	                    <li ng-class="{lsyhov:!change(salecount,3)}" ng-click="salecount = 3"><%=tbwkt[2][1] %></li>
	                    <li ng-class="{lsyhov:!change(salecount,2)}" ng-click="salecount = 2"><%=tbwkt[1][1] %></li>
	                    <li ng-class="{lsyhov:!change(salecount,1)}" ng-click="salecount = 1"><%=tbwkt[0][1] %></li>
	                </ul>
	            </div>
	            <div class="lmurl">以下链接来自于 <a href="/">{{delurl}}...</a></div>
	            <div class="lmbody5">
	                <ul ng-hide="change(salecount,1)">
	                <!-- 从数据库中读取hotel推荐前四 -->
	                <!-- 1 -->
	                <%
				    	TbTake take1 = new TbTake();
				    	List listtake1 = hb.findTakeAll1();
				    	if(listtake1!=null && !listtake1.isEmpty()){                 	//判断list是否为空
							for(int i=0;i<listtake1.size()&&i<4;i++){					//循环遍历集合
								take1 = (TbTake)listtake1.get(i);
								%>
								<li>
			                        <img src=<%=take1.getImg() %>/>
			                        <h1><%=take1.getNam() %></h1>
			                        <p class="lscore"><%=take1.getGra() %>分</p><p class="lsale"><%=take1.getSal() %></p>
			                        <div class="lprice">
			                        <div><%=take1.getSpr() %></div> <div><%=take1.getDfe() %></div> <div class="ltime"><%=take1.getDti() %></div>
			                        </div>
			                        <div class="lspan"><%=take1.getLab() %></div>
			                    </li>
								<%
							}
						}
					%>
	                </ul>
	                <ul ng-hide="change(salecount,2)">
	                <!-- 2 -->
	                <%
				    	TbTake take2 = new TbTake();
				    	List listtake2 = hb.findTakeAll2();
				    	if(listtake2!=null && !listtake2.isEmpty()){                 	//判断list是否为空
							for(int i=0;i<listtake2.size()&&i<4;i++){					//循环遍历集合
								take2 = (TbTake)listtake2.get(i);
								%>
								<li>
			                        <img src=<%=take2.getImg() %>/>
			                        <h1><%=take2.getNam() %></h1>
			                        <p class="lscore"><%=take2.getGra() %>分</p><p class="lsale"><%=take2.getSal() %></p>
			                        <div class="lprice">
			                        <div><%=take2.getSpr() %></div> <div><%=take2.getDfe() %></div> <div class="ltime"><%=take2.getDti() %></div>
			                        </div>
			                        <div class="lspan"><%=take2.getLab() %></div>
			                    </li>
								<%
							}
						}
					%>
	                </ul>
	                <ul ng-hide="change(salecount,3)">
	                <!-- 3 -->
	                <%
				    	TbTake take3 = new TbTake();
				    	List listtake3 = hb.findTakeAll3();
				    	if(listtake3!=null && !listtake3.isEmpty()){                 	//判断list是否为空
							for(int i=0;i<listtake3.size()&&i<4;i++){					//循环遍历集合
								take3 = (TbTake)listtake3.get(i);
								%>
								<li>
			                        <img src=<%=take3.getImg() %>/>
			                        <h1><%=take3.getNam() %></h1>
			                        <p class="lscore"><%=take3.getGra() %>分</p><p class="lsale"><%=take3.getSal() %></p>
			                        <div class="lprice">
			                        <div><%=take3.getSpr() %></div> <div><%=take3.getDfe() %></div> <div class="ltime"><%=take3.getDti() %></div>
			                        </div>
			                        <div class="lspan"><%=take3.getLab() %></div>
			                    </li>
								<%
							}
						}
					%>
	                </ul>
	            </div>
	        </div>
    	</div>
    
	    <div id="footer">
	
	    </div>
	</div>
	
	<script type="text/javascript">
	    document.onscroll =function(){
	        var navi=document.getElementById('nav');
	        var navs=document.getElementsByName('lsynav-s');
	        if(document.body.scrollTop>150){
	            navi.className ='lsynav2 lsynav';
	        }else{
	            navi.className ='lsynav';
	        }
	    }
	    var app = angular.module('lsyApp',['ngAnimate']);
	    app.controller('lmodel',function($scope){
	        $scope.delcount = 1;
	        $scope.filmcount = 1;
	        $scope.ktvcount = 1;
	        $scope.hotelcount = 1;
	        $scope.salecount = 1;
	        $scope.delurl = 'www.meituan.com';
	        $scope.change = function(value,judge){
	            if(value==1){ $scope.delurl = 'www.meituan.com';}
	            if(value==2){ $scope.delurl = 'https://www.dianping.com/';}
	            if(value==3){ $scope.delurl = '百度糯米';}
	            if(value==judge)return false;
	            else{return true;}
	        };
	    });
	    app.controller('ltop',function($scope){
	        $scope.wx=true;
	    })
	    app.controller('lpic',function($scope, $interval){
	        $scope.number = 1;
	        $scope.ptype = 1;
	        $scope.change = function(value,judge){
	//            if(value==0){value=3;
	//                $scope.number = 3;}
	//            if(value==4){value=1;
	//                $scope.number = 1;}
	            if(value==judge)return false;
	            else{return true;}
	        };
	        $scope.judgement=function(count,value){
	            if(count==value)
	            {
	                return true;
	            }else return false;
	        };
	        $interval(function () {
	            $scope.number ;
	        }, 5000);
	    });
	    app.controller('lnav',function($scope){
	        $scope.count =2;
	        $scope.types=[{text:"美食",id:"meishi"},{text:"K歌",id:"kge"},{text:"电影",id:"dianying"},
	            {text:"住宿",id:"zhusu"},{text:"外卖",id:"waimai"}];
	
	        $scope.msglist=true;
	        $scope.msgtoggle=function(){
	            $scope.msglist=!$scope.msglist;
	        }
	        $scope.choose=function(count,value){
	            if(count==value)
	            {
	               return true;
	            }else return false;
	        }
	
	        $scope.goto=function(count,$animate){
	         //  alert( document.body.scrollTop);
	            var body= document.body;
	         //   var top=  angular.element(body).animate({ scrollTop: 550 }, 100);
	//            $animate.enter(document.body).then(function() {
	//                $scope.scrollTop = 550;
	//            });
	           // alert(top);
	            var top = 550+(count-1)*430;
	            body.scrollTop=550+(count-1)*430;
	        }
	    });
	</script>
  </body>
</html>
