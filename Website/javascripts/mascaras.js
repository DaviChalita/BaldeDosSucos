jQuery(function($){
		
	  /*$("#ID").mask('Máscara', {'translation': { CaractereMáscara: {pattern: /[ValorInício-ValorFinal]/} } }) */
		
       $("#cep").mask('99999999', {'translation': { 9: {pattern: /[0-9]/} } });
	   
       $("#telefone").mask('99999999999', {'translation': { 9: {pattern: /[0-9]/} } });
	   
	   $("#numero").mask('99999999', {'translation': { 9: {pattern: /[0-9]/} } });
	   
	   $("#estado").mask('AA', {'translation': { A: {pattern: /[A-Za-z]/} } });
});