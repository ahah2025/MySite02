<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- editform.jsp -->
<!DOCTYPE html>

<html lang="ko">
    <head>
        <meta charset="UTF-8">
        <title>MySite</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/reset.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/mysite.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/board.css">
    </head>

    <body>
    	versoin1 
      <div class="wrap">
            
        	<!-- 헤더 + 네비----------------------------------------------------->
        	<c:import url="/WEB-INF/views/include/header.jsp" > </c:import>
        	<!-- 헤더 + 네비----------------------------------------------------->
        	               

            <div class="content2 clearfix">
				<!-- 방명록 aside ----------------------------------------------------->
             	<c:import url="/WEB-INF/views/include/asideGuestBook.jsp" > </c:import>


				<main>

				    <div class="main-head clearfix">
                        <h3>일반게시판</h3>
                        <ol class="clearfix">
                            <li>홈</li>
                            <li>게시판</li>
                            <li>일반게시판</li>
                        </ol>
                    </div>
	
					<div id="board-editform">
						
						<form class="form-box" action="#" method="get">
							<!-- 작성자 -->
							<div class="info-row">
								<span class="info-title">작성자</span>
								<span>정우성</span>
							</div>
							
							<!-- 조회수 -->
							<div class="info-row">
								<span class="info-title">조회수</span>
								<span>123</span>
							</div>
							
							<!-- 작성일 -->
							<div class="info-row">
								<span class="info-title">작성일</span>
								<span>2020-03-02</span>
							</div>
							
							<!-- 제목 -->
							<div class="info-row">
								<label class="info-title" for="txt-title">제&nbsp;&nbsp;&nbsp;목</label>
								<input type="text" id="txt-title" name="" value="">
							</div>
						
							<!-- 내용 -->
							<div class="info-row">
								<textarea id="txt-content">여기에는 본문내용이 출력됩니다.
														   여기에는 본문내용이 출력됩니다.
														   여기에는 본문내용이 출력됩니다.
														   여기에는 본문내용이 출력됩니다.
														   여기에는 본문내용이 출력됩니다.
														   여기에는 본문내용이 출력됩니다.
														   여기에는 본문내용이 출력됩니다.
														   여기에는 본문내용이 출력됩니다. 
								</textarea>
							</div>
							
                            <div class="btn-box">
                                <a class="btn btn-gray btn-md" href="">목록</a>
							    <button class="btn btn-blue btn-md" type="submit" >수정</button>
                            </div>
							
						</form>

					</div>
				
			     
                </main>
            </div>
            

			<!----------------------  footer------------------------------------------------>
       		<c:import url="/WEB-INF/views/include/footer.jsp" > </c:import>
    		<!----------------------  footer------------------------------------------------>
       		

        </div>
     
    </body>
</html>