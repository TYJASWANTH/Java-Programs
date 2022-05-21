
import  java.util.*;
public class SearchNo {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int count=0;
        System.out.println("enter the size of the array");
        int size = sc.nextInt();

        int a[] = new int[size];

        System.out.println("enter the array elements");
        for(int i=0;i<size;i++){
             a[i] = sc.nextInt();
        }

        System.out.println("enter teh number to be searched");
        int no = sc.nextInt();

        for(int i=0;i<size;i++){
            if(a[i]==no) {
                System.out.println(i);
                count++;
            }
        }
        if (count>0)
            System.out.println("above is found");
        else
            System.out.println("element not found");


    }
}
