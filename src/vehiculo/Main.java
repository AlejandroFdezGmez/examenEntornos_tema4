package vehiculo;

/**
 *
 * @author Alejandro Fernández Gómez
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoAFG2223 miVehiculoAFG2223;
        int stockActual;
        
        miVehiculoAFG2223 = new VehiculoAFG2223("Seat",18000,100);
        operativaVehiculosAFG2223(miVehiculoAFG2223, miVehiculoAFG2223); 
        stockActual = miVehiculoAFG2223.obtenerStock();
        System.out.println("El stock actual es "+ stockActual );
    }

    private static void operativaVehiculosAFG2223(VehiculoAFG2223 miVehiculoAFG2223, VehiculoAFG2223 cantidad) {
        
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoAFG2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoAFG2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
    }
}