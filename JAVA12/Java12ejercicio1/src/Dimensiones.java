public class Dimensiones {

    private double profundidad;
    private double ancho;
    private double alto;

    public Dimensiones() {
    }

    public Dimensiones(double profundidad, double ancho, double alto) {
        this.profundidad = profundidad;
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getProfundidad() {
        return this.profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    public double getAncho() {
        return this.ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return this.alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    public String toString() {
        return 
        getProfundidad() + "x" + getAncho() + "x" + getAlto();
    }

    public double calcularVolumen(){

        return getProfundidad()*getAncho()*getAlto();

    }

}
