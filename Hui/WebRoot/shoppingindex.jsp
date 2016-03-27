<%@page import="com.model.TbTaobao"%>
<%@page import="com.model.TbAmazon"%>
<%@page import="com.model.TbJumeiyoupin"%>
<%@page import="com.model.TbYihaodian"%>
<%@page import="com.model.TbWkind"%>
<%@page import="com.hibernate.util.HibernateUtil"%>
<%@page import="com.model.TbMogujie"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head lang="en">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="js/angular.min.js"></script>
    <script src="js/angular-animate.min.js"></script>
    <script src="js/ng.js"></script>
    <link rel="stylesheet" href="css/css.css" type="text/css"/>
    <title>汇购物</title>
</head>
<body bgcolor="#FFFFFF" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
<div ng-app="lsyApp" class="lsyapp">
<!--top-->
<div class="lsytop" ng-controller="ltop">
    <div class="lsylogin">请登录or 注册</div>
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
<div id="nav" class="lsynav" ng-controller="lnav" ng-mouseleave="count=1">
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
            <li ng-click="goto(1)">淘宝</li>
            <li ng-click="goto(2)">聚美优品</li>
            <li ng-click="goto(3)">一号店</li>
            <li ng-click="goto(4)">蘑菇街</li>
            <li ng-click="goto(5)">亚马逊</li>
        </ul>
        <ul ng-hide="!choose(count,2)">
            <li ng-click="goto(0)">>美食</li>
            <li ng-click="goto(0)">>电影</li>
            <li ng-click="goto(0)">>ktv</li>
            <li ng-click="goto(0)">>旅店</li>
            <li ng-click="goto(0)">>外卖</li>
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
<div class="lsybody">
<!--pic-->
<div class="lsypics lsypgw" ng-controller="lpic">
    <div class="lsypt">
        <ul>
            <li><p class="listtitle">今日推荐</p></li>
            <li><span>1</span><a href="/">曼言</a></li>
            <li><span>2</span><a href="/">曼言</a></li>
            <li><span>3</span><a href="/">曼言</a></li>
            <li><span>4</span><a href="/">曼言</a></li>
            <li><span>5</span><a href="/">曼言</a></li>
            <li><span style="color:gray;">6</span><a href="/">曼言</a></li>
            <li><span style="color:gray;">7</span><a href="/">曼言</a></li>
            <li><span style="color:gray;">8</span><a href="/">曼言</a></li>
            <li><span style="color:gray;">9</span><a href="/">曼言</a></li>
            <li><span style="margin-left: -100px;color:gray;">10</span><a href="/">曼言</a></li>
        </ul>
    </div>
    <div class="lsypi" ng-hide="!judgement(ptype,1)">
        <div class="lsyp"  ng-class="{lsyphd:change(number,1)}"> <div class="lsybq">淘宝</div><img src="image/hgw/bgtb603201.jpg"/></div>
        <div class="lsyp"  ng-class="{lsyphd:change(number,2)}"> <div class="lsybq">聚美优品</div><img src="image/hgw/bgjm603201.jpg"/></div>
        <div class="lsyp"  ng-class="{lsyphd:change(number,3)}"> <div class="lsybq">一号店</div><img src="image/hgw/bg1hd603201.jpg"/></div>
        <div class="lsyp"  ng-class="{lsyphd:change(number,4)}"> <div class="lsybq">蘑菇街</div><img src="image/hgw/bgmgj603201.jpg"/></div>
        <div class="lsyp"  ng-class="{lsyphd:change(number,5)}"> <div class="lsybq">亚马逊</div><img src="image/hgw/bgymx603201.jpg"/></div>
        <div class="lsyp-s">
            <div class="lsyp-sp" ng-class="{lsypsphd:!change(number,1)}" ng-mouseover="number=1"><img src="image/hgw/bgtb603201.jpg"/></div>
            <div class="lsyp-sp" ng-class="{lsypsphd:!change(number,2)}" ng-mouseover="number=2"><img src="image/hgw/bgjm603201.jpg"/></div>
            <div class="lsyp-sp" ng-class="{lsypsphd:!change(number,3)}" ng-mouseover="number=3"><img src="image/hgw/bg1hd603201.jpg"/></div>
            <div class="lsyp-sp" ng-class="{lsypsphd:!change(number,4)}" ng-mouseover="number=4"><img src="image/hgw/bgmgj603201.jpg"/></div>
            <div class="lsyp-sp" ng-class="{lsypsphd:!change(number,5)}" ng-mouseover="number=5"><img src="image/hgw/bgymx603201.jpg"/></div>
        </div>
    </div>
