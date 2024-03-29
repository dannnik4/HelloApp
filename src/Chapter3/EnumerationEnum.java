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

//        Book1 b1 = new Book1("War and Peace", "L. Tolstoy", Type.BELLETRE);
//        System.out.printf("Book '%s' has a type %s", b1.name, b1.bookType);
//
//        switch(b1.bookType){
//            case BELLETRE:
//                System.out.println("Belletre");
//                break;
//            case SCIENCE:
//                System.out.println("Science");
//                break;
//            case SCIENCE_FICTION:
//                System.out.println("Science fiction");
//                break;
//            case PHANTASY:
//                System.out.println("Phantasy");
//                break;
//        }
//    }
//}
//class Book1{
//
//    String name;
//    Type bookType;
//    String author;
//
//    Book1(String name, String author, Type type){
//
//        bookType = type;
//        this.name = name;
//        this.author = author;
//    }
//}
//
//enum Type
//{
//    SCIENCE,
//    BELLETRE,
//    PHANTASY,
//    SCIENCE_FICTION
//}

//        Type[] types = Type.values();
//        for (Type s : types) { System.out.println(s); }
//    }
//}
//enum Type
//{
//    SCIENCE,
//    BELLETRE,
//    PHANTASY,
//    SCIENCE_FICTION
//}

//        System.out.println(Color.RED.getCode());        // #FF0000
//        System.out.println(Color.GREEN.getCode());      // #00FF00
//
//
//    }
//}
//enum Color{
//    RED("#FF0000"), BLUE("#0000FF"), GREEN("#00FF00");
//    private String code;
//    Color(String code){
//        this.code = code;
//    }
//    public String getCode(){ return code;}
//}

        Operation1 op = Operation1.SUM;
        System.out.println(op.action(10, 4));   // 14
        op = Operation1.MULTIPLY;
        System.out.println(op.action(6, 4));    // 24
    }
}
enum Operation1{
    SUM{
        public int action(int x, int y){ return x + y;}
    },
    SUBTRACT{
        public int action(int x, int y){ return x - y;}
    },
    MULTIPLY{
        public int action(int x, int y){ return x * y;}
    };
    public abstract int action(int x, int y);
}