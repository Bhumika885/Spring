<%@ page language="java" contentType="text/html; charset=US-ASCII"
pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="bhu" %>



<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Health Card Application</title>
	<style>
		body {
			font-family: Arial, sans-serif;
			background-color: #f2f2f2;
		}

		form {
			width: 50%;
			margin: 40px auto;
			padding: 20px;
			background-color: #fff;
			border: 1px solid #ddd;
			border-radius: 10px;
		}

		h1 {
			text-align: center;
		}

		label {
			display: block;
			margin-bottom: 10px;
		}

		input[type="text"], input[type="email"], input[type="tel"] {
			width: 100%;
			height: 40px;
			margin-bottom: 20px;
			padding: 10px;
			border: 1px solid #ccc;
			border-radius: 5px;
		}

		input[type="submit"] {
			width: 100%;
			height: 40px;
			background-color: #4CAF50;
			color: #fff;
			padding: 10px;
			border: none;
			border-radius: 5px;
		}


	</style>
</head>
<body>
	<form action="updateApplicantInfo" method="post">
		<h1>Health Card Application Form</h1>
		<input type="text" hidden placeholder="Enter ApplicantId" name="id" value="${ beneficiaryInfo.getId() }">
                		<label>Enter Full Name:</label>
                                <input type="text" name="fullName" value="${ beneficiaryInfo.getFullName() }"><br>

                                <label>Enter Date of Birth:</label>
                                <input type="text" name="dob" value="${ beneficiaryInfo.getDob() }"><br>

                                <label>Enter Email ID:</label>
                                <input type="email" name="emailId" value="${ beneficiaryInfo.getEmailId() }"><br>
                                <label>Enter Mobile Number:</label>
                                <input type="tel" name="mobileNumber" value="${ beneficiaryInfo.getMobileNumber() }"><br>

                                <label>Enter Address:</label>
                                <input type="text" name="address" value="${ beneficiaryInfo.getAddress() }"><br>

                                <label>Enter City:</label>
                                <input type="text" name="city" value="${ beneficiaryInfo.getCity() }"><br>

                                <label>Enter State:</label>
                                <input type="text" name="state" value="${ beneficiaryInfo.getState() }"><br>

                                <label>Enter PIN Code:</label>
                                <input type="text" name="pinCode" value="${ beneficiaryInfo.getPinCode() }"><br>
		<label>Enter Family Income:</label>
		<input type="text" name="familyIncome" value="${ beneficiaryInfo.getFamilyIncome() }"><br>
												<h2 align="center">${updateMsg}</h2>

		<input type="submit" value="Update Health Card" name="applyHealthCard">

	</form>
		<a href="getAllApplicantInfo">Get All Applicant Info</a>

</body>
</html>