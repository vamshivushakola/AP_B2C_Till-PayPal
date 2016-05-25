<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/desktop/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/desktop/common"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


  
<template:page pageTitle="${pageTitle}">
	<div id="globalMessages">
		<common:globalMessages />
	</div>
	
	<div id="productNotifyDiv">
		<ol class="products-list" data-isOrderForm="false">
		
			<c:forEach items="${comingSoonProductData}" var="product">
				<div class="head">${product.name}</div>
				<input type="submit" id="notifyMe_${product.code}" value="Notify Me" 
				onclick="openForm(${product.code})" />
				<div id="notifyId_${product.code}" style="display: none">
					<form id="saveCustomerDataForm_">
					
						<table>
							<tr>
								<td>First name:<br></td>
								<td><input type="text" name="firstName" id="firstName"><br></td>
							</tr>
							<tr>
								<td>Last name:<br></td>
								<td><input type="text" name="lastName" id="lastName"><br></td>
							</tr>
							<tr>
								<td>Email Id :<br></td>
								<td><input type="text" name="emailId" id="emailId"><br></td>
							</tr>
							<tr>
								<td>Product Code:<br></td>
								<td><input type="text" name="productCode" id="productCode"
									value="${product.code}" readonly="readonly"><br></td>
							</tr>
							<tr>
								<td>Product Name :<br></td>
								<td><input type="text" name="productName" id="productName"
									value="${product.name}" readonly="readonly"><br></td>
							</tr>
							<tr>
							<tr>
								<td></td>
								<td><input type="submit" value="Save" onclick="formsubmit(${product.code})" > 
									<input type="reset" value="Cancel" onclick="cancelForm(${product.code})" >
								</td>
							</tr>
						</table>
					</form>
				</div>
			</c:forEach>
		</ol>
		<div>
			<input type="text" id="messageNotifyId" readonly="readonly"/>
		</div>
	</div>
	
	<script type="text/javascript" src="${commonResourcePath}/js/jquery-1.11.2.min.js"></script>
	<script type="text/javascript" >
	function formsubmit(code) {
		 var str = $("#saveCustomerDataForm_").serialize();
		 $.ajax({
				type : "POST",
				data : str,
				url : "<c:url value='/saveNotifyMeProducts'/>",
				success : function(result) {
					alert("SUCCESS");
					$("#messageNotifyId").val(result);
					$("#messageNotifyId").css({
						'display' : "block"
					}); 	 
				},
				error : function() {
					alert('ERROR');
				},
				done : function() {
					alert("DONE");
				}
			});
		}
	</script>
		<script type="text/javascript">
		function openForm(code) {
			alert('You wants to open form???')
		 
			$("#notifyId_"+code).css({
				'display' : "block"
			});
			$("#notifyMe_"+code).css({
				'display' : "none"
			});
		}
		
		function cancelForm(code) {
			alert('Cancel??')
			$("#notifyId_"+code).css({
				'display' : "none"
			});
			$("#notifyMe_"+code).css({
				'display' : "block"
			});
		}
	</script>
	
</template:page>
 