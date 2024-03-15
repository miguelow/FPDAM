#!/bin/bash

# Función para mostrar el menú
mostrar_menu() {
    clear
    echo "Menú"
    echo "----"
    echo "1. Comprobar si un archivo de texto está vacío"
    echo "2. Comprobar si dos números son distintos"
    echo "3. Mostrar la ruta del directorio actual"
    echo "4. Salir"
    echo "----"
}

# Función para comprobar si un archivo de texto está vacío
comprobar_archivo_vacio() {
    local archivo=$1
    if [ -s "$archivo" ]; then
        echo "El archivo no está vacío."
    else
        echo "El archivo está vacío."
    fi
}

# Función para comprobar si dos números son distintos
comprobar_numeros_distintos() {
    read -p "Introduce el primer número: " num1
    read -p "Introduce el segundo número: " num2
    if [ $num1 -ne $num2 ]; then
        echo "Los números son distintos."
    else
        echo "Los números son iguales."
    fi
}

# Función para mostrar la ruta del directorio actual
mostrar_ruta_directorio() {
    echo "La ruta del directorio actual es: $(pwd)"
}

# Bucle principal
while true; do
    mostrar_menu
    read -p "Seleccione una opción: " opcion
    case $opcion in
        1)
            read -p "Introduce la ruta del archivo de texto: " archivo
            comprobar_archivo_vacio "$archivo"
            ;;
        2)
            comprobar_numeros_distintos
            ;;
        3)
            mostrar_ruta_directorio
            ;;
        4)
            echo "Saliendo..."
            exit 0
            ;;
        *)
            echo "Opción inválida. Por favor, seleccione una opción válida."
            ;;
    esac
    read -p "Presione Enter para continuar..."
done
