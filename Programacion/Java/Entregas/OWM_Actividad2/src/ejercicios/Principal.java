package ejercicios;
public class Principal {
    public static void main(String[] args) {

        Fiesta fiesta1 = new Fiesta("Cumpleaños", "2023-10-10 14:00", "Calle Burgos, Alcobendas 28291", 10, 20, 10);
        Fiesta fiesta2 = new Fiesta();

        fiesta1.invitar();
        fiesta1.invitar();
        fiesta1.cancelarInvitacion();
        
        fiesta2.invitar();
        fiesta2.invitar();
        fiesta2.cancelarInvitacion();
        
        System.out.println("Información de la fiesta 1 creada con el constructor con parametros:\n" + fiesta1.toString());
        System.out.println("\nDesglose del precio fiesta 1:\n" + 
        		fiesta1.getInvitados() + " * 5 euros el invitado\n" + 
        		fiesta1.getBebidas() + " * 2 euros la bebida\n" + 
        		fiesta1.getBocadillos() + " * 3 euros por bocadillo\n" + 
        		"------------------\n" + 
        		fiesta1.precioFiesta() + " euros"
        );
        

        System.out.println("\nInformación de la fiesta 2 creada con el constructor sin parametros:\n" + fiesta2.toString());
        System.out.println("\nDesglose del precio fiesta 2:\n" + 
        		fiesta2.getInvitados() + " * 5 euros el invitado\n" + 
        		fiesta2.getBebidas() + " * 2 euros la bebida\n" + 
        		fiesta2.getBocadillos() + " * 3 euros por bocadillo\n" + 
        		"------------------\n" + 
        		fiesta2.precioFiesta() + " euros"
        );

       
    }
}