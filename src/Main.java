
class Persona {
    int edad;
    String nombre;
    String telefono;
}

class Cliente extends Persona {
    int credito;
}

class Trabajador extends Persona {
    int salario;
}

    public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.edad = 30;
        cliente1.nombre = "Juan";
        cliente1.telefono = "555-1234";
        cliente1.credito = 5000;

        System.out.println("Cliente 1:");
        System.out.println("Edad: " + cliente1.edad);
        System.out.println("Nombre: " + cliente1.nombre);
        System.out.println("Teléfono: " + cliente1.telefono);
        System.out.println("Crédito: " + cliente1.credito);

        Trabajador trabajador1 = new Trabajador();
        trabajador1.edad = 40;
        trabajador1.nombre = "Ana";
        trabajador1.telefono = "555-5678";
        trabajador1.salario = 30000;

        System.out.println("Trabajador 1:");
        System.out.println("Edad: " + trabajador1.edad);
        System.out.println("Nombre: " + trabajador1.nombre);
        System.out.println("Teléfono: " + trabajador1.telefono);
        System.out.println("Salario: " + trabajador1.salario);
    }
}
