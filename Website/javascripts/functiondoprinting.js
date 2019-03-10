function DoPrinting(){
if (!window.print){
alert("Seu navegador n\u00e3o suporta essa fun\u00e7\u00e3oo, \n por favor tente o Google Chrome/Internet Explorer \n em versões mais atualizadas.");
return false;
}
window.print()
}