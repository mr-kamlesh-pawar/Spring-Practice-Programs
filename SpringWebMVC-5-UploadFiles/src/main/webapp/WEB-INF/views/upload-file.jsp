<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>File Upload</title>
</head>
<body>

<h3>Upload File</h3>

<form action="uploadFileForm" method="post" enctype="multipart/form-data">


<input type="file" name="file1"	>
<input type="submit" value="Upload File"/>

</form>


</body>
</html>