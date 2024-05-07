public class Envio {
    
    // Existe el método calcularVolumen(), que es para los envíos, y que en un futuro se aplicará a otros productos que no sean juguetes 
    // (por lo tanto, no pertenece a la clase juguetes)

    // Volumen = ancho x alto x profundidad
    // coste del envio = volumen/100 x 0.05

    private double costeEnvio100;
    private double costeEnvioTotal;
    private double volumen;

    public Envio() {
    }

    public Envio(double costeEnvio100, double costeEnvioTotal, double volumen) {
        this.costeEnvio100 = costeEnvio100;
        this.costeEnvioTotal = costeEnvioTotal;
        this.volumen = volumen;
    }

    public double getCosteEnvio100() {
        return this.costeEnvio100;
    }

    public void setCosteEnvio100(double costeEnvio100) {
        this.costeEnvio100 = costeEnvio100;
    }

    public double getCosteEnvioTotal() {
        return this.costeEnvioTotal;
    }

    public void setCosteEnvioTotal(double costeEnvioTotal) {
        this.costeEnvioTotal = costeEnvioTotal;
    }

    public double getVolumen() {
        return this.volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    @Override
    public String toString() {
        return "Coste del envio total: " + getCosteEnvioTotal() + "€.";
    }

    public static double calcularEnvioTotal(double volumen, double costeEnvio100){
        return (volumen/100)*costeEnvio100;
    }

}