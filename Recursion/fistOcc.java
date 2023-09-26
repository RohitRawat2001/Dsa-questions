class fistOcc{

    public static int first = -1;
    public static int last = -1;
    
    public static void fun(String s,int idx,char element){

        if(idx==s.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char curele = s.charAt(idx);
        if(curele == element){
            if(first == -1){
                first = idx;    
            }else{
                last = idx;
            }
        }
         fun(s, idx+1, element);

    }
    public static void main(String[] args) {
        String s="absbfhufah";

        fun(s, 0, 'a');


        
    }
}