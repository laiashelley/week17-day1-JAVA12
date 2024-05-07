// Tienes una almacén de juguetes en la que cada juguete contiene estas características: nombre, precio y dimensiones (ancho, alto, profundidad) OK

// Existe el método calcularVolumen(), que es para los envíos, y que en un futuro se aplicará a otros productos que no sean juguetes (por lo tanto, no pertenece a la clase juguetes) OK

// Desde la clase principal, debes instanciar diversos juguetes, incluyéndole los tres valores de dimensión. Al final, deben imprimirse todas las propiedades del juguete, incluyendo las del envío (volumen) OK

// ¿Cómo imprimirías todos los juguetes con salto de linea entre ellos? Cómo guardarías aparte este método de visualizar todo el arraylist de juguetes para poder llamarlo cuando quieras, sin repetir código? OK

// + EXTRA: añadir precio envío según volumen y sumárselo al precio del juguete (tramos de precio según volumen).

// ++ EXTRA DIFICIL: poner el método calcular volumen en una clase llamada Dimensión (ancho, alto, profundidad). En la clase del juguete, dejar solo nombre, precio y dimensión (tipo de dato: Dimension). OK

import java.util.ArrayList;

public class Java12ejercicio1 {
    public static void main(String[] args) throws Exception {
        
        Dimensiones dimensionesJuguete1 = new Dimensiones(13.9, 239, 102);
        Dimensiones dimensionesJuguete2 = new Dimensiones(260, 390, 104);
        Dimensiones dimensionesJuguete3 = new Dimensiones(276, 333, 78);
        Dimensiones dimensionesJuguete4 = new Dimensiones(49, 298, 117);

        double costeEnvio100 = 0.05; // 0.05 € por cada 100 cm3

        double volumenJuguete1 = dimensionesJuguete1.calcularVolumen();
        double volumenJuguete2 = dimensionesJuguete2.calcularVolumen();
        double volumenJuguete3 = dimensionesJuguete3.calcularVolumen();
        double volumenJuguete4 = dimensionesJuguete4.calcularVolumen();

        Envio costeEnvioJuguete1 = new Envio(costeEnvio100, Envio.calcularEnvioTotal(volumenJuguete1, costeEnvio100), volumenJuguete1);
        Envio costeEnvioJuguete2 = new Envio(costeEnvio100, Envio.calcularEnvioTotal(volumenJuguete2, costeEnvio100), volumenJuguete2);
        Envio costeEnvioJuguete3 = new Envio(costeEnvio100, Envio.calcularEnvioTotal(volumenJuguete3, costeEnvio100), volumenJuguete3);
        Envio costeEnvioJuguete4 = new Envio(costeEnvio100, Envio.calcularEnvioTotal(volumenJuguete4, costeEnvio100), volumenJuguete4);

        Juguetes juguete1 = new Juguetes("Nintendo Switch", 299, dimensionesJuguete1, costeEnvioJuguete1);
        Juguetes juguete2 = new Juguetes("PlayStation 5", 399, dimensionesJuguete2, costeEnvioJuguete2);
        Juguetes juguete3 = new Juguetes("XBOX One", 299, dimensionesJuguete3, costeEnvioJuguete3);
        Juguetes juguete4 = new Juguetes("Steam Deck", 399, dimensionesJuguete4, costeEnvioJuguete4);

        ArrayList <Juguetes> juguetesArray = new ArrayList<>();

        juguetesArray.add(juguete1);
        juguetesArray.add(juguete2);
        juguetesArray.add(juguete3);
        juguetesArray.add(juguete4);

        System.out.println(juguetesArray);

        imprimirJuguetes(juguetesArray);

    }
    
    public static void imprimirJuguetes (ArrayList<Juguetes> juguetes){

        for (Juguetes juguete : juguetes){
            System.out.println(juguete);
            System.out.println();
        }

    }

}
