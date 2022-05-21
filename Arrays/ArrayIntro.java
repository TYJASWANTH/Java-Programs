import java.util.*;
public class ArrayIntro {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];

        for (int i=0;i<size ; i++){
            a[i]=sc.nextInt();
        }
       // a[0]=12;
       // a[2]=16;
       // a[1]=17;
        //System.out.println(a[2]);


        for(int i=0;i<size;i++){
            System.out.println(a[i]);
        }



    }
}
