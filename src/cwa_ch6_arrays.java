public class cwa_ch6_arrays {
    public static void main(String[] args) {
      //  int [] marks= {70,80,10,35,65};
       // System.out.println(marks.length);
        // reverse order quick quiz
       // for(int i=marks.length-1;i>=0;i--){
         //   System.out.println(marks[i]);
            // for each loop
          //  for(int element: marks){
            //    System.out.println(element);
          //  }
        // 2-D Arrays
        int [][] flats;
        flats = new int [2][3];
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;
        // displaying array using for loop
        for(int i=0; i<flats.length; i++){
            for(int j=0; j<flats[i].length; j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        }
    }

