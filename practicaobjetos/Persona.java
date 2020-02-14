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

    //Atributos
    String Nombre;
    int Edad;

//Métodos


    //Se coloca el nombre exactamente igual que el de la clase, pero no es un método que regrese algún valor de retorno, nis iqueira void.
    //El método puede tener parametros, los cuales ayudan a inicializar los atributos, en este caso los párametros "Nombre" y "Edad".
    public Persona(String Nombre,int Edad) 
    {
        //Si se utiliza la siguiente manera, se tiene que poner también el guión bajo "_" en los arametros del método constructor.
        //Nombre = _Nombre; //Se inicializa el atributo "Nombre" igual al valor introducido.
        //Edad = _Edad; //Se inicializa el atributo "Edad" igual al valor introducido

        //Si se utilzia este método, ni en los parametros ni en la asignación se utiliza el guión bajo "_".
        //La palabra reservada "This" indica a Java que se está refieriendo al atributo y que recibirán los valores de los arguementos que se enviarán.
        this.Nombre = Nombre; //Se inicializa el atributo "Nombre" igual al valor introducido.
        this.Edad = Edad; //Se inicializa el atributo "Edad" igual al valor introducido

    }

    //Método de tipo void que lo únicop que hace es mostrar los atributos introducidos en pantalla.

    public void MostrarDatos()
    {

        System.out.println("El nombre es: "+Nombre); //Para mostrar en pantalla el atributo "Nombre" introducido.
        System.out.println("La edad es: "+Edad); //Para mostrar en pantalla el atributo "Edad" introducido.

    }

}
