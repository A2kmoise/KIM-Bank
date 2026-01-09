import java.util.Date;

class Book {
String title;
String author;
String ISBN;
boolean availability;
int id;

 public  Book(int id, String title, String author, String ISBN){
     this.id = id;
     this.title = title;
     this.author = author;
     this.ISBN = ISBN;
 };


     boolean bookAvailabiliy(){
    return availability;
     }

}

abstract class Transaction {
 int bookId;
 String userName;
 String type; /* transaction type*/
 Date date;

 public Transaction(int bookId, String userName, String type, Date date){
this.bookId = bookId;
this.userName = userName;
this.type = type;
this.date = date;
 }

 abstract void printTransaction();
}

