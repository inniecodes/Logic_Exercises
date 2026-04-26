
import static Level01.Exercise01.squareMath;
import static Level01.Exercise02.enteredCharacters;
import static Level01.Exercise03.*;
import static Level01.Exercise04.triangleArea;
import static Level01.Exercise05.latePayment;
import static Level02.Exercise06.verifyNumber;

public static void main(String[] args){
    System.out.println("Exercise 01");
    int result = squareMath(2);
    System.out.println("The square is: " + result);

    System.out.println("=================");

    System.out.println("\nExercise 2");
    String characters = enteredCharacters("b", "c");
    System.out.println(characters);

    System.out.println("\n=================");

    System.out.println("\nExercise 3");
    int exercise3A = predecessor(20);
    int exercise3B = successor(20);
    System.out.println(exercise3A);
    System.out.println(exercise3B);

    System.out.println("\n=================");

    System.out.println("\nExercise 4");
    double ex4 = triangleArea(4,10);
    System.out.println(ex4);


    System.out.println("\n=================");

    System.out.println("\nExercise 5");
    double ex5 = latePayment(457.90,10.4,60);
    System.out.println(ex5);

    System.out.println("\n=================");
    String ex06 = verifyNumber(2);
    System.out.println(ex06);


}