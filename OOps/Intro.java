import java.util.Scanner;

class pen {
    String color;
    String type ; //ball point pen or gel pen or an ink pen

    public void write(){
        System.out.println("writing something");
    }

    public void printcolor(){
        System.out.println(this.color);
    }
}

public class Intro {
    public static void main (String args[]){
        pen pen1 = new pen();
        pen1.color="Blue";
        pen1.type="Ink pen";

        pen1.write();

        pen pen2 = new pen();

        pen2.color= "Black";
        pen2.type = "Ball Point";

        pen1.printcolor();
        pen2.printcolor();


    }
}