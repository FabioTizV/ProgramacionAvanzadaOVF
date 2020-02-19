    //Constructor
    //¿Qué es un "Constructor"?
    //R = Es un método especial de una clase que se manda llamar SIEMPRE que se crea un objeto de esa clase. Básicamente, es parte de cada clase.
    //Cuando se CREA un objeto pasan 3 cosas:
    //  1. Se asigna memoria para el objeto.
    //  2. Se inicializan los ATRIBUTOS del objeto.
    //  3. Se manda a llamar al CONSTRUCTOR de la clase (SE PUEDE LLAMAR A UNO, PERO EXISTIR VARIOS).

    //EJEMPLO

    //Persona P1 = new Persona();
    //        |         |     |  
    //        1         3     2

    //CARACTERÍSTICAS DE LOS CONSTRUCTORES

    //1. Tienen el mismo nombre que la clase en la que se encuentran.
    //2. No devuelve ningún valor, por lo que ni siquiera es de tipo "void".
    //3. Debe declararse como " Público".
    //4. Se ejecuta una sola vez.
    //5. Es el primer método que se ejecuta.
    //6. Su objetivo es INICIALIZAR los atributos de un objeto.

package practicaobjetos;

public class Persona 
{

    public Persona(String Nombre,int Edad,int Altura,double Peso) 
    {
        
        String nombre;
        int edad;
        int altura;
        double peso;

    }


}
