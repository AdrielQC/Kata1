package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {       
        Student student = new Student ("Adriel", new Date (88, 8, 15));
        System.out.println(student.getAge()); 
    }
}
