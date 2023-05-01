package tree;
import java.util.*;
public class ArvoresBinarias {
public static void main(String[] args) {

    Tree tree = new Tree();
    
    tree.insert(new Inteiros(3));
    tree.insert(new Inteiros(2));
    tree.insert(new Inteiros(1));
    tree.insert(new Inteiros(5));
    tree.insert(new Inteiros(0));
    tree.insert(new Inteiros(7));
    
    tree.readTree();
    
    System.out.println(tree.search(9));
    System.out.println("------------------------");
    
}
    
}
