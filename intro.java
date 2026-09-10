// public class array2{
//     public static void main(String[]fdvb){
//         int[]arr={3,4,5,6,7,8,9};
//         int product=1;
//         for(int i=0;i<arr.length;i++){
//             product*=arr[i];
//         }
//         System.out.println(product);
       

        
// }

// }

//                        linea rscarch

// public class array2{
//     public static void main(String[]vnei){
//         int[]arr={8,7,5,32,5,76,556,343,834,302,54};
//         int x=9;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==x) System.out.println(x);
            
            
//         }


//     }
// }


public class array{
    public static void main(String args[]){
    int[]arr={1,2,3,4,5,6,7};
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length-1;j++){
            if(arr[i]+arr[j]==5){
                System.out.println(arr[i]);
                System.out.println(arr[j]);

            }
            else{
                System.out.println(-1);
            }
        }

    }


                
    }
}
