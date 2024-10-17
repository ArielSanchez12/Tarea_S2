public class Jugador {
    String nombre;
    String posicion;
    int edad = 22;
    int num_camisa;

    public Jugador(String nombre, String posicion, int num_camisa) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.num_camisa = num_camisa;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Posicion: " + posicion);
        System.out.println("Edad: " + edad);
        System.out.println("Numero de Camisa: " + num_camisa);
    }

}