</div>
<!--model-->
<div class="lsymodel" ng-controller="lmodel1" id="hgw">
<!--taobao-->
<div class="lsydel" id="taobao">
    <div class="lmhead">
        <div class="lmfont">淘宝</div>
        
        		<!-- 从数据库中读取taobao分类 -->
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
        <ul>
            <li ng-class="{lsyhov:!change(tbcount,1)}" ng-click="tbcount = 1"><%=tbwk[0][1] %></li>
            <li ng-class="{lsyhov:!change(tbcount,2)}" ng-click="tbcount = 2"><%=tbwk[1][1] %></li>
            <li ng-class="{lsyhov:!change(tbcount,3)}" ng-click="tbcount = 3"><%=tbwk[2][1] %></li>
        </ul>
        <div class="lmmore">更多。。。</div>
    </div>
    <!--<div class="lmurl">以下链接来自于 <a href="/">{{delurl}}...</a></div>-->
	                    
    
    <div class="lmbody">
        <ul ng-hide="change(tbcount,1)">
 
            <!-- 从数据库中读取天天特价前四 -->
	                <!-- 1 -->
	         <%
				  TbTaobao tb1 = new TbTaobao();
				  List listtb1 = hb.findTaobaoAll1();
				  if(listtb1!=null && !listtb1.isEmpty()){                 	//判断list是否为空
					  for(int i=0;i<listtb1.size()&&i<4;i++){					//循环遍历集合
							tb1 = (TbTaobao)listtb1.get(i);
			%>
				<li>
			         <img src=<%=tb1.getImg() %>/>
			         <h1 title="<%=tb1.getTit() %>"><%=tb1.getTit() %></h1>
			         <div class="lprice">¥<%=tb1.getNpri1() %>.<span><%=tb1.getNpri2() %></span><small>¥<%=tb1.getOpri() %></small></div>
			      	<div class="lnum">已售<%=tb1.getSal() %>件</div>	
				 </li>	
				<%		}
					}
				%>
        </ul>
        <ul ng-hide="change(tbcount,2)">
         
             <!-- 从数据库中读取清仓前四 -->
	                <!-- 1 -->
	         <%
				  TbTaobao tb2 = new TbTaobao();
				  List listtb2 = hb.findTaobaoAll2();
				  if(listtb2!=null && !listtb2.isEmpty()){                 	//判断list是否为空
					  for(int i=0;i<listtb2.size()&&i<4;i++){					//循环遍历集合
							tb2 = (TbTaobao)listtb2.get(i);
			%>
				<li>
			         <img src=<%=tb2.getImg() %>/>
			         <h1 title="<%=tb2.getTit() %>"><%=tb2.getTit() %></h1>
			         <div class="lprice">¥<%=tb2.getNpri1() %>.<span><%=tb1.getNpri2() %></span><small>¥<%=tb1.getOpri() %></small></div>
			      	<div class="lnum">已抢<%=tb1.getSal() %>件</div>	
				 </li>	
				<%		}
					}
				%>
        </ul>
        <ul ng-hide="change(tbcount,3)">
          <!-- 从数据库中读取抢新前四 -->
	                <!-- 1 -->
	         <%
				  TbTaobao tb3 = new TbTaobao();
				  List listtb3 = hb.findTaobaoAll3();
				  if(listtb3!=null && !listtb3.isEmpty()){                 	//判断list是否为空
					  for(int i=0;i<listtb3.size()&&i<4;i++){					//循环遍历集合
							tb3 = (TbTaobao)listtb3.get(i);
			%>
				<li>
			         <img src=<%=tb3.getImg() %>/>
			         <h1 title="<%=tb3.getTit() %>"><%=tb3.getTit() %></h1>
			         <div class="lprice"><small style="text-decoration:none;">抢新价</small><span>&nbsp;¥<%=tb3.getNpri1() %></span></div>
			      	<div class="lnotice"><%=tb3.getSal() %></div>
				 </li>	
				<%		}
					}
				%>
        </ul>
    </div>
    <!--<div class="lmfoot">加载更多</div>-->
