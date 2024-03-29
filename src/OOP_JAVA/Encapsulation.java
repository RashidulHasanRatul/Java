package OOP_JAVA;

public class Encapsulation {
    private String name; // private = restricted access

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }


    public static void main(String[] args) {
        Encapsulation myobj = new Encapsulation();
        myobj.setName("Ratul");
        System.out.println( myobj.getName());

    }
}
