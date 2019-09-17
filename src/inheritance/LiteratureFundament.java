package inheritance;

public class LiteratureFundament {
	protected String title;
	protected String author;
	
	public LiteratureFundament(String title, String author)
	{
		this.title = title;
		this.author = author;
	}
	
	public void Print()
	{
		System.out.println(title);
		System.out.println("\tWritten by\t" + author);
	}
}
