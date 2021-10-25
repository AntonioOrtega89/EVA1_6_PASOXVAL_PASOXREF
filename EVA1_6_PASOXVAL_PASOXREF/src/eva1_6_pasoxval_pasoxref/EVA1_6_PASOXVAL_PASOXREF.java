/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_6_pasoxval_pasoxref;

/**
 *
 * @author JOSE ALBERTO PEREZ
 */
public class EVA1_6_PASOXVAL_PASOXREF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int valOrig = 5;
        //PASO POR VALOR
        System.out.println("ValOrig en el main = " + valOrig);
        incrementa(valOrig);
        System.out.println("ValOrig despues de llamar a incrementa = " + valOrig); 

        //DEMOSTACION DE PASO O REFEREnCIA
        Prueba objPrueba = new Prueba();
        System.out.println("Valor de la x = " + objPrueba);
        System.out.println("objPrueba en el main = " + objPrueba);
        incrementaObj(objPrueba);
        System.out.println("Valor de la x despues de incrementa = " + objPrueba);


  }
    //PASO POR VALOR --> PASAMOS UNA COPIA DEL VALOR EN UNA VARIABLE (VARIABLES LOCALES PRIMITIVOS)
    public static void incrementa(int val){
        val++;//incrementa en uno val = + 1; val +=1;
        System.out.println("VALOR EN INCREMENTA = " + val);
    
    }
    //PASO POR REFERENCIA --> PASAN LA DIRECCION EN MEMORIA DEL OBJETO (OBJETOS)
    public static void incrementaObj(Prueba val){
        System.out.println("Objeto en incrementaObj = " + val);
        val.x++;
    
    }    
    
}
class Prueba{
    public int x = 10;
}

