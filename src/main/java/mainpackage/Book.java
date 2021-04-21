package mainpackage;

public class Book {


	private String title;
	private String author;
	private String isbn;
	private String signature;
	
	public Book()
	{
		this.setIsbn("");
		this.setAuthor("NONE");
		this.setSig("NONE");
		this.setTitle("NONE");
	
	}
   
	public void setTitle(String mytitle)
    {
     this.title = mytitle;
    }
    public void setSig(String sig)
    {
     this.signature = sig;
    }
    public void setAuthor(String myauthor)
    {
     this.author = myauthor;
    }
    public void setIsbn(String myisbn)
    {
     this.isbn = myisbn;
    }
 
  
    public String getISBN() 
    {
	 return this.isbn;
	}
    public String getAuthor() 
    {
	 return this.author;
	}
    public String getTitle() 
    {
	 return this.title;
	}
    public String getSig() 
    {	
     return signature;
    }

}
