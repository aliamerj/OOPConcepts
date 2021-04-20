package joeamerson;


public class Main {

    public static void main(String[] args) {
        System.out.println("hi ");
     var calculation = new Calculation(4,2);
     int multi = calculation.getMultiplication();
     int sub = calculation.getSubtraction();
     int add = calculation.getAddition();

        System.out.println("multi = "+ multi);
        System.out.println("sub = "+ sub);
        System.out.println("add = "+ add);
    }


}
