/*ENUNCIADO EJERCICIO 1 ACTIVIDAD 2
El proyecto contará con una clase llamada Fiesta con la siguiente estructura:

private String tipoFiesta;
private String direccion;
private int bocadillos;
private int bebidas;
private int invitados;
private String fecha;
private String hora;


Todas las propiedades serán  accesibles mediante métodos get/set.
La propiedad tipoFiesta indica el tipo de fiesta: infantil, cumpleaños, disfraces, etc.
La propiedad bocadillos contiene la cantidad de bocadillos que se comprarán para la fiesta. Lo mismo con las bebidas.
El ejercicio propone almacenar la fechaHora como String por simplificar el código. Si tienes ganas de investigar puedes probar a guardarlo como un objeto de la clase LocalDateTime.
Se creará un constructor, que recibirá por medio de parámetros el tipo, fechaHora, direccion, bebidas y bocadillos e invitados.
Se creará otro constructor que no reciba ningún parámetro.
El método toString() retornará una cadena con todos los datos de la fiesta, ponlo en la clase.
El método invitar() sumará 1 al contador de invitados.
El método cancelarInvitación() restará 1 al contador de invitados.
El método precioFiesta() retornará el precio de la fiesta calculado de la siguiente forma: 5 euros por cada invitado, 2 euros por cada bebida y 3 euros por cada bocadillo.
Crea una clase Principal (con método main) donde crearás varios objetos de la clase Fiesta utilizando varios constructores distintos. Pon en práctica todos los métodos que has creado (invitar, toString(), cancelarInvitación y precioFiesta).
 */
package ejercicios;


public class Fiesta {
	
    private String tipoFiesta;
    private String direccion;
    private int bocadillos;
    private int bebidas;
    private int invitados;
    private String fechaHora;

    //Constructor con parámetros
    public Fiesta(
    		String tipoFiesta, 
    		String fechaHora, 
    		String direccion, 
    		int bebidas,
    		int bocadillos, 
    		int invitados) {
    	super();
        this.tipoFiesta = tipoFiesta;
        this.fechaHora = fechaHora;
        this.direccion = direccion;
        this.bebidas = bebidas;
        this.bocadillos = bocadillos;
        this.invitados = invitados;
    }

    //Constructor sin parámetros
    public Fiesta() {
      
    }

    //Métodos get y set
    public String getTipoFiesta() {
        return tipoFiesta;
    }
    
    public void setTipoFiesta(String tipoFiesta) {
        this.tipoFiesta = tipoFiesta;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getBocadillos() {
        return bocadillos;
    }

    public void setBocadillos(int bocadillos) {
        this.bocadillos = bocadillos;
    }

    public int getBebidas() {
        return bebidas;
    }

    public void setBebidas(int bebidas) {
        this.bebidas = bebidas;
    }

    public int getInvitados() {
        return invitados;
    }

    public void setInvitados(int invitados) {
        this.invitados = invitados;
    }

    public String fechaHora() {
        return fechaHora;
    }

    public void fechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    // Método toString
    @Override
    public String toString() {
        return "Fiesta [tipoFiesta=" + tipoFiesta + ", direccion=" + direccion + ", bocadillos=" + bocadillos
                + ", bebidas=" + bebidas + ", invitados=" + invitados + ", fechaHora=" + fechaHora + "]";
    }

    // Métodos propios
    public void invitar() {
        invitados++;
    }

    public void cancelarInvitacion() {
        if (invitados > 0) {
            invitados--;
        }else {
        	System.out.println("No hay más invitados en la lista");
        }
    }

    public double precioFiesta() {
        return (5 * invitados) + (2 * bebidas) + (3 * bocadillos);
    }
}

