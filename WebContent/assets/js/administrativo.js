$(document).ready(function() {
	
	$.validate({
		 lang : 'pt',
		  modules : 'brazil',
		  modules : 'date'
		  
		});
	
	
	$("#formulario_voo").submit(function(event) {
		
		if( $("#formulario_voo select[name=origem]").val() == $("#formulario_voo select[name=destino]").val()  ){
		 
			swal("Alerta","Origem não pode ser igual à destino!","warning");
			event.preventDefault();
		}else{
		   return;
		}
		
		
	
	});
});