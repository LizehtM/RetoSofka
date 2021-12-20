package preguntas;

public class Preguntas2 extends ControlPreguntas {

    private String respuesta;

    public boolean categoria2() {

        System.out.println("Bienvenido a la pregunta del nivel : 2");
        System.out.println("Ingrese la letra de la respuesta Ejemplo: A,B,C,D");
        System.out.println("Si responde correctamente el premio ira acomulando de a $10.000");
        System.out.println("Podra retirarce antes de responder e irse con el acomulado");
        System.out.println("");
        System.out.println("");

        switch (super.getNumero()) {

            case 1:

                System.out.println("¿Cuál es la descripción que crees que define mejor el concepto 'clase' en la programación orientada a objetos??");
                System.out.println("A: Es un concepto similar al de 'array'");
                System.out.println("B: Es un tipo particular de variable");
                System.out.println("C: Es un modelo o plantilla a partir de la cual creamos objetos");
                System.out.println("D: Es una categoria de datos ordenada secuencialmente");
                respuesta = sc.next().toUpperCase();

                if (respuesta.equals("C")) {

                    return true;

                }

                break;

            case 2:

                System.out.println("¿Qué elementos crees que definen a un objeto?");
                System.out.println("A: Sus cardinalidad y su tipo");
                System.out.println("B: Sus atributos y sus métodos ");
                System.out.println("C: La forma en que establece comunicación e intercambia mensajes");
                System.out.println("D: Su interfaz y los eventos asociados");
                respuesta = sc.next().toUpperCase();

                if (respuesta.equals("B")) {
                    return true;
                }

                break;

            case 3:

                System.out.println("¿Qué código de los siguientes tiene que ver con la herencia?");
                System.out.println("A: public class Componente extends Producto");
                System.out.println("B: public class Componente inherit Producto");
                System.out.println("C: public class Componente implements Producto");
                System.out.println("D: public class Componente belong to Producto");
                respuesta = sc.next().toUpperCase();

                if (respuesta.equals("A")) {
                    return true;
                }

                break;

            case 4:

                System.out.println("¿Qué significa instanciar una clase?");
                System.out.println("A: Duplicar una clase");
                System.out.println("B: Eliminar una clase");
                System.out.println("C: Crear un objeto a partir de la clase");
                System.out.println("D: Conectar dos clases entre sí");
                respuesta = sc.next().toUpperCase();

                if (respuesta.equals("C")) {
                    return true;
                }

                break;

            case 5:

                System.out.println(" En Java, ¿a qué nos estamos refiriendo si hablamos de 'Swing'?");
                System.out.println("A: Una función utilizada para intercambiar valores");
                System.out.println("B: Es el sobrenombre de la versión 1.3 del JDK");
                System.out.println("C: Un framework específico para Android");
                System.out.println("D: Una librería para construir interfaces gráficas");
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
