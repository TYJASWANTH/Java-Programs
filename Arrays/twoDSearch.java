
import  java . util . *;

public class twoDSearch {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int r = sc.nextInt();
        System.out.println("Enter no of columns");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("enter the arrays"+"(max no = "+r*c+")");
        for(int i=0 ;  i<r ; i++){
            for(int j=0; j<c ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The entered array is");
        for(int i=0 ;  i<r ; i++){
            for(int j=0; j<c ; j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }

        System.out.println("enter the no to be searched");
        int no = sc.nextInt();
        int count=0;

        for(int i=0 ;  i<r ; i++){
            for(int j=0; j<c ; j++){
               if(arr[i][j]==no){
                   System.out.println(" the index is "+i+" and "+j);
                   count++;
               }
            }
        }

        if(count>0)
            System.out.println("Number found");
        else
            System.out.println("Number does not exist in the array");

    }
}
