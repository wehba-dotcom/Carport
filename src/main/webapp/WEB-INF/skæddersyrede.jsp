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
            <h2> hvad du ønsker om carport </h2>

           <form  action="${pageContext.request.contextPath}/fc/bergen" method="post">
               <label for="length">Carport  length:</label>
               <select id="length" name="length">
                   <option value="length" selected>Vælger længde</option>
                   <option value="240">240 cm</option>
                   <option value="270">270 cm</option>
                   <option value="300">300 cm</option>
                   <option value="330">330 cm</option>
                   <option value="360">360 cm</option>
                   <option value="390">390 cm</option>
                   <option value="420">420 cm</option>
                   <option value="450">450 cm</option>
                   <option value="480">480 cm</option>
                   <option value="510">510 cm</option>
                   <option value="540">540 cm</option>
                   <option value="570">570 cm</option>
                   <option value="600">600 cm</option>
                   <option value="630">630 cm</option>
                   <option value="660">660 cm</option>
                   <option value="690">690 cm</option>
                   <option value="720">720 cm</option>
                   <option value="750">750 cm</option>
                   <option value="780">780 cm</option>

               </select>
                  <br><br>
                   <label for="width">Carport width:</label>
               <select id="width" name="width">
                   <option value=" width " selected>Vælger bredde</option>
                   <option value="240">240 cm</option>
                   <option value="270">270 cm</option>
                   <option value="300">300 cm</option>
                   <option value="330">330 cm</option>
                   <option value="360">360 cm</option>
                   <option value="390">390 cm</option>
                   <option value="420">420 cm</option>
                   <option value="450">450 cm</option>
                   <option value="480">480 cm</option>
                   <option value="510">510 cm</option>
                   <option value="540">540 cm</option>
                   <option value="570">570 cm</option>
                   <option value="600">600 cm</option>
                   <option value="630">630 cm</option>
                   <option value="660">660 cm</option>
                   <option value="690">690 cm</option>
                   <option value="720">720 cm</option>
                   <option value="750">750 cm</option>
                   <option value="780">780 cm</option>

               </select>


               <br><br>
               <br> <button type="submit" class="btn btn-primary">Hvis detialerne</button></br></br>
           </form>


            <c:if test="${sessionScope.role == 'employee' }">
                <p style="font-size: larger">This is what you can do,
                    since your are logged in as an employee</p>
                 <p><a href="fc/employeepage">Employee Page</a>
             </c:if>

             <c:if test="${sessionScope.role == 'customer' }">
                <p style="font-size: larger">This is what you can do, since your
                    are logged in as a customer</p>
                <p><a href="fc/customerpage">Customer Page</a>
            </c:if>

        </div>

    </jsp:body>
</t:genericpage>