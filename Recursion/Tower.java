public class Tower {

    public static void tp(int n,String source,String helper,String destination){

        if(n==1){
            System.out.println("tranfer disk "+n+" from "+source+" to "+destination);
            return;
        }

        tp(n-1, source, destination, helper);
        System.out.println("tranfer disk "+n+" from "+source+" to "+destination);
        tp(n-1, helper, source, destination);
 
    }
    public static void main(String[] args) {
       
        int n=3;
        tp(n, "s", "h", "d");
    }
    
}