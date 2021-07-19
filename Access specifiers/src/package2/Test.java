package package2;

import package1.*;

/*public class Test {
    public static void main(String args[]) {
        Addition obj = new Addition();         //example for default
        obj.addTwoNumbers(10,20);
    }




class Test extends Addition{
    public static void main(String args[]){       //we can access only in the same package
        Test obj = new Test();                    //example for protected
        System.out.println(obj.addTwoNumbers(10,50));
    }*/


class Test {
    public static void main(String args[]) {
        Addition obj = new Addition();         //example for public
        System.out.println(obj.addTwoNumbers(100,200));
    }
}
