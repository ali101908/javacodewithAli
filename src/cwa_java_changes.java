import java.util.Scanner;


interface Bank{
    //  void name(String a) ;
    void name() ;

    void branch(String b);

    //  void NoOfEmployees(String c ,int a);
    void NoOfEmployees(int a);

}


/*
class MainBank{
    public int savings;
    public int depositAmount;
    public int transactionAmount;

    public int getSavings() {
    //    System.out.println("Total amount of savings of Allied bank in a year is :" );
        return savings;
    }

    public void setSavings(int savings) {
        this.savings = savings;
    }

    public int getDepositAmount() {
       // System.out.println("The amount deposited by a client in bank is:" );
        return depositAmount;
    }

    public void setDepositAmount(int depositAmount) {
        this.depositAmount = depositAmount;
    }

    public int getTransactionAmount() {
        return transactionAmount;

    }

    public void setTransactionAmount(int transactionAmount) {
        this.transactionAmount = transactionAmount;
     //   System.out.println("The total amount transacted by a client from Allied bank is :");
    }
}

 */

class MainBank{
    public void deposit(){
        System.out.println("Deposit processing... :");
        Scanner sc=new Scanner(System.in);
        int dep=sc.nextInt();
        System.out.println("The amount has been deposited in the bank successfully .");
        System.out.println("");
    }
    public void withdraw(){
        System.out.println("Withdraw processing... :");
        Scanner sc=new Scanner(System.in);
        int wid=sc.nextInt();
        System.out.println("The amount has been successfully withdraw from the bank .");
        System.out.println("");
    }

    public void savings(){
        System.out.println("Total Savings ...");
        Scanner sc =new Scanner(System.in);
        int sav=sc.nextInt();
        System.out.println("This is the total savings of Bank in a year :" );
        System.out.println("");
    }
}

class AlliedBank extends MainBank implements Bank{

  /*  public void name(String a){
        System.out.println("The name of Bank is :" +a);
    }

   */

    public void name(){
        System.out.println("The name of Bank is : ALLIED BANK");
    }

    @Override
    public void branch(String b) {
        System.out.println("It is the Main branch of " + b + " lahore, DHA");
    }

 /*   @Override
    public void NoOfEmployees( String c,int a) {
        System.out.println("The number of employees " + c + " is " +a);
    }

  */

    public void NoOfEmployees(int a) {
        System.out.println("The number of employees in Allied Bank is : " +a);
    }

    @Override
    public void deposit() {
        super.deposit();
    }

    @Override
    public void withdraw() {
        super.withdraw();
    }

    @Override
    public void savings() {
        super.savings();
    }
}
class MCB extends MainBank implements Bank{
    public void name(){
        System.out.println("The name of Bank is : MUSLIM COMMERCIAL BANK ");
    }

    @Override
    public void branch(String b) {
        System.out.println("It is the Main branch of " + b + " in lahore , Punjab");
    }

    @Override
    public void NoOfEmployees(int a) {
        System.out.println("The number of employees in  MUSLIM COMMERCIAL BANK is : " +a);
    }

}

class HBL extends MainBank implements Bank{
    public void name(){
        System.out.println("The name of Bank is : HABIB BANK LIMITED ");
    }

    @Override
    public void branch(String b) {
        System.out.println("It is the Main branch of " + b + " in Pakistan");
    }

    @Override
    public void NoOfEmployees(int a) {
        System.out.println("The number of employees in  HABIB BANK LIMITED: " +a);
    }

}

class BOP extends MainBank implements Bank{
    public void name(){
        System.out.println("The name of Bank is : BANK OF PUNJAB");
    }

    @Override
    public void branch(String b) {
        System.out.println("It is the Main branch of " + b + " in Multan, Punjab");
    }

    @Override
    public void NoOfEmployees(int a) {
        System.out.println("The number of employees in BANK OF PUNJAB is : " +a);
    }

}

 /* class AskariBank extends MainBank implements Bank{
    public void name(){
        System.out.println("The name of Bank is : ASKARI BANK ");
    }

    @Override
    public void branch(String b) {
        System.out.println("It is the Main branch of " + b + " in lahore , Punjab");
    }

    @Override
    public void NoOfEmployees(int a) {
        System.out.println("The number of employees in ASKARI BANK is : " +a);
    }

}
  */



class UBL extends MainBank implements Bank{
    public void name(){
        System.out.println("The name of Bank is : UNITED BANK LIMITED ");
    }

    @Override
    public void branch(String b) {
        System.out.println("It is the Main branch of " + b + " in Walton , Lahore");
    }

    @Override
    public void NoOfEmployees(int a) {
        System.out.println("The number of employees in UNITED BANK LIMITED is : " +a);
    }



}

public class cwa_java_changes {
    public static void main(String[] args) {

        // ALLIED BANK


        System.out.println("INFO OF ALLIED BANK :");

        AlliedBank Ab = new AlliedBank();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Option 1");
            System.out.println("2. Option 2");
            System.out.println("3. Option 3");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You selected Option 1.");
                    // Add code for Option 1 here
                    Ab.withdraw();
                    break;
                case 2:
                    System.out.println("You selected Option 2.");
                    // Add code for Option 2 here
                    Ab.deposit();
                    break;
                case 3:
                    System.out.println("You selected Option 3.");
                    // Add code for Option 3 here
                    Ab.savings();
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        scanner.close();
    }
}



        /*
        Ab.name();
        Ab.NoOfEmployees(35);
        Ab.branch("ALLIED BANK");

        System.out.println("Type 0 to enter into bank system :");
        Scanner Bb=new Scanner(System.in);
        int m=Bb.nextInt();
        if (m==0){
            System.out.println("You have been successfully entered into bank system :");
            System.out.println("Enter 1 for depositing money .");
            System.out.println("Enter 2 for withdrawing money .");
            System.out.println("Enter 3 to see total savings of bank .");
        }

        Scanner Bk=new Scanner(System.in);
        int n=Bk.nextInt();

        switch (n)
        {
            case 1:
                Ab.deposit();
                break;
            case 2:
                Ab.withdraw();
                break;
            case 3:
                Ab.savings();
                break;
            default:
                System.out.println("invalid input");
        }

         */

       


