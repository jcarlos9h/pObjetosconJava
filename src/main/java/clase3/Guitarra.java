package clase3;
// giutarra es una subclase de instrumento
// creo la clase guitarra, para tener el objeto guitarra
public class Guitarra extends Instrumento { // con la pabalra extends definimos a guitarra como subclase de instrumento
    // definimos los atributos propios de guitarra

    private int canCuerdas;
    private String tipoGuitarra;

    public Guitarra(String material, String tipo, int tamanio, int canCuerdas, String tipoGuitarra) {
        super(material, tipo, tamanio);
        this.canCuerdas = canCuerdas;
        this.tipoGuitarra = tipoGuitarra;
    }

    public Guitarra(int canCuerdas, String tipoGuitarra) {
        this.canCuerdas = canCuerdas;
        this.tipoGuitarra = tipoGuitarra;
    }

    public Guitarra() { // constructor vacio
    }

    // Generar geters y seters para poder acceder a los atributos de la clase padre


    public int getCanCuerdas() {
        return canCuerdas;
    }

    public void setCanCuerdas(int canCuerdas) {
        this.canCuerdas = canCuerdas;
    }

    public String getTipoGuitarra() {
        return tipoGuitarra;
    }

    public void setTipoGuitarra(String tipoGuitarra) {
        this.tipoGuitarra = tipoGuitarra;
    }

    /* sobreescribimos el metodo sonar de la clase padre instrumento y lo hacemos
    sonar como una guitarra */

    @Override

    public void sonar(){
        System.out.println("Estoy sonando como una guitarra");
    }
}
