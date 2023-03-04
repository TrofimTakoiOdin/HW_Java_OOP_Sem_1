import java.util.ArrayList;

public class GeoTree {

    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    // связь родитель - ребенок
    public void appendPerentChild(Person parent, Person children) {
        tree.add(new Node(parent, Relationship.PARENT, children));
        tree.add(new Node(children, Relationship.CHILD, parent));
    }

    // связь муж - жена
    public void appendVifeHusbent(Person WIFE, Person husband) {
        tree.add(new Node(WIFE, Relationship.WIFE, husband));
        tree.add(new Node(husband, Relationship.HUSBAND, WIFE));
    }

}
