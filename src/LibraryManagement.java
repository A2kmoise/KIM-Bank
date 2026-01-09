import java.util.Date;

public class LibraryManagement{
    public static void main(String[] args){
        System.out.println("\t\t\t\t\t\t \t\t\t\t\t\t\t\t=====================================+ Welcome to URS library +========================================");
        User admin = new Admin(1, "Moise");
        User student1 = new Student(2, "Abayo","", "Computer science", new Date());

        System.out.println(admin);
        System.out.println(student1);
    }
}
