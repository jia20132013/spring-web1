<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 
<html>
<head>
<title>This is small spring web app</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1" />
<script
	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.6.0/angular.min.js"></script>
<script src="/js/angular.js"></script>
<link rel="stylesheet"
	href="http://netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css" />
</head>
<body>
	<div class="container" ng-app="app">
    <p class="bg-primary">Find user </p>
		<div class="row">
				
			<div ng-controller="getuserController" >
				<label for="userId">UserId:</label>
				<input type="text" class="form-control" style="width: 150px;" ng-model="userId" placeholder="Enter user Id" /> <br />
				<button ng-click="getUser()" class="btn btn-default">Submit</button>
				<button ng-click="clear()" class="btn btn-default" >Clear</button> 
				<br/><br/>
				<div ng-show="showUser">
					        Id: {{user.userId}}<br />
					First Name: {{user.firstName}}<br />
					 Last Name: {{user.lastName}}<br/>
					   Theater: {{user.theater}}<br/>
				     	Region: {{user.region}}
			    </div>
				<p>{{ErrorMsg}}</p>
	    </div>
 
			
    </div>
	</div>

</body>
</html>