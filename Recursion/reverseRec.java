class reverseRec{

    public static void rev(String s,int n){
        if(n== 0){
            System.out.println(s.charAt(n));
            return;
        }
        System.out.println(s.charAt(n));
        rev(s,n-1);
    }
    public static void main(String[] args) {
       String s="abcd";
      

       rev(s,s.length()-1);

    }
}

