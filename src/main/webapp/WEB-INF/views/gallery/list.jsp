<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    

<!DOCTYPE html>

<html lang="ko">
	<head>
		<meta charset="UTF-8">
        <title>MySite</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/reset.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/mysite.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/gallery.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/modal.css">
        <!-- js -->
        <script src="${pageContext.request.contextPath}/assets/js/jquery/jquery-3.7.1.js"></script>
    </head>
	<body>
		<div class="wrap">
            <header class="clearfix">
                <h1><a href="">MySite</a></h1>
              
               
			    <ul class="clearfix">
				    <li><span class="user-welcome">이아름 님 안녕하세요^^</span></li>
				    <li>
                        <a class="btn btn-white btn-sm" href="">로그아웃</a>
                    </li>
                    <li>
                        <a class="btn btn-white btn-sm" href="">회원정보수정</a>
                    </li>
			    </ul>
               
                 
                <ul id=login class="clearfix">
                    <li>
                        <a class="btn btn-white btn-sm" href="">로그인</a>
                    </li>
                    <li>
                        <a class="btn btn-white btn-sm" href="">회원가입</a>
                    </li>
                </ul>
                 
            </header>

            <nav>
                <ul class="clearfix">
                    <li><a href="">입사지원서</a></li>
                    <li><a href="">게시판</a></li>
                    <li><a href="">갤러리</a></li>
                    <li><a href="">방명록</a></li>
                </ul>
            </nav>

            <div class="content2 clearfix">
                <aside>
                    <h2>갤러리</h2>
                    <ul>
                        <li><a href="">일반갤러리</a></li>
                        <li><a href="">첨부파일연습</a></li>
                    </ul>
                </aside>

				<main>
                    <div class="main-head clearfix">
                        <h3>일반갤러리</h3>
                        <ol class="clearfix">
                            <li>홈</li>
                            <li>갤러리</li>
                            <li>일반갤러리</li>
                        </ol>
                    </div>

                    <div id="gallery-list">
                        <div class="btn-box">
                            <button id="imgupload" class="btn btn-blue btn-md" type="submit">이미지올리기</button>
                        </div>
                        
                        <ul class="clearfix">
							
							<!-- 이미지반복영역 -->
							<li>
                                <div class="card" >
                                    <img src="${pageContext.request.contextPath}/assets/images/Park-Myung- Soo.jpg">
                                    <div class="writer">
                                        작성자: <strong>이효리</strong>
                                    </div>
                                </div>
                            </li>
                            <li>
                                <div class="card" >
                                    <img src="${pageContext.request.contextPath}/assets/images/Yang-Se-chan.jpg">
                                    <div class="writer">
                                        작성자: <strong>정우성</strong>
                                    </div>
                                </div>
                            </li>
                            <li>
                                <div class="card" >
                                    <img src="${pageContext.request.contextPath}/assets/images/Song-Ji-Hyo.jpg">
                                    <div class="writer">
                                        작성자: <strong>황일영</strong>
                                    </div>
                                </div>
                            </li>
                            <li>
                                <div class="card" >
                                    <img src="${pageContext.request.contextPath}/assets/images/Park-Myung- Soo.jpg">
                                    <div class="writer">
                                        작성자: <strong>이효리</strong>
                                    </div>
                                </div>
                            </li>
                            <li>
                                <div class="card" >
                                    <img src="${pageContext.request.contextPath}/assets/images/Lee-Kwang-soo.jpg">
                                    <div class="writer">
                                        작성자: <strong>정우성</strong>
                                    </div>
                                </div>
                            </li>
                            <li>
                                <div class="card" >
                                    <img src="${pageContext.request.contextPath}/assets/images/LeeHyoRi.jpg">
                                    <div class="writer">
                                        작성자: <strong>황일영</strong>
                                    </div>
                                </div>
                            </li>
                            <li>
                                <div class="card" >
                                    <img src="${pageContext.request.contextPath}/assets/images/Kim-Jong-kook.jpg">
                                    <div class="writer">
                                        작성자: <strong>이효리</strong>
                                    </div>
                                </div>
                            </li>
                            <li>
                                <div class="card" >
                                    <img src="${pageContext.request.contextPath}/assets/images/Yoo-Jae-Suk.jpg">
                                    <div class="writer">
                                        작성자: <strong>황일영</strong>
                                    </div>
                                </div>
                            </li>      
                            <li>
                                <div class="card" >
                                    <img src="${pageContext.request.contextPath}/assets/images/JiseokJin.jpg">
                                    <div class="writer">
                                        작성자: <strong>정우성</strong>
                                    </div>
                                </div>
                            </li>                                                     
                            <li>
                                <div class="card" >
                                    <img src="${pageContext.request.contextPath}/assets/images/JeonSoMin.jpg">
                                    <div class="writer">
                                        작성자: <strong>황일영</strong>
                                    </div>
                                </div>
                            </li>                               
                            <li>
                                <div class="card" >
                                    <img src="${pageContext.request.contextPath}/assets/images/Jeongjae-Lee.jpg">
                                    <div class="writer">
                                        작성자: <strong>정우성</strong>
                                    </div>
                                </div>
                            </li>                               
                            <li>
                                <div class="card" >
                                    <img src="${pageContext.request.contextPath}/assets/images/Gangho-dong.jpg">
                                    <div class="writer">
                                        작성자: <strong>황일영</strong>
                                    </div>
                                </div>
                            </li>                               
							<!-- 이미지반복영역 -->
							
						</ul>
                    </div>
                    
                </main>
            </div>
            
			<!----------------------  footer------------------------------------------------>
       		<c:import url="/WEB-INF/views/include/footer.jsp" > </c:import>
    		<!----------------------  footer------------------------------------------------>

        </div>

        



