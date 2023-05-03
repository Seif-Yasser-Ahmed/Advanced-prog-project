package Library;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[]args){
        Scanner s1=new Scanner(System.in);
        ArrayList<Librarian>librarians=new ArrayList<Librarian>();
        Librarian l1=new Librarian(1234,1234,"male","seif","yasser","cairo",1234,"seif",false);
        Librarian l2=new Librarian(1234,1234,"male","seif","yasser","cairo",1234,"seif",false);
        Librarian l3=new Librarian(1234,1234,"male","seif","yasser","cairo",1234,"seif",false);
        Librarian l4=new Librarian(1234,1234,"male","seif","yasser","cairo",1234,"seif",false);
        Librarian l5=new Librarian(1234,1234,"male","seif","yasser","cairo",1234,"seif",false);
        Librarian l6=new Librarian(1234,1234,"male","seif","yasser","cairo",1234,"seif",false);
        Librarian l7=new Librarian(1234,1234,"male","seif","yasser","cairo",1234,"seif",false);
        librarians.add(l1);
        librarians.add(l2);
        librarians.add(l3);
        librarians.add(l4);
        librarians.add(l5);
        librarians.add(l6);
        librarians.add(l7);
        Reader r1=new Reader("seif",2023);
        Reader r2=new Reader("seif",2025);
        Reader r3=new Reader("seif",2024);
        l1.addreader(r1);
        l1.addreader(r2);
        l1.addreader(r3);
        l1.show_reader_list();
        System.out.println("enter id you are searching for");
        int input;
        input=s1.nextInt();

        if(l1.search_user(input)>=0){
            System.out.println(l1.show_user(l1.search_user(input)));
        }else{
            System.out.println("There's no reader with id: "+input);
        }

    }
}
