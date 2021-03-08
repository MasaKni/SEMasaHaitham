package Main_Package;
import java.util.ArrayList;

public class Books_Library {

    public static ArrayList<Book> Books ;
    Book book =new Book();
    Book bk=new Book();
    Book bk2=new Book();
    Book bk3=new Book();
    Book bk4=new Book();
    
    public Books_Library()
     {
		Books= new ArrayList<Book>() ;
		book.set_author("Elizabeth Gilbert");
		book.set_ISBN("0143125842");
		book.set_title("The Signature of All Things");
		book.set_added(true);
		book.set_Sig("Elizabeth2014");
		Books.add(book);
		
		bk.set_author("Elizabeth Gilbert");
		bk.set_ISBN("0143038419");
		bk.set_title("Eat Pray Love");
		bk.set_added(true);
		bk.set_Sig("Elizabeth2007");
		Books.add(bk);
		
		bk2.set_author("Kent Beck");
		bk2.set_ISBN("9780321146");
		bk2.set_title("Test-Drivenest Driven Development: By Example");
		bk2.set_added(true);
		bk2.set_Sig("Beck2002");
		Books.add(bk2);
		
		bk3.set_author("Cassandra Clare");
		bk3.set_ISBN("1481455923");
		bk3.set_title("City of Bones");
		bk3.set_added(true);
		bk3.set_Sig("Cassandra2015");
		Books.add(bk3);
		
		bk4.set_author("Holly Black");
		bk4.set_ISBN("031631031X");
		bk4.set_title("The Cruel Prince");
		bk4.set_added(true);
		bk4.set_Sig("Holly2018");
		Books.add(bk4);
		
	 } 



    public void addBook(String title,String author,String isbn) 
     {
	    book.set_author(author);
	    book.set_ISBN(isbn);
	    book.set_title(title);
	    book.set_added(true);
	    Books.add(book);
	 }

}
