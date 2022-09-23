package bookComparator;

import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;


public class ComparatorBook {

	public static void main(String[] args) {
		List<Book> books = init();
		
		Comparator<Book> compareByPageCount = (b1, b2) -> b1.getPages() - b2.getPages();
		BinaryOperator<Book> operation=BinaryOperator.maxBy(compareByPageCount);
		
		System.out.println(operation.apply(books.get(2), books.get(1)));
		System.out.println(operation.apply(books.get(5), books.get(4)));
			
	}
	private static List<Book> init(){
		return BookFactory.getBookList();
	}
}
