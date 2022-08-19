package lambdastreams.task2;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.stream.Collectors;


public class Book {

    private String name;
    private Integer price;

    public Book(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public static List<Book> createListOfBooks(Integer booksQuantity) {
        List<Book> listOfBooks = new ArrayList<>();
        for (int i = 0; i < booksQuantity; i++) {
            String randomBookName = RandomStringUtils.randomAlphabetic(3, 10).toLowerCase(Locale.ROOT);
            randomBookName = StringUtils.capitalize(randomBookName);
            Integer randomBookPrice = new Random().nextInt(100);
            Book book = new Book(randomBookName, randomBookPrice);
            listOfBooks.add(book);
        }
        return listOfBooks;
    }

    public static List<String> createListOfNamesOfAllBooks(List<Book> listOfBooks) {
        return listOfBooks.stream()
                .map(Book::getName)
                .collect(Collectors.toList());
    }

    public static int totalPriceOfAllBooks(List<Book> listOfBooks) {
        return listOfBooks.stream()
                .map(Book::getPrice)
                .reduce(0, Integer::sum);
    }

    public static List<String> createListOfBooksContainsA(List<Book> listOfBooks) {
        return listOfBooks.stream()
                .map(Book::getName)
                .filter(name -> name.contains("A") || name.contains("a"))
                .collect(Collectors.toList());
    }

    public static Book selectBookWithHighestPrice(List<Book> listOfBooks) {
        return listOfBooks.stream()
                .max(Comparator.comparing(Book::getPrice))
                .orElseThrow(NoSuchElementException::new);
    }

    public static int totalOfBookNamesWith5Character(List<Book> listOfBooks) {
        return (int) listOfBooks.stream()
                .map(Book::getName)
                .filter(name -> name.length() == 5)
                .count();
    }

    public static List<Book> createListCheapBooks(List<Book> listOfBooks) {
        return listOfBooks.stream()
                .filter(book -> book.getPrice() <= 30)
                .collect(Collectors.toList());
    }

    public static List<Book> createSortedListOfBooks(List<Book> listOfBooks) {
        return listOfBooks.stream()
                .sorted(Comparator.comparing(Book::getName)
                        .reversed()
                        .thenComparing(Book::getPrice))
                .collect(Collectors.toList());
    }

    public static String bookMap(Book book1, Book book2) {
        Map<Book, String> mapWithBook = new HashMap<>();
        mapWithBook.put(book1, "Central library");
        return mapWithBook.get(book2);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name: '" + name + '\'' +
                ", price: " + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return name.equals(book.name) && price.equals(book.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}