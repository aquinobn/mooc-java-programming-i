import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }           
            System.out.print("Pages: ");
            Integer pages = Integer.parseInt(scanner.nextLine());            
            System.out.print("Publication year: ");
            Integer year = Integer.parseInt(scanner.nextLine());            
            
            Book book = new Book(title, pages, year);
            books.add(book);                        
        }

        System.out.println("What information will be printed? ");
        String selection = scanner.nextLine();        

        for (Book book : books) {
            System.out.println(book.toString(selection));
        }
        
        scanner.close();        
    }
}
