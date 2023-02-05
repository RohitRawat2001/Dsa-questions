import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Main{
    public static void main(String args[]){
       Random r=new Random();
       int arr[]=new int[1000];

        int min =1,max=100000;
       for(int i=0;i<1000;i++){
        arr[i]= r.nextInt(max-min)+min;

       }
       Scanner s =new Scanner(System.in);
       int value =s.nextInt();
       int temp=-1;
       for(int i:arr){
        System.out.println(i+"");
       }

       Arrays.sort(arr);
       for(int i=0;i<arr.length;i++){
        if(arr[i]==value){
            temp=i;
        }
       }
       if(temp>0){
        System.out.println("value is found at"+temp+"index");
       }
       else{
        System.out.println("value is not found");
       }
    }
}