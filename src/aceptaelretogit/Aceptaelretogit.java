/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceptaelretogit;
import java.util.Scanner;
/**
 *
 * @author Usuario DAM 1
 */
public class Aceptaelretogit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        String numeros = sc.nextLine();

        String resultado = "";

        int suma = 0;

        

        

        for (int i = 0; i < numeros.length(); i++)

        {

            int n ;

            n = Integer.parseInt("" + numeros.charAt(i));

            suma += n;

            if (i != numeros.length() - 1)

            {

                resultado = resultado.concat(n + " + ");

            } else

            {

                resultado = resultado.concat(n + " = " + suma);

            }

        }

 

        System.out.println(resultado);

    }

 

}  
    
    

