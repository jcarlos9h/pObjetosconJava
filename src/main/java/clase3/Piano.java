package clase3;

public class Piano extends Instrumento {

    private int canTeclas;
    private String marca;

    public Piano(String material, String tipo, int tamanio, int canTeclas, String marca) {
        super(material, tipo, tamanio);
        this.canTeclas = canTeclas;
        this.marca = marca;
    }

    public Piano(int canTeclas, String marca) {
        this.canTeclas = canTeclas;
        this.marca = marca;
    }

    public Piano() {
    }

    public int getCanTeclas() {
        return canTeclas;
    }

    public void setCanTeclas(int canTeclas) {
        this.canTeclas = canTeclas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
public void sonar(){
        System.out.println("Estoy sonando como un piano");
    }

}
