#!/bin/bash


#Para asignar valores a las variables, NO HAY ESPACIO
ruta="/home/javier/Desktop/"
archivo="resultados.txt"


#FUNCIONAMIENTO DEL OPERADOR > y >>
#Este operador redirecciona la salida del comando al archivo de destino. 
#Entonces, lo que sea que debería suceder en consola, sucede en la ruta de destino.

#> se encarga de crear si no existe y sobreescribe si ya existe.
#>> va a añadir a la última línea.

while true
do

echo "Turno de jugador 1"
read jugador1
clear

echo "Turno de jugador 2"
read jugador2
clear

if [ $jugador1 = "tijeras" ] && [ $jugador2 = "papel" ]
	then
	resultado=" -----Jugador 1 ha ganado"
	echo "El operador >> se encargará de añadir una nueva línea con los resultados al archivo especificado en la ruta"
	
	echo $resultado >> $ruta$archivo

elif [ $jugador2 = "tijeras" ] && [ $jugador1 = "papel" ]
	then
	resultado="------Jugador 2 ha ganado"
	
	echo 'Recuerda que para concatenar variables lo haremos así: $variable1$variable2. Las comillas simples hacen que el símbolo $ se trate como un String'
	echo $resultado >> $ruta$archivo

elif [ $jugador1 = "q" ] || [ $jugador2 = "q" ]
	then
		echo "Adiós"
		sleep 2
		exit 0

else 
	resultado="Empate. Como hemos usado el operador '>', ahora se 	nos va a sobreescribir el archivo y van a desaparecer los datos previos."
	echo $resultado
	echo $resultado > $ruta$archivo
	echo "Y ahora vamos a añadir la ruta con ls" > $ruta$archivo
	ls $ruta >> $ruta$archivo 

fi

done

