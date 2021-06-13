public class ProjectTest{
    public static void main(String[] args){
        Project project1 = new Project();
        Project project2 = new Project("Project2");
        Project project3 = new Project("Project3", "This Project provides a name and description");

        System.out.println(project1.elevatorPitch());
        System.out.println(project2.elevatorPitch());
        System.out.println(project3.elevatorPitch());
    }
}