</div>
<!--jumei-->
<div class="lsydel" id="jumei">
    <div class="lmhead">
        <div class="lmfont">聚美优品</div>
        <!-- 从数据库中读取jumeiyoupin分类 -->
            <%
	                    	List listjmwm = hb.findJumeikind();
	                    	String jmwk[][] = new String[3][4];
	                    	if(listjmwm!=null && !listjmwm.isEmpty()){                 	//判断list是否为空
								for(int i=0;i<listjmwm.size()&&i<2;i++){					//循环遍历集合
									tbw = (TbWkind)listjmwm.get(i);						//获得遍历网站种类信息
									jmwk[i][0] = tbw.getKindNo().toString();
									jmwk[i][1] = tbw.getName();
									jmwk[i][2] = tbw.getLink();
									jmwk[i][3] = tbw.getNot();
								}
							}
	                     %>
        <ul>
            <li ng-class="{lsyhov:!change(jmcount,1)}" ng-click="jmcount = 1"><%=jmwk[0][1] %></li>
            <li ng-class="{lsyhov:!change(jmcount,2)}" ng-click="jmcount = 2"><%=jmwk[1][1] %></li>
        </ul>
        <div class="lmmore">更多。。。</div>
    </div>
    <div class="lmbody">
        <ul ng-hide="change(jmcount,1)">
                   <!-- 从数据库中读取限时特卖前四 -->
	                <!-- 1 -->
	         <%
				  TbJumeiyoupin jm1 = new TbJumeiyoupin();
				  List listjm1 = hb.findJumeiAll1();
				  if(listjm1!=null && !listjm1.isEmpty()){                 	//判断list是否为空
					  for(int i=0;i<listjm1.size()&&i<4;i++){					//循环遍历集合
							jm1 = (TbJumeiyoupin)listjm1.get(i);		
			%>
				<li>
			         <img src=<%=jm1.getImg() %>/>
				 </li>	
				<%		}
					}
				%>
        </ul>
 
        <ul ng-hide="change(jmcount,2)">
                <!-- 从数据库中读取极速免税前四 -->
	                <!-- 1 -->
            <%
				  TbJumeiyoupin jm2 = new TbJumeiyoupin();
				  List listjm2 = hb.findJumeiAll2();
				  if(listjm2!=null && !listjm2.isEmpty()){                 	//判断list是否为空
					  for(int i=0;i<listjm2.size()&&i<4;i++){					//循环遍历集合
							jm2 = (TbJumeiyoupin)listjm2.get(i);		
			%>
				<li>
			         <img src=<%=jm2.getImg()%>/>
				 </li>	
				 
				 
				<%		}
					}
				%>
        </ul>
    </div>
