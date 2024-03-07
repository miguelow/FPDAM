Algoritmo sin_titulo
	//Leer un número detrás de otro mientras que el número 
	//leído sea distinto de cero. Al final del
	//proceso mostrar cuantos números válidos he leído, 
	//y cuanto suman las cantidades de los números
	//introducidos, y cual es la media de los números leídos.
	
	//Definimos las variables
	Definir numeroLeido, cuantosLeidos, sumatorio Como Entero;
	
	//Inicializar a un valor por defecto
	numeroLeido = 0; cuantosLeidos = 0; sumatorio = 0;
	
	//Leer el primer numeroLeido
	Escribir "Dame un numero, teclee 0 para salir";
	Leer numeroLeido;
	
	Mientras numeroLeido <> 0 Hacer
		cuantosLeidos = cuantosLeidos + 1;
		sumatorio = sumatorio + numeroLeido;
		Leer numeroLeido;
	FinMientras
	
	
	//termine, escribo estadísticas
	Escribir "numeros procesados : " cuantosLeidos;
	Escribir "sumatorio  numeros leidos: " sumatorio;
	Escribir "la media es : " sumatorio / cuantosLeidos;
FinAlgoritmo
