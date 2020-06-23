<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HOME PAGE</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	
	<header>
		<h1>Java Web App</h1>
		<div id="githubButtons">
			<a class="github-button" href="https://github.com/aymkh" data-color-scheme="no-preference: dark; light: dark; dark: dark;" data-size="large" data-show-count="true" aria-label="Follow @aymkh on GitHub">Follow @aymkh</a>

			<a class="github-button" href="https://github.com/AymKh/java-web-app-101" data-color-scheme="no-preference: dark; light: dark; dark: dark;" data-icon="octicon-star" data-size="large" data-show-count="true" aria-label="Star aymkh/rockPaperScissors on GitHub">Star</a>
		</div>		
	</header>
	<main>
		<div class="container">
			<p>This form allows you to add data into a remote SQL DB hosted on <a href="https://www.clever-cloud.com/en/" target="_blank">Clever Cloud</a></p>
			<p>However the BD is only 10MB of size since it's free.</p>

			<p>To manage the online DB you can see the free <a href="https://minidbmanager.herokuapp.com/" target="_blank">Tool</a> coded by AymKh</p>

			<form action="ProccessInfo" method="POST">
				<input type="text" placeholder="Name" name="name">
				<input type="submit" value="Send">
			</form>
		</div>
		
	</main>
	<script async defer src="https://buttons.github.io/buttons.js"></script>
</body>
</html>