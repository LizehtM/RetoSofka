package preguntas;

public class Preguntas3 extends ControlPreguntas {

    private String respuesta;

    public boolean categoria3() {

        System.out.println("Bienvenido a la pregunta del nivel : 3 ");
        System.out.println("Ingrese la letra de la respuesta Ejemplo: A,B,C,D");
        System.out.println("Si responde correctamente el premio ira acomulando de a $10.000");
        System.out.println("Podra retirarce antes de responder e irse con el acomulado");
        System.out.println("");
        System.out.println("");

        switch (super.getNumero()) {

            case 1:

                System.out.println("¿Qué es Eclipse?");
                System.out.println("A: Una libreria de Java");
                System.out.println("B: Una versión de Java especial para servidores");
                System.out.println("C: Un IDE para desarrollar aplicaciones");
                System.out.println("D: Ninguna de las anteriores");
                respuesta = sc.next().toUpperCase();

                if (respuesta.equals("C")) {

                    return true;

                }

                break;

            case 2:

                System.out.println("¿Qué es el bytecode en Java?");
                System.out.println("A: El formato de intercambio de datos");
                System.out.println("B: El formato que obtenemos tras compilar un fuente .java ");
                System.out.println("C: Un tipo de variable");
                System.out.println("D: Un depurador de código");
                respuesta = sc.next().toUpperCase();

                if (respuesta.equals("B")) {
                    return true;
                }

                break;

            case 3:

                System.out.println("¿Qué código asociarías a una  en Java?");
                System.out.println("A: public class Componente interfaInterfazce Product");
                System.out.println("B: Componente cp = new Componente (interfaz)");
                System.out.println("C: public class Componente implements Printable");
                System.out.println("D: Componente cp = new Componente.interfaz");
                respuesta = sc.next().toUpperCase();

                if (respuesta.equals("C")) {
                    return true;
                }

                break;

            case 4:

                System.out.println("¿Qué significa sobrecargar (overload) un método?");
                System.out.println("A: Editarlo para modificar su comportamiento");
                System.out.println("B: Cambiarle el nombre dejándolo con la misma funcionalidad ");
                System.out.println("C: Crear un método con el mismo nombre pero diferentes argumentos");
                System.out.println("D: Añadirle funcionalidades a un método");
                respuesta = sc.next().toUpperCase();

                if (respuesta.equals("C")) {
                    return true;
                }

                break;

            case 5:

                System.out.println(" ¿Qué es una excepción?");
                System.out.println("A: Un error que lanza un método cuando algo va mal");
                System.out.println("B: Un objeto que no puede ser instanciado");
                System.out.println("C: Un bucle que no finaliza");
                System.out.println("D: Un tipo de evento muy utilizado al crear interfaces");
                respuesta = sc.next().toUpperCase();

                if (respuesta.equals("A")) {
                    return true;
                }

                break;

        }

        System.out.println("");

        return false;
    }

}
