package Main_Package;


import java.util.ArrayList;

public class Books_Library {

public static ArrayList<Books_Library> Books = new ArrayList<Books_Library>() ;
public String title;
public String author;
public String ISBN;
public static Boolean added;
public void set_title(String my_title){
    this.title = my_title;
}
public void set_author(String my_author){
    this.author = my_author;
}
public void set_ISBN(String my_ISBN){
    this.ISBN = my_ISBN;
}

}
