<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
	<link href="./resources/css/ss90.css" rel="stylesheet" type="text/css">
	<meta charset="utf-8">
  	<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>SS90 ShoppingMall</title>
</head>
<body>
	<div id="wrap">
		<div class="header_wrap">
			<div class="header_inner">
				<div class="logo">
					<a href="/dd">
					 	<img src="https://user-images.githubusercontent.com/38419723/38845101-3bd0b6f8-4231-11e8-8ce8-e63771765ae8.png">
					</a>
				</div> <!-- logo class div -->
			</div> <!-- header_inner class div -->
			<div class="fixed_wrap">
				<div class="fixed_inner">
					<div class="log_sch clearWrap">
						<div class="log_menu">
							<a href="">로그인</a>
							<a href="">회원가입</a>
							<a href="">마이페이지</a>
							<a href="">장바구니</a>
							<a href="">고객센터</a>
						</div> <!-- log_menu div -->
						<div class="sch_pl_wrap clearWrap" style="display: block;">
							<div class="sch_wrap">
								<form action="" method="post" name="search">
									<fieldset>
										<legend>검색 폼</legend>
										<input name="search" onkeydown="CheckKey_search();" value class="MS_search_word top_sch">
										<a class="sch_btn" href="javascript:search_submit();">
										<img src="./resources/img/search_btn.gif" alt=""></a>
									</fieldset>
								</form>
							</div> <!-- sch_wrap class div -->							
						</div> <!-- sch_pl_wrap clelarWrap class div -->
					</div> <!-- log_sch clearWrap class div -->
					<div class="catez_wrap">
						<div class="catez_inn" style="width:1300px;">
							<ul style="width:115%">
								<li class="t_cate">
									<a href="">
									OUTER
									<span class="r_bar"></span>
									</a>
								</li>
								
								<li class="t_cate">
									<a href="">
									SHIRT
									<span class="r_bar"></span>
									</a>
								</li>
								
								<li class="t_cate">
									<a href="">
									TOP
									<span class="r_bar"></span>
									</a>
								</li>
								
								<li class="t_cate">
									<a href="">
									BOTTOM
									<span class="r_bar"></span>
									</a>
								</li>
							</ul>
						</div>
					</div>
				</div> <!-- fixed_inner class div -->
			</div> <!-- fixed_wrap class div -->
		</div> <!-- header_wrap class div -->		
	</div> <!-- wrap class div -->

	<div id="myCarousel" class="carousel slide" data-ride="carousel">
		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="1"></li>
			<li data-target="#myCarousel" data-slide-to="2"></li>
			<li data-target="#myCarousel" data-slide-to="3"></li>
			<li data-target="#myCarousel" data-slide-to="4"></li>
			<li data-target="#myCarousel" data-slide-to="5"></li>
			<li data-target="#myCarousel" data-slide-to="6"></li>			
		</ol>

		<!-- Wrapper for slides -->
		<div class="carousel-inner" role="listbox">
			<div class="item active">
				<img src="./resources/img/main_img_1.jpg" alt="">
				<div class="carousel-caption">
				</div>
			</div>

			<div class="item">
				<img src="./resources/img/main_img_2.jpg" alt="">
				<div class="carousel-caption">					
				</div>
			</div>

			<div class="item">
				<img src="./resources/img/main_img_3.jpg" alt="">
				<div class="carousel-caption">
				</div>
			</div>
			
			<div class="item">
				<img src="./resources/img/main_img_4.jpg" alt="">
				<div class="carousel-caption">					
				</div>
			</div>
			
			<div class="item">
				<img src="./resources/img/main_img_5.jpg" alt="">
				<div class="carousel-caption">					
				</div>
			</div>
			
			<div class="item">
				<img src="./resources/img/main_img_6.jpg" alt="">
				<div class="carousel-caption">					
				</div>
			</div>
			
			<div class="item">
				<img src="./resources/img/main_img_7.jpg" alt="">
				<div class="carousel-caption">					
				</div>
			</div>
		</div>

		<!-- Left and right controls -->
		<a class="left carousel-control" href="#myCarousel" role="button"
			data-slide="prev"> <span class="glyphicon glyphicon-chevron-left"
			aria-hidden="true"></span> <span class="sr-only">Previous</span>
		</a> <a class="right carousel-control" href="#myCarousel" role="button"
			data-slide="next"> <span
			class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			<span class="sr-only">Next</span>
		</a>
	</div>	
	
	<!-- slider end div -->
	<div style="margin-bottom:30px;"></div>
	
	<div class="contentWrapper">
		<div class="contentWrap">
			<div class="newitem-wrap">
				<div class="item-list">
					<table summary="상품이미지, 상품설명, 가격">
						<caption>신규 상품 목록</caption>
						<colgroup>
							<col width="20%">
							<col width="20%">
							<col width="20%">
							<col width="20%">
							<col width="20%">
						</colgroup>
						<tbody>
						<tr>
							<td>
								<div class="item">
									<ul></ul>
								</div>
							</td>
						</tr>
						
						
						</tbody>					
					</table>
				
				</div> <!-- item-list class div -->			
			</div> <!-- newitem-wrap class div -->		
		</div> <!-- contentWrap class div -->	
	</div> <!-- contentWrapper class div -->
	
	
	<div id="footer">

