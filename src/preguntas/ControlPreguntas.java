/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preguntas;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ControlPreguntas {
    
     Scanner sc = new Scanner(System.in);
     private int contPreguntas;
     

    public int getNumero() {
        return numero;
    }
     
     private int numero = (int) (Math.random() * 5 + 1);

    public int getContPreguntas() {
        return contPreguntas;
    }

    public void setContPreguntas(int contPreguntas) {
        this.contPreguntas = contPreguntas;
    }
    
}
