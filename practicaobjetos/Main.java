package practicaobjetos;

import java.util.Scanner; 

public class Main 
{

    public static void main (String []args)
    {

        System.out.println();

        String nombre = "";
        int edad = 0;
        int altura = 0;
        double peso = 0;
        Scanner sn = new Scanner (System.in); // Es el objeto predefnido para la captura de datos.
        Scanner se = new Scanner (System.in); // Es el objeto predefnido para la captura de datos.
        Scanner sa = new Scanner (System.in); // Es el objeto predefnido para la captura de datos.
        Scanner sp = new Scanner (System.in); // Es el objeto predefnido para la captura de datos.

        System.out.println();
    
        nombre = sn.nextLine(); //Asignamos a la variable "Nombre" el valor que entre por el teclado con "sc" y a continuación del ".next" estará el tipo de dato primitivo que se guardará, en este caso "Line" que es un cadena de carácteres.
        edad = se.nextInt();    //Asignamos a la variable "Nombre" el valor que entre por el teclado con "sc" y a continuación del ".next" estará el tipo de dato primitivo que se guardará, en este caso "Int" que es un entero.
        altura = sa.nextInt();  //Asignamos a la variable "Nombre" el valor que entre por el teclado con "sc" y a continuación del ".next" estará el tipo de dato primitivo que se guardará, en este caso "Int" que es un entero.
        peso = sp.nextDouble(); //Asignamos a la variable "Nombre" el valor que entre por el teclado con "sc" y a continuación del ".next" estará el tipo de dato primitivo que se guardará, en este caso "Double" que es un double.

        PersonaConAdquisicionDeDatos persona1 = new PersonaConAdquisicionDeDatos(nombre,edad,altura,peso); //Con la clase "PersonaConAdquisiciónDeDatos" creamos un objeto llamado "Persona1" y le asignamos los atributos que se encuentren dentro de los parametros de nustra clase "PersonaConAdquisiciónDeDatos", en este caso al revisar la Clase en su archivo .java nos damos cuenta que son: String Nombre, int Edad, int Altura, double Peso.

        System.out.println();

        System.out.println("Tu nombre es: "+nombre); //Se muestra en la pantalla el mensaje: "Tu nombre es:" seguido de los datos dentro de la variable "nombre".
        System.out.println("Tu edad es: "+edad); //Se muestra en la pantalla el mensaje: "Tu edad es:" seguido de los datos dentro de la variable "edad".
        System.out.println("Tu altura es: "+altura); //Se muestra en la pantalla el mensaje: "Tu altura es:" seguido de los datos dentro de la variable "altura".
        System.out.println("Tu peso es: "+peso); //Se muestra en la pantalla el mensaje: "Tu peso es:" seguido de los datos dentro de la variable "peso".
        
        nombre = sn.nextLine(); //Asignamos a la variable "Nombre" el valor que entre por el teclado con "sc" y a continuación del ".next" estará el tipo de dato primitivo que se guardará, en este caso "Line" que es un cadena de carácteres.
        edad = se.nextInt();    //Asignamos a la variable "Nombre" el valor que entre por el teclado con "sc" y a continuación del ".next" estará el tipo de dato primitivo que se guardará, en este caso "Int" que es un entero.
        altura = sa.nextInt();  //Asignamos a la variable "Nombre" el valor que entre por el teclado con "sc" y a continuación del ".next" estará el tipo de dato primitivo que se guardará, en este caso "Int" que es un entero.
        peso = sp.nextDouble(); //Asignamos a la variable "Nombre" el valor que entre por el teclado con "sc" y a continuación del ".next" estará el tipo de dato primitivo que se guardará, en este caso "Double" que es un double.

        PersonaConAdquisicionDeDatos Persona2 = new PersonaConAdquisicionDeDatos(nombre,edad,altura,peso); 

        System.out.println();

        System.out.println("Tu nombre es: "+nombre); //Se muestra en la pantalla el mensaje: "Tu nombre es:" seguido de los datos dentro de la variable "nombre".
        System.out.println("Tu edad es: "+edad); //Se muestra en la pantalla el mensaje: "Tu edad es:" seguido de los datos dentro de la variable "edad".
        System.out.println("Tu altura es: "+altura); //Se muestra en la pantalla el mensaje: "Tu altura es:" seguido de los datos dentro de la variable "altura".
        System.out.println("Tu peso es: "+peso); //Se muestra en la pantalla el mensaje: "Tu peso es:" seguido de los datos dentro de la variable "peso".

        nombre = sn.nextLine(); //Asignamos a la variable "Nombre" el valor que entre por el teclado con "sc" y a continuación del ".next" estará el tipo de dato primitivo que se guardará, en este caso "Line" que es un cadena de carácteres.
        edad = se.nextInt();    //Asignamos a la variable "Nombre" el valor que entre por el teclado con "sc" y a continuación del ".next" estará el tipo de dato primitivo que se guardará, en este caso "Int" que es un entero.
        altura = sa.nextInt();  //Asignamos a la variable "Nombre" el valor que entre por el teclado con "sc" y a continuación del ".next" estará el tipo de dato primitivo que se guardará, en este caso "Int" que es un entero.
        peso = sp.nextDouble(); //Asignamos a la variable "Nombre" el valor que entre por el teclado con "sc" y a continuación del ".next" estará el tipo de dato primitivo que se guardará, en este caso "Double" que es un double.

        PersonaConAdquisicionDeDatos Persona3 = new PersonaConAdquisicionDeDatos(nombre,edad,altura,peso); 

        System.out.println();

        System.out.println("Tu nombre es: "+nombre); //Se muestra en la pantalla el mensaje: "Tu nombre es:" seguido de los datos dentro de la variable "nombre".
        System.out.println("Tu edad es: "+edad); //Se muestra en la pantalla el mensaje: "Tu edad es:" seguido de los datos dentro de la variable "edad".
        System.out.println("Tu altura es: "+altura); //Se muestra en la pantalla el mensaje: "Tu altura es:" seguido de los datos dentro de la variable "altura".
        System.out.println("Tu peso es: "+peso); //Se muestra en la pantalla el mensaje: "Tu peso es:" seguido de los datos dentro de la variable "peso".
    }

}