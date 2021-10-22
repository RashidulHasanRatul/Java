package BasicJava;

public class Fields_Constructors_Method {
    // Fields - Parameters,Variable-int,float,double,boolean,String
    // Constructor
    // Method


    int i;

    // Constructor = same name as Class
    public Fields_Constructors_Method(){

        i=6;
    }

    // Method
    public void   initialize(){
        int i=5;
        System.out.println(i);
    }


    public static void main(String[] args) {

        Fields_Constructors_Method obj = new Fields_Constructors_Method();

        obj.initialize();


        System.out.println(obj.i);



    }


}
