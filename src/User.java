import java.util.Date;

abstract  class User {
int id;
String name;
String role;
public User(){}
    public User(int id, String name, String role){
        this.id = id;
        this.name = name;
        this.role = role;
    }
abstract void getRole();

}

class Admin extends User {
@Override
    void getRole(){
    System.out.println("I am admin");
}
}

class Student extends User {
String department;
Date createAt;
@Override
    void getRole(){
    System.out.println("I am student");
}


}