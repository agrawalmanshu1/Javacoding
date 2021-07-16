public class Binary_Search {
    public static void main(String[] args) {
        int arr[]={2,5,6,8,70,80,90};
        int element=20;
        System.out.println(bin_search(arr,element));// gives -1 if the element is not present in the given array
    }
    public static int bin_search(int[]arr,int element){
        int len=arr.length;
        int min=0;
        int max=len-1;
        for(int i=min;i<=max;i++){
            int mid=(min+max)/2;
            if(element==arr[mid]){
                return mid;
            }else if(element>arr[mid]){
                min=mid+1;
            }else {
               max=mid-1;
            }
        }
        return -1;
    }
}
