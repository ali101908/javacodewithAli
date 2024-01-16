public class cwa_ch6_practicearray {
    public static void main(String[] args) {
     /*   float [] marks= {45.7f,67.8f,89.7f};
        float num =45.7f;
        boolean isinarray = false; // by default kiya agay prove krna para.
        for(float element:marks){
            if(num==element){
                isinarray=true;
                break;
            }
        }
if(isinarray){
    System.out.println("the num is present");
}
else{
    System.out.println("the value is not present");
}*/
      /*  int [][] mat1= {{ 2,5,7 },
                      {4,6,8 }};
        int [][] mat2= {{ 2,5,7 },
                        {4,6,8 }};
        int [][] result={{ 0,0,0 },
                         {0,0,0 }};
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                System.out.format("Setting value for i=%d and j=%d\n", i,j);
                result[i][j]= mat1[i][j]+mat2[i][j];
            }
        }*/
        // 2d array result
      /*  for(int i=0;i<mat1.length;i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println("");
        }*/
        // reverse order
      /*  int [] arr= {47,3,4,7};
        int l=arr.length;
        int n= Math.floorDiv(l,2);
        int temp;
        for(int i=0;i<n;i++){
            // swap 3 by 4
            // a[i] =3 n a[l-i-1]= 4

            temp=arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;
        }
        for(int element: arr){
            System.out.println(element +" ");
        }*/
        // minimum value
      /*  int [] arr= {67,8,99,4,5};
        int min=Integer.MAX_VALUE;
        for(int e: arr){
            if(e<min){
               min=e;
            }
        }
        System.out.println("the min value is" +min);*/
        //SORTED ARRAY
        boolean issorted= true;
        int [] arr= {1,2,3,4,5};
        for(int i=0; i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                issorted=false;
                break;
            }
        }
        if(issorted){
            System.out.println("the array is chokus");
        }
        else{
            System.out.println("the array is not chokus");
        }
    }
}
