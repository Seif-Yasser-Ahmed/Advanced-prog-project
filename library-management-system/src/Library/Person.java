package Library;

import java.util.List;

public abstract class Person {
    public  int id;
    public int password;
    public static int UserId;
    public String type;
    public  String FirstName;
    public  String LastName;
    public  String Adderss;

    public Person() {
    }

    public  int CellPhone;
    public  String Email;
    public  boolean isBlocked;
    public String UserName;

    public Person(int id, int password, String type, String FirstName, String LastName, String Adderss, int CellPhone, String Email, boolean isBlocked) {
        this.UserId = id;
        this.password = password;
        this.type = type;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Adderss = Adderss;
        this.CellPhone = CellPhone;
        this.Email = Email;
        this.isBlocked = isBlocked;
    }

//    public static Person search_user(List<Readerr> readers, int UserId);

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setAdderss(String Adderss) {
        this.Adderss = Adderss;
    }

    public void setCellPhone(int CellPhone) {
        this.CellPhone = CellPhone;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setIsBlocked(boolean isBlocked) {
        this.isBlocked = isBlocked;
    }
    public int getId() {
        return id;
    }

    public int getPassword() {
        return password;
    }

    public String getType() {
        return type;
    }

    public String getFirtsName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getAdderss() {
        return Adderss;
    }

    public int getCellPhone() {
        return CellPhone;
    }

    public String getEmail() {
        return Email;
    }

    public boolean isIsBlocked() {
        return isBlocked;
    }
//    public static boolean search_user(int user){
//        if (UserId==user){
//            return true;}
//        else {
//            return false;}
//    }
}

