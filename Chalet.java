public class Chalet extends Casa{
    private int mJardin;
    private String colorvalla;
    private double mantener;

    public Chalet(int nVentanas, int nPuertas, String color, int mJardin, String colorvalla, double mantener) {
        super(nVentanas, nPuertas, color);
        this.mJardin = mJardin;
        this.colorvalla = colorvalla;
        this.mantener = mantener;
    }
    public Chalet(){

    }
    public void aumentaMantener(){
        setMantener(this.mantener*1.02);
    }

    public int getmJardin() {
        return mJardin;
    }

    public void setmJardin(int mJardin) {
        this.mJardin = mJardin;
    }

    public String getColorvalla() {
        return colorvalla;
    }

    public void setColorvalla(String colorvalla) {
        this.colorvalla = colorvalla;
    }

    public double getMantener() {
        return mantener;
    }

    public void setMantener(double mantener) {
        this.mantener = mantener;
    }
    public void pintar(String colorvalla){
        this.colorvalla = colorvalla;
    }
    public void mostrarDatos(){
        System.out.println("El chalet tiene "+getnPuertas()+" puertas, es de color "+getColor()+", tiene "+getnVentanas()+" ventanas y "+getmJardin()+" m2 de jardín. El coste de mantenimiento es "+getMantener());
    }
    public String toString(){
        return getClass().getName()+ " - "+this.getColor();
    }

}
