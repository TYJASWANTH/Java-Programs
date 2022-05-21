import java . util . *;
public class strindBuilder {
    public  static  void main (String args[]){
        StringBuilder str = new StringBuilder("helllo");

        System.out.println(str.charAt(3));

        //replacement of character in string
        str.setCharAt(4,'p');
        System.out.println(str);

        //inserting at a index
        str.insert(4,"abc");
        System.out.println(str);

        //deleting a str in string
        str.delete(4,8);
        System.out.println(str);

        //appending -- adding
        str.append(" world");
        System.out.println(str);
        System.out.println(str.length());

    }
}

