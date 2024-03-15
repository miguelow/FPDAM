#!/bin/bash

mostrar_menu() {
    echo "Menú"
    echo "----"
    echo "1. Indicar el nombre del script"
    echo "2. Indicar el nombre del archivo pasado como parámetro"
    echo "3. Mostrar por pantalla el contenido del archivo pasado como parámetro"
    echo "4. Copiar el archivo pasado como parámetro a una nueva carpeta llamada almacén"
    echo "5. Salir"
}

indicar_nombre_script() {
    echo "El nombre del script es: $0"
}

indicar_nombre_archivo() {
    echo "El nombre del archivo pasado como parámetro es: $1"
}

mostrar_contenido_archivo() {
    echo "Contenido del archivo $1:"
    cat "$1"
}

copiar_archivo_a_carpeta_almacen() {
    if [ ! -d "almacén" ]; then
        mkdir almacén
    fi
    cp "$1" almacén/
    echo "El archivo $1 ha sido copiado a la carpeta almacén."
}

if [ $# -ne 1 ]; then
    echo "Uso: $0 /Users/miguelow/Desktop/pruebas/test.txt"
    exit 1
fi

while true; do
    mostrar_menu
    read -p "Elija una opción del 1 al 5 incluidos: " opcion
    case $opcion in
        1) indicar_nombre_script ;;
        2) indicar_nombre_archivo "$1" ;;
        3) mostrar_contenido_archivo "$1" ;;
        4) copiar_archivo_a_carpeta_almacen "$1" ;;
        5) echo "Saliendo del menú" && break ;;
        *) echo "Opción no válida, elija del 1-5 incluidos" ;;
    esac
done
