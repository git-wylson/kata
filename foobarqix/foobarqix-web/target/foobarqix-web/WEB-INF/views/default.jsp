<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>FooBarQix</title>

<link rel="stylesheet" href="<c:url value='/static/css/bootstrap.min.css' />">
<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
</head>
<body ng-app="fbqApp" class="ng-cloak">

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#fbqNavbar">
					<span class="icon-bar"></span> 
					<span class="icon-bar"></span> 
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">FooBarQix</a>
			</div>
			<div class="collapse navbar-collapse" id="fbqNavbar">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container text-center">
		<div class="main-container" ng-controller="FbqController as ctrl">

			<h1>FooBarQix Kata Application</h1>
			<p>
				If you want to see the subject about this problem,<a href="https://gist.github.com/dlresende/60b4c0240ad020a323ad"> click here</a>
			</p>
			<p>
				If you want to download the solution about this problem,<a href="#"> click here</a>
			</p>
			<hr>
			<div class="panel panel-default">
				<!-- Default panel contents -->
				<div class="panel-heading">
					<span class="lead">List of Results </span>
				</div>
				<div class="tablecontainer">
					<table class="table table-hover">
						<thead>
							<tr>
								<th>Number</th>
								<th>Result</th>
							</tr>
						</thead>
						<tbody>
							<tr ng-repeat="n in ctrl.results">
								<td><span ng-bind="n.number"></span></td>
								<td><span ng-bind="n.result"></span></td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>

	<footer class="container-fluid text-center">
		<h6>© Copyright 2016, wylson-dibinga@hotmail.fr, All rights reserved.</h6>
	</footer>

	<script src="<c:url value='/static/lib/angular.js' />"></script>
	<script src="<c:url value='/static/js/fonction.utils.js' />"></script>
	<script src="<c:url value='/static/js/app.js' />"></script>
	<script src="<c:url value='/static/js/service/fbq.service.js' />"></script>
	<script src="<c:url value='/static/js/controller/fbq.controller.js' />"></script>
</body>
</html>
