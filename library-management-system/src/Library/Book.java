package Library;
import java.util.*;
public class Book {
       private String title;
        private String author;
        private int bookid;
        private String subject;
        public static int bookidcounter = 0;
        private boolean isAvaliable ;

        public Book(){
            this.author=null;
            this.title=null;
            this.bookid=0;
            this.subject=null;
            this.isAvaliable=false;
        }

        public Book( String title ,String author ,int bookid ,String subject ,boolean isAvaliable )
        {
            bookidcounter++;
            if(bookid==-1)
            {
                bookidcounter = bookid;
            }
            else
            {
                this.bookid=bookid;
                this.author=author;
                this.title=title;
                this.subject=subject;
                this.isAvaliable=isAvaliable;
            }
        }



        public void printInfo()
        {
            System.out.println(title + "\t\t\t" + author + "\t\t\t" + subject);
        }

        public void changeInfo(){

            Scanner scanner = new Scanner(System.in);
            String input;

            System.out.println("\nUpdate Author? (y/n)");
            input = scanner.nextLine();

            if(input.equalsIgnoreCase("y")){

                System.out.println("\nEnter new Author: ");
                author=scanner.nextLine();
            }

            System.out.println("\nUpdate Subject? (y/n)");
            input = scanner.nextLine();

            if(input.equalsIgnoreCase("y"))
            {
                System.out.println("\nEnter new Subject: ");
                subject = scanner.nextLine();
            }
            System.out.println("\nUpdate Title? (y/n)");
            input = scanner.nextLine();

            if(input.equalsIgnoreCase("y"))
            {
                System.out.println("\nEnter new Title: ");
                title = scanner.nextLine();
            }
            System.out.println("\nBook is successfully updated.");
        }



        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public int getBookid() {
            return bookid;
        }

        public String getSubject() {
            return subject;
        }

        public static int getBookidcounter() {
            return bookidcounter;
        }

        public boolean isAvaliable() {
            return isAvaliable;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public void setBookid(int bookid) {
            this.bookid = bookid;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public static void setBookidcounter(int bookidcounter) {
            Book.bookidcounter = bookidcounter;
        }

        public void setIsLoan(boolean isAvaliable) {
            this.isAvaliable = isAvaliable;
        }

//    public static void main(String args[]){
//
//        Book b = new Book("Mohamed","Salah",1,"car",false);
//        b.printInfo();
//        System.out.println(bookidcounter);
//        b.changeInfo();
//        b.printInfo();
//        System.out.println(bookidcounter);
//    }



    }
