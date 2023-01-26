
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        boolean end = false; //A flag, to identify the end of the program
        int shape; //This variable saves the figure
        int operation; //This variable saves the operation

//This cycle iterates the menu until the user enters the number 8
        while(!end){
            System.out.println("AREAS AND PERIMETERS CALCULATOR");
            System.out.println("Choose the option that you want");
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            System.out.println("4. Circle");
            System.out.println("5. pentagon");
            System.out.println("6. Semi Circle");
            System.out.println("7. Pentagram");
            System.out.println("8. Salir");

            shape = sn.nextInt();
            //Here starts the menu of my options
            switch(shape){
                case 1:
                    System.out.println("Which operation do you want?");
                    System.out.println("1. Perimeter");
                    System.out.println("2. Area");
                    operation = sn.nextInt();
                    if(operation==1){
                        SquarePerimeter();
                    }
                    else if (operation==2) {
                        SquareArea();
                    }
                    else{
                        System.out.println("Invalid Option");
                    }
                    break;

                case 2:
                    System.out.println("Which operation do you want?");
                    System.out.println("1. Perimeter");
                    System.out.println("2. Area");
                    operation = sn.nextInt();
                    if(operation==1){
                        RectanglePerimeter();
                    }
                    else if (operation==2) {
                        RectangleArea();
                    }
                    else{
                        System.out.println("Invalid Option");
                    }

                    break;

                case 3:
                    System.out.println("Which operation do you want?");
                    System.out.println("1. Perimeter");
                    System.out.println("2. Area");
                    operation = sn.nextInt();
                    if(operation==1){
                        TrianglePerimeter();
                    }
                    else if (operation==2) {
                        TriangleArea();
                    }
                    else{
                        System.out.println("Invalid option");
                    }
                    break;

                case 4:
                    System.out.println("Which operation do you want?");
                    System.out.println("1. Perimeter");
                    System.out.println("2. Area");
                    operation = sn.nextInt();
                    if(operation==1){
                        CirclePerimeter();
                    }
                    else if (operation==2) {
                        CircleArea();
                    }
                    else{
                        System.out.println("Invalid option");
                    }
                    break;

                case 5:
                    System.out.println("Which operation do you want?");
                    System.out.println("1. Perimeter");
                    System.out.println("2. Area");
                    operation = sn.nextInt();
                    if(operation==1){
                        PentagonPerimeter();
                    }
                    else if (operation==2) {
                       PentagonArea();
                    }
                    else{
                        System.out.println("Invalid option");
                    }
                    break;

                case 6:
                    System.out.println("Which operation do you want?");
                    System.out.println("1. Perimeter");
                    System.out.println("2. Area");
                    operation = sn.nextInt();
                    if(operation==1){
                        SemiCirclePerimeter();
                    }
                    else if (operation==2) {
                        SemiCircleArea();
                    }
                    else{
                        System.out.println("Invalid option");
                    }
                    break;

                case 7:
                    System.out.println("Which operation do you want?");
                    System.out.println("1. Perimeter");
                    System.out.println("2. Area");
                    operation = sn.nextInt();
                    if(operation==1){
                        PentagramPerimeter();
                    }
                    else if (operation==2) {
                        PentagramArea();
                    }
                    else{
                        System.out.println("Invalid option");
                    }
                    break;

                case 8:
                    end=true;
                    break;
                default:
                    System.out.println("Only numbers between 1 and 8");
            }

        }
    }

    ////////////////////////////Square/////////////////////////////////////////////////////////

    //Function to calculate the perimeter of a square
    static void SquarePerimeter() {
        int side;
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the value of the sides of your square");
        side = sn.nextInt();
        System.out.println("The perimeter of the square is: " + (side*4));
    }

    //Function to calculate the area of a square
    static void SquareArea() {
        int side;
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the value of the sides of your square");
        side = sn.nextInt();
        System.out.println("The Area of the square is: " + (side*side));
    }
    ////////////////////////////Square/////////////////////////////////////////////////////////

    ////////////////////////////Rectangle/////////////////////////////////////////////////////////
    //Function to calculate the perimeter of a rectangle
    static void RectanglePerimeter() {
        int height,base;
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the value of the height of your rectangle");
        height = sn.nextInt();
        System.out.println("Enter the value of the base of your rectangle");
        base = sn.nextInt();
        System.out.println("\n The perimeter of the rectangle is: " + (2*height + 2*base));
    }

    //Function to calculate the area of a rectangle
    static void RectangleArea() {
        int height,base;
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the value of the height of your rectangle");
        height = sn.nextInt();
        System.out.println("Enter the value of the base of your rectangle");
        base = sn.nextInt();
        System.out.println("\n The area of the rectangle is: " + (height*base));
    }

    ////////////////////////////Rectangle/////////////////////////////////////////////////////////


    ////////////////////////////Triangle/////////////////////////////////////////////////////////
    //Function to calculate the perimeter of a triangle
    static void TrianglePerimeter() {
        int side1, side2, side3;
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the values of the 3 sides of your triangle");
        side1 = sn.nextInt();
        side2 = sn.nextInt();
        side3 = sn.nextInt();
        System.out.println("The perimeter of the triangle is: " + (side1 + side2 + side3));
    }

    //Function to calculate the area of a triangle
    static void TriangleArea() {
        int height,base;
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the value of the height of your triangle");
        height = sn.nextInt();
        System.out.println("Enter the value of the base of your triangle");
        base = sn.nextInt();
        System.out.println("The area of the triangle is: " + ((height*base)/2));
    }

    ////////////////////////////Triangle/////////////////////////////////////////////////////////

    ////////////////////////////Circle/////////////////////////////////////////////////////////
    //Function to calculate the perimeter of a circle
    static void CirclePerimeter() {
        int diameter;
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the value of the diameter of your circle");
        diameter = sn.nextInt();
        System.out.println("The perimeter of the circle is: " + (diameter * 3.1416));
    }

    //Function to calculate the area of a circle
    static void CircleArea() {
        int radius;
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the value of the radius of your circle");
        radius = sn.nextInt();
        System.out.println("The area of the circle is: " + (3.1416*(radius*radius)));
    }

    ////////////////////////////Circle/////////////////////////////////////////////////////////

    ////////////////////////////Pentagon/////////////////////////////////////////////////////////
    //Function to calculate the perimeter of a pentagon
    static void PentagonPerimeter() {
        int side;
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the value of one of your pentagon");
        side = sn.nextInt();
        System.out.println("The perimeter of the pentagon is: " + (side*5));
    }

    //Function to calculate the area of a pentagon
    static void PentagonArea() {
        int side, apothem;
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the value of one of your pentagon");
        side = sn.nextInt();
        System.out.println("Enter the value of the apothem of your pentagon");
        apothem = sn.nextInt();
        System.out.println("The area of the pentagon is: " + ((side*5*apothem)/2));
    }

    ////////////////////////////Pentagon/////////////////////////////////////////////////////////

    ////////////////////////////SemiCircle/////////////////////////////////////////////////////////
    //Function to calculate the perimeter of a semicircle
    static void SemiCirclePerimeter() {
        int radius;
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the value of the radius of your semi circle");
        radius = sn.nextInt();
        System.out.println("The perimeter of the semicircle is: " + (radius*3.1416)+(2*radius));
    }

    //Function to calculate the area of a semicircle
    static void SemiCircleArea() {
        int radius;
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the value of the radius of your semi circle");
        radius = sn.nextInt();
        System.out.println("The area of the semicircle is: " + (((radius*radius)*3.1416)/2));
    }


    ////////////////////////////SemiCircle/////////////////////////////////////////////////////////



    ////////////////////////////Pentagram/////////////////////////////////////////////////////////
    //Function to calculate the perimeter of a pentagram
    static void PentagramPerimeter() {
        int diagonal,width;
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the value of the diagonal of your pentagram");
        diagonal = sn.nextInt();
        System.out.println("Enter the value  of the width of one edge ");
        width = sn.nextInt();
        System.out.println("The perimeter of the pentagram is: " + (diagonal- width)*(5));
    }

    //Function to calculate the area of a pentagram
    static void PentagramArea() {
        int diagonal;
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the value of the diagonal of your pentagram");
        diagonal = sn.nextInt();
        System.out.println("The area of the pentagram is: " + (Math.sqrt(5*(5-(2*Math.sqrt(5)))))*((diagonal*diagonal)/2));
    }


    ////////////////////////////Pentagram/////////////////////////////////////////////////////////
}