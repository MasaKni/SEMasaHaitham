package mainpackage;
import java.util.ArrayList;

public class BooksLibrary {

    public static  ArrayList<Book> books2 =new ArrayList<Book>() ;;
    private Book book =new Book();

    
    public BooksLibrary()
     {
		// do nothing
	 } 



    public void addBook(String title,String author,String isbn,String sign) 
     {
	    book.setAuthor(author);
	    book.setIsbn(isbn);
	    book.setTitle(title);
	    book.setSig(sign);
	    books2.add(book);
	 }

}
