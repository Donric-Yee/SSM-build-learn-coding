
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
</head>
<body>

<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
<%--       隐藏域：出现的问题：我们提交了修改的   SQL请求，但是修改失败，
        初次考虑式事务问题，配置完毕事务，依旧失败！--%>
<%--        看一下SQL语句,是否执行成功:SQL执行失败,因为缺少id--%>

<%--    前端传递隐藏域--%>
    <input type="hidden" name="bookID" value="${QBook.bookID}">

        书籍名称：<input type="text" name="bookName" value="${QBook.bookName}" required><br><br><br>
        书籍数量：<input type="text" name="bookCounts" value="${QBook.bookCounts}" required><br><br><br>
        书籍详情：<input type="text" name="detail" value="${QBook.detail}" required><br><br><br>
        <input type="submit" value="修改">
    </form>

</div>
</body>
</html>
