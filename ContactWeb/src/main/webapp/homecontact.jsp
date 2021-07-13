<html>
<head>
<title>Welcome to Home Page</title>
</head>
<body>
<h2> Enter to Contact information to save</h2>
<form action="addContact">
Enter id <input type="text" name="id"><br>
Enter name <input type="text" name="name"><br>
Enter number <input type="text" name="number"><br>
<input type="submit">
</form>

<h2> Display Contact information</h2>
<form action="getContact">
Enter id <input type="text" name="id"><br>
<input type="submit">
</form>

<h2> Delete number from Contact</h2>
<form action="delContact">
Enter id <input type="text" name="id"><br>
<input type="submit">
</form>

<h2> Enter details to update Contact information</h2>
<form action="updateContact">
Enter id <input type="text" name="id"><br>
<input type="submit">
</form>

</body>
</html>