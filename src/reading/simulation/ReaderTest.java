package reading.simulation;

public class ReaderTest {

	public static void main(String[] args) {
		Author author=new Author("Victor Hugo");
		Book book=new Book("Sefiller","Roman",250,0,true,author,BookType.FICTION);
		Book book2=new Book("Deniz Ýscileri","Roman",100,20,false,author,BookType.COMEDY);
		
		book2.getBookType();

		Reader reader=new Reader("Asli",21,'F');
		
		reader.read(book);
		book.currentPageCounter(50);
		book.currentPageCounter(10);
		
		System.out.println(author.name+ " " + book.type + " türünde bir kitap yazmýþtýr.");
		
		reader.read(book2);
	}

}
