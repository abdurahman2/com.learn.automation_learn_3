package lambdastreams.task2;

import java.util.List;

public class DisplayOfTheTask {
    public static void main(String[] args) {
        Book book1 = new Book("myBook", 5);
        Book book2 = new Book("myBook", 5);

        List<Book> listOfRandomBooks = Book.createListOfBooks(10);
        System.out.println("List of all random books: " + listOfRandomBooks);

        List<String> listOfNamesAllBooks = Book.createListOfNamesOfAllBooks(listOfRandomBooks);
        System.out.println("List of all book names: " + listOfNamesAllBooks);

        int totalPriceOfAllBooks = Book.totalPriceOfAllBooks(listOfRandomBooks);
        System.out.println("Total price of all books = " + totalPriceOfAllBooks);

        List<String> listOfBooksContainsA = Book.createListOfBooksContainsA(listOfRandomBooks);
        System.out.println("List of books names with \"A\": " + listOfBooksContainsA);

        Book bookWithHighestPrice = Book.selectBookWithHighestPrice(listOfRandomBooks);
        System.out.println("Book with highest price is: " + bookWithHighestPrice.getName());

        int cauntOfBookNamesWith5Character = Book.totalOfBookNamesWith5Character(listOfRandomBooks);
        System.out.println("Number of books where name consists of 5 letters = " + cauntOfBookNamesWith5Character);

        List<Book> cheapBooks = Book.createListCheapBooks(listOfRandomBooks);
        System.out.println("List of all books except books with price higher then 30: " + cheapBooks);

        List<Book> sortedListOfBooks = Book.createSortedListOfBooks(listOfRandomBooks);
        System.out.println("List of sorted books: " + sortedListOfBooks);

        System.out.println("Library name is: " + Book.bookMap(book1, book2));
    }
}
