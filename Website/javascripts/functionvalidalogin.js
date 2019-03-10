function validaLogin(){
	
	if (formlogin.login.value == ""){
		alert("Informe seu login.");
		formlogin.login.focus();
		return false;
	}
	
	if (formlogin.senha.value == ""){
		alert("Informe sua senha.");
		formlogin.senha.focus();
		return false;
	}
	
	var tamanhologin = formlogin.login.value.length;
	if (tamanhologin < 5){
		alert("O login deve possuir no mínimo 5 caracteres.");
		formlogin.login.focus();
		return false;
	}
	
	var tamanhosenha = formlogin.senha.value.length;
	if (tamanhosenha < 5){
		alert("A senha deve possuir no mínimo 5 caracteres.");
		formlogin.senha.focus();
		return false;
	}
	
	return true;
}