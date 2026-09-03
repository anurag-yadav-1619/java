// public class array {
//     public static void main(String[]gfn ){
//         // int[]x={6,19,4,5,6,7};
//         // System.out.println(x[0]);
//         // System.out.println(x[1]);
//         // System.out.println(x[2]);
//         // System.out.println(x[3]);
//         // System.out.println(x[4]);
//         // System.out.println(x[5]);
//         int []arr=new int[5];
//         arr[0]=10;
//         arr[1]=1;
//         arr[2]=105;
//         arr[3]=150;
//         arr[4]=180;




//     }
    
// }



// public class array {
//     public static void main(String[]gfn ){
//         int[]arr={4,5,6,7,8,9};
//             for(int i=0;i<=5;i++){
//                 System.out.print(arr[i]+" ");
//             }
        
      


//     }
    
// }




// public class array {
//     public static void main(String[]gfn ){
//         int[]arr={4,5,6,7,8,9};
//             int i=0;
//             while (i<=5) {
//                 System.out.println(arr[i]);
//                 i++;
                
//             }
//     }
    
// }




// public class array {
//     public static void main(String[]gfn ){
//         int[]arr={4,5,6,7,8,9,54,32,10};
//         int n=arr.length;
//             for(int i=0;i<arr.length;i++){
//                 System.out.println(arr[i]+" ");
//             }
//     }
    
// }




// public class array {
//     public static void main(String[]gfn ){
//         int[]arr=new int[7];
//         for(int i=0;i<7;i++){
//             System.out.println(arr[i]+" ");
//         }
//     }
    
// }




// import java.util.Scanner;
// public class array {
//     public static void main(String[]gfn ){
//         Scanner sc=new Scanner(System.in);
//         int[] arr=new int[7];
//         // input
//         for(int i=0;i<7;i++){
//         arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<7;i++){
//             System.out.println(arr[i]+" ");
//         }
        
//     }
    
// }


// import java.util.Scanner;
// public class array{
//     public static void main(String[]bnj){
//         Scanner sc=new Scanner(System.in);
//         int[]arr=new int[7];
//         // input
//         for(int i=0;i<7;i++){
//         arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<7;i++){
//             if (arr[i]<0) {
                
//                 System.out.print(arr[i]+" ");
//             }
//         }




//     }
// }




// import java.util.Scanner;
// public class array{
//     public static void main(String[]bnj){
//         Scanner sc=new Scanner(System.in);
//         int sum=0;
//         int[]arr=new int[7];
//         // input
//         for(int i=0;i<7;i++){
//         arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<7;i++){
//             sum+=arr[i];
            
            
//         }
//         System.out.print(sum);




//     }
// }



// import java.util.Scanner;
// public class array{
//     public static void main(String[]bnj){
//         Scanner sc=new Scanner(System.in);
//         int sum=1;
//         int[]arr=new int[7];
//         // input
//         for(int i=0;i<7;i++){
//         arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<7;i++){
//             sum*=arr[i];
            
            
//         }
//         System.out.print(sum);




//     }
// }

// import java.util.*;



// import java.util.Scanner;
// public class array{
//     public static void main(String[]bnj){
//         Scanner sc=new Scanner(System.in);
//         int sum=1;
//         int[]arr=new int[7];
//         // input
//         for(int i=0;i<7;i++){
//         arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<7;i++){
//             sum*=arr[i];
            

            
            
//         }
//         System.out.print(sum);



//      sc.close();
//     }
// }


// public class array{
//     public static void main(String args[]){
//         // Scanner sc=new Scanner(System.in);
//         int []arr={54,3,54,65,7,54,32,54,6,78};
//         int MAX=arr[0];
//         // int MAX=Integer .MAX_VALUE;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>MAX) MAX=arr[i];
//         }
//         System.out.println(MAX);
        
//     }
// }


// public class array{
//     public static void main(String args[]){
//         // Scanner sc=new Scanner(System.in);
//         int []arr={54,3,54,65,7,54,32,54,6,78};
//         int MIN=arr[0];
//         // int MAX=Integer .MAX_VALUE;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]<MIN) MIN=arr[i];
//         }
//         System.out.println(MIN);
        
//     }
// }



// // import java.util.Scanner;
// public class array{
//     public static void main(String args[]){
//         // Scanner sc=new Scanner(System.in);
//         // int n=sc.nextInt();
//         char[] arr= new char[8];
//         for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i]+" ");
//         }

     
//     }
// }




// public class array{
//     public static void main(String args[]){
//       String[]arr={"anurag","harsh","sujal"};
//       for(int i=0;i<arr.length;i++){
//         System.out.println(arr[i]);
//       }
        
//     }
// }


//                               passing to mathods



// public class array{
//     public static void main(String args[]){
//         int x[]={4,5,6,7,8,9};
//         System.out.println(x[2]);
//         change(x);
//         System.out.println(x[2]);
        
//     }
//     public static void change(int[]x){
//         x[2]=99;
//     }
// }


//                   shalo copy


// public class array{
//     public static void main(String[]fdvf){
//         int[]arr={10,20,30,40,50};
//         int[]x=arr;
//         x[0]=100;for(int i=0;i<arr.length;i++){
//         System.out.println(arr[i]);
//         }
//     }
// }



//              deep copy


// public class array{
//     public static void main(String[]fdvf){
//         int[]arr={10,20,30,40,50};
//         int[]x=arr;
//         x[0]=100;for(int i=0;i<arr.length;i++){
//         System.out.println(arr[i]);
//         }
//     }
// }



//                 sort elements



// import java.util.Arrays;

// public class ArrayExample {
//     public static void main(String[] frb) {
//         int[] arr = {6, 3, 7, 9, 54, 3, 6, 10};
//         print(arr);
//         Arrays.sort(arr);
//         print(arr);
//     }
//     public static void print(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
// }



// public class array{
//     public static void main(String[] vhj){
//         int[]arr={1,2,3,4,5,6,7,8,9,10};
//         for(int i=0;i<arr.length;i+=2){
//             System.out.print(2*arr[i]+" ");
//         }
//         System.out.println();
//         for(int i=1;i<arr.length;i+=3){
//             System.out.print(10+arr[i]+" ");
//         }
//         System.out.println();
       


//     }
    
// }

 



// public class array1{
//     public static void main(String args[]){
//         int []arr={1,2,3,4,5};
//         int t=6;
//         for(int i=0;i<=4;i++){
//         if(t==arr[i]){
//                 t=arr[i];
//             }
            
           
//         }
//         System.out.println(t);
       
        
       
//     }
// }






