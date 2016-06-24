/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculador;

/**
 *
 * @author EPIS
 */
public class Calculador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    float sumar(float a, float b){
    return a+b;
    } 
    float resta(float a, float b){
        return a-b;
    }
    float producto(float a, float b){
        return a * b;
    }
     float division(float a, float b){    
         if (b==0) {
             System.out.print("no se puede dividir");
             return -1;
         }
        return a / b;
    }
    double potencia(double a, double b){
    return Math.pow(a, b);
    } 
    // gracias por la correcion
    double raiz(double a, double b){
        return Math.pow(a, (double)(1/b));
    }
    
}
