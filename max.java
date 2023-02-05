public class max {
    public static void main(String[] args) {
        int[] a={12,23,4,5,2,25};
        int min=a[0];
        for(int i=1;i<a.length;i++){
            
                if(a[i]<min){
                   min=a[i]; 
                }
        }
    
        System.out.println("max value" +min);
    }
 }