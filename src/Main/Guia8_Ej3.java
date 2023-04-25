package Main;

import Entidad.Persona;
import Servicio.PersonaServicio;
import java.util.Scanner;

public class Guia8_Ej3 {

    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);

        PersonaServicio pers = new PersonaServicio();// traigo el  objeto en main. 

        //creo las personas: 
        Persona p1 = pers.crearPersona(); // Persona = clase   p1=; pers=objeto pers.crearObjeto 
        pers.esMayordeEdad(p1);// objeto servicio. el metodo que quietro trabajar (objeto).
        pers.calcularIMC(p1);

        Persona p2 = pers.crearPersona(); // Persona = clase   p2= objeto persona = servicio.
        pers.esMayordeEdad(p2);// objeto servicio. el metodo que quietro trabajar (objeto).
        pers.calcularIMC(p2);
       
        Persona p3 = pers.crearPersona(); // Persona = clase   p3= objeto persona = servicio.
        pers.esMayordeEdad(p3);// objeto servicio. el metodo que quietro trabajar (objeto).
        pers.calcularIMC(p3);
        
        Persona p4 = pers.crearPersona(); // Persona = clase   p4= objeto persona = servicio.
        pers.esMayordeEdad(p4);// objeto servicio. el meto que quietro trabajar (objeto).
        pers.calcularIMC(p4);
        

        // crear el vector persona
        // Creacion del vector crearPersona
        Persona[] Vpersonas = new Persona[4]; // CREO EL  vector de objeto llamado "Vpersonas" Clase del objeto

        Vpersonas[0] = p1; // este arreglo va a guardar el objeto n@ para la 4 personas... 
        Vpersonas[1] = p2; // este arreglo va a guardar el objeto n@ para la 4 personas... 
        Vpersonas[2] = p3; // este arreglo va a guardar el objeto n@ para la 4 personas... 
        Vpersonas[3] = p4; // este arreglo va a guardar el objeto n@ para la 4 personas... 

        //  CREAR Vector IMC    
        int[] vIMCs = new int[4];
        pers.calcularPorcentajeIMC(vIMCs);
        //   Vector EDAD         
        boolean[] vEdad = new boolean[4];
        pers.calcularPorcentajeEdad(vEdad);
    }
}

        
        

        // Vector EDAD         boolean[] vEdad = new boolean[4];
        // asiganción del valor         for (int i = 0; i < (3); i++) {            vEdad[i] = pers.esMayordeEdad(Vpersonas[i].getEdad()) // esto devuelve el verdadero/falso
  //  }
    //mostrar el vector EDAD           for (boolean i = 0; i < (3); i++) {             System.out.println("" + vEdad[i] "");

// }
//  CREAR Vector IMC           int[] vIMCs = new int[4]; 
// asignacion valor vIMC          for (int i = 0; i < (3); i++) {             vIMCs[i] = pers.calcularIMC(Vpersonas[i].getPeso(), Vpersona.calcularIMC(personas[i].getAltura());
// }
        //mostrar el vector IMC          for (int i = 0; i < 3; i++) {             System.out.println("" + vIMCs[i] "");
    //        }
       //  }
        
        // falta terminar con vector 
   //  }
    

 /**
 * A continuación, en la clase main hacer lo siguiente:
* Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada objeto, 
* deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar 
* para cada objeto si la persona es mayor de edad.
* 
* Por último, guardaremos los resultados de los métodos calcularIMC y
* esMayorDeEdad en distintas variables(arrays), para después calcular
* un porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en su peso ideal y 
* cuantos, por encima, y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
* Para esto, podemos crear unos métodos adicionales.
*/