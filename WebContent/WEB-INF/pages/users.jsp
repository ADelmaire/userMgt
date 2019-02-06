<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Users</title>
<link rel="stylesheet" href="ressources/css/user.css" />
</head>
<body>

	<h1>Liste des personnes</h1>

	<div id="conteneur">

		<c:forEach items="${users }" var="user" varStatus="status">
			<div class="bloc_produit">

				<div class="prix">
					<label>${user.age} ans</label>
				</div>
				<a href="userinfos?i=${status.index}">
				<img src="${user.urlImage}"/>
				</a>
				<div class="description">${user.nom}  ${user.prenom}</div>

			</div>
		</c:forEach>
	</div>

</body>
</html>