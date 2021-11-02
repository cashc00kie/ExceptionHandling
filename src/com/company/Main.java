//package com.company;
//import java.util.Scanner;

//public class Main {

   // public static void main(String[] args) {
	//Scanner input = new Scanner(System.in);
      //  System.out.println("Type in a number");

       // try{
       //    int c = input.nextInt();
           // System.out.println("Result = " + c);
       //}
       // catch (Exception error){
        //    System.out.println(error);
        //    System.out.println("You need to type in a number");
      //  }
  //  }
 //
//}
//--------------------NEW EXAMPLE----------------------------------------------------------------
//package com.company;
//import java.util.InputMismatchException;
//import java.util.Scanner;

//public class Main {
  //  public static void main(String[] args) {
    //    Scanner input = new Scanner(System.in);
    //    boolean valid = false;

      //  while (valid == false) {
        //    try {
           //     System.out.println("Type in a number");
            //    int num = input.nextInt();
           //     System.out.println(10 / num);
            //    valid = true;
        //   } catch (InputMismatchException e) {
         //       System.out.println("Number too long" + e);
        //        input.next(); //refreshes scanner
        //    } catch (ArithmeticException e) {
        //        System.out.println("You should not divide a number by zero" + e);
       //         input.next();
       //     } catch (Exception e) {
        //        System.out.println("Exception occurred " + e);
       //         input.next();
    //        }
  //      }
 //   }
//}
//-----------------NEW EXAMPLE-------------------------------------------------------------
package com.company;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int a[] = new int[2];

        try {
            System.out.println("Access element three:" + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("exception thrown :" + e);
        } finally {
            a[0] = 6;
            System.out.println("first element value :" + a[0]);
            System.out.println("the finally statement is executed");
        }
    }
}