

class  Student{
    String name;
    int Age;

    public void  printInfo(){
        System.out.println(this.name);
        System.out.println(this.Age);
         }

        //parameterized controller
        /* Student(String name , int age){
            this.name = name;
            this.Age = age;
          } */



    //non-para constuctor
       /*
       Student(){
       System.out.println("calling constuctor");
       }
        */

    //copy constuctors
    Student(Student s2){
        this.name = s2.name;
        this.Age = s2.Age;
    }

    Student(){

    }

}

public class StudentDetails {
    public static void main(String args[]){
        //Student student1 = new Student("Tejasree",69);
        Student student1 = new Student();
        student1.name = "T.Jaswanth";
        student1.Age = 25;

        Student s2 = new Student(student1);
        s2.printInfo();
    }
}


