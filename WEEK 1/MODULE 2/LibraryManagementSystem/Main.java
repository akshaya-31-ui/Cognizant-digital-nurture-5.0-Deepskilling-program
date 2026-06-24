import java.util.Arrays;
public class Main 
{
    public static void main(String[] args) 
    {
        Book[] books = {
            new Book(1, "The Great Gatsby",         "F. Scott Fitzgerald"),
            new Book(2, "Clean Code",               "Robert C. Martin"),
            new Book(3, "Atomic Habits",            "James Clear"),
            new Book(4, "Design Patterns",          "Gang of Four"),
            new Book(5, "Introduction to Algorithms","Thomas Cormen"),
            new Book(6, "You Don't Know JS",        "Kyle Simpson"),
            new Book(7, "The Pragmatic Programmer", "Andrew Hunt"),
        };
        System.out.println("LIBRARY CATALOG ");
        for(Book b:books) System.out.println(b);
        System.out.println("\nLINEAR SEARCH");
        Book result1=LibrarySearch.linearSearchByTitle(books,"Clean Code");
        if (result1!=null) System.out.println("Result: " + result1);
        Book result2 = LibrarySearch.linearSearchByTitle(books,"Harry Potter");
        System.out.println("Result: " + (result2 == null ? "Not Found" : result2));
        System.out.println("\nBINARY SEARCH");
        Book[] sortedBooks=Arrays.copyOf(books,books.length);
        LibrarySearch.sortByTitle(sortedBooks);
        System.out.println("\nSorted Library(Alphabetical):");
        for(Book b:sortedBooks) System.out.println("  " + b.getTitle());
        Book result3=LibrarySearch.binarySearchByTitle(sortedBooks,"The Great Gatsby");
        if(result3!=null) System.out.println("Result: " + result3);
        Book result4 = LibrarySearch.binarySearchByTitle(sortedBooks,"Harry Potter");
        System.out.println("Result: " + (result4 == null ? "Not Found" : result4));
        System.out.println("\n WHEN TO USE WHICH?");
        System.out.println("Linear Search:");
        System.out.println("  → Use when list is SMALL (< 100 books)");
        System.out.println("  → Use when list is UNSORTED");
        System.out.println("  → Use when data changes frequently");
        System.out.println("  → Time: O(n)");
        System.out.println("\nBinary Search:");
        System.out.println("  → Use when list is LARGE (1000+ books)");
        System.out.println("  → Use when list is SORTED");
        System.out.println("  → Use when data is stable (rare changes)");
        System.out.println("  → Time: O(log n)");
    }
}