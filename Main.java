public class Main {
    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("1. Primera parte del ejercicio");
            System.out.println("2. Segunda parte del ejercicio");
            System.out.println("0. Salir");
            opcion = Leer.leerEntero("Introduce una opcion: ");
            switch(opcion){
                case 1:
                    Casa casa1 = new Casa(2,3,"Azul");
                    casa1.mostrarDatos();
                    casa1.pintar("Rojo");
                    casa1.mostrarDatos();
                    Chalet chalet1 = new Chalet(2,4,"Verde",32,"Verdecito",2400.30);
                    chalet1.mostrarDatos();
                    chalet1.aumentaMantener();
                    chalet1.mostrarDatos();
                    Adosado adosado1 = new Adosado(2,7,"Morado",true,2);
                    adosado1.mostrarDatos();
                    adosado1.pintar("Rojo");
                    adosado1.mostrarDatos();
                    Piso piso1 = new Piso(4,5,"Marrón caca",3,1);
                    piso1.mostrarDatos();
                    piso1.pintar("Turquesita");
                    piso1.mostrarDatos();
                    Casa casa2 = new Casa(3,1,"Amarillo");
                    casa2.mostrarDatos();
                    casa2.pintar("Negro");
                    casa2.mostrarDatos();
                    Chalet chalet2 = new Chalet(4,4,"Gris",20,"Blanco",314.25);
                    chalet2.mostrarDatos();
                    chalet2.aumentaMantener();
                    chalet2.mostrarDatos();
                    Adosado adosado2 = new Adosado(4,6,"Cyan",false,5);
                    adosado2.mostrarDatos();
                    adosado2.pintar("Lila");
                    adosado2.mostrarDatos();
                    Piso piso2 = new Piso(2,6,"Lima",4,7);
                    piso2.mostrarDatos();
                    piso2.pintar("Naranja");
                    piso2.mostrarDatos();
                    break;
                case 2:
                    Casa []casas ;
                    int numero = Leer.leerEntero("¿Cuántas casas tienes en propiedad?: ");
                    casas = new Casa[numero];
                    for(int i=0; i<casas.length;i++){
                        int tipo;
                        System.out.println("1. Chalet");
                        System.out.println("2. Adosado");
                        System.out.println("3. Piso");
                        tipo = Leer.leerEntero("Tipo de la casa "+(i+1)+": ");
                        switch(tipo){
                            case 1:
                                casas[i] = new Chalet();
                                break;
                            case 2:
                                casas[i] = new Adosado();
                                break;
                            case 3:
                                casas[i] = new Piso();
                        }
                    }
                    for(int i = 0; i<casas.length;i++){
                        casas[i].setColor(Leer.leerTexto((i+1)+" "+casas[i].getClass().getName()+" - Dime el color: "));
                    }
                    for(Casa c: casas){
                        System.out.println(c);
                    }

            }
        }while(opcion !=0);


    }
}