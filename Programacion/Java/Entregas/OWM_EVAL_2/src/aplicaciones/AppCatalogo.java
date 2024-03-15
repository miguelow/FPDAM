package aplicaciones;

import java.util.Scanner;

import modelo.dao.CatalogoProductos;
import modelo.javabeans.Producto;

public class AppCatalogo {
	private static Scanner leer;
	private static CatalogoProductos cdao;

	static {
		leer = new Scanner(System.in);
		cdao = new CatalogoProductos();
	}

	public static void main(String[] args) {
		int opcion = 0;

		do {
			opcion = pintarmenu();
			if (opcion == 6)
				break;
			switch (opcion) {
				case 1:
					procPorFamilia();
					break;
				case 2:
					procPorProveedor();
					break;
				case 3:
					procPrecioMayor();
					break;
				case 4:
					procDescripcion();
					break;

				case 5:
					procAElegir();
					break;

			}

		} while (opcion >= 1 && opcion <= 6);

		System.out.println("fin de programa");
	}

	public static void procPorFamilia() {
		System.out.println("Listado de productos con idFamilia = 1");
		for (Producto prod : cdao.buscarPorFamilia(1)) {
			System.out.println(prod.getDescripcionLarga() + " con idProducto = " + prod.getIdProducto());
		}
	}

	public static void procPorProveedor() {
		System.out.println("Listado de productos con idProveedor = 1");
		for (Producto prod : cdao.productosPorProveedor("cif1")) {
			System.out.println(prod.getDescripcionLarga() + " con idProducto = " + prod.getIdProducto());
		}
	}

	public static void procPrecioMayor() {
		System.out.println("Listado de productos con un precio mayor que 100 euros");
		for (Producto prod : cdao.buscarPorPrecioMayorQue(100)) {
			System.out.println(prod.getDescripcionLarga() + " con un precio de = " + prod.getPrecio() + " euros ");
		}
	}

	public static void procDescripcion() {
		System.out.println("Listado de productos cuya descripcion contiene la palabra Limpia");
		for (Producto prod : cdao.buscarDescripcionLarga("Limpia")) {
			System.out.println(prod.getDescripcionLarga() + " del proveedor =  " + prod.getProveedor().getNombre());
		}
	}

	public static void procAElegir() {
		System.out.println("Prueba e1limar producto con idProducto = 1");
		System.out.println("Numero de productos antes de eliminar " + cdao.buscarTodos().size());
		System.out.println("Estado de proceso de eliminado " + cdao.eliminarProducto(1));
		System.out.println("Numero de productos después de eliminar " + cdao.buscarTodos().size());
		System.out.println("¿El producto con idProducto = 1 se encuentra en la lista? " + cdao.buscarUno(1));
	}

	public static int pintarmenu() {
		int opcion = 0;
		System.out.println("1.- Listar Productos de una Familia");
		System.out.println("2.- Listar Productos de un Proveedor");
		System.out.println("3.- Listar productos por Precio mayor");
		System.out.println("4.- Listar Productos por palabra en descripción larga");
		System.out.println("5.- Prueba eliminado producto");
		System.out.println("6.- Salir");
		System.out.println("teclee opcion 1 a 5, 6 salir");
		opcion = leer.nextInt();

		while (opcion < 1 || opcion > 6) {
			System.out.println("opcion incorrecta");
			opcion = leer.nextInt();
		}

		return opcion;

	}

}
