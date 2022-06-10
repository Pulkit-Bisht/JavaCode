//we can use main method inside  the enum


//All enums implicitly extend java.lang.Enum class.
// As a class can only extend one parent in Java, so an enum cannot extend anything else.




enum Color{
    RED,GREEN,BLUE;

    public static void main(String[] args) {
        Color c=Color.GREEN;
        System.out.println(c);
    }


}