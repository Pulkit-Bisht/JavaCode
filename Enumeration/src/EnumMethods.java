public class EnumMethods {

    enum Colour{
        RED,GREEN,YELLOW;

//Enum constructor cant be public
        private Colour(){
            System.out.println("enum construction is called "+this.toString());

        }

        public void firstMethod(){
            System.out.println("Your Method is called");
        }
    }

    public static void main(String[] args) {
        Colour colour=Colour.RED;
        System.out.println(colour);
    }
}
