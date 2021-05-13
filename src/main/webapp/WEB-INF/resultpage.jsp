<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:genericpage>

    <jsp:attribute name="header">
        Vælger Carport
    </jsp:attribute>

    <jsp:attribute name="footer">
        <c:set var="addHomeLink" value="${true}" scope="request"/>
    </jsp:attribute>

    <jsp:body>
       <div>

           <p>
               You have reserved the  carport with length : ${requestScope.length} cm <br/>
               You have reserved the  carport with width : ${requestScope.width} cm

           </p>


           <table>
               <thead><th>Description </th><th>length</th><th>Qauntity</th><th>informaion</th><th></th><th></th></thead>
               <c:forEach var="carportItem" items="${requestScope.carportItem}">
                   <tr>
                       <td>${carportItem.description}</td>
                       <td>${carportItem.length}</td>
                       <td>${carportItem.quantity}</td>
                       <td>${carportItem.info}</td>


                   </tr>
               </c:forEach>

           </table>
        </div>

    </jsp:body>
</t:genericpage>