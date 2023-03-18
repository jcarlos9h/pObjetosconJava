package clase3;
// estamos creando un instrumento
public class Instrumento { // definimos los atributos del objeto que queremos crear en este caso instrumento

    private String material;

    private String tipo;

    private int tamanio;

    // generamos un constructor

    public Instrumento(String material, String tipo, int tamanio) {
        this.material = material;
        this.tipo = tipo;
        this.tamanio = tamanio;
    }


// generamos un constructor vacio

    public  Instrumento (){

    }

    // Generamos los metodos geter and setters
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
    // modelamos un metodo propio de la clase

    public void sonar (){
        System.out.println("estoy sonando :D");
    }
}
