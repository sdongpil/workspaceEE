<%@ page  contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<script type="text/javascript">
		function access_form() {
			let formE = document.getElementById('f');
			formE.id.value = "pil";
			formE.irum.value = "pil2";
			formE.style.border = '1px dashed orange';
			formE.style.color = 'blue';


		}
		function access_div() {
			let div1E = document.getElementById('div1');
			let div1Content = div1E.innerHTML;
			console.log('div1Content:' + div1Content);
			let name = '고소영';
			div1E.innerHTML = `
			<ol>
				<li>김태희</li>
				<li>이효리</li>
				<li>${name}</li>
			</ol>
			<img src='penguin1.gif'>
			<img src='penguin2.gif'>
			<img src='penguin3.gif'>
		`;
		}
		var count = 0;
		function access_img() {
			count = count % 3;
			count++;
			let imgeE = document.getElementById('img1');
			imgeE.src = 'penguin' + count + '.gif';


		}
		function form_display() {
			let f = document.getElementById('f');
			if (f.style.visibility == 'visible') {

				f.style.visibility = 'hidden';
			} else {
				f.style.visibility = 'visible';
			}

		}
	</script>

</head>

<body  onmousemove="access_img();">
	<h1 onmouseover="access_img();">javascript dom[document object
		model]</h1>
	<hr>
	<form action="" name='f' id='f'>
		아이디:<input type="text" name="id" id="id"><br>
		이 름: <input type="text" name="irum" id="irum"><br>
	</form>
	<div id="div1">div1 content</div>
	<div>
		<img id="img1" width="100" height="100" src='penguin1.gif' /> <span id="span1">span1 content</span>
	</div>

	<div>
		<input type="button" value="access form" onclick="access_form();">
		<input type="button" value="access div" onclick="access_div();">
		<input type="button" value="access img" onclick="access_img();">
		<input type="button" value="form display" onclick="form_display();">
	</div>

</body>

</html>