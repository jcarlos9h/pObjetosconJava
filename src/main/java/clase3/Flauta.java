package clase3;

public class Flauta extends Instrumento {
    private int canHuecos;

    public Flauta(String material, String tipo, int tamanio, int canHuecos) {
        super(material, tipo, tamanio);
        this.canHuecos = canHuecos;
    }

    public Flauta(int canHuecos) {
        this.canHuecos = canHuecos;
    }

    public Flauta() {
    }

    public int getCanHuecos() {
        return canHuecos;
    }

    public void setCanHuecos(int canHuecos) {
        this.canHuecos = canHuecos;
    }

    @Override

    public void sonar(){
        System.out.println(" Estoy sonando como una flauta ");
    }
}
