package vehiculo;

/**
 * 
 * @author Alejandro Fernández Gómez
 */
public class VehiculoAFG2223 {

    /**
     * @return el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre que es el nombre a cambiar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return el precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio que es el precio a cambiar
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return el precio con IVA
     */
    public double getPrecioIVA() {
        return precioIVA;
    }

    /**
     * @param precioIVA que es el precio con IVA a cambiar
     */
    public void setPrecioIVA(double precioIVA) {
        this.precioIVA = precioIVA;
    }

    /**
     * @return el stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock que es el stock a cambiar
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    private String nombre;
    private double precio;
    private double precioIVA;
    private int stock;

    /**
     * Constructor sin argumentos
     */
    public VehiculoAFG2223 ()
    {
    }
    
    /**
     * Constructor con los parámetros:
     * @param nom
     * @param precio
     * @param stock 
     */
    
    
    public VehiculoAFG2223 (String nom, double precio, int stock)
    {
        this.nombre =nom;
        this.precio=precio;
        this.stock=stock;
    }
    
    /**
     * Método que asigna un nombre y devuelve un void
     * @param nom 
     * @see setNombre
     */
    
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
    
    /**
     * Método para obtener un nombre 
     * @return el nombre en String
     * @see getNombre
     */
    
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     * Método para obtener el stock
     * @return el stock en int
     * @see getStock
     */
    
     public int obtenerStock ()
    {
        return getStock();
    }

    /**
     * Método para comprar un vehículo y modificar el stock
     * @param cantidad
     * @throws Exception 
     * @see setStock
     */
     
    public void comprar(int cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede comprar un nº negativo de vehiculos");
        setStock(getStock() + cantidad);
    }
    
    /**
     * Método para vender n vehículo y modifica el stock
     * @param cantidad
     * @throws Exception 
     * @see setStock
     */
    public void vender (int cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede vender una cantidad negativa de vehiculos");
        if (obtenerStock()< cantidad)
            throw new Exception ("No se hay suficientes vehiculos para vender");
        setStock(getStock() - cantidad);
    }
}  