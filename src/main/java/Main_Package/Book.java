package Main_Package;

public class Book {

	public String title;
	public String author;
	public String ISBN;
	public String Signature;
	public static Boolean added;
	
	public Book()
	{
		ISBN = "";
		title = "None";
		author = "Nobody";
		added = false;
	}
   
	public void set_title(String my_title)
    {
     this.title = my_title;
    }
    public void set_Sig(String Sig)
    {
     this.Signature = Sig;
    }
    public void set_author(String my_author)
    {
     this.author = my_author;
    }
    public void set_ISBN(String my_ISBN)
    {
     this.ISBN = my_ISBN;
    }
    public void set_added(boolean k)
    {
     added = k;
    }
    
    public boolean getAdded() 
    {
	 return added;
    } 
    public String getISBN() 
    {
	 return this.ISBN;
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
     return this.Signature;
    }

}
