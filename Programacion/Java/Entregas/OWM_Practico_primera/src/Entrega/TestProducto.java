package Entrega;

public class TestProducto {

    public static void main(String[] args) {
    	
        // Apartado f
        Producto productoVacio1 = new Producto();
        productoVacio1.setNumeroProducto(1);
        productoVacio1.setDescripcion("Producto Vacío");
        productoVacio1.setPrecioUnitario(100.0);
        productoVacio1.setCantidadStock(2);
        productoVacio1.setTalla("M");
        productoVacio1.setColor("Fuxia");

        System.out.println("Producto vacío 1:\n" + productoVacio1);
        
        Producto productoConTodo1 = new Producto(2, "Producto con todo 1", 25.0, 30, "L", "Azul a rayas blancas");

        System.out.println("\nProducto con todo 1:\n" + productoConTodo1);

        // Apartado g
        
        System.out.println("\nPruebas métodos propios con el producto con todo 1:");
        System.out.println("Precio con IVA (23%): " + productoConTodo1.precioConIva(23));
        productoConTodo1.aumentarStock(10);
        System.out.println("Stock después de aumentar: " + productoConTodo1.getCantidadStock());
        System.out.println("Disminuir stock (éxito): " + productoConTodo1.disminuirStock(5));
        System.out.println("Stock después de disminuir: " + productoConTodo1.getCantidadStock());

        // Apartado h
        
        Producto[] productos = {
                new Producto(3, "Producto XS", 20.0, 15, "XS", "Negro"),
                new Producto(4, "Producto S", 30.0, 20, "S", "Blanco"),
                new Producto(5, "Producto XXL", 40.0, 25, "XXL", "Gris con puntos blancos")
        };

        System.out.println("\nPrueba de precios aplicados según talla:");
        for (Producto producto : productos) {
            System.out.println(
            		"Numero de producto: " + 
            		producto.getNumeroProducto() + 
            		" con descripcion: " + 
            		producto.getDescripcion() + 
            		" tiene un precio de " + 
            		producto.precioAplicado() + 
            		" euros "
            		);
        }
    }
}

