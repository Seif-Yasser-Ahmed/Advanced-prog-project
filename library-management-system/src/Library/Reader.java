package Library;

public class Reader extends Person{
    int Id;
    String Username;
    public Reader(String name, int id) {
        this.Username=name;
        this.Id=id;
    }
    public String getUsername() {
        return Username;
    }
}
