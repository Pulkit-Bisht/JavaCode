

/*Outside class decleration of enum
enum Colour {
    RED, GREEN, BLUE
}

 */

/* internally above enum Color is converted to
class Color
{
     public static final Color RED = new Color();

     //Kya eska matlb h color type ka  container jiska nam red h wo color class ko rkh rha h
     public static final Color BLUE = new Color();
     public static final Color GREEN = new Color();
}*/

public class Enum {
//Enum dec inside the class
    enum Colour {
        RED, GREEN, BLUE
    }
public static void main(String []args){
   Colour c=Colour.RED;
    System.out.println(c);
}
}
