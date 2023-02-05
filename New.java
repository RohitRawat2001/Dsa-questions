public class New{
    public static void main(String[] args) {
        int[] arr={12,3,4,44,5,6};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
               
            }
            
        }
        for(int i=0;i<arr.length;i++){
            
            System.out.println(arr[i]);
    }
    }
}
    

