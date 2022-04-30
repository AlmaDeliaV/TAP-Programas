
package JerarquiaHerencia;

public class ClassRevista extends Periodicidad {
    private String ISNN;
    private int numero;
    private int year;

    public String getISNN() {
        return ISNN;
    }

    public int getNumero() {
        return numero;
    }

    public int getYear() {
        return year;
    }

    public void setISNN(String ISNN) {
        this.ISNN = ISNN;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
}
