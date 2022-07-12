package level1;
//import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    //    Scanner in = new Scanner(System.in);
        UniqueCharacters array = new UniqueCharacters();
        System.out.println(array.AmountOfUniqueCharacters(array.ArrayOfCharacters));

        Horse Horse = new Horse();
        Horse.InputCoordinate();

        Triangle triangle = new Triangle();
        System.out.printf("Square of a triangle: %.2f", triangle.Square());
    }

}
