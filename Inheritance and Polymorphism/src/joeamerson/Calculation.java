package joeamerson;

public class Calculation extends Subtraction {
    private Addition addition;
    private Multiplication  multiplication;
    private Subtraction subtraction;


    public Calculation(int number1, int number2) {
        super(number1, number2);
        addition = new Addition(number1,number2);
        multiplication = new Multiplication(number1,number2);
        subtraction = new Subtraction(number1,number2);
    }
    public int getAddition() {
         addition.setNumber();
         return addition.getNumber();
    }
    public int getMultiplication(){
        multiplication.setNumber();
        return multiplication.getNumber();
    }

    public int getSubtraction() {
        subtraction.setNumber();
        return subtraction.getNumber();
    }
}
