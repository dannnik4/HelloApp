package Chapter3;

public class EnumerationEnum {
    public static void main(String[] args) {
//        Day current = Day.MONDAY;
//        System.out.println(current);    // MONDAY
//    }
//}
//enum Day{
//
//    MONDAY,
//    TUESDAY,
//    WEDNESDAY,
//    THURSDAY,
//    FRIDAY,
//    SATURDAY,
//    SUNDAY
//}

        Book1 b1 = new Book1("War and Peace", "L. Tolstoy", Type.BELLETRE);
        System.out.printf("Book '%s' has a type %s", b1.name, b1.bookType);

        switch(b1.bookType){
            case BELLETRE:
                System.out.println("Belletre");
                break;
            case SCIENCE:
                System.out.println("Science");
                break;
            case SCIENCE_FICTION:
                System.out.println("Science fiction");
                break;
            case PHANTASY:
                System.out.println("Phantasy");
                break;
        }
    }
}
class Book1{

    String name;
    Type bookType;
    String author;

    Book1(String name, String author, Type type){

        bookType = type;
        this.name = name;
        this.author = author;
    }
}

enum Type
{
    SCIENCE,
    BELLETRE,
    PHANTASY,
    SCIENCE_FICTION
}