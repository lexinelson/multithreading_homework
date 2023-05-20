package structure;

public class Tree {

    private Node root;

    public Tree() {
        this.root = new Node(new Member("Joseph Cardigan", 1951, 2, 27, 72));
        Node mamaJune = new Node(new Member("June Molasses", 1959, 9, 1, 63));
        Node zach = new Node(
                new Member("Zachary Cardigan", 1976, 7, 14, 46), mamaJune, root
        );
        Node mallory = new Node(
                new Member("Mallory Cardigan", 1978, 1, 7, 45), mamaJune, root
        );
        Node sarah = new Node(new Member("Sarah Menshaw", 1974, 4, 20, 49));
        Node lucy = new Node(new Member("Lucy Lullers", 1983, 11, 2, 39));
        Node tom = new Node(new Member("Thomas Henheffer", 1975, 7, 6, 47));
        Node brian = new Node(
                new Member("Brian Cardigan", 1998, 3, 13, 25), sarah, zach
        );
        new Node(
                new Member("Rosie Cardigan", 1998, 3, 13, 25), sarah, zach
        );
        new Node(
                new Member("William Cardigan", 2009, 8, 9, 13), lucy, zach
        );
        new Node(
                new Member("Ryan Henheffer", 1998, 10, 3, 24), mallory, tom
        );
        new Node(
                new Member("Lily Henheffer", 2006, 6, 16, 16), mallory, tom
        );
        Node star = new Node(new Member("Star Davies", 2001, 9, 6, 21));
        new Node(
                new Member("Felix Davies", 2021, 4, 4, 2), star, brian
        );
    }

    public Node getRoot() {
        return this.root;
    }
}
