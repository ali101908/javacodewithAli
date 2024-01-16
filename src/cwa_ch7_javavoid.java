public class cwa_ch7_javavoid {
    static void telljoke(){
        System.out.println("hahahha");
    }
    static void foo(){
        System.out.println("Good morning");
    }
    static void foo(int a){
        System.out.println("hello "+a+" bro");
    }
    static void foo(int a ,int b){
        System.out.println("good morning "+a + b+" jiyo");
       // System.out.println("good morning "+b+" nhi");
    }

    public static void main(String[] args) {
        telljoke();
        foo();
        foo(200);
        foo(300,500);
    }
}
