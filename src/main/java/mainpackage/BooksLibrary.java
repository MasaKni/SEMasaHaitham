package mainpackage;
import java.util.ArrayList;
import java.util.List;


public class BooksLibrary {
	protected static final List<Book> books2=new ArrayList<Book>() ;
	private Book book =new Book();

    public void addBook(String title,String author,String isbn,String sign) 
     {
	    book.setAuthor(author);
	    book.setIsbn(isbn);
	    book.setTitle(title);
	    book.setSig(sign);
	    
		books2.add(book);
	 }
    
   
	public static List<Book> getArray() 
    {
    	return books2;
    }

}
