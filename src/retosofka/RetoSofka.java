package retosofka;

import java.io.IOException;
import preguntas.*;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RetoSofka {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String control;
        Preguntas5 pregunta5 = new Preguntas5();
        Preguntas4 pregunta4 = new Preguntas4();
        Preguntas3 pregunta3 = new Preguntas3();
        Preguntas2 pregunta2 = new Preguntas2();
        Preguntas pregunta = new Preguntas();
        Premios premio = new Premios();

        if (pregunta.categoria1() == true) {
            System.out.println("Respuesta correcta, su nuevo acomulado es $" + premio.respuestaCorrecta());
            System.out.println("Pasaste al nivel 2");
            System.out.println("");
            System.out.println("Ingresa |Si| Para retirarte con :$" + premio.getPremio() + " o |No| Para continuar");
            control = sc.next().toUpperCase();
            if (control.equals("SI")) {
                System.out.println("Gracias por jugar te retiraste con :$" + premio.getPremio());
                guardarEnLog(1, premio.getPremio());
                System.exit(0);
            }
            System.out.println("");

            if (pregunta2.categoria2() == true) {
                System.out.println("Respuesta correcta, su nuevo acomulado es $" + premio.respuestaCorrecta());
                System.out.println("Pasaste al nivel 3");
                System.out.println("");
                System.out.println("Ingresa |Si| Para retirarte con :$" + premio.getPremio() + " o |No| Para continuar");
                control = sc.next().toUpperCase();
                if (control.equals("SI")) {
                    System.out.println("Gracias por jugar te retiraste con :$" + premio.getPremio());
                    guardarEnLog(2, premio.getPremio());
                    System.exit(0);
                }
                System.out.println("");

                if (pregunta3.categoria3() == true) {
                    System.out.println("Respuesta correcta, su nuevo acomulado es $" + premio.respuestaCorrecta());
                    System.out.println("Pasaste al nivel 4");
                    System.out.println("");
                    System.out.println("Ingresa |Si| Para retirarte con :$" + premio.getPremio() + " o |No| Para continuar");
                    control = sc.next().toUpperCase();
                    if (control.equals("SI")) {
                        System.out.println("Gracias por jugar te retiraste con :$" + premio.getPremio());

                        guardarEnLog(3, premio.getPremio());
                        System.exit(0);
                    }
                    System.out.println("");

                    if (pregunta4.categoria4() == true) {
                        System.out.println("Respuesta correcta, su nuevo acomulado es $" + premio.respuestaCorrecta());
                        System.out.println("Pasaste al nivel 5");
                        System.out.println("");
                        System.out.println("Ingresa |Si| Para retirarte con :$" + premio.getPremio() + " o |No| Para continuar");
                        control = sc.next().toUpperCase();
                        if (control.equals("SI")) {
                            System.out.println("Gracias por jugar te retiraste con :$" + premio.getPremio());
                            guardarEnLog(4, premio.getPremio());
                            System.exit(0);
                        }
                        System.out.println("");

                        if (pregunta5.categoria5() == true) {
                            System.out.println("Ganaste el juego y tu premio total es : $" + premio.respuestaCorrecta());
                            System.out.println("Gracias por jugar :D");
                            guardarEnLog(5, premio.getPremio());

                        } else {
                            System.out.println("Haz perdido el juego y tu acumulado es : $" + premio.respuestaIncorrecta());
                            guardarEnLog(5, premio.getPremio());
                        }

                    } else {
                        System.out.println("Haz perdido el juego y tu acumulado es : $" + premio.respuestaIncorrecta());
                        guardarEnLog(4, premio.getPremio());
                    }

                } else {
                    System.out.println("Haz perdido el juego y tu acumulado es : $" + premio.respuestaIncorrecta());
                    guardarEnLog(3, premio.getPremio());
                }
            } else {
                System.out.println("Haz perdido el juego y tu acumulado es : $" + premio.respuestaIncorrecta());
                guardarEnLog(2, premio.getPremio());
            }
        } else {
            System.out.println("Lo sentimos ha perdido su premio es $" + premio.respuestaIncorrecta());
            guardarEnLog(1, premio.getPremio());
        }

    }

    public static void guardarEnLog(int nivel, double monto) {

        try {
            Log myLog = new Log("./log.txt");

            myLog.addLine("Linea 1 : Maximo nivel alcanzado : " + nivel);
            myLog.addLine("Linea 2 : Monto acomulado en el juego : " + monto);

            System.out.println("");
            System.out.println("");
            System.out.println("HISTORICO EN LOG");
            System.out.println("");
            String[] lines = myLog.getLines();
            for (int i = 0; i < lines.length; i++) {
                System.out.println(lines[i]);
            }

        } catch (IOException ex) {
            Logger.getLogger(RetoSofka.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
