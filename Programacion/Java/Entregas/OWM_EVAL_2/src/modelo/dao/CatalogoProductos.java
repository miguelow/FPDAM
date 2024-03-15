package modelo.dao;

import java.util.ArrayList;

import modelo.javabeans.Familia;
import modelo.javabeans.Producto;
import modelo.javabeans.Proveedor;

public class CatalogoProductos implements IntCatalogo {
	private ArrayList<Producto> lista;

	public CatalogoProductos() {
		lista = new ArrayList<Producto>();
		cargarDatos();
	}

	private void cargarDatos() {
		Proveedor prov1 = new Proveedor("cif1", "Materiales limpieza Perez", "Limpieza y reparaciones",
				"materialesperez@gmail.com", "España");
		Familia fam1 = new Familia(1, "Limpieza");
		Proveedor prov2 = new Proveedor("cif2", "Materiales Guadarrama", "Materiales construcción",
				"materialesguadarrama@gmail.com", "España");
		Familia fam2 = new Familia(2, "Materiales");
		Producto prod1 = new Producto(1, "Limpiador multisusos baño y cocina", "Limpieza", "Pato", 20, fam1, prov1);
		Producto prod2 = new Producto(2, "Limpiador exteriores", "Limpieza", "Bosque Limpio", 200, fam1, prov1);
		Producto prod3 = new Producto(3, "Reparador de juntas", "Reparación", "Bosque Limpio", 100, fam1, prov1);
		Producto prod4 = new Producto(4, "Limpiador coches", "Limpieza", "Paro", 15, fam1, prov1);
		Producto prod5 = new Producto(5, "Cemento liso", "Cemento", "Leroy Merlin", 300, fam2, prov2);
		Producto prod6 = new Producto(6, "Piedras pequeñas exteriores", "Piedras", "Leroy Merlin", 2, fam2, prov2);
		lista.add(prod1);
		lista.add(prod2);
		lista.add(prod3);
		lista.add(prod4);
		lista.add(prod5);
		lista.add(prod6);
	}

	@Override
	public boolean altaProducto(Producto producto) {
		if (lista.contains(producto))
			return false;
		else
			return lista.add(producto);
	}

	@Override
	public boolean eliminarProducto(long idProducto) {
		Producto producto = buscarUno(idProducto);
		if (producto != null)
			return lista.remove(producto);
		else
			return false;
	}

	@Override
	public boolean modificarProducto(Producto producto) {
		int pos = lista.indexOf(producto);
		if (pos != -1) {
			lista.set(pos, producto);
			return true;
		} else
			return false;
	}

	@Override
	public Producto buscarUno(long idProducto) {
		for (Producto ele : lista) {
			if (ele.getIdProducto() == idProducto)
				return ele;
		}
		return null;
	}

	@Override
	public ArrayList<Producto> buscarTodos() {
		return lista;
	}

	@Override
	public ArrayList<Producto> buscarPorFamilia(int idFamilia) {
		ArrayList<Producto> aux = new ArrayList<Producto>();
		for (Producto producto : lista) {
			if (producto.getFamilia().getIdFamilia() == idFamilia)
				aux.add(producto);
		}
		return aux;
	}

	@Override
	public ArrayList<Producto> buscarPorPrecioMayorQue(double precio) {
		ArrayList<Producto> aux = new ArrayList<Producto>();
		for (Producto producto : lista) {
			if (producto.getPrecio() > precio)
				aux.add(producto);
		}
		return aux;
	}

	@Override
	public ArrayList<Producto> buscarDescripcionLarga(String subCadena) {
		ArrayList<Producto> aux = new ArrayList<Producto>();
		for (Producto producto : lista) {
			if (producto.getDescripcionLarga().contains(subCadena))
				aux.add(producto);
		}
		return aux;
	}

	@Override
	public ArrayList<Producto> productosPorProveedor(String cif) {
		ArrayList<Producto> aux = new ArrayList<Producto>();
		for (Producto producto : lista) {
			if (producto.getProveedor().getCif().equalsIgnoreCase(cif))
				aux.add(producto);
		}
		return aux;
	}
}
