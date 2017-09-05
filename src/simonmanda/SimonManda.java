/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simonmanda;
import java.util.Scanner;

/**
 *
 * @author Soledad Moraga
 */
public class SimonManda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String cadenaS=sc.nextLine();
        String cadenaN=sc.nextLine();
        String [] caracteres=cadenaS.split(" ");
        String [] caracnumeros=cadenaN.split(" ");
        int [] numero=new int[caracnumeros.length];
        for(int i=0;i<caracnumeros.length;i++)
        {
            numero[i]=Integer.parseInt(caracnumeros[i]);
        }
        int [] cadenaInvertida=invertirCadena(numero);
        String cadenaFinal="";
        if(caracteres.length==cadenaInvertida.length)
        {
            for(int i=0;i<caracteres.length;i++)
            {
                if(caracteres[i].equals("L"))
                {
                    cadenaFinal+=cadenaInvertida[i]+" ";
                }
                else if(caracteres[i].equals("N"))
                {
                   
                }
                else if(caracteres[i].equals("E"))
                {
                    cadenaFinal+=(cadenaInvertida[i]+2)+" ";
                }
                else if(caracteres.equals("I"))
                {
                    cadenaFinal+=(cadenaInvertida[i]-1)+" ";
                }
            }    
        }
        System.out.println(cadenaFinal);
        
    }   
    public static int [] invertirCadena(int [] arreglo)
    {
        int [] aux = new int [arreglo.length];
        for(int i=0,j=aux.length-1;i<aux.length;i++,j--)
        {
            aux[i]=arreglo[j];
        }
        return aux;
    }
}
