/* Handy shortcuts:
reveal required input for constructor: ctrl + shift + space
*/

package inheritance;

public class Main_Inheritance {

	public static void main(String[] args) {
		Book a = new Book("The Lord Of The Rings", "J.R.R. Tolkein", "George Allen and Unwin", "Fantasy");
		Poem b = new Poem("The Iliad", "Homer", "Dactylic Hexameter");
		Book c = new Book("The Pillgrims Progress", "John Bunyan", "John Bunyan", "Christian Biography");
		a.Print();
		b.Print();
		c.Print();
	}

}
