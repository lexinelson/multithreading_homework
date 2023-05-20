package structure;

import java.util.ArrayList;
import java.util.List;

public class Node {

    private final Node mother;

    private final Node father;

    private final List<Node> children;

    private final Member data;

    public Node(Member data) {
        this(data, null, null);
    }

    public Node(Member data, Node mother, Node father) {
        this.data = data;
        this.mother = mother;
        if (mother != null) mother.addChild(this);
        this.father = father;
        if (father != null) father.addChild(this);
        this.children = new ArrayList<>();
    }

    public void addChild(Node child) {
        this.children.add(child);
    }

    public List<Node> getChildren() {
        return this.children;
    }

    public Node getMother() {
        return this.mother;
    }

    public Node getFather() {
        return this.father;
    }

    public Member getData() {
        return this.data;
    }
}
