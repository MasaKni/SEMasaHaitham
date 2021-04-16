package mainpackage;

public class Book {

	private String title;
    private String author;
    private String isbn;
    private String signature;
	
	public Book()
	{
        isbn = "";
		title = "None";
		author = "Nobody";
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
     return this.signature;
    }

}
