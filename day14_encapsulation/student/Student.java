/**
 * Represents a student with encapsulated fields and grade validation.
 */

public class Student {
    private String name;
    private int grade;

    public String getName() {
        return this.name;
    }

    public int getGrade() {
        return this.grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        if (grade < 0 || grade > 100) {
            System.out.println("Invalid grade entered. Grade set to 0 by default.");
            this.grade = 0;
        } 
        else {
            this.grade = grade;
        }
        
    }

}

