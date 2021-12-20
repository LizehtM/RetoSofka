package preguntas;

public class Preguntas5 extends ControlPreguntas {

    private String respuesta;

    public boolean categoria5() {

        System.out.println("Bienvenido a la pregunta del nivel : 5");
        System.out.println("Ingrese la letra de la respuesta Ejemplo: A,B,C,D");
        System.out.println("Si responde correctamente el premio ira acomulando de a $10.000");
        System.out.println("Podra retirarce antes de responder e irse con el acomulado");
        System.out.println("");
        System.out.println("");

        switch (super.getNumero()) {

            case 1:

                System.out.println("¿Qué lenguaje informático es el más utilizado?");
                System.out.println("A: PHP");
                System.out.println("B: Java");
                System.out.println("C: SQL");
                System.out.println("D: Todas las anteriores");
                respuesta = sc.next().toUpperCase();

                if (respuesta.equals("B")) {

                    return true;

                }

                break;

            case 2:

                System.out.println("¿Quién inventó Google?");
                System.out.println("A: Bill Gates");
                System.out.println("B: Steve Jobs");
                System.out.println("C: Larry Page");
                System.out.println("D: Steve wozniak");
                respuesta = sc.next().toUpperCase();

                if (respuesta.equals("C")) {
                    return true;
                }

                break;

            case 3:

                System.out.println("¿ Qué es el spam?");
                System.out.println("A: Un virus informático");
                System.out.println("B: Correos no solicitados");
                System.out.println("C: Un lenguaje de programación");
                System.out.println("D: Una marca de ordenadores");
                respuesta = sc.next().toUpperCase();

                if (respuesta.equals("B")) {
                    return true;
                }

                break;

            case 4:

                System.out.println("¿Qué significa la abreviatura WWW?");
                System.out.println("A: World Wailer Web");
                System.out.println("B: Wireless World Web");
                System.out.println("C: World Wide Web");
                System.out.println("D: Ninguna de las anteriores");
                respuesta = sc.next().toUpperCase();

                if (respuesta.equals("C")) {
                    return true;
                }

                break;

            case 5:

                System.out.println("¿Qué tecnología se utiliza para hacer posibles las llamadas telefónicas a través de Internet?");
                System.out.println("A: Ethernet");
                System.out.println("B: Bluetooth");
                System.out.println("C: POP");
                System.out.println("D: VoIP");
                respuesta = sc.next().toUpperCase();

                if (respuesta.equals("D")) {
                    return true;
                }

                break;

        }

        System.out.println("");

        return false;
    }

}