</div>
<!--1号店-->
<div class="lsydel" id="yihaodian">
    <div class="lmhead">
        <div class="lmfont"></div>
        <!-- 从数据库中读取yihaodian分类 -->
            <%
	                    	List listyhwm = hb.findYhaodianWkind();
	                    	String yhwk[][] = new String[3][4];
	                    	if(listyhwm!=null && !listyhwm.isEmpty()){                 	//判断list是否为空
								for(int i=0;i<listyhwm.size()&&i<2;i++){					//循环遍历集合
									tbw = (TbWkind)listyhwm.get(i);						//获得遍历网站种类信息
									yhwk[i][0] = tbw.getKindNo().toString();
									yhwk[i][1] = tbw.getName();
									yhwk[i][2] = tbw.getLink();
									yhwk[i][3] = tbw.getNot();
								}
							}
	                     %>
        
        <ul>
            <li ng-class="{lsyhov:!change(ydhcount,1)}" ng-click="ydhcount = 1"><%=yhwk[0][1] %></li>
            <li ng-class="{lsyhov:!change(ydhcount,2)}" ng-click="ydhcount = 2"><%=yhwk[1][1] %></li>
        </ul>
        <div class="lmmore">更多。。。</div>
        <div class="change" ng-click="ydhdisplay=!ydhdisplay">换一些</div>
    </div>
    <!--<div class="lmurl">以下链接来自于 <a href="/">{{delurl}}...</a></div>-->
    <div class="lmbody">
        <ul ng-hide="change(ydhcount,1)">
        
                <!-- 从数据库中读取海购新品前四 -->
	                <!-- 1 -->
            <%
				  TbYihaodian yh1 = new TbYihaodian();
				  List listyh1 = hb.findYihaodianAll1();
				  if(listyh1!=null && !listyh1.isEmpty()){                 	//判断list是否为空
					  for(int i=0;i<listyh1.size()&&i<2;i++){					//循环遍历集合
							yh1 = (TbYihaodian)listyh1.get(i);		
			%>
			 <li ng-class="{list2:!ydhdisplay}">
			<img src=<%=yh1.getImg()%> />	 
			<h1 title=<%=yh1.getTit() %>><%=yh1.getTit()%></h1>
			<p><%=yh1.getDis() %></p>
			<div class="lprice">¥<%=yh1.getPri() %><small>参考价¥<%=yh1.getPpri() %></small></div>
			<div class="lnum"><%=yh1.getSal() %>件已售</div>
			  </li>
				<%		}
				
				%>
			<%	
							  for(int i=2;i<listyh1.size()&&i<4;i++){					//循环遍历集合
							yh1 = (TbYihaodian)listyh1.get(i);		
			%>
			 <li ng-class="{list2:ydhdisplay}">
			<img src=<%=yh1.getImg()%> />	 
			<h1 title=<%=yh1.getTit() %>><%=yh1.getTit()%></h1>
			<p><%=yh1.getDis() %></p>
			<div class="lprice">¥<%=yh1.getPri() %><small>参考价¥<%=yh1.getPpri() %></small></div>
			<div class="lnum"><%=yh1.getSal() %>件已售</div>
			  </li>
				<%		}
					}
				%>
  
  
        </ul>
        <ul ng-hide="change(ydhcount,2)">
                 <!-- 从数据库中读取团购前四 -->
	                <!-- 1 -->
            <%
				  TbYihaodian yh2 = new TbYihaodian();
				  List listyh2 = hb.findYihaodianAll2();
				  if(listyh2!=null && !listyh2.isEmpty()){                 	//判断list是否为空
					  for(int i=0;i<listyh2.size()&&i<2;i++){					//循环遍历集合
							yh2 = (TbYihaodian)listyh2.get(i);		
			%>
			 <li ng-class="{list2:!ydhdisplay}">
			<img src=<%=yh2.getImg()%> />	 
			<h1 title=<%=yh2.getTit() %>><%=yh2.getTit()%></h1>
			<p><%=yh2.getDis() %></p>
			<div class="lprice">¥<%=yh2.getPri() %><small>参考价¥<%=yh2.getPpri() %></small></div>
			<div class="lnum"><%=yh2.getSal() %>件已售</div>
			  </li>
				<%		}
				
				%>
			<%	
							  for(int i=2;i<listyh2.size()&&i<4;i++){					//循环遍历集合
							yh2 = (TbYihaodian)listyh2.get(i);		
			%>
			 <li ng-class="{list2:ydhdisplay}">
			<img src=<%=yh2.getImg()%> />	 
			<h1 title=<%=yh2.getTit() %>><%=yh2.getTit()%></h1>
			<p><%=yh2.getDis() %></p>
			<div class="lprice">¥<%=yh2.getPri() %><small>参考价¥<%=yh2.getPpri() %></small></div>
			<div class="lnum"><%=yh2.getSal() %>件已售</div>
			  </li>
				<%		}
					}
				%>
  
  
        </ul>
    </div>
