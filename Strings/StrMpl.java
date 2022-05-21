import java . util .*;

public class StrMpl {
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     String str1 = sc.nextLine();
     String str2 = sc.nextLine();

     //concatinate
        System.out.println(str1+str2);
        String str3 = str1.concat(str2);
        System.out.println(str3);

     //length of a string]
        System.out.println("length of str1 is");
        System.out.println(str1.length());

        // charAt- to find the index of a string
        System.out.println(str1.charAt(1));

        //comparing two strings
        System.out.println(str1.compareTo(str2));

        //substring
        System.out.println(str3.substring(2,str3.length()));
        System.out.println(str1.startsWith("j"));
    }
}
