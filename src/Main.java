import structure.Node;
import structure.Tree;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String... args) {
        Tree cardiganFamilyTree = new Tree();
        Node root = cardiganFamilyTree.getRoot();
    }

    public static void writeResultToFile(String result) {
        try (FileWriter writer = new FileWriter("results.txt")) {
            writer.write(result);
        } catch (IOException exc) {
            throw new RuntimeException(exc);
        }
    }
}
