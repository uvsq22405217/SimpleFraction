public class Main {
    public static void main(String[] args){

        


       /* System.out.println("Test "); */

       /*  Fraction fraction = new Fraction();
        System.out.println(fraction.toString());*/

        Fraction f1 = new Fraction(3, 4);
    assert f1.toString().equals("3/4");

    Fraction f2 = new Fraction(9);  
    assert f2.toString().equals("9/1");

    Fraction f3 = new Fraction();     // 0/1
    assert f3.toString().equals("0/1");

   

    System.out.println("hello ");

    }
}
