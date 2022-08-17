package reading.simulation;

public class Book {
	String title;
	String type;
	int page;
	int currentPage;
	boolean isHardCover;
	Author author;
	BookType bookType;
	
	public BookType getBookType() {
		System.out.println(bookType);
		return bookType;
	}

	public void setBookType(BookType bookType) {
		this.bookType = bookType;
	}

	Book(String title, String type, int page, int currentPage, boolean isHardCover, Author author,BookType bookType){
		this.title=title;
		this.type=type;
		this.page=page;
		this.currentPage=currentPage;
		this.isHardCover=isHardCover;
		this.author=author;
		this.bookType=bookType;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public boolean isHardCover() {
		return isHardCover;
	}
	public void setHardCover(boolean isHardCover) {
		this.isHardCover = isHardCover;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public int currentPageCounter(int numberOfReadingPages) {
		currentPage += numberOfReadingPages;
		System.out.println("su ana kadar " + currentPage + " sayfa okudunuz.");
		return currentPage;
	}
	
	
}
