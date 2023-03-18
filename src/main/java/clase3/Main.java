package clase3;

public class Main {
    public static void main(String[] args) {
       // creamos los objetos

        /* creamos el instrumento 1 llamamos a la clase instrumento  colocamos en nombre del instrumento que queremos crear
        luego usamos new llamamos de nuevo a la clase instrumento y listo  */
        Instrumento in= new Instrumento();

        Instrumento in2=new Instrumento("madera", "viento", 20 ); // aca pasamos los atributos de la clase instrumento

        in.sonar();
        in2.sonar();
        // definimos una guitarra.

        Guitarra guitar =new Guitarra();
        Guitarra guitar2 =new Guitarra( "madera", "nacional", 110, 5, "acustica");

        System.out.println(guitar2.getCanCuerdas() + " cuerdas");
        guitar2.sonar();

        Piano pia=new Piano(20, "pioner");

        pia.sonar();
        System.out.println(" Y estoy compuesto de " + pia.getCanTeclas() + " Teclas");

        Flauta fla=new Flauta(10);
        fla.sonar();
        System.out.println("y tengo " + fla.getCanHuecos() + " huecos");
    }

}