</div>
<!--mogujie-->
<div class="lsydel" id="mogujie">
    <div class="lmhead">
        <div class="lmfont">蘑菇街</div>
         <!-- 从数据库中读取mogujie分类 -->
            <%
	                    	List listmgwm = hb.findMogujieWkind();
	                    	String mgwk[][] = new String[3][4];
	                    	if(listmgwm!=null && !listmgwm.isEmpty()){                 	//判断list是否为空
								for(int i=0;i<listmgwm.size()&&i<2;i++){				//循环遍历集合
									tbw = (TbWkind)listmgwm.get(i);						//获得遍历网站种类信息
									mgwk[i][0] = tbw.getKindNo().toString();
									mgwk[i][1] = tbw.getName();
									mgwk[i][2] = tbw.getLink();
									mgwk[i][3] = tbw.getNot();
								}
							}
	                     %>
        
        
        <ul>
            <li ng-class="{lsyhov:!change(mgjcount,1)}" ng-click="mgjcount = 1"><%=mgwk[0][1] %></li>
            <li ng-class="{lsyhov:!change(mgjcount,2)}" ng-click="mgjcount = 2"><%=mgwk[1][1] %></li>
        </ul>
        <div class="logo"></div>
        <div class="lmmore">更多。。。</div>
        <div class="change" ng-click="mgjdisplay=!mgjdisplay">换一些</div>
    </div>
    <!--<div class="lmurl">以下链接来自于 <a href="/">{{delurl}}...</a></div>-->
    <div class="lmbody">
        <ul ng-hide="change(mgjcount,1)">
                         <!-- 从数据库中读取团购前四 -->
	                <!-- 1 -->
            <%
				  TbMogujie mg1 = new TbMogujie();
				  List listmg1 = hb.findMogujieAll1();
				  if(listmg1!=null && !listmg1.isEmpty()){                 	//判断list是否为空
					  for(int i=0;i<listmg1.size()&&i<2;i++){					//循环遍历集合
							mg1 = (TbMogujie)listmg1.get(i);		
			%>
			 <li ng-class="{list2:!mgjdisplay}">
			<img src=<%=mg1.getImg()%> />	 
			<h1 title=<%=mg1.getTit() %>><%=mg1.getTit()%></h1>
			   <div class="lprice"><span>快抢价</span>¥<%=mg1.getPri() %><small>¥<%=mg1.getOpri() %></small></div>
			   <div class="lbuy">立即抢购</div>
			<div class="lnum"><%=mg1.getSur() %>件已售</div>
			  </li>
				<%		}
				
				%>
			<%	
							  for(int i=2;i<listmg1.size()&&i<4;i++){					//循环遍历集合
								mg1 = (TbMogujie)listmg1.get(i);		
			%>
			 <li ng-class="{list2:mgjdisplay}">
			<img src=<%=mg1.getImg()%> />	 
			<h1 title=<%=mg1.getTit() %>><%=mg1.getTit()%></h1>
			   <div class="lprice"><span>快抢价</span>¥<%=mg1.getPri() %><small>¥<%=mg1.getOpri() %></small></div>
			   <div class="lbuy">立即抢购</div>
			<div class="lnum"><%=mg1.getSur() %>件已售</div>
			  </li>
				<%		}
					}
				%>

        </ul>
        <ul ng-hide="change(mgjcount,2)">
        
           <!-- 从数据库中读取快抢前四 -->
	                <!-- 1 -->
            <%
				  TbMogujie mg2 = new TbMogujie();
				  List listmg2 = hb.findMogujieAll2();
				  if(listmg2!=null && !listmg2.isEmpty()){                 	//判断list是否为空
					  for(int i=0;i<listmg2.size()&&i<2;i++){					//循环遍历集合
							mg2 = (TbMogujie)listmg2.get(i);		
			%>
			 <li ng-class="{list2:!mgjdisplay}">
			<img class="img2" src=<%=mg2.getImg()%>/> 
			<h1 class="h2" title=<%=mg2.getTit() %>><%=mg2.getTit() %></h1>
		  <div class="lprice"><span>团购价</span>¥<%=mg2.getPri() %></div>
			   <div class="lbuy">立省¥<%=mg2.getSav() %></div>
			<div class="lnum"><%=mg1.getPar() %>人参与</div>
			  </li>
				<%		}
				
				%>
			<%	
					 for(int i=2;i<listmg1.size()&&i<4;i++){					//循环遍历集合
								mg1 = (TbMogujie)listmg1.get(i);		
			%>
			 <li ng-class="{list2:mgjdisplay}">
			 <img class="img2" src=<%=mg2.getImg()%>/>
			<h1 class="h2" title=<%=mg2.getTit() %>><%=mg2.getTit() %></h1>
		  <div class="lprice"><span>团购价</span>¥<%=mg2.getPri() %></div>
			   <div class="lbuy">立省¥<%=mg2.getSav() %></div>
			<div class="lnum"><%=mg1.getPar() %>人参与</div>
			  </li>
			  <%
			  				}
			  }
			   %>

        </ul>
    </div>
