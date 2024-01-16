import java.util.Scanner;

class CarSeller{
    public static class Cars_Web {
        private String Web = "Welcome to Car Sellers Website! ";
        public String Wn () {
            return Web;
        }
    }
}

abstract class getCars{

   abstract void CompanyName();

   abstract void DisplayMsg();

//   abstract void CarName(String a);
//
//   abstract void CarColor();
    abstract void Model();
    Scanner mod=new Scanner(System.in);
    abstract void No_of_cars();
    Scanner num = new Scanner(System.in);

}

interface  Cars {
//     void CompanyName();
//
//     void DisplayMsg();

     void CarName(String a);

     void CarColor();
}



//class getCars {
//
//    public void Model() {
//        System.out.println("Which models are available ? ");
//        Scanner mod=new Scanner(System.in);
//        int no=mod.nextInt();
//        System.out.println("Only These models are available right now.");
//
//    }
//
//
//    public void No_of_cars() {
//        System.out.println("How many cars of this brand are availble? ");
//        Scanner num = new Scanner(System.in);
//        String am = num.next();
//        System.out.println("Are you interested to buy? ");
//        Scanner ans = new Scanner(System.in);
//        String get = ans.next();
//
//        while (get == "Yes") System.out.println("We r happy that u bought our car. Thanks! ");
//
//        System.out.println("Thanks for visiting our website! ");
//    }


//}

 class Civic extends getCars implements Cars {


     @Override
      void CompanyName() {
         System.out.println("Company Name: Arshad Car Sellers !");
     }

     @Override
      void DisplayMsg() {
         System.out.println("Welcome to Arshad Car Sellers Web! ");
     }

     @Override
     public void CarName(String a) {
         System.out.println("Car you are looking for is: "+a);
     }

     @Override
     public void CarColor() {
         System.out.println("Car is available in black n white color only! ");
     }

     @Override
      void Model() {
         System.out.println("Which models are available ? ");
//        Scanner mod=new Scanner(System.in);
         String no=mod.next();
        System.out.println("Only These models are available right now.");
     }

     @Override
      void No_of_cars() {
         System.out.println("How many cars of this brand are availble? ");
//        Scanner num = new Scanner(System.in);
        String am = num.next();
        System.out.println("Are you interested to buy? ");
        Scanner ans = new Scanner(System.in);
        String get = ans.next();

        while (get == "Yes") System.out.println("We r happy that u bought our car. Thanks! ");

        System.out.println("Thanks for visiting our website! ");
     }
 }

class Swift extends getCars implements Cars {


    @Override
     void CompanyName() {
        System.out.println("Company Name: Arshad Car Sellers !");
    }

    @Override
     void DisplayMsg() {
        System.out.println("Welcome to Arshad Car Sellers Web! ");
    }

    @Override
    public void CarName(String a) {
        System.out.println("Car you are looking for is: "+a);
    }

    @Override
    public void CarColor() {
        System.out.println("Car is available in grey n pink color only! ");
    }

    @Override
     void Model() {
        System.out.println("Which models are available ? ");
//        Scanner mod=new Scanner(System.in);
        String no=mod.next();
        System.out.println("Only These models are available right now.");
    }

    @Override
     void No_of_cars() {
        System.out.println("How many cars of this brand are availble? ");
//        Scanner num = new Scanner(System.in);
        String am = num.next();
        System.out.println("Are you interested to buy? ");
        Scanner ans = new Scanner(System.in);
        String get = ans.next();

        while (get == "Yes") System.out.println("We r happy that u bought our car. Thanks! ");

        System.out.println("Thanks for visiting our website! ");
    }
}

class Toyotta extends getCars implements Cars {


    @Override
     void CompanyName() {
        System.out.println("Company Name: Arshad Car Sellers !");
    }

    @Override
     void DisplayMsg() {
        System.out.println("Welcome to Arshad Car Sellers Web! ");
    }

    @Override
    public void CarName(String a) {
        System.out.println("Car you are looking for is: "+a);
    }

    @Override
    public void CarColor() {
        System.out.println("Car is available in grey n purple color only! ");
    }

    @Override
    public void Model() {
        System.out.println("Which models are available ? ");
//        Scanner mod=new Scanner(System.in);

        String no=mod.next();

        System.out.println("Only These models are available right now.");
    }

    @Override
    public void No_of_cars() {
        System.out.println("How many cars of this brand are availble? ");

//      Scanner num = new Scanner(System.in);

        String am = num.next();
        System.out.println("Are you interested to buy? ");
        Scanner ans = new Scanner(System.in);
        String get = ans.next();

        while (get == "Yes") System.out.println("We r happy that u bought our car. Thanks! ");

        System.out.println("Thanks for visiting our website! ");
    }
}


public class cwa_car_sale_purchase {
    public static void main(String[] args) {

        CarSeller.Cars_Web CS= new CarSeller.Cars_Web();
        System.out.println(CS.Wn());

        Scanner scanner = new Scanner(System.in);
        int menu;

        do {
            System.out.println("Cars Menu:");
            System.out.println("Enter 1 to get Civic details: ");
            System.out.println("Enter 2 to get Swift details: ");
            System.out.println("Enter 3 to get Toyotta details: ");

            System.out.print("Enter your choice: ");

            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    // Add code for Option 1 here
                    System.out.println("You have successfully entered into Civic Car details! ");

                    Civic Ck=new Civic();
                    Ck.DisplayMsg();

                    Ck.CompanyName();

                    Ck.CarName("Civic");

                    Ck.CarColor();

                    Ck.Model();

                    Ck.No_of_cars();
//                    Scanner ans = new Scanner(System.in);
//                    String get = ans.next();
//
//                    if (get == "Yes") System.out.println("We r happy that u bought our car. Thanks! ");
//
//                    System.out.println("Thanks for visiting our website! ");
                    break;
                case 2:

                    // Add code for Option 2 here
                    System.out.println("You have successfully entered into Civic Car details! ");

                    Swift St=new Swift();
                    St.DisplayMsg();

                    St.CompanyName();

                    St.CarName("Civic");

                    St.CarColor();

                    St.Model();

                    St.No_of_cars();

                    break;
                case 3:

                    // Add code for Option 3 here
                    System.out.println("You have successfully entered into Civic Car details! ");

                    Toyotta Ty=new Toyotta();
                    Ty.DisplayMsg();

                    Ty.CompanyName();

                    Ty.CarName("Civic");

                    Ty.CarColor();

                    Ty.Model();

                    Ty.No_of_cars();

                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (menu != menu);


//        Civic Ck=new Civic();
//        Ck.DisplayMsg();
//        Ck.CompanyName();
//        Ck.CarName("Civic");
//        Ck.CarColor();
//        Ck.Model();
//        Ck.No_of_cars();
    }


}
