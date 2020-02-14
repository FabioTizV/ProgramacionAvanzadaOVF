package practicaobjetos;

import java.util.Scanner; //Librería para poder obtener datos del teclado.

public class PersonaConAdquisicionDeDatos
{


    public PersonaConAdquisicionDeDatos() //Dado que obtendremos los parametros del teclado, el campo entre parentesis, que es apra parametros, se deja en blanco.
    {
        Scanner EntradaNombre = new Scanner (System.in); //Se leerá una variable a partir de la entrada en teclado.
        String Nombre = ""; //Se inicializa una variable de tipo String de identificador "Nombre" con valor "".
        Scanner EntradaEdad = new Scanner (System.in); //Se leerá una variable a partir de la entrada en teclado.
        int Edad = 0; //Se inicializa una variable de tipo String de identificador "Nombre" con valor "".
        
        
        
        

        System.out.println("¿Cuál es tu nombre?"); //Se muestra el mensaje en pantalla.
        Nombre = EntradaNombre.nextLine(); //Se introduce por el teclado los datos y se le asignan a la variable "Nombre".

        System.out.println("¿Cuál es tu Edad?"); //Se muestra el mensaje en pantalla.
        Edad = EntradaEdad.nextInt(); //Se introduce por el teclado los datos y se le asignan a la variable "Edad".

        //En la escritura ".next" en seguida se escribe el tipo de dato que se introducirá, para Strings = "Line", apra int's = "Int"

        System.out.println("Tu nombre es: "+Nombre); //Se muestra en la pantalla el mensaje: "Tu nombre es:" seguido de los datos dentro de la variable "Nombre".
        System.out.println("Tu edad es: "+Edad); //Se muestra en la pantalla el mensaje: "Tu edad es:" seguido de los datos dentro de la variable "Edad".
    
    }

}