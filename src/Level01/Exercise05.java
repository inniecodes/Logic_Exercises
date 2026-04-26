package Level01;

public class Exercise05 {
    //Create a program that, given the value, rate, and time, calculates the value of a late payment using the formula:
    //payment = value + (value * (rate / 100) * time)
    public static double latePayment(double value, double rate, int time ){
     double payment = value + (value * (rate / 100) * time);
     return payment;
    }
}
