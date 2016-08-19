<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %><!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8" />
	<!--[if lt IE 9]><script src="https://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7.3/html5shiv.min.js"></script><![endif]-->
	<title>${parameters['title']}</title>
	<meta name="keywords" content="${parameters['keywords']}" />
	<meta name="description" content="${parameters['deckription']}" />
	<style><%@ include file="/files/css/style.css" %></style>
</head>

<body >
<div class="wrapper">

	<div id="siteBackgroundLowLaer1" >
		<div id="siteBackgroundLowLaer2" >
		</div>
	</div>
		
	<%@ include file="./jspf/header.jsp" %>

	<div class="middle">

		
		
		<div class="containerOut">
		<div class="containerIn">

			<jsp:include page="./jspf/regBlock.jsp"/>
		
		</div>
		</div><!-- .container-->
		
		<div class="clear"></div>
	
	</div><!-- .middle-->

	<%@ include file="./jspf/footer.jsp" %>

</div><!-- .wrapper -->
</body>
</html>