<div class="downinfo">


<div id="toggle">
<select onchange="javascript:window.open(value,'_blank');">
            <option selected="" value="">::::::인터넷뱅킹::::::</option>
            <option value="http://www.wooribank.com/">우리은행</option>
            <option value="http://banking.nonghyup.com/">NH농협은행</option>
            <option value="https://www.kbstar.com/">국민은행</option>
            <option value="http://www.shinhan.com/">신한은행</option>
            <option value="http://www.ibk.co.kr/">기업은행</option>

</select>
</div>

<img border="0" alt="" src="/design/jogunshop/wizdesign/down.jpg" width="1200" height="340" usemap="#down">

<div style=" position:fixed; bottom:110px; right:95px; z-index:10;"><img src="http://jogunshop.img18.kr/web/upload/btn_kakao2.png" alt="" onclick="javascript:window.open('https://lc1.lunasoft.co.kr/lunachat/api-connect/@jogunshop/main', 'lunachat', 'width=1024, height=800');" style="cursor:pointer"></div>


<map name="down">
<area shape="rect" coords="802, 240, 905, 264" href="https://www.doortodoor.co.kr/main/index.jsp" onfocus="this.blur()" target="_blank">
<!--<area shape="rect" coords="975, 219, 1071, 242" href="http://www.ftc.go.kr/info/bizinfo/communicationList.jsp" onFocus="this.blur()" target="_blank">-->
<area shape="rect" coords="975, 219, 1071, 242" href="http://www.ftc.go.kr/info/bizinfo/communicationView.jsp?apv_perm_no=2011386021230200126&amp;area1=&amp;area2=&amp;currpage=1&amp;searchKey=01&amp;searchVal=조군&amp;stdate=&amp;enddate=" onfocus="this.blur()" target="_blank">
<area shape="rect" coords="44, 205, 83, 244" href="http://ibn1.kbstar.com/quics?page=B010972&amp;cc=a002346:a052857&amp;mHValue=66ee3baf021cb1d71a5bb88a65f3fe13201307261600705&quot;" onfocus="this.blur()" target="_blank">
<area shape="rect" coords="1159, 359, 1199, 387" href="#top" onfocus="this.blur()">
<area shape="rect" coords="356, 354, 488, 371" href="http://www.wizdesign.co.kr" target="_blank" onfocus="this.blur()">
<area shape="rect" coords="404, 222, 464, 261" href="/shop/page.html?id=1" onfocus="this.blur()">
<area shape="rect" coords="476, 222, 536, 262" href="/shop/page.html?id=2" onfocus="this.blur()">
<area shape="rect" coords="545, 222, 605, 261" href="/shop/page.html?id=3" onfocus="this.blur()">
<area shape="rect" coords="615, 220, 676, 261" href="/shop/page.html?id=4" onfocus="this.blur()">
<area shape="rect" coords="685, 222, 747, 262" href="/board/board.html?code=jogunshop_board11" onfocus="this.blur()">
</map>
  </div>



</div>

</body>
</html>
