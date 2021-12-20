package preguntas;

public class Preguntas4 extends ControlPreguntas {

    private String respuesta;

    public boolean categoria4() {

        System.out.println("Bienvenido a la pregunta del nivel : 4");
        System.out.println("Ingrese la letra de la respuesta Ejemplo: A,B,C,D");
        System.out.println("Si responde correctamente el premio ira acomulando de a $10.000");
        System.out.println("Podra retirarce antes de responder e irse con el acomulado");
        System.out.println("");
        System.out.println("");

        switch (super.getNumero()) {

            case 1:

                System.out.println(" ¿A qué hace relación el Machine Learning? ?");
                System.out.println("A: A programar las máquinas para que usen algoritmos para parsear datos, aprender de ellos y ser capaces de hacer predicciones o sugerencias");
                System.out.println("B: A enseñar a las máquinas a hacer cosas");
                System.out.println("C: A todo aquello que podemos aprender de una máquina");
                System.out.println("D: Todas las anteriores");
                respuesta = sc.next().toUpperCase();

                if (respuesta.equals("A")) {

                    return true;

                }

                break;

            case 2:

                System.out.println("¿Qué son los Digital Twins?");
                System.out.println("A: Réplicas virtuales de objetos o procesos que simulan el comportamiento de sus homólogos reales");
                System.out.println("B:Los perfiles de los usuarios en las redes sociales");
                System.out.println("C: La reproducción digital de los objetos reales");
                System.out.println("D: A cosas con internet");
                respuesta = sc.next().toUpperCase();

                if (respuesta.equals("A")) {
                    return true;
                }

                break;

            case 3:

                System.out.println("¿Qué significan las siglas RV o VR en inglés?");
                System.out.println("A: 'Realidad vista'");
                System.out.println("B: 'Realidad virtual'");
                System.out.println("C: 'Reproducción Virtual'");
                System.out.println("D: Ninguna de las anteriores");
                respuesta = sc.next().toUpperCase();

                if (respuesta.equals("C")) {
                    return true;
                }

                break;

            case 4:

                System.out.println("¿Sabes lo que es el Big Data?");
                System.out.println("A: Un conjunto muy grande de datos");
                System.out.println("B: Entre otros, es aprovechar la inteligencia de analizar y cruzar grandes cantidades de datos para identificar nuevas oportunidades de negocio");
                System.out.println("C: Disciplina tecnológica que se ocupa de almacenar cada vez un número mayor de datos, requiriendo cada vez más espacio");
                System.out.println("D: El big data puede solucionar 'todos' los problemas");
                respuesta = sc.next().toUpperCase();

                if (respuesta.equals("B")) {
                    return true;
                }

                break;

            case 5:

                System.out.println("¿Inteligencia Artificial es...?");
                System.out.println("A: Una película");
                System.out.println("B: La inteligencia mejorada por la implantación de un chip en un cerebro humano, lo que permite mejorar el análisis en la toma de decisiones");
                System.out.println("C: La simulación de procesos de inteligencia humana por parte de máquinas, especialmente sistemas informáticos");
                System.out.println("D: Todas las anteriores");
                respuesta = sc.next().toUpperCase();

                if (respuesta.equals("B")) {
                    return true;
                }

                break;

        }

        System.out.println("");

        return false;
    }

}
