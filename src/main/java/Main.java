public class Main
{
    public static void main(String[] args)
    {
        ComplexNumber firstNumber = new ComplexNumber(4,5);
        ComplexNumber secondNumber = new ComplexNumber(10, 5);
        System.out.print("The first number is: ");
        firstNumber.createComplexNumber();
        System.out.print("The second number is: ");
        secondNumber.createComplexNumber();
        ComplexNumber sum = ComplexNumber.addNumbers(firstNumber, secondNumber);
        System.out.println("The sum is: ");
        sum.createComplexNumber();
    }
}
