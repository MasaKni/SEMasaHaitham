package mainpackage;
import java.util.ArrayList;
import java.util.List;

import testpackage.AddBookSteps;


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
    
    public void checkIsbn(AddBookSteps addBookSteps, String isbn) {
		for (int j = 0; j <= isbn.length() - 1; j++) 
		     { 
			  if (Character.getNumericValue(isbn.charAt(j))>= 0|| Character.getNumericValue(isbn.charAt(j))<= 9)
			    {
				  addBookSteps.tot+=Character.getNumericValue(isbn.charAt(j)) *addBookSteps.num;
				  addBookSteps.num--;
			    }
			  else 
				{
				//  Added= false;
				  break;
				}
		     }
	}

	public static List<Book> getArray() 
    {
    	return books2;
    }

}
