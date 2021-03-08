package Main_Package;
import java.util.ArrayList;

public class Books_Library {

    public static ArrayList<Book> Books =new ArrayList<Book>() ;;
    Book book =new Book();
	/*
	 * Book bk=new Book(); Book bk2=new Book(); Book bk3=new Book(); Book bk4=new
	 * Book();
	 */
    
    public Books_Library()
     {
		
	 } 



    public void addBook(String title,String author,String isbn,String sign) 
     {
	    book.set_author(author);
	    book.set_ISBN(isbn);
	    book.set_title(title);
	    book.set_Sig(sign);
	    Books.add(book);
	 }

}
