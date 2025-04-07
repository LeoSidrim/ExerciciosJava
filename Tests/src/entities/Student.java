package entities;

public class Student {
    public String name;
    public float n1,n2,n3;

    public float sumGradePoint(){
        return n1 + n2 + n3;
    }

   public  void status(){
        if (sumGradePoint() < 60){
            float missingPoints = 60 - sumGradePoint();
            System.out.println("STUDENT: "+ name);
            System.out.println("FINAL GRADE= "+ sumGradePoint());
            System.out.println("FAILED");
            System.out.println("MISSING "+missingPoints +" POINTS");
        } else {
            System.out.println("FINAL GRADE = "+ sumGradePoint());
            System.out.println("PASS");
        }
    }

}
