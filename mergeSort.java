import java.util.Random;
import java.util.Scanner;

public class mergeSort {
    int[] array;
    int[] tempMergeArr;
    int length;
    public static void main(String[] args) {
        Random r=new Random();

        int min=1,max;
        System.out.println("Enter a number which you want to generate random no.");
        Scanner s=new Scanner(System.in);
        max=s.nextInt();

        int inputArr[]=new int[max];
        for(int i=0;i<max;i++){
            inputArr[i]=r.nextInt(max-min)+min;
        }

      mergeSort ms =new mergeSort();
      ms.sort(inputArr);

      for(int i:inputArr){
        System.out.println(i+"");
      }
    }
    public void sort(int inputArr[]){
        this.array=inputArr;
        this.length=inputArr.length;
        this.tempMergeArr=new int[length];
        divideArray(0,length-1);

    }
    public void divideArray(int lowerindex, int higherindex){
        if(lowerindex<higherindex){
            int middle=lowerindex+(higherindex-lowerindex)/2;

            divideArray(lowerindex,middle);
            divideArray(middle+1, higherindex);

            mergeArray(lowerindex,middle,higherindex);
        }

    }
    public void mergeArray(int lowerindex, int middle, int higherindex) {
        for(int i=lowerindex;i<=higherindex;i++){
            tempMergeArr[i]=array[i];
        }
        int i=lowerindex;
        int j=middle+1;
        int k=lowerindex;
        while(i<=middle && j<=higherindex){
            if(tempMergeArr[i]<=tempMergeArr[j]){
                array[k]=tempMergeArr[i];
                i++;
            }
            else{
                array[k]=tempMergeArr[j];
                j++;
            }
            k++;
        }
        while(i<=middle){
            array[k]=tempMergeArr[i];
            k++;
            i++;
        }
       
    }
    
}
