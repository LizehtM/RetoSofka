package preguntas;

import java.util.Scanner;

public class Preguntas extends ControlPreguntas {

    private String respuesta;

    public boolean categoria1() {

        System.out.println("Bienvenido a la pregunta del nivel : 1");
        System.out.println("Ingrese la letra de la respuesta Ejemplo: A,B,C,D");
        System.out.println("Si responde correctamente el premio ira acomulando de a $10.000");
        System.out.println("Podra retirarce antes de responder e irse con el acomulado");
        System.out.println("");
        System.out.println("");
        switch (super.getNumero()) {

            case 1:

                System.out.println("Que es una variable ?");
                System.out.println("A: Un espacio en memoria");
                System.out.println("B: Un valor que puede cambiar");
                System.out.println("C: Un campo en la nube");
                System.out.println("D: Todas las anteriores");
                respuesta = sc.next().toUpperCase();

                if (respuesta.equals("A")) {

                    return true;

                }

                break;

            case 2:

                System.out.println("¿A qué hace relación el Internet de las Cosas?");
                System.out.println("A: A todas las cosas que puedes encontrar navegando por Internet");
                System.out.println("B: Al Bluetooth, Wifi y demás redes ");
                System.out.println("C: A una red que interconecta objetos físicos valiéndose del Internet");
                System.out.println("D: A cosas con internet");
                respuesta = sc.next().toUpperCase();

                if (respuesta.equals("C")) {
                    return true;
                }

                break;

            case 3:

                System.out.println("¿Qué es el Blockchain?");
                System.out.println("A: Es una cadena para bloquear datos y que solo nosotros podamos verlos");
                System.out.println("B: Es la nueva técnica para transferir dinero y que los bancos no puedan interferir en nuestro dinero");
                System.out.println("C: Una estructura de datos en la que la información contenida se agrupa en bloques enlazados y cifrados para proteger la seguridad y privacidad");
                System.out.println("D: Todas las anteriores");
                respuesta = sc.next().toUpperCase();

                if (respuesta.equals("C")) {
                    return true;
                }

                break;

            case 4:

                System.out.println("¿Qué entendemos por Realidad Aumentada?");
                System.out.println("A: Es la visión de un entorno físico del mundo real, a través de un dispositivo tecnológico");
                System.out.println("B: Es la ampliación de  las imágenes y vídeos a través del móvil");
                System.out.println("C: Aquello que vemos cuando nos colocamos unas gafas de visión 3D");
                System.out.println("D: Darle poderes a la realidad");
                respuesta = sc.next().toUpperCase();

                if (respuesta.equals("A")) {
                    return true;
                }

                break;

            case 5:

                System.out.println("¿Qué es un Chatbot?");
                System.out.println("A: Una app de mensajería y chat para el móvil");
                System.out.println("B: Un robot con el que hablar cuando te sientes solo");
                System.out.println("C: Un programa informático con el que es posible mantener una conversación, normalmente para solicitarle algún tipo de información");
                System.out.println("D: Un asesor disfrasado de robot");
                respuesta = sc.next().toUpperCase();

                if (respuesta.equals("C")) {
                    return true;
                }

                break;

        }

        System.out.println("");

        return false;
    }

}
