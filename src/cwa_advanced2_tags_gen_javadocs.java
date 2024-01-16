/**
 * This is the javadocs method
 */

public class cwa_advanced2_tags_gen_javadocs {
    /**
     *
     * @param args These are arguements supplied to the command line
     */
    public static void main(String[] args) {
        System.out.println("i am a main method");
    }

    /**
     * this is the easiest n beautiful method
     * @param i This is the first value to  add
     * @param j this is the second value to  add
     * @return Sum of two numbers as an integers
     * @throws Exception if i is 0
     * @deprecated this method must use an operator +
     */
    public int add(int i, int j)throws Exception{
        if (i==0){
            throw new Exception();
        }
        int c;
        c=i+j;
        return c;
    }

}
