public class ClassOne {
    int age;
    int cars;
    String Designation;
    String Name;

    public ClassOne(int age, int cars, String designation, String name) {
        this.age = age;
        this.cars = cars;
        Designation = designation;
        Name = name;
        this.message();
    }

    void message() {
        System.out.println(this.Designation);
    }
    public static void main(String[] args) {
        ClassOne x = new ClassOne(22, 4, "Machine Learning Engineer", "Sharma");
    }
}
//        final int SHARMA = 53;
//        System.out.println(SHARMA);
////
////        em.out.println(SHARMA);
//    }

//    public class ClassOneExample {
////        int roll_number;
////        String name;
////        long number;
//
//
//
////        SHARMA = 4;
//    }

//    public static void main(String[] args) {
//        ClassOneExample vishnu;
//
//        System.out.println(vishnu);
//    }
//}
