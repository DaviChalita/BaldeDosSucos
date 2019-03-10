function validaCadastro(){
	var email = formCadastro.cadastroEmail.value;
	var atpos = email.indexOf("@");
	var atpon = email.indexOf(".");
	var tam = email.length;
	var tam1 = tam-2;
	var tamanhoCadastroLogin = formCadastro.cadastroLogin.value.length;
	var tamanhocadastroSenha = formCadastro.cadastroSenha.value.length;
	
	/* Verificando nome de usuário */
	if (formCadastro.cadastroLogin.value == ""){
		alert("O nome de usu\u00e1rio n\u00e3o pode ficar em branco.");
		formCadastro.cadastroLogin.focus();
		return false;
	}
	if (tamanhoCadastroLogin<5){
		alert("O nome de su\u00e1rio deve possuir no m\u00ednimo 5 caracteres.");
		formCadastro.cadastroLogin.focus();
		return false;
	}
	
	/* Verificando senha */
	if (formCadastro.cadastroSenha.value == ""){
		alert("A senha n\u00e3o pode ficar em branco.");
		formCadastro.cadastroSenha.focus();
		return false;
	}
	if (tamanhocadastroSenha<5){
		alert("A senha deve possuir no m\u00ednimo 5 caracteres.");
		formCadastro.cadastroSenha.focus();
		return false;
	}
	
	/* Verificando confirmação de senha */
	if (formCadastro.cadastroSenha.value != formCadastro.cadastroConfirmaSenha.value){
		alert("As senhas n\u00e3o conferem.");
		formCadastro.cadastroSenha.focus();
		return false;
	}
	
	/* Verificando email */
	if (formCadastro.cadastroEmail.value==""){
		alert("O email n\u00e3o pode ficar em branco.");
		formCadastro.cadastroEmail.focus();
		return false;
	}
	if (atpon>=tam1 || atpos<2 || atpon<2){
		alert("Email inv\u00e1lido.");
		formCadastro.cadastroEmail.focus();
		return false;
	}
	return true;
	
}