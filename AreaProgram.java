import java.util.Scanner;

/**
 * Calculates the area of either a square, circle, or triangle,
 * depending on the users input.
 *
 * @author albertocahdez
 * @author Roland Price
 */
public class AreaProgram {

  /**
   * Main method for the AreaProgram. Contains the code for the visual menu,
   * along with code for taking and checking inputs, for both the menu and the
   * calculations, at each point in the process.
   *
   * @param args unused
   */
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    int menuOption;

    do {
      System.out
          .print("=== AREA CALCULATOR ===\n1. Square\n2. Circle\n3. Triangle\n4. Exit\n");
      System.out.print("Enter the desired option[1-4]: ");
      menuOption = userInput.nextInt();

      switch(menuOption) {
        case 1:
          double userSideLength = 0.0d;
          System.out.print("Please input the side length of your square: ");
          userSideLength = userInput.nextDouble();

          while(userSideLength <= 0) {  // Catch invalid side lengths
            System.out.println("Side length invalid, please try again: ");
            userSideLength = userInput.nextDouble();
          }

          System.out.println("The area of your square is: "
              + calcAreaSquare(userSideLength)
              + " units");
          break;

        case 2:
          double userRadius = 0.0d;
          System.out.print("Please input the radius of your circle: ");
          userRadius = userInput.nextDouble();

          while(userRadius <= 0) {  // Catch invalid radii
            System.out.println("Radius invalid, please try again: ");
            userRadius = userInput.nextDouble();
          }

          System.out.println("The area of your circle is: "
              + calcAreaCircle(userRadius)
              + " units");
          break;

        case 3:
          double userBase = 0.0d;
          double userHeight = 0.0d;
          System.out.print("Please input the base of your triangle: ");
          userBase = userInput.nextDouble();

          while(userBase <= 0) {  // Catch invalid bases
            System.out.println("Base invalid, please try again: ");
            userBase = userInput.nextDouble();
          }

          System.out.print("Please input the height of your triangle: ");
          userHeight = userInput.nextDouble();

          while(userHeight <= 0) {  // Catch invalid heights
            System.out.println("Height invalid, please try again: ");
            userHeight = userInput.nextDouble();
          }

          System.out.println("The area of your triangle is: "
              + calcAreaTriangle(userBase, userHeight)
              + " units");
          break;

        case 4:
          break;  // 4 exits the program

        default:
          System.out.println("Option invalid, please try again");
      }
    } while (menuOption != 4);
    userInput.close();
  }

  /**
   * Calculates the area of a square.
   *
   * @param sideLength length of each side of the square
   * @return area of the square
   */
  public static double calcAreaSquare(double sideLength) {
    return Math.pow(sideLength, 2.0);
  }

  /**
   * Calculates the area of a circle.
   *
   * @param radius radius of the circle
   * @return area of the circle
   */
  public static double calcAreaCircle(double radius) {
    return Math.PI * Math.pow(radius, 2.0);
  }

  /**
   * Calculates the area of a triangle.
   *
   * @param base length of the base of the triangle
   * @param height height of the triangle
   * @return area of the triangle
   */
  public static double calcAreaTriangle(double base, double height) {
    return 0.5 * base * height;
  }
}


