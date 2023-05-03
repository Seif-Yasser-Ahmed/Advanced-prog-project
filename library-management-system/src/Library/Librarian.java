package Library;
import java.util.ArrayList;

public class Librarian extends Person {
    ArrayList<Reader> readers=new ArrayList<Reader>();
    public Librarian(int id, int password, String type, String FirstName, String LastName, String Adderss, int CellPhone, String Email, boolean isBlocked) {
        super(id, password, type, FirstName, LastName, Adderss, CellPhone, Email, isBlocked);
    }

    public void show_reader_list(){
        for (Reader r:readers) {
            System.out.println(r.getId()+" "+r.getUsername());
        }
    }
    public Reader show_user(int z){
        return readers.get(z);
    }
    protected void addreader(Reader reader){
        readers.add(reader);
    }
    protected void removereader(Reader reader){
        readers.remove(reader);
    }
    public int search_user(int UserId){
        for (int i=0;i<readers.size();i++) {
            if(readers.get(i).getId()==UserId) {
                return i;
            }

        }
        return -1;
    }
    public Reader show_Reader(int x){
        return readers.get(x);
    }
}