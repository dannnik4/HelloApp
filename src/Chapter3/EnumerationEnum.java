package Chapter3;

public class EnumerationEnum {
    public static void main(String[] args) {
        Day current = Day.MONDAY;
        System.out.println(current);    // MONDAY
    }
}
enum Day{

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}