/*
        Scanner Bk=new Scanner(System.in);
        int n=Bk.nextInt();

        System.out.println("Processing ur input :");

        while(n==1) {
            System.out.println("DEPOSIT");
            Ab.deposit();
        }
            while (n == 2) {
                System.out.println("WITHDRAW");
                Ab.withdraw();
            }
            while (n == 3) {
                System.out.println("SAVINGS");
                Ab.savings();
            }
            System.out.println("invalid input exit .");

 */


/*
        if (n==1){
            System.out.println("DEPOSIT");
            Ab.deposit();
        } else if (n==2) {
            System.out.println("WITHDRAW");
            Ab.withdraw();
        } else if (n==3) {
            System.out.println("SAVINGS");
            Ab.savings();
        }
        else {
            System.out.println("invalid input");
        }

 */

        //  Ab.deposit();
       // Ab.withdraw();
       // Ab.savings();
/*
   Ab.setDepositAmount(100000);
   int b=Ab.getDepositAmount();
        System.out.println("The amount deposited by a client in bank is:" +b);
     //  System.out.println(b);

  Ab.setTransactionAmount(150000);
 // System.out.println(Ab.getTransactionAmount());
        System.out.println("Total amount transacted by a client from Allied bank is :" +Ab.getTransactionAmount());

Ab.setSavings(10000000);
int d=Ab.getSavings();
        System.out.println("Total amount of savings of Allied bank in a year is :" +d);
        System.out.println(" ");

 */


        // MUSLIM COMMERCIAL BANK ( MCB )
/*
  System.out.println("INFO OF MCB :");
        MCB mcb=new MCB();
        mcb.name();
        System.out.println(" ");
        mcb.NoOfEmployees(44);
        System.out.println(" ");
        mcb.branch("MUSLIM COMMERCIAL BANK");
        System.out.println(" ");
        mcb.setDepositAmount(220000);
        int c=mcb.getDepositAmount();
        System.out.println("The amount deposited by a client in bank is:" +c);
        System.out.println(" ");
        mcb.setTransactionAmount(2700);
        System.out.println("Total amount transacted by a client from MUSLIM COMMERCIAL BANK is :" +mcb.getTransactionAmount());
        System.out.println(" ");
        mcb.setSavings(50000000);
        int e=mcb.getSavings();
        System.out.println("Total amount of savings of MUSLIM COMMERCIAL BANK in a year is :" +e);
        System.out.println(" ");
 */


        // BANK OF PUNJAB

        /*
        System.out.println("INFO OF BOP :");
        BOP bop=new BOP();
        bop.name();
        System.out.println(" ");
        bop.NoOfEmployees(44);
        System.out.println(" ");
        bop.branch("BANK OF PUNJAB");
        System.out.println(" ");
        bop.setDepositAmount(220000);
        int f=bop.getDepositAmount();
        System.out.println("The amount deposited by a client in bank is:" +f);
        System.out.println(" ");
        bop.setTransactionAmount(250000);
        System.out.println("Total amount transacted by a client from BANK OF PUNJAB is :" +bop.getTransactionAmount());
        System.out.println(" ");
        bop.setSavings(170000000);
        int g=bop.getSavings();
        System.out.println("Total amount of savings of BANK OF PUNJAB in a year is :" +g);
        System.out.println(" ");
         */


        // HABIB BANK LIMITED ( HBL )
/*
        System.out.println("INFO OF HBL :");
        HBL hbl=new HBL();
        hbl.name();
        System.out.println(" ");
        hbl.NoOfEmployees(44);
        System.out.println(" ");
        hbl.branch("HABIB BANK LIMITED");
        System.out.println(" ");
        hbl.setDepositAmount(220000);
        int k=hbl.getDepositAmount();
        System.out.println("The amount deposited by a client in bank is:" +k);
        System.out.println(" ");
        hbl.setTransactionAmount(250000);
        System.out.println("Total amount transacted by a client from HABIB BANK LIMITED is :" +hbl.getTransactionAmount());
        System.out.println(" ");
        hbl.setSavings(170000000);
        int i=hbl.getSavings();
        System.out.println("Total amount of savings of HABIB BANK LIMITED in a year is :" +i);
        System.out.println(" ");
 */


        // UNITED BANK LIMITED ( UBL )
/*
        System.out.println("INFO OF UBL :");
        UBL ubl=new UBL();
       ubl.name();
        System.out.println(" ");
        ubl.NoOfEmployees(44);
        System.out.println(" ");
        ubl.branch("UNITED BANK LIMITED");
        System.out.println(" ");
        ubl.setDepositAmount(220000);
        int z=ubl.getDepositAmount();
        System.out.println("The amount deposited by a client in bank is:" +z);
        System.out.println(" ");
        ubl.setTransactionAmount(250000);
        System.out.println("Total amount transacted by a client from UNITED BANK LIMITED is :" +ubl.getTransactionAmount());
        System.out.println(" ");
        ubl.setSavings(170000000);
        int o=ubl.getSavings();
        System.out.println("Total amount of savings of UNITED BANK LIMITED in a year is :" +o);
        System.out.println(" ");
 */


  //  }
//}



