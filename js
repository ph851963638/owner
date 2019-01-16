//按钮操作 使用类


.red {
width:500px; 
background: blue; 
padding: 20px;
color: yellow;
border: 20px solid #444;
    }

.yellow{ 
width:500px; 
background: yellow; 
padding: 20px;
color: blue;
border: 20px solid #444;	
}

</style>
<script>
			window.onload = function() {
				var oBtn1 = document.getElementById('btn1');
				var oBtn2 = document.getElementById('btn2');
				var oP = document.getElementById('p1');

				oBtn1.onclick = function() {
            oP.className='red';          	
				};
       oBtn2.onclick=function()
       {
            	oP.className='yellow';
       };
			};
	</script>
	<body>
		<input id="btn1" type="button"  value="红" />
		<input id="btn2" type="button"  value="黄" />
		<p id="p1">范德萨范德萨发F犯嘀 到分为非我</p>
	</body>
  
  // 图片处理
  	<body>
<img  id="img1"   src="img/9f974fff78.jpg"/>		
		
	
	<script>
		var olmg=document.getElementById('img1');
		
		olmg.onclick=function(){
			
			//alert(  olmg.src  );
			
			if (olmg.src=="http://127.0.0.1:8020/%E6%B8%A1%E4%B8%80/img/9f974fff78.jpg") 
			{
				olmg.src="img/pic1.png";
			} 
				
			
			
			
		}
		
		
		
	</script>	
		
	</body>
</html>
  
  
  
