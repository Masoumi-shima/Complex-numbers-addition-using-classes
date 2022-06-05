public class ComplexNumber
{
    int real;
    int image;

    public ComplexNumber(int real, int image)
    {
        this.real = real;
        this.image = image;

    }

    public void createComplexNumber()
    {
        System.out.println(this.real + "+ i" + this.image);
    }

    public static ComplexNumber addNumbers(ComplexNumber firstNumber, ComplexNumber secondNumber)
    {
        ComplexNumber complexNumbersSum = new ComplexNumber(0, 0);
        complexNumbersSum.real = firstNumber.real + secondNumber.real;
        complexNumbersSum.image = firstNumber.image + secondNumber.image;
        return complexNumbersSum;
    }
}
