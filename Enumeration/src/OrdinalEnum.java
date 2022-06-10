//What is Ordinal in  enum java.lang.Enum class
enum Colors {
    RED, GREEN, BLUE;

}

public class OrdinalEnum {
    public static void main(String[] args) {
        Colors arr[] = Colors.values();

        //Now access values of array with the help of array

        for (Colors col : arr) {
            System.out.println(col+ " At index "+col.ordinal());
        }
//        System.out.println(Colors.valueOf("RED"));
    }
}