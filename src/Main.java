import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        System.out.print("Ingrese el nombre del jugador 1: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la posicion del jugador 1: ");
        String posicion = scanner.nextLine();
        System.out.print("Ingrese el numero de camisa del jugador 1: ");
        int num_camisa = scanner.nextInt();
        scanner.nextLine(); // para limpiar el buffer de entrada
        Jugador jugador1 = new Jugador(nombre, posicion, num_camisa);

        System.out.print("Ingrese el nombre del jugador 2: ");
        String nombre2 = scanner.nextLine();
        System.out.print("Ingrese la posicion del jugador 2: ");
        String posicion2 = scanner.nextLine();
        System.out.print("Ingrese el numero de camisa del jugador 2: ");
        int num_camisa2 = scanner.nextInt();
        scanner.nextLine();
        Jugador jugador2 = new Jugador(nombre2, posicion2, num_camisa2);


        System.out.print("Ingrese el nombre del jugador 3: ");
        String nombre3 = scanner.nextLine();
        System.out.print("Ingrese la posicion del jugador 3: ");
        String posicion3 = scanner.nextLine();
        System.out.print("Ingrese el numero de camisa del jugador 3: ");
        int num_camisa3 = scanner.nextInt();
        scanner.nextLine();
        Jugador jugador3 = new Jugador(nombre3, posicion3, num_camisa3);

        jugador1.mostrarInfo();
        jugador2.mostrarInfo();
        jugador3.mostrarInfo();

         */
        System.out.print("Ingrese el nombre del empleado 1: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el cargo del empleado 1: ");
        String cargo = scanner.nextLine();
        System.out.print("Ingrese el salario del empleado 1: ");
        double salario = scanner.nextDouble();
        System.out.print("Ingrese la fecha de ingreso del empleado 1 (DD-MM-AAAA): ");
        String fechaIngreso = scanner.next();
        scanner.nextLine();
        Empleado empleado1 = new Empleado(nombre, cargo, salario, fechaIngreso);

        System.out.print("Ingrese el nombre del empleado 2: ");
        String nombre2 = scanner.nextLine();
        System.out.print("Ingrese el cargo del empleado 2: ");
        String cargo2 = scanner.nextLine();
        System.out.print("Ingrese el salario del empleado 2: ");
        double salario2 = scanner.nextDouble();
        System.out.print("Ingrese la fecha de ingreso del empleado 2 (DD-MM-AAAA): ");
        String fechaIngreso2 = scanner.next();
        scanner.nextLine();
        Empleado empleado2 = new Empleado(nombre2, cargo2, salario2, fechaIngreso2);

        System.out.print("Ingrese el nombre del empleado 3: ");
        String nombre3 = scanner.nextLine();
        System.out.print("Ingrese el cargo del empleado 3: ");
        String cargo3 = scanner.nextLine();
        System.out.print("Ingrese el salario del empleado 3: ");
        double salario3 = scanner.nextDouble();
        System.out.print("Ingrese la fecha de ingreso del empleado 3 (DD-MM-AAAA): ");
        String fechaIngreso3 = scanner.next();
        scanner.nextLine();
        Empleado empleado3 = new Empleado(nombre3, cargo3, salario3, fechaIngreso3);


        empleado1.mostrarInformacion();
        empleado2.mostrarInformacion();
        empleado3.mostrarInformacion();
    }
}