<!-- 모달창 -->
<!-- 업로드 모달창 -->
<div id="modal-upload" class="modal-bg">

	<div class="modal-content" >
    
        <div class="clearfix">
            <button class="btn-close">X</button>
        </div>
        
		<p class="title">이미지등록 모달창</p>
		
		<form id="imgupload-form" action="" method="">
			<div class="info-row">
                <label for="txt-content">글작성</label>
				<input id="txt-content" type="text" name="content" value="">
			</div>

            <div class="info-row">
                <label for="txt-file">이미지선택</label>
				<input type="file" name="file" value="">
			</div>
            <div class="btn-box">
			    <button type="submit" class="btn-del btn btn-blue btn-md">등록</button>
            </div>
        </form>
		
	</div>

</div>


<!-- 이미지보기 모달창 -->
<div id="modal-view" class="modal-bg" active>

	<div class="modal-content" >
    
        <div class="clearfix">
            <button class="btn-close">X</button>
        </div>
        
		<p class="title">이미지보기 모달창</p>
		
		<div id="img-view">
            <img src="../../assets/images/Gangho-dong.jpg">


            <div class="img-content">
                여기는 입력한 코멘트가 나옵니다.
            </div>

            <div class="btn-box">
			    <button type="submit" class="btn-del btn btn-blue btn-md">삭제</button>
            </div>

        </div>
			
		
	</div>

</div>
		
<!-- 스크립트 -->
<script>
$(document).ready(function(){
	console.log('돔트리완성');
	
	//화면에 리스트 그리는 함수
	fetchList();
	
	//이미지올리기 버튼을 클릭했을때
	$('#upLoad').on('submit', function(event){
		console.log('등록버튼클릭');
		
		//value값 수집
		//imgul = 이미지 업로드
		let imgul = $('#imgupload').val();
		console.log(imgupload);
		
		//서버에 저장 요청
		$.ajax({ 
			url : '${pageContext.request.contextPath}/gallery/upload',
			type : 'post',
			data : imgul,
			
			dataType : 'json',
			success : function(JsonResult){
				/*성공시 처리해야될 코드 작성*/
				console.log(JsonResult);
				console.log(JsonResult.result);
				console.log(JsonResult.apiData);
				
				if(JsonResult.result == 'success'){
					
					/* 화면에 그리기 */
					render(JsonResult.apiData, 'up');
						
					/* 입력폼 비우기 */
					$('#imgupload').val('');
					
				}else {
					console.log("이미지 업로드 실패");
				}
				
			},
			error : function(XHR, status, error) {
				console.error(status + " : " + error);
			}
		});
	});
	
	//리스트에 있는 이미지버튼 클릭 했을때
	$('#modal-view').on('click', function(){
		let value = $(this).text(); // 버튼의 텍스트를 가져옴
	
	    if (value === "C") {
	        expression = "";
	        $('#modal-view').val('');
	    } else if (value === "=") {
	        try {
	            let result = eval(expression); // 수식 계산
	            $('#modal-view').val(result);
	            expression = result.toString(); // 결과를 다음 계산에 사용
	        } catch (e) {
	            $('#modal-view').val("Error");
	            expression = "";
	        }
	    } else {
	    	expression += value;
	        $('#modal-view').val(expression);
	    }		
	});
	
	
	//리스트데이타요청해서 그리는 함수
	function fetchList(){
		$.ajax({
			url : "${pageContext.request.contextPath }/gallery",
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
	
	//GalleryVO 1개를 화면에 그린다
	function render(galleryVO, updown){
		console.log(galleryVO);
		console.log('그린다');
		
		let str = '';
		str += '<table id="t'+galleryVO.no+'" class="gallery-item">';
		str += '	<colgroup>';
		str += '		<col style="width: 10%;">';
		str += '    	<col style="width: 40%;">';
		str += '    	<col style="width: 40%;">';
		str += '    	<col style="width: 10%;">';
		str += '	</colgroup>';
		str += '    <tbody>';
		str += '		<tr>';
		str += '			<td>' + galleryVO.no +'</td>';
		str += '			<td>' + galleryVO.filePath +'</td>';
		str += '			<td>' + galleryVO.orgName +'</td>';
		str += '			<td>' + galleryVO.saveName +'</td>';
		str += '			<td>' + galleryVO.filesize +'</td>';
		str += '			<td class="txt-center">';
		str += '				<button class="btn-del btn btn-blue btn-md" data-no="'+galleryVO.no+'">삭제</button>';
		str += '			</td>';
		str += '		</tr>';
		str += '		<tr>';
		str += '			<td colspan=4>' + galleryVO.content +'</td>';
		str += '		</tr>';
		str += '	</tbody>';
		str += '</table>';
		
		if(updown =='up'){
			$('#modal-view').prepend(str);
			
		}else if(updown =='down'){
			$('#modal-view').append(str);
			
		}else {
			console.log('방향체크');
		}
	
	
});
</script>		
	</body>
</html>