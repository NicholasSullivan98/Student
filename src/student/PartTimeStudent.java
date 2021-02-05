package student;

public class PartTimeStudent extends Student{
    private int numCourses;
    
    public PartTimeStudent(String name, int numofCourses){
        numCourses = numofCourses;
    }
    
    public int getNumCourses(){
        return numCourses;
    }
    
    public void setNumCourses(int numCourses){
        this.numCourses = numCourses;
    }
}
