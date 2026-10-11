import java.util.*;

class Library {
    int bookNo;
    String bookName;
    String author;

    Library(int n, String name, String a) {
        bookNo = n;
        bookName = name;
        author = a;
    }

    static int addBook(Library[] books, int count, Scanner sc) {
        System.out.print("Book number: ");
        int no = sc.nextInt();
        System.out.print("Book name: ");
        String name = sc.next();
        System.out.print("Author: ");
        String author = sc.next();
        
        books[count] = new Library(no, name, author);
        count++;
        System.out.println("Book added successfully.");
        return count;
    }

    static int removeBook(Library[] books, int count, Scanner sc) {
        System.out.print("Enter book number to delete: ");
        int no = sc.nextInt();
        
        for (int i = 0; i < count; i++) {
            if (books[i].bookNo == no) {
                for (int j = i; j < count - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[count - 1] = null;
                count--;
                System.out.println("Book deleted successfully.");
                return count;
            }
        }
        System.out.println("Book not found.");
        return count;
    }

    void display() {
        System.out.println("Book number : " + bookNo);
        System.out.println("Book name : " + bookName);
        System.out.println("Author: " + author);
    }
}

public class A7e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library[] books = new Library[10];
        int count = 0;
        int choice;

        do {
            System.out.println("1. Add book");
            System.out.println("2. Delete book");
            System.out.println("3. Display books");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                count = Library.addBook(books, count, sc);
            } else if (choice == 2) {
                count = Library.removeBook(books, count, sc);
            } else if (choice == 3) {
                for (int i = 0; i < count; i++) {
                    System.out.println("Book " + (i + 1));
                    books[i].display();
                }
            } else if (choice == 4) {
                System.out.println("Exiting....");
            } else {
                System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        sc.close();
    }
}