Algoritmo sin_titulo
	//Leer consecutivamente dos números cada vez, hasta que los dos sean -1. Comparar los dos
	//números leídos e informar cada vez si son iguales, mayor o menor (el primero respecto al
	//segundo). Al final del proceso informar cuantas veces los números eran iguales, cuantas veces el
	//primero era mayor del segundo y cuantas veces el primero era menor del segundo número leído.
	
	//Definimos las variables
	Definir numero1, numero2, num1Mayornum2, numIguales, num2MayorNum1 Como Entero
	//Inicializamos las variables
	numero1 = 0; numero2 = 0; num1Mayornum2 = 0; numIguales = 0; num2MayorNum1 = 0;
	Escribir "Introduce 2 numeros, para salir ambos deben ser -1";
	Leer numero1; Leer numero2;
	
	Mientras numero1 <> 0 O numero2 <> 0 Hacer
		Si numero1 > numero2 Entonces
			Escribir "Primer numero mayor que el segundo"
			num1Mayornum2 = num1Mayornum2 + 1;
		SiNo
			Si numero2 > numero1 Entonces
				Escribir  "Segundo numero mayor que primer numero"
				num2MayorNum1 = num2MayorNum1 + 1;
			SiNo
				Escribir "Numeros iguales"
				numIguales = numIguales + 1;
			FinSi
		FinSi
		//Volvemos pedir los numeros volviendo a validar la condicion del bucle
		Leer numero1; Leer numero2;
	FinMientras
	
	Escribir "cuantas veces han sido iguales los numeros : ", numIguales;
	Escribir "cuantas veces ha sido mayor el primer numero: ", num1Mayornum2;
	Escribir "cuantas veces ha sido mayor el segundo numero: ", num2MayorNum1;	
	
FinAlgoritmo
