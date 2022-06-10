enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, FRIDAY, SATURDAY
}

public class Enumeration {
    Days days;

    public Enumeration(Days days) {
        this.days = days;
    }

    public void switchDays() {
        switch (days) {
            case MONDAY:
                System.out.println("This is Monday");
                break;
            case TUESDAY:
                System.out.println("This is Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("This is Wednesday");
                break;
            case FRIDAY:
                System.out.println("This is Friday");
                break;
            case SATURDAY:
                System.out.println("This is Saturday");
                break;
            case SUNDAY:
                System.out.println("This is Sunday");
                break;
            default:
                System.out.println("Bye Bye");
        }
    }

    public static void main(String[] args) {
        String str = "TUESDAY";
        Enumeration e = new Enumeration(Days.valueOf(str));
        e.switchDays();
    }
}
