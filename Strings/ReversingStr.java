public class ReversingStr {
    public static void main(String args[]){
        StringBuilder sc = new StringBuilder("jaswanth");

        for (int i=0;i<sc.length()/2;i++){
            int f = i;
            int b  = sc.length()-1-i;

            char fc = sc.charAt(f);
            char bc = sc.charAt(b);

            sc.setCharAt(f,bc);
            sc.setCharAt(b,fc);

        }
        System.out.println(sc);
    }
}
