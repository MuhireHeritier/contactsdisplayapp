
package model;

/**
 *Part 1 of the coursework. A random class UserImplPart1 that implements the IDisplayable interface just for testing the interface purposes
 * @author hmuhire
 * 
 */
public class UserImplPart1 implements IDisplayable {
    private int studentId;
    private String name;
    private int age;    
    private int schoolYear;
    private String nationality;
/**
 * Constructs a new UserInfo whose fields are specified by Integer and String argument 
 * @param studentId Student Id
 * @param yourName Student name
 * @param yourAge Student age
 * @param yourSchoolYear Academic year
 * @param yourNationality Nationality
 */    
    public UserImplPart1(int studentId, String yourName, int yourAge,int yourSchoolYear, String yourNationality){
        this.studentId = studentId;
        this.name= yourName;
        this.age = yourAge;    
        this.schoolYear= yourSchoolYear;
        this.nationality= yourNationality;
}
    /**
     * 
     * @return the student ID
     */
    public int getStudentId() {
        return studentId;
    }
    /**
     * 
     * @param iD set the student ID
     */
    public void setStudentId(int iD) {
        this.studentId = iD;
    }
    /**
     * 
     * @return the name of the student
     */
    public String getName() {
        return name;
    }
    /**
     *  
     * @param name assign the student name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * 
     * @return the age of student
     */
    public int getAge() {
        return age;
    }
    /**
     * 
     * @param age set the age
     */
    public void setAge(int age) {
        this.age = age;
    }
    /**
     * 
     * @return the school year
     */
    public int getSchoolYear() {
        return schoolYear;
    }
    /**
     * 
     * @param schoolYear set the school year
     */
    public void setSchoolYear(int schoolYear) {
        this.schoolYear = schoolYear;
    }
    /**
     * 
     * @return the nationality of the user
     */
    public String getNationality() {
        return nationality;
    }
    /**
     * 
     * @param nationality set the nationality
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    /**
     * Display method used for displaying student information
     */
    @Override
    public void display(){
        System.out.println("Student id: "+getStudentId()+"\nName is: "+getName()+"\nAge :"+getAge()+"\nAcademic year: "+getSchoolYear()
        +"\nNationality :"+getNationality());
    }  
  
//    public static void main(String [] args){
//        UserImplPart1 newUserInfo = new UserImplPart1(23,"Muhire", 3, "Rwandan");
//        System.out.println("Student information\n"+"====================");
//        newUserInfo.display();
//}
}
