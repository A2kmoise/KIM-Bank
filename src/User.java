import java.util.Date;

abstract  class User {
int id;
String name;
String role;

    public User(int id, String name, String role){
        this.id = id;
        this.name = name;
        this.role = role;
    }
abstract String getRole();


@Override
public String toString(){
    return ( "ID: "+ id + " \tNAME: " + name + " \tROLE: " +role);
}

}

class Admin extends User {

public  Admin(int id, String name){
    super(id, name, "ADMIN");
}
    @Override
    String getRole(){
        return(this.role);
    }
}

class Student extends User {
String department;
Date createAt;

public Student (int id, String name,String role, String department, Date createAt) {
    super(id, name, (role != "ADMIN") ? "STUDENT": role);
    this.department = department;
    this.createAt = createAt;
}

@Override
    String getRole(){
    return(this.role);
}

@Override
    public String toString(){
    return ("ID: " + id + "\tNAME: " + name +  "\tDEPARTMENT: "+ department + "\tCREATED AT: " + createAt +"\tROLE: "+ role);
}
}