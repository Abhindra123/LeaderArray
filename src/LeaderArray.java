import java.util.ArrayList;
import java.util.Scanner;

public class LeaderArray {
    private static void leadersCalc(int[] arr) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            boolean flag=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    flag=false;
                }
            }
            if(flag==true){
                list.add(arr[i]);
            }
        }
        //  list.add(arr.length);
        System.out.println(list);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        // int arr[]={16, 17, 4, 3, 5, 2};
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        leadersCalc(arr);
    }


}