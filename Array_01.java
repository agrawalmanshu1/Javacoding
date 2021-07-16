//import java.util.*;
//public class Array_01 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the size of array");
//        int N= sc.nextInt();
//        int sum=0;
//        int count=0;
//        int []arr=new int[N];
//        for (int i=0;i<N;i++){
//            System.out.println("enter the element"+i+"th");
//            arr[i]=sc.nextInt();
//            //if (arr[i]%2!=0)
//                //count+=1;
//            //sum=sum+arr[i];
//        }
//        System.out.println("enter the size of array");
//        N= sc.nextInt();
//        arr=new int[N];
//        for (int i=0;i<N;i++){
//            System.out.println("enter the element"+i+"th");
//            arr[i]=sc.nextInt();
//            //if (arr[i]%2!=0)
//            //count+=1;
//            //sum=sum+arr[i];
//        }
//
//       System.out.println(sum);
//        System.out.println("total odd number "+count);
//   }
//}


import java.io.*; // for handling input/output
        import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Array_01 {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("enter T");
        int T = sc.nextInt();
        while(T > 0){
            System.out.println("enter N");
            int size = sc.nextInt();
            int[] arr = new int[size];
            for(int i = 0; i < size; i++){
                System.out.println("array");
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[size-1]+" "+arr[size-2]+" "+arr[size-3]);
            T--;
        }
        //sc.close();
    }
}