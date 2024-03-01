
package Habitaciones;


public class MainPrueba {
     public static void main(String[] args) {
        Hotel hotel = new Hotel();
     

        System.out.println("Habitaciones individuales disponibles: " + hotel.obtenerIndividualesDisponibles());
        System.out.println("Habitaciones para parejas disponibles: " + hotel.obtenerParejasDisponibles());
        System.out.println("Habitaciones de matrimonio disponibles: " + hotel.obtenerMatrimonioDisponibles());
        System.out.println("Habitaciones familiares disponibles: " + hotel.obtenerFamiliaresDisponibles());

      
        Habitacion habitacionIndividual = new Habitacion("Individual", 1);
        habitacionIndividual.setToallas(3);
        habitacionIndividual.setSabanas(2);
        habitacionIndividual.setMuebles(3);
        

        System.out.println("Inventario de cada una de las habitaciones Individuales:");
        System.out.println("Toallas: " + habitacionIndividual.getToallas());
        System.out.println("Sábanas: " + habitacionIndividual.getSabanas());
        System.out.println("Muebles: " + habitacionIndividual.getMuebles());
        
        Habitacion habitacionPareja = new Habitacion("Pareja", 1);
        habitacionPareja.setToallas(6);
        habitacionPareja.setSabanas(4);
        habitacionPareja.setMuebles(6);
        

        System.out.println("Inventario de cada una de las habitaciones Parejas:");
        System.out.println("Toallas: " + habitacionPareja.getToallas());
        System.out.println("Sábanas: " + habitacionPareja.getSabanas());
        System.out.println("Muebles: " + habitacionPareja.getMuebles());
        
        Habitacion habitacionMatrimonio = new Habitacion("Matrimonio", 1);
        habitacionMatrimonio.setToallas(6);
        habitacionMatrimonio.setSabanas(4);
        habitacionMatrimonio.setMuebles(6);
        

        System.out.println("Inventario de cada una de las habitaciones Matrimonio:");
        System.out.println("Toallas: " + habitacionMatrimonio.getToallas());
        System.out.println("Sábanas: " + habitacionMatrimonio.getSabanas());
        System.out.println("Muebles: " + habitacionMatrimonio.getMuebles());
        
        Habitacion habitacionFamiliar = new Habitacion("Familiar", 1);
        habitacionFamiliar.setToallas(12);
        habitacionFamiliar.setSabanas(8);
        habitacionFamiliar.setMuebles(6);
        

        System.out.println("Inventario de cada una de las habitaciones Familiares:");
        System.out.println("Toallas: " + habitacionFamiliar.getToallas());
        System.out.println("Sábanas: " + habitacionFamiliar.getSabanas());
        System.out.println("Muebles: " + habitacionFamiliar.getMuebles());
    }
}
