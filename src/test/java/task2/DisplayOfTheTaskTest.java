package task2;

import lambdastreams.task2.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class DisplayOfTheTaskTest {
    Book book1 = new Book("myBook", 5);
    Book book2 = new Book("myBook", 5);

    List<Book> listOfBooks = List.of(new Book("Zzq", 23), new Book("Privet", 26),
            new Book("Zcwdbz", 80), new Book("Yyrbrc", 18), new Book("Rrvsghe", 86),
            new Book("Rpgtnz", 84), new Book("Ooub", 47), new Book("Nlwijm", 35),
            new Book("Lxhwak", 53), new Book("Kesvkwkhs", 51));

    @Test
    public void listOfRandomBooks() {
        System.out.println("List of all random books: " + listOfBooks);
        Assertions.assertEquals(10, listOfBooks.size(),
                "The size of the list of random books meets the criteria");
    }

    @Test
    public void listOfNamesAllBooks() {
        List<String> listOfNamesAllBooks = Book.createListOfNamesOfAllBooks(listOfBooks);
        System.out.println("List of all book names: " + listOfNamesAllBooks);
        Assertions.assertEquals(10, listOfBooks.size(),
                "The size of the list of all names random books meets the criteria");
    }

    @Test
    public void totalPriceOfAllBooks() {
        int totalPriceOfAllBooks = Book.totalPriceOfAllBooks(listOfBooks);
        System.out.println("Total price of all books = " + totalPriceOfAllBooks);
        Assertions.assertEquals(503, totalPriceOfAllBooks, "Total price of all books as expected");
    }

    @Test
    public void listOfBooksContainsA() {
        List<String> myListOfRandomBooksWithA = List.of("Lxhwak");
        List<String> listOfBooksContainsA = Book.createListOfBooksContainsA(listOfBooks);
        System.out.println("List of books names with \"A\" and \"a\": " + listOfBooksContainsA);
        Assertions.assertEquals(myListOfRandomBooksWithA, listOfBooksContainsA, "List of books names with \"A\" and \"a\"");
    }

    @Test
    public void bookWithHighestPrice() {
        Book myBookWithHighestPrice = new Book("Rrvsghe", 86);
        Book bookWithHighestPrice = Book.selectBookWithHighestPrice(listOfBooks);
        System.out.println("Book with highest price is: " + bookWithHighestPrice);
        Assertions.assertEquals(myBookWithHighestPrice, bookWithHighestPrice,
                "Books with the highest price are displayed as correct");
    }

    @Test
    public void countOfBookNamesWith5Character() {
        int countOfBookNamesWith5Character = Book.totalOfBookNamesWith5Character(listOfBooks);
        System.out.println("Number of books where name consists of 5 letters = " + countOfBookNamesWith5Character);
        Assertions.assertEquals(0, countOfBookNamesWith5Character,
                "Only books in the name of which 5 letters are displayed");
    }

    @Test
    public void cheapBooks() {
        List<Book> myCheapBooks = List.of(new Book("Zzq", 23), new Book("Privet", 26),
                new Book("Yyrbrc", 18));
        List<Book> cheapBooks = Book.createListCheapBooks(listOfBooks);
        System.out.println("List of all books except books with price higher then 30: " + cheapBooks);
        Assertions.assertEquals(myCheapBooks, cheapBooks, "List of all books except books with price higher then 30");
    }

    @Test
    public void sortedListOfBooks() {
        List<Book> mySortedListBooks = List.of(new Book("Zzq", 23), new Book("Zcwdbz", 80),
                new Book("Yyrbrc", 18), new Book("Rrvsghe", 86),
                new Book("Rpgtnz", 84), new Book("Privet", 26),
                new Book("Ooub", 47), new Book("Nlwijm", 35),
                new Book("Lxhwak", 53), new Book("Kesvkwkhs", 51));
        List<Book> sortedListOfBooks = Book.createSortedListOfBooks(listOfBooks);
        System.out.println("List of sorted books: " + sortedListOfBooks);
        Assertions.assertEquals(mySortedListBooks, sortedListOfBooks, "Books are sorted correctly");
    }

    @Test
    public void libraryName() {
        System.out.println("Library name is: " + Book.bookMap(book1, book2));
        Assertions.assertEquals(book1, book2, "Library is same");
    }

    @Test
    public void createListOfRandomBooks() {
        System.out.println(Book.createListOfBooks(2));
    }
}
