public class Piso extends Casa{
    private int nPlanta;
    private int balcones;

    public Piso(int nVentanas, int nPuertas, String color, int nPlanta, int balcones) {
        super(nVentanas, nPuertas, color);
        this.nPlanta = nPlanta;
        this.balcones = balcones;
    }

    public int getnPlanta() {
        return nPlanta;
    }

    public void setnPlanta(int nPlanta) {
        this.nPlanta = nPlanta;
    }

    public int getBalcones() {
        return balcones;
    }

    public void setBalcones(int balcones) {
        this.balcones = balcones;
    }
    public void mostrarDatos(){
        System.out.println("El piso tiene "+getnPuertas()+", es de color "+getColor()+", tiene "+getnVentanas()+" ventanas y "+getBalcones()+" balcones");
    }
}
