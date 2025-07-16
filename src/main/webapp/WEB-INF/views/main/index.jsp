<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html lang="ko">
    <head>
        <meta charset="UTF-8">
        <title>MySite</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/reset.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/mysite.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/main.css">
    	<!-- js -->
    	<script src="${pageContext.request.contextPath}/assets/js/jquery/jquery-3.7.1.js"></script>       
            
    </head>

    <body>
        <div class="wrap">
        	
        	<!-- 헤더 + 네비----------------------------------------------------->
        	<c:import url="/WEB-INF/views/include/header.jsp" > </c:import>
        	<!-- 헤더 + 네비----------------------------------------------------->
        	     
            <div class="content clearfix">
                <main>
                    <div id="main-home">
                        <img class="profile" src="${pageContext.request.contextPath}/assets/images/profile.jpg">
                        <div class="greeting-box">
                            <p class="greeting">
                                안녕하세요!!<br>
                                이아름의 MySite에 오신 것을 환영합니다.<br>
                                <br>
                                이 사이트는 웹 프로그램밍 실습과제 예제 사이트입니다.
                            </p>
                            
                            <p class="introduce">
                                사이트 소개, 회원가입, 방명록, 게시판으로 구성되어 있으며<br>
                                jsp&serlvet(모델2) 방식으로 제작되었습니다.<br>
                                <br>
                                자바 수업 + 데이터베이스 수업 + 웹프로그래밍 수업<br>
                                배운 거 있는거 없는 거 다 합쳐서 만들어 놓은 사이트 입니다.<br>
                                <br>
                                MyBatis2.x(IBatis)의 후속으로 등장한 ORM 프레임워크입니다
                                <br>
                                이미 익숙한 SQL를 그대로 사용하고 JDBC코드의 불편함을 제거하였으며
                                <br>
                                가장 큰 특징은 SQL을 자바코드에서 분리해서 별도의 XML 파일 안에 작성하고 관리 할 수 있는것 입니다.
                                <br>
                                MyBatis의 DAO(Repository)는 SQLSession 인터페이스를 구현한 클래스의 객체를 DI받아 사용합니다.
                                <br>
                                MyBatis의 DAO는 SQLSessionDaoSupport 추상 클래스를 상속받아 구현하기도 합니다.
                                <br>
                                Mapper 인터페이스를 통한 OR 매핑 기능을 지원합니다.
                                <br>
                                이 중에 SQLSession 인터페이스를 구현한 클래스의 객체의 DI 방식을 주로 사용하게 됩니다.
                                <br>
                                SQLSession 인터페이스를 구현한 SQLSessionTemplate 클래스를 사용한다.
                                <br>
                                결과의 칼럼 이름과 resultType의 class의 필드명이 다른 경우(컬럼명 alias 사용)
                                <br>
                                <![CDATA[ "이 곳에 내용을 기재 하면 '<' 부등호 또는 -와 같은 기호를 사용해도 태그에는 문제가 되지 않습니다"  ]]>
                                <br>
                                <br>
                                <br>
                                <br>
                                <a href="${pageContext.request.contextPath}/assets/views/guestbook/addlist.jsp">[방명록에 글 남기기]</a>
                            </p>
                        </div>
                    </div>
                </main>
            </div>

			<!----------------------  footer------------------------------------------------>
       		<c:import url="/WEB-INF/views/include/footer.jsp" > </c:import>
    		<!----------------------  footer------------------------------------------------>
       		
       	</div>
<!-- 자바스크립트 -->      
<script>
$(document).ready(function(){
	console.log('돔트리완성');

	function fetchList(){
		$.ajax({
			url : "${pageContext.request.contextPath}/guestbook/add",
			type : "get",
			
			dataType : "json",
			success : function(jsonResult){
				/*성공시 처리해야될 코드 작성*/
				console.log(jsonResult);
				console.log(jsonResult.result);
				console.log(jsonResult.apiData);
				
				if(jsonResult.result == 'success'){
					//화면에 그린다
					for(let i=0; i<jsonResult.apiData.length; i++){
						render(jsonResult.apiData[i], 'down');
					}
				}else {
					console.log('알 수 없는 오류');
				}
				
			},
			
			error : function(XHR, status, error) {
				console.error(status + " : " + error);
			}	
			
		});	
	}

});
</script> 	
    </body>
</html>