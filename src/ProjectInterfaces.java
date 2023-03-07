import java.util.ArrayList;

public class ProjectInterfaces {
    public interface TreeInterface {
        public ArrayList<Node> getTree();
        public void appendParentChild(Person parent, Person children);
        public void appendWifeHusband(Person wife, Person husband);
    }

    public interface PersonInterface {
        public String getFullName();

        public void setFullName(String fullName);

        public int getAge();

        public void setAge(int age);
        public void printNameAndAge();
    }

    public interface ResearchInterface {
        public ArrayList<String> spend(Person p, Relationship re);
        public ArrayList<String> searchAge();

    }
}
