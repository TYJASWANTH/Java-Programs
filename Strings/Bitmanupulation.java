import java.util.*;

public class Bitmanupulation {
    public static void main(String args[]){
         //get method
        int number = 5;
        int position = 2;
        int bitmask = 1<<position;

        if((bitmask & number)== 0){
            System.out.println("the pos no is 0");
        }
        else{
            System.out.println("the pos no is 1");
        }
         //set function
        System.out.println(SetBit(position,number));
        //clear function
        System.out.println(ClrBit(position,number));

        Scanner sc = new Scanner(System.in);
         int bit = sc.nextInt();
         if(bit==1){
             System.out.println(SetBit(position,number));
         }
         else if(bit==0)
             System.out.println(ClrBit(position,number));
         else
             System.out.println("error");
    }

    public static int SetBit(int pos , int num){
        int bmask = 1<< pos;
        int newno = num | bmask;
        return  newno;
    }

    public  static int ClrBit(int pos, int num){
        int bm = 1<<pos;
        int  notbm = ~(bm);
        int newno = notbm & num;
        return  newno;
    }
}
