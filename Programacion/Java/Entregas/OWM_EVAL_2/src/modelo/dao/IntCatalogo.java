package modelo.dao;

import java.util.ArrayList;

import modelo.javabeans.Producto;

public interface IntCatalogo {
	boolean altaProducto(Producto producto);

	boolean eliminarProducto(long idProducto);

	boolean modificarProducto(Producto producto);

	Producto buscarUno(long idProducto);

	ArrayList<Producto> buscarTodos();

	ArrayList<Producto> buscarPorFamilia(int idFamilia);

	ArrayList<Producto> buscarPorPrecioMayorQue(double precio);

	ArrayList<Producto> buscarDescripcionLarga(String subCadena);

	ArrayList<Producto> productosPorProveedor(String cif);
}
