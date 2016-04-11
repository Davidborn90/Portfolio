<%@ page import="portfolio.Auto"%>
<%@ page import="portfolio.AutoLijst"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html lang="en">
<head>
<style>
* {
	text-align: center;
	margin: auto;
}

body {
	background-color: black;
}

.autolijst {
	border: 1px solid black;
	width:20%;
	padding: 20px;
	margin-top: 20px;
	border-radius: 20%;
	background-color: white;
	display:inline-block;
}

.merktype {
	background-color: antiquewhite;

}
</style>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<title>David Born - Portfolio</title>
<link rel="stylesheet"
	href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
<script
	src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
<!--[if lt IE 9]>
			<script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script>
		<![endif]-->
</head>


<%
	AutoLijst al = new AutoLijst();
	ArrayList<Auto> autos = al.getLijst();
	ArrayList<Auto> selectie = new ArrayList<Auto>();
	ArrayList<String> merken = al.getMerken();

	if (request.getParameter("stuur") != null) {
		int minPrijs = 0;
		int maxPrijs = Integer.MAX_VALUE;
		String merk = request.getParameter("merk");
		if (!request.getParameter("minprijs").equals("")) {
			minPrijs = Integer.parseInt(request.getParameter("minprijs"));
		}
		if (!request.getParameter("maxprijs").equals("")) {
			maxPrijs = Integer.parseInt(request.getParameter("maxprijs"));
		}
		for (Auto a : autos) {
			if (merk.equals("alle merken")) {
				if (a.getPrijs() <= maxPrijs && a.getPrijs() >= minPrijs) {
					selectie.add(a);
				}
			} else {
				if (a.getMerk().equals(merk) && a.getPrijs() <= maxPrijs && a.getPrijs() >= minPrijs) {
					selectie.add(a);
				}
			}
		}
	} else {
		selectie = autos;
	}
%>
<body>
	<div>
		<form action="Autoshop.jsp" method="get">
			<table>
				<tr>
					<th colspan="4">Deckshop</th>
				</tr>
				<tr>
					<td colspan="4"><select name="merk">
							<option value="alle merken">alle merken</option>
							<%
								for (String merk : merken) {
							%>
							<option value="<%=merk%>"><%=merk%></option>
							<%
								}
							%>
					</select></td>
				</tr>
				<tr>
					<th colspan="2">Minimumprijs</th>
					<th colspan="2">Maximumprijs</th>
				</tr>
				<tr>
					<td colspan="2"><input type="number" name="minprijs"></td>
					<td colspan="2"><input type="number" name="maxprijs"></td>
				</tr>
				<tr>
					<td colspan="4"><input type="submit" name="stuur" value="Ga"></td>
				</tr>
			</table>
			<%
				for (Auto auto : selectie) {
			%>
			<div class="autolijst">
				<p class="merktype"><%=auto.getMerk()%>&copy;
					<%=auto.getType()%></p>
				<img src="<%=auto.getFoto()%>">
				<p class="prijs">
					&#x20ac;<%=auto.getPrijsFormat()%></p>

			</div>
			<%
				}
			%>
		</form>
	</div>
</body>