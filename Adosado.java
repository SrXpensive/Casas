public class Adosado extends Casa{
    private boolean pati;
    private int nCocheres;

    public Adosado(int nVentanas, int nPuertas, String color, boolean pati, int nCocheres) {
        super(nVentanas, nPuertas, color);
        this.pati = pati;
        this.nCocheres = nCocheres;
    }

    public boolean isPati() {
        return pati;
    }

    public void setPati(boolean pati) {
        this.pati = pati;
    }

    public int getnCocheres() {
        return nCocheres;
    }

    public void setnCocheres(int nCocheres) {
        this.nCocheres = nCocheres;
    }
    public void mostrarDatos(){
        String pati;
        if(!this.pati){
            pati = "no tiene";
        }else{
            pati = "tiene";
        }
        System.out.println("El adosado tiene "+getnPuertas()+" puertas, es de color "+getColor()+", tiene "+getnVentanas()+" ventanas y "+pati+" patio");
    }
}
