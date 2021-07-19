class People{
    int rollno;
    String name;
    static String college ="KSR";            //static variable

    People(int r, String n){
        this.rollno = r;
        this.name = n;
    }
    void display (){
        System.out.println(rollno+" "+name+" "+college);
    }
}

public class Student{
    public static void main(String args[]){
        People p1 = new People(111,"xxx");
        People p2 = new People(222,"yyy");
        p1.display();
        p2.display();
    }
}
