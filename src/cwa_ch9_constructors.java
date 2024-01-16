class MyEmployee{
   private int id;
   private int salary;
   private String name;

   public MyEmployee(){
       id=111;
       name="Your name";
       salary=10000;
   }
   public MyEmployee(String myname, int myid , int mysalary){
       id=myid;
       name="myname";
       salary=mysalary;
   }
   public int getid(){return id;}
    public void setid(int i){this.id=i;}
    public String getname(){return name;}
    public void setname(String n){this.name=n;}
    public int getSalary(){return salary;}
    public void setsalary(int s){this.salary=s;}

}

public class cwa_ch9_constructors {
    public static void main(String[] args) {
     //   MyEmployee Ali=new MyEmployee("Ali",10,10000);
        MyEmployee Ali=new MyEmployee();
      //  Ali.setid(10);
     //   Ali.setname("Jiyo");
     //   Ali.setsalary(10000);
      System.out.println(Ali.getSalary());
       System.out.println(Ali.getid());
        System.out.println(Ali.getname());

    }
}