</div>
<!--亚马逊-->
<div class="lsydel" id="yamaxun">
    <div class="lmhead">
        <div class="lmfont">亚马逊</div>
        <!-- 从数据库中读取yamaxun分类 -->
           <%
	                    	List listymwm = hb.findYamaxunWkind();
	                    	String ymwk[][] = new String[3][4];
	                    	if(listymwm!=null && !listymwm.isEmpty()){                 	//判断list是否为空
								for(int i=0;i<listymwm.size()&&i<2;i++){				//循环遍历集合
									tbw = (TbWkind)listymwm.get(i);						//获得遍历网站种类信息
									ymwk[i][0] = tbw.getKindNo().toString();
									ymwk[i][1] = tbw.getName();
									ymwk[i][2] = tbw.getLink();
									ymwk[i][3] = tbw.getNot();
								
								}
							}
	                     %>
	            
        <ul>
            <li ng-class="{lsyhov:!change(ymxcount,1)}" ng-click="ymxcount = 1"><%=ymwk[0][1] %></li>
            <li ng-class="{lsyhov:!change(ymxcount,2)}" ng-click="ymxcount = 2"><%=ymwk[1][1] %></li>
        </ul>
        <div class="lmmore">更多。。。</div>
    </div>
    <!--<div class="lmurl">以下链接来自于 <a href="/">{{delurl}}...</a></div>-->
    <div class="lmbody">
        <ul ng-hide="change(ymxcount,1)">
        
        <!-- 从数据库中读取Z秒杀前四 -->
         <%
				  TbAmazon ym1 = new TbAmazon();
				  List listym1 = hb.findYamaxunAll1();
				  if(listym1!=null && !listym1.isEmpty()){                 	//判断list是否为空
					  for(int i=0;i<listym1.size()&&i<4;i++){					//循环遍历集合
							ym1 = (TbAmazon)listym1.get(i);		
			%>
				<li>
			         <img src=<%=ym1.getImg() %>/>
			         <h1 title=<%=ym1.getTit() %>><%=ym1.getTit() %></h1>
			          <div class="lprice">¥<%=ym1.getPri1() %><span>.<%=ym1.getPri2() %></span></div>
			           <div class="lnum"><%=ym1.getSal() %></div>
				 </li>	
				<%		}
					}
				%>
        </ul>
        <ul ng-hide="change(ymxcount,2)">
        
            <!-- 从数据库中读取海外购前四 -->
              <%
				  TbAmazon ym2 = new TbAmazon();
				  List listym2 = hb.findYamaxunAll2();
				  if(listym2!=null && !listym2.isEmpty()){                 	//判断list是否为空
					  for(int i=0;i<listym2.size()&&i<4;i++){					//循环遍历集合
							ym2 = (TbAmazon)listym2.get(i);		
			%>
				<li>
			         <img src=<%=ym2.getImg() %>/>
			         <h1 title=<%=ym2.getTit() %>><%=ym2.getTit() %></h1>
			          <div class="lprice">¥<%=ym2.getPri1() %><span>.<%=ym2.getPri2() %></span></div>
			           <div class="lnum"><%=ym2.getSal() %></div>
				 </li>	
				<%		}
					}
				%>
        </ul>
    </div>
