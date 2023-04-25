package Servicio;

import Entidad.Persona;

import java.util.Scanner;

/**
 *
 * @author Claudia
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    // SI CLIQUEO: Pm tabulardor y creo la estructura del método   
    private int mayorEdad;

    // Metodo crearPersona(): el método crear persona, 
    //le pide los valores de los atributos al usuario y
    //despué s se le asignan a sus respectivos atributos para llenar el objeto Persona. 
    public Persona crearPersona() {
        int conta = 1;
        conta = conta++;
        System.out.println("\n - Persona Nº" + conta + " complete los siguientes datos:");
        System.out.println("Nombre: ");
        String nombre = leer.next();
        System.out.println("Edad: ");
        int edad = leer.nextInt();

        //Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
        //Si no es correcto se deberá mostrar un mensaje
        String sexo;
        do {
            System.out.println("Sexo, H: para hombre - M: para mujer - O: para otro ");
            sexo = leer.next();
            if (sexo.equalsIgnoreCase("H") || sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("O")) {
                break;
            } else {
                System.out.println("dato erroneo");
            }
        } while (true);

        System.out.println(" Ingrese su en Kg.");
        double peso = leer.nextDouble();
        System.out.println("Ingrese su altura en metros");
        double altura = leer.nextDouble();

        
      
        
        return new Persona(nombre, edad, sexo, peso, altura);

    }
//* Método esMayorDeEdad(): indica si la persona es mayor de edad. DEVUELVE UN BOOLEANO

    public boolean esMayordeEdad(Persona aux) {

        if (aux.getEdad() >= 18) {
            System.out.println("\n - La persona es mayor de edad  ");
            return true;
        } else {
            System.out.println("\n - La persona es menor de edad");
            return false;
        }
    }
// Método calcularIMC(): calculara si la persona está en su peso ideal 
    // (peso en kg/(altura^2 en mt2)).
    // fórmula valor menor que 20, la persona está por debajo de su peso ideal y la función devuelve un -1.
    // fórmula da  un número entre 20 y 25 (incluidos), la persona está en su peso ideal y devuelve un 0.
    //Ffórmula es un valor mayor que 25 la persona tiene sobrepeso, y la función devuelve un 1.

    public int calcularIMC(Persona aux) {

        double IMC = aux.getPeso() / (aux.getAltura() * aux.getAltura());

        System.out.println("- La persona mide " + aux.getAltura()+" metros");
        System.out.println("- La persona pesa " + aux.getPeso()+ " kg.");
        System.out.println("- El índice de  masa corporal (IMC) es:   " + IMC);

        if (IMC <= 20) {
            System.out.println(" La persona está por debajo de su peso ideal. \n Valor: -1");
            return -1;
        } else if (IMC >= 20 && IMC <= 25) {
            System.out.println(" La persona está en su peso ideal. \n Valor: 0 ");
            return 0;
        } else if (IMC > 25) {
            System.out.println("- La persona está por encima de su peso ideal. \n Valor: 1 ");
            return 1;
        }
        return 0;
        }
    public void calcularPorcentajeIMC(int[] vIMCs) {
      
     
       int contBajoPeso=0;
        int contPesoIdeal=0;
        int contSobrepeso=0;
                     
        for (int i = 0; i < 4; i++) {
            
             vIMCs[i] = aux.getPeso() / (aux.getAltura() * aux.getAltura());
            if (vIMCs[i] <20 ){
              vIMCs[i] = contBajoPeso ++;
        }else if (vIMCs[i] >=20 && <=25);{
         vIMCs[i] =  contPesoIdeal++;   
            }else{
                 vIMCs[i] =    contSobrepeso++;
        }
        }
        double bPeso = contBajoPeso * 4/100;
        double pIdeal = contPesoIdeal*4/100;
        double sobrePeso =contSobrepeso/4/100;
        System.out.println("\n"+ bPeso +" % de personas debajo del peso ideal" );
        System.out.println(+ pIdeal +" % de personas con peso ideal" );
        System.out.println(+ sobrePeso +" % de personas con obrepeso" );

            
        }
    public void calcularPorcentajeEdad(boolean[]vEdad) {
        int mayorEdad =0;
        int menorEdad =0;
        for (int i = 0; i < 4; i++) {
            if (vEdad[i]) {
                mayorEdad ++;}
            else{
                 menorEdad ++;}
                
            }
            
        }
        double mayores = ((double)mayorEdad)* 4/100;
        // double menores = ((double)menorEdad)*4/100;
    }
    
    
    

  