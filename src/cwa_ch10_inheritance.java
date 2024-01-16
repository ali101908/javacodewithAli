class animals{
    String cat;
    String dog;

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        System.out.println("Cat speaks by saying :");
        this.cat = cat;
    }

    public String getDog() {
        return dog;
    }

    public void setDog(String dog) {
        System.out.println("Dog is known as:");
        this.dog = dog;
    }
}
class dog  extends animals{
    String puppy;

    public String getPuppy() {
        return puppy;
    }

    public void setPuppy(String puppy) {
        System.out.println("puppy is:");
        this.puppy = puppy;
    }
}

public class cwa_ch10_inheritance {
    public static void main(String[] args) {
animals al=new animals();
al.setCat("meaown");
        System.out.println(al.getCat());
        dog d=new dog();
        d.setDog("Barking");
        System.out.println(d.getDog());
    }
}
