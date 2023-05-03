package Library;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class BookOrderList {
    private Reader reader;
    private Book book;
    private Librarian librarian;
    private Date OrderDate;
    private Date ReturnDate;
    private boolean FinePaid;

    public BookOrderList(Reader reader, Book book, Librarian librarian, Date OrderDate, Date ReturnDate, boolean finepaid) {
        this.reader = reader;
        this.book = book;
        this.librarian = librarian;
        this.OrderDate = OrderDate;
        this.ReturnDate = ReturnDate;
        this.FinePaid = finepaid;
    }

    //Do not forget setters and getters
    public double TakeFine() {

        double totalfine = 0;

        if (!FinePaid) {

            Date OrderDate1 = OrderDate;
            Date ReturnDate1 = new Date();
            long dateorder = OrderDate1.getTime();
            long datereturn = ReturnDate1.getTime();
            long daysdiff = Math.abs(dateorder - datereturn);
            long days = TimeUnit.DAYS.convert(daysdiff, TimeUnit.MILLISECONDS);
            System.out.println("Days : " + days);
            if (days > 0)
                totalfine = days;

            else
                totalfine = 0;

        }
        return totalfine;
    }
}



