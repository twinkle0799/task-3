//import javax.lang.model.util.ElementScanner14;
package student;
public class Student {
    private int rollNumber;
    private String name;
    private String course;
    private int mark1;
    private int mark2;
    private int mark3;

    int calculateTotal(){
        return (mark1 + mark2 + mark3);
    }


    String calculateGrade(){
        double total = calculateTotal();
        double average = (total*100)/300;
        
        if(average>=90)
            return "A+";
        else if(average>=80 && average<90)
            return "A";
        else if(average>=70 && average<80)
            return "B+";
        else if(average>=60 && average<70)
            return "B";
        else if(average >= 50 && average<60)
            return "C+";
        else if(average >= 40 && average<50)
            return "C";
        else if(average>=34 && average<40)
            return "D";
        
        return "F";

        
    }

    void setRoll(int rollNumber){
        this.rollNumber = rollNumber;
    }
    int getRoll(){
        return rollNumber;
    }


    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }


    void setCourse(String course){
        this.course = course;
    }
    String getCourse(){
        return course;
    }
    
    
    void setMark1(int mark1){
        this.mark1 = mark1;
    }
    int getMark1(){
        return mark1;
    }


    void setMark2(int mark2){
        this.mark2 = mark2;
    }
    int getMark2(){
        return mark2;
    }

    void setMark3(int mark3){
        this.mark3 = mark3;
    }
    int setmMark3(){
        return mark3;
    }
	
    public String toString(){
        return "Roll number : " + rollNumber + "   " + "Name : " + name +"    "+ "Course : " + course ; 
    }
}

public class ClassTask1 {
    public static void main(String args[]){
        Student pra = new Student();
        pra.setRoll(1);
        pra.setName("Prachi");
        pra.setCourse("Computer Science");
        pra.setMark1(96);
        pra.setMark2(85);
        pra.setMark3(90);

        Student twin = new Student();
        twin.setRoll(2);
        twin.setName("Twinkle");
        twin.setCourse("Computer Science");
        twin.setMark1(88);
        twin.setMark2(88);
        twin.setMark3(89);

        Student ra = new Student();
        ra.setRoll(3);
        ra.setName("Ram");
        ra.setCourse("Computer Science");
        ra.setMark1(76);
        ra.setMark2(85);
        ra.setMark3(99);

        Student shy = new Student();
        shy.setRoll(4);
        shy.setName("Shyam");
        shy.setCourse("Computer Science");
        shy.setMark1(65);
        shy.setMark2(85);
        shy.setMark3(77);

        Student sit = new Student();
        sit.setRoll(5);
        sit.setName("Sita");
        sit.setCourse("Computer Science");
        sit.setMark1(77);
        sit.setMark2(85);
        sit.setMark3(63);

        System.out.println(pra + "   " +  pra.calculateGrade());
        System.out.println(twin +"   " + twin.calculateGrade());

        System.out.println(ra + "   " +  ra.calculateGrade());
        System.out.println(shy +"   " + shy.calculateGrade());
        System.out.println(sit + "   " + sit.calculateGrade());
    }
    
}
