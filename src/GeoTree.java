import java.util.ArrayList;
import java.util.Scanner;

public class GeoTree implements ProjectInterfaces.TreeInterface, ProjectInterfaces.ResearchInterface {

    private ArrayList<Node> tree = new ArrayList<>();
    ArrayList<String> result = new ArrayList<>();
    ArrayList<String> resultAge = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    // связь родитель - ребенок
    public void appendParentChild(Person parent, Person children) {
        tree.add(new Node(parent, Relationship.PARENT, children));
        tree.add(new Node(children, Relationship.CHILD, parent));
    }

    // связь муж - жена
    public void appendWifeHusband(Person wife, Person husband) {
        tree.add(new Node(wife, Relationship.WIFE, husband));
        tree.add(new Node(husband, Relationship.HUSBAND, wife));
    }

    @Override
    public ArrayList<String> spend(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.getFullName() == p.getFullName() && t.re == re) {
                result.add(t.p2.getFullName());
            }
        }
        return result;
    }

    @Override
    public ArrayList<String> searchAge() {
        System.out.print("Введите ограничение по возрасту: ");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        System.out.println("Люди, младше: " + age + ":");

        for (Node t : tree) {

            if (t.p1.getAge() <= age && !resultAge.contains(t.p1.getFullName())) {
                resultAge.add(t.p1.getFullName());
            }
        }
        return resultAge;
    }
}
