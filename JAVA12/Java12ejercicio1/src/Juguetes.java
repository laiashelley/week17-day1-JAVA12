public class Juguetes {
    
    private String nombre;
    private double precio;
    private Dimensiones dimensiones;
    private Envio precioEnvio;
    
    //dimensiones (ancho, alto, profundidad)

    public Juguetes() {
    }

    public Juguetes(String nombre, double precio, Dimensiones dimensiones, Envio precioEnvio) {
        this.nombre = nombre;
        this.precio = precio;
        this.dimensiones = dimensiones;
        this.precioEnvio = precioEnvio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Dimensiones getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(Dimensiones dimensiones) {
        this.dimensiones = dimensiones;
    }

    public Envio getPrecioEnvio() {
        return precioEnvio;
    }

    public void setPrecioEnvio(Envio precioEnvio) {
        this.precioEnvio = precioEnvio;
    }

    @Override
    public String toString() {
        return
            "Nombre: " + getNombre() + "; " +
            "Precio: " + getPrecio() + "; " +
            "Dimensiones: " + dimensiones + "; " + "Coste envio: " + precioEnvio.getCosteEnvioTotal() + "€.";
    }
        
}