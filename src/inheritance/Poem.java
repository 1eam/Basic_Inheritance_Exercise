/*The following variables: title & author are currently redundant.
  As well as our entire constructor at the moment. This is because of our newly created superclass.
  
  --MEANING EXTENDS--
  In more Java terms, we're saying that the Poem subclass inherits (so extends) from the Literature class.
  */



package inheritance;

public class Poem extends LiteratureFundament{
	
//	private String title;
//	private String author;
	private String style;
//	public Poem(String title, String author, String style)
	{
//		this.title = title;
//		this.author = author;
		this.style = style;
	}
	
	public void Print()
	{
		System.out.println(title);
		System.out.println("\tStyle\t\t" + style);
	}
	

}
