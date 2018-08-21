<%@page import="java.util.ArrayList"%>
<%@page import="fs.dao.MSTCUSTOMER"%>
<%@page import="fs.dao.MSTCUSTOMER_DAO"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String idCustomer = request.getParameter("idCustomer")!=null?request.getParameter("idCustomer"):"";
		String action = request.getParameter("action");
		MSTCUSTOMER_DAO dao = new MSTCUSTOMER_DAO();
		
		ArrayList<MSTCUSTOMER> cusList = new ArrayList<>();
		if(idCustomer!=""){
			cusList = dao.getListCustomerByID(idCustomer);
		}
		MSTCUSTOMER cus = cusList.size()>0 ? cusList.get(0) : null;
		String CUSTOMER_ID = "";
		String CUSTOMER_NAME = "";
		String SEX = "";
		String ADDRESS = "";
		String EMAIL = "";
		String BIRTHDAY = "";
		if (cus != null) {
			CUSTOMER_ID = cus.getS_customerID() != null ? cus.getS_customerID() : "";
			CUSTOMER_NAME = cus.getS_customerName() != null ? cus.getS_customerName() : "";
			SEX = cus.getS_sex() != null ? cus.getS_sex() : "";
			ADDRESS = cus.getS_address() != null ? cus.getS_address() : "";
			BIRTHDAY = cus.getS_birthday() != null ? cus.getS_birthday().toString() : "";
			EMAIL = cus.getS_email() != null ? cus.getS_email() : "";
			System.out.print(EMAIL+"sssss");
		}
	%>

	<form action="../CustomerAction">
		<div <%=!action.equals("view")?"hidden":"" %>>
			<label>CUSTOMER_ID</label> <input name="CUSTOMER_ID"
				value=<%=action.equals("view") ? CUSTOMER_ID :""%>>
		</div>
		<div>
			<label>CUSTOMER_NAME</label> <input name="CUSTOMER_NAME"
				value="<%=action.equals("view") ? CUSTOMER_NAME:""%>">
		</div>
		<div>
			<label>SEX</label> <input name="SEX" value="<%=action.equals("view") ? SEX:""%>">
		</div>
		<div>
			<label>ADDRESS</label> <input name="ADDRESS" value="<%=action.equals("view") ? ADDRESS:""%>">
		</div>
		<div>
			<label>BIRTHDAY</label> <input name="BIRTHDAY" value="<%=action.equals("view") ? BIRTHDAY:""%>">
		</div>
		<div>
			<label>EMAIL</label> <input name="EMAIL" value="<%=action.equals("view") ? EMAIL:""%>">
		</div>
		<div>
			<%
				Date d = new Date();
				String currentDate = d.getDate() + "-" + d.getMonth() + "-" + d.getYear();
				String UPDATE_YMD = (cus != null && cus.getD_insertYMD() != null) ? cus.getD_insertYMD().toString() : currentDate;
			%>
			<input name="UPDATE_YMD"
				value="<%=UPDATE_YMD%>">
			<input name="INSERT_YMD"
				value="<%=(cus != null && cus.getD_insertYMD() != null) ? cus.getD_insertYMD() : currentDate%>">
			<input name="DELETE_YMD"
				value="<%=(cus != null && cus.getD_deleteYMD() != null) ? cus.getD_deleteYMD() : currentDate%>">
			<input name="action" value="create" hidden>
		</div>
		<input type="submit" value="Save" <%=action.equals("view")?"hidden":"" %>>
	</form>
</body>
</html>