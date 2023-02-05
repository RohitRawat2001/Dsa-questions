public class Duplicate {
    public static void main(String[] args) {
        System.out.println("Duplicate element are:");
        int[] a={2,5,4,2,5,6};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if((a[i]==a[j])&&(i!=j)){
                    System.out.println(a[j]);
                }
            }
        
        }
    }
    
}
