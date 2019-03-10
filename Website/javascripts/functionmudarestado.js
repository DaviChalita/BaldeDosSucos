function mudarestado(num){
	var id="conteudo_"+num;
	var obj=document.getElementById(id);
	var status=obj.style.display;
	if(status=="none"){obj.style.display="inline"}
	else{obj.style.display="none";}
}