/*class Sum {
    private int number=100;
    private int square(int a){
        return a*a;
    }
}
public class Example{
    public static void main(String args[]){
        Sum obj = new Sum();
        System.out.println(obj.number);
        System.out.println(obj.square(10));
    }
}*/



class Data {
    private String strname;

    // getter method
    public String getName() {
        return this.strname;
    }
    // setter method
    public void setName(String name) {
        this.strname= name;                                      //example fr private
    }
}
public class Sum {
    public static void main(String[] main) {
        Data d = new Data();
        d.setName("Java Programming");
        System.out.println(d.getName());
    }
}