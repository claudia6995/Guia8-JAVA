
package Servicios;

import Entidades.Persona;
import java.util.Scanner;


public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        System.out.println("Ingrese nombre de la persona");
        String nombre = leer.next();
        System.out.println("Ingrese la edad de la persoa");
        int edad = leer.nextInt();
        System.out.println("Ingrese el sexo de la persona");
        String sexo = leer.next();
        while(!sexo.equals("O") && !sexo.equals("H") && !sexo.equals("M")){
            System.out.println("Ingrese nuevamente el sexo");
            sexo = leer.next();
        }
        System.out.println("Ingrese el peso de la persona");
        double peso = leer.nextDouble();
        System.out.println("Ingrese la altura de la persona");
        double altura = leer.nextDouble();
        return new Persona(nombre, edad, sexo, peso, altura);
    }    
    public boolean esMayorDeEdad(Persona edadPersona){
        if(edadPersona.getEdad() >= 18){
            return true;
        } else {
            return false;
        }
    }
    public int calcularIMC(Persona pesoPersona, Persona alturaPersona){
        double formula =  pesoPersona.getPeso() / (alturaPersona.getAltura()*alturaPersona.getAltura()) ;
        
        if(formula < 20){
            return -1;
        }
        else if (formula >= 20 && formula <= 25){
            return 0;
        }
        else if(formula > 25){
            return 1;
        } 
        return 0;
    }
    
    public void calcularPorcentajeIMC(int[] resultadosIMC){
    int porDebajo = 0;
    int pesoIdeal = 0;
    int sobrepeso = 0;

    for (int i = 0; i < resultadosIMC.length; i++) {
        if (resultadosIMC[i] == -1) {
            porDebajo++;
        } else if (resultadosIMC[i] == 0) {
            pesoIdeal++;
        } else {
            sobrepeso++;
        }
    }
    
    double porcentajePorDebajo = porDebajo * 100.0 / 4;
    double porcentajePesoIdeal = pesoIdeal * 100.0 / 4;
    double porcentajeSobrepeso = sobrepeso * 100.0 / 4;
    
    System.out.println("Por debajo del peso ideal: " + porcentajePorDebajo + "%");
    System.out.println("Peso ideal: " + porcentajePesoIdeal + "%");
    System.out.println("Sobrepeso: " + porcentajeSobrepeso + "%");

    }
    
    public void calcularPorcentajeEdad(boolean [] resultadosEdad){
   
      int mayor = 0;
      int menor = 0;
      
      for(int i = 0; i<resultadosEdad.length; i++){
          if(resultadosEdad[i]){
              mayor++;
          } else {
              menor++;
          }
      }
      
    double porcentajeMayor = ((double) mayor / 4) * 100;
    double porcentajeMenor = ((double) menor / 4) * 100;

        System.out.println("Cantidad de personas mayores " + mayor + "%");
        System.out.println("Cantidad de personas menores " + menor + "%");
        
    }
}