</div>
</div>
</div>
<div id="footer">

</div>
</div>
<script type="text/javascript">
//    document.onscroll =function(){
//        var navi=document.getElementById('nav');
//        var navs=document.getElementsByName('lsynav-s');
//        if(document.body.scrollTop>150){
//            navi.className ='lsynav2 lsynav';
//        }else{
//            navi.className ='lsynav';
//        }
//    }
//    var app = angular.module('lsyApp',['ngAnimate']);
//    app.controller('lmodel1',function($scope){
//        $scope.tbcount = 1;
//        $scope.jmcount = 1;
//        $scope.ydhcount = 1;
//        $scope.ydhdisplay = true;
//        $scope.mgjcount = 1;
//        $scope.mgjdisplay = true;
//        $scope.ymxcount = 1;
//        $scope.delurl = 'www.meituan.com';
//        $scope.change = function(value,judge){
//            if(value==1){ $scope.delurl = 'www.meituan.com';}
//            if(value==2){ $scope.delurl = 'https://www.dianping.com/';}
//            if(value==3){ $scope.delurl = '百度糯米';}
//            if(value==judge)return false;
//            else{return true;}
//        };
//    });
//    app.controller('ltop',function($scope){
//        $scope.wx=true;
//    })
//    app.controller('lpic',function($scope, $interval){
//        $scope.number = 1;
//        $scope.ptype = 1;
//        $scope.change = function(value,judge){
////            if(value==0){value=3;
////                $scope.number = 3;}
////            if(value==4){value=1;
////                $scope.number = 1;}
//            if(value==judge)return false;
//            else{return true;}
//        };
//        $scope.judgement=function(count,value){
//            if(count==value)
//            {
//                return true;
//            }else return false;
//        };
//        $interval(function () {
//            $scope.number ;
//        }, 5000);
//    });
//    app.controller('lnav',function($scope){
//        $scope.count =1;
////        $scope.types=[{text:"美食",id:"meishi"},{text:"K歌",id:"kge"},{text:"电影",id:"dianying"},
////            {text:"住宿",id:"zhusu"},{text:"外卖",id:"waimai"}];
//
//        $scope.msglist=true;
//        $scope.msgtoggle=function(){
//            $scope.msglist=!$scope.msglist;
//        }
//        $scope.choose=function(count,value){
//            if(count==value)
//            {
//                return true;
//            }else return false;
//        }
//
//        $scope.goto=function(count,$animate){
//            //  alert( document.body.scrollTop);
//            var body= document.body;
//            //   var top=  angular.element(body).animate({ scrollTop: 550 }, 100);
////            $animate.enter(document.body).then(function() {
////                $scope.scrollTop = 550;
////            });
//            // alert(top);
//            var top = 550+(count-1)*430;
//            body.scrollTop=550+(count-1)*430;
//        }
//    });
</script>
</body>
</html>
