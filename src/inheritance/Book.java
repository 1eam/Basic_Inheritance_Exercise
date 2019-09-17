package inheritance;

public class Book extends LiteratureFundament{

	private String publisher;
	private String genre;
	
	public Book(String title, String author, String publisher, String genre)
	{
		super(title, author);
		this.publisher = publisher;
		this.genre = genre;
	}
	
	public void Print()
	{
		super.Print();
		System.out.println("\tPublished by\t" + publisher);
		System.out.println("\tGenre \t\t" + genre);	
	}
	

}
