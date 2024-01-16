class Employee{
    int id;
    String name;
    int salary;
    public void getdetails(){
        System.out.println("my id is:" +id);
        System.out.println("my name is:" +name);
    }
    public int getsalary(){
        return salary;
    }
}

public class cwa_ch8_custom_class {
    public static void main(String[] args) {
        System.out.println("This is my custom class");
        Employee Ali= new Employee();
        Employee Samia= new Employee();

        // ATTRIBUTES OF ALI
        Ali.id=1019;
        Ali.salary=10000000;
        Ali.name="M.ALI";

        //ATTRIBUTES OF SAMIA
        Samia.id=10;
        Samia.salary= 1000000;
        Samia.name="SAMIA";

        //Printing details
        Ali.getdetails();
       // int salary=Ali.getsalary();
      //  System.out.println(salary);
      //  System.out.println(Ali.getsalary());

        Samia.getdetails();
       //  salary= Samia.getsalary();
      //  System.out.println(salary);

      //  System.out.println(Samia.id);
      //  System.out.println(Ali.name);
    }
}
