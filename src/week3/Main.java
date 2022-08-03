package week3;

public class Main {
    // Lecture - Today we will be learning about creating objects using a class in another file
    //         - create a file Student and open it (i already did so just open it)

    public static void main(String [] args) {
        Student object = new Student(); // object created

        // ADD - name, matric number and gpa to object
        object.name = "caleb";                       // set name of object
        object.matricNumber = "BHU/20/04/05/0089";   // set matric number of object
        object.gpa = 4.3;                           // set gpa of object

        System.out.println(object.name);                  // print object name
        System.out.println(object.matricNumber);          // print object matric number
        System.out.println(object.gpa);                   // print object gpa


        // -------------------------
        // class work - create another object and give it
        // name - "tony"
        // matric number - "BHU/21/04/05/0066"
        // gpa - 3.2;

        Student object2 = new Student(); // object 2 created

        // ADD - name, matric number and gpa to object
        object2.name = "tony";                       // set name of object
        object2.matricNumber = "BHU/21/04/05/0066";  // set matric number of object
        object2.gpa = 3.2;                           // set gpa of object

        System.out.println(object2.name);                  // print object name
        System.out.println(object2.matricNumber);          // print object matric number
        System.out.println(object2.gpa);                   // print object gpa


        // -------------------------
        // Exercise - create another object and give it (please do this)
        // name - "funke"
        // matric number - "BHU/19/04/05/0103"
        // gpa - 4.51;


    }

}
