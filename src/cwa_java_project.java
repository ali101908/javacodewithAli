interface Bank{
   //  void name(String a) ;
     void name() ;

   void branch(String b);

  //  void NoOfEmployees(String c ,int a);
    void NoOfEmployees(int a);

}

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

public class cwa_java_project {
    public static void main(String[] args) {

        // ALLIED BANK


        System.out.println("INFO OF ALLIED BANK :");

  AlliedBank Ab=new AlliedBank();
        Ab.name();
        Ab.NoOfEmployees(35);
        Ab.branch("ALLIED BANK");

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





    }



}
