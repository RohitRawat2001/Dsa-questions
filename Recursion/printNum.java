class printNum{

    public static void num(int n){
        if(n==6){
            return;
        }
       
        System.out.println(n);
        num(n+1);
    }
    public static void main(String[] args) {
        // int n=5;
       int n=1;
      
       num(n);
    }
}