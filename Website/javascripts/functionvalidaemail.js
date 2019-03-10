function validaEmail(){
	var email = formRecuperarSenha.emailRecuperar.value;
	var atpos = email.indexOf("@");
	var atpon = email.indexOf(".");
	var tam = email.length;
	var tam1 = tam-2;
	
	/* Verificando email */
	if (formRecuperarSenha.emailRecuperar.value==""){
		alert("O email n\u00e3o pode ficar em branco.");
		formRecuperarSenha.emailRecuperar.focus();
		return false;
	}
	if (atpon>=tam1 || atpos<2 || atpon<2){
		alert("Email inv\u00e1lido.");
		formRecuperarSenha.emailRecuperar.focus();
		return false;
	}
	return true;
	
}