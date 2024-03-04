public class Casa {
    private int nVentanas;
    private int nPuertas;
    private String color;

    public Casa(int nVentanas, int nPuertas, String color) {
        this.nVentanas = nVentanas;
        this.nPuertas = nPuertas;
        this.color = color;
    }

    public Casa() {
    }

    public int getnVentanas() {
        return nVentanas;
    }

    public void setnVentanas(int nVentanas) {
        this.nVentanas = nVentanas;
    }

    public int getnPuertas() {
        return nPuertas;
    }

    public void setnPuertas(int nPuertas) {
        this.nPuertas = nPuertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void pintar(String color){
        this.color = color;
    }
    public void abrirVentanas(int ventanasNuevas){
        this.nVentanas = ventanasNuevas;
    }
    public void cerrarVentanas(int ventanasCerradas){
        this.nVentanas -= ventanasCerradas;
        if(this.nVentanas<0){
            this.nVentanas = 0;
        }
    }
    public void mostrarDatos(){
        System.out.println("La casa tiene "+getnPuertas()+" puertas, es de color "+getColor()+" y "+getnVentanas()+" ventanas");
    }
}
