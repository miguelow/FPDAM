package Entrega;

public class Producto {

	// Apartado a
    private int numeroProducto;
    private String descripcion;
    private double precioUnitario;
    private int cantidadStock;
    private String talla;
    private String color;

 // Apartado b
    public Producto() {

    }

    public Producto(
    		int numeroProducto, 
    		String descripcion, 
    		double precioUnitario,
    		int cantidadStock, 
    		String talla, 
    		String color
    		) {
        this.numeroProducto = numeroProducto;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.cantidadStock = cantidadStock;
        this.talla = talla;
        this.color = color;
    }

    // Apartado c
    public int getNumeroProducto() {
        return numeroProducto;
    }

    public void setNumeroProducto(int numeroProducto) {
        this.numeroProducto = numeroProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "numeroProducto=" + numeroProducto +
                ", descripcion='" + descripcion + '\'' +
                ", precioUnitario=" + precioUnitario +
                ", cantidadStock=" + cantidadStock +
                ", talla='" + talla + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
    
    // Apartado d

    public double precioConIva(int iva) {
        return precioUnitario * (1 + (double) iva / 100);
    }

    public void aumentarStock(int cantidad) {
        cantidadStock += cantidad;
    }

    public boolean disminuirStock(int cantidad) {
        if ((cantidadStock - cantidad) < 0) {
            return false; 
        } else {
            cantidadStock -= cantidad;
            return true;
        }
    }

    public double precioAplicado() {
    	double incremento3Porciento = 1.03;
    	double incremento4Porciento = 1.04;
        switch (talla) {
            case "XS":
                return precioUnitario;
            case "S":
            case "M":
                return precioUnitario * incremento3Porciento;
            case "L":
            case "XL":
                return precioUnitario * incremento3Porciento; 
            case "XXL":
            case "XXXL":
                return precioUnitario * incremento4Porciento; 
            default:
                return precioUnitario; 
        }
    }
}