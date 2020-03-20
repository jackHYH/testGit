<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/3
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="http://libs.baidu.com/jquery/2.0.0/jquery.js"></script>
    <title>主数据模型页面</title>
    <link rel="stylesheet" href="../css/page.css"/>

</head>
<body>
<div>

    <div id="a">主数据模型整理界面</div>

    <form>
        <table>
            <tbody id="tboy1">
            <div class="demo">

                <p>我是div.demo中第一个P元素：<a href="#">我在第一个P里面</a></p>
                <p>第二个P元素这是一个段落元素，里面包含了一个a链接元素<a href="#">W3CPLUS</a></p>
            </div>
            </tbody>
            <th colspan="7">我在此地</th>
            <tr>
                <td>周一</td>
                <td>周二</td>
                <td>周三</td>
                <td>周四</td>
                <td>周五</td>
                <td>周六</td>
                <td>周日</td>
            </tr>
            <tr>
                <td>时间：<input type="text" name="时间" value="" style="background-color: aliceblue"/></td>
                <td></td>
                <td>3</td>
                <td>4</td>
                <td>5</td>
                <td>6</td>
                <td>7</td>
            </tr>
            <tr>
                <td>11</td>
                <td>21</td>
                <td><select name="city">
                    <option id="12" value="bj"></option>
                    <option value="sh" selected>上海</option>
                    <option value="gz" >广州</option>
                </select></td>
                <td>个人描述: <textarea name="man" cols="宽度" rows="高度">请输入个人描述..</textarea></td>
                <td>头像: <input type="file" name="photo" value="头像上传" style="background-color: burlywood"/> </td>
                <td><input id="but" type="button" value="导入"/></td>
                <td>
                    <input type="submit" value="提交" style="background-color: aquamarine">
                    <input type="reset" value="重置" style="background-color: red">
                </td>
            </tr>
        </table>
    </form>
    <p>姓名：<%=request.getAttribute("name")%></p>
    <p><%= new Date().toString()%></p>
    <p>jsp用不用重启</p>


    <%
        //声明一个数组, 并将数组存入域中
        String[] namess = {"王海涛","齐雷","陈子枢"};
        request.setAttribute("namess", namess);
    %>
    <c:forEach items="${namess}" var="namesss">
        ${ namesss }
    </c:forEach>


</div>

<div id="colorRadio">
    <input type="radio" name="color" id="rd1" value="Red" />Red
    <input type="radio" name="color" id="rd2" value="Yello" />Yello
    <input type="radio" name="color" id="rd3" value="Blue" />Blue
</div>
<div id="sizeCheck">
    <input type="checkbox" name="size" id="ch1" value="10 pt" />10 pt
    <input type="checkbox" name="size" id="ch2" value="12 pt" />12 pt
    <input type="checkbox" name="size" id="ch3" value="14 pt" />14 pt
</div>
<input type="button" id="submitBtn" value="Get Value" />

<form action="" method="post">
    <select id="dropdown">
        <option>Red</option>
        <option>Yellow</option>
        <option>Blue</option>
    </select>
    <select id="listbox" multiple="multiple">
        <option>Red</option>
        <option>Yellow</option>
        <option>Blue</option>
    </select>
    <input type="button" id="getSelectValue" value="Get Value" />
</form>

<input type="text" id="textBox" value="Hello,jQuery!" />


<script>
    $(function () {
        $("input:text").focus(function(){
            var $inputTextVal = $(this).val();
            if($inputTextVal == this.defaultValue) {
                $(this).val("");
            }
        });
        $("input:text").blur(function(){
            var $inputTextVal = $(this).val();
            if($inputTextVal == ""){
                $(this).val(this.defaultValue);
            }
        });

        $("#getSelectValue").click(function(){
            alert($("#dropdown").val());
            var colors = $("#listbox").val();
            for(var key in colors){
                alert(colors[key]);
            }
        });

        $("div.demo p").html('<h2 class="title">新加的标题.text修改</h2><p>我是div.demo中第一个P元素：<a href="#">我在第一个P里面</a></p>');
        alert("这是.text"+$("div.demo p").text());
    });
    $("div.demo p").text('<h2 class="title">新加的标题.html修改</h2><p>我是div.demo中第一个P元素：< href="#">我在第一个P里面</a></p>');
    alert("这是.html"+$("div.demo p").html());

        $('#submitBtn').click(function () {
            alert($('input:radio[name=color]:checked').val());
             $("input:checkbox[name=size]:checked").each(function () {
               alert( $(this).val());
            });

        });

</script>

</body>
</html>
