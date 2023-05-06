package tree;
import java.util.*;
public class ArvoresBinarias {
public static void main(String[] args) {

    Tree tree = new Tree();
    
    tree.insert(new Inteiros(10));
    tree.insert(new Inteiros(27));
    tree.insert(new Inteiros(5));
    tree.insert(new Inteiros(6));
    tree.insert(new Inteiros(34));
    tree.insert(new Inteiros(100));
    tree.insert(new Inteiros(0));
    tree.insert(new Inteiros(3));
    tree.insert(new Inteiros(-5));
    tree.insert(new Inteiros(4));    
    tree.insert(new Inteiros(2));
    tree.insert(new Inteiros(35));
    tree.insert(new Inteiros(32));
    tree.readTree();
    System.out.println("===================================");
    tree.remove(10);
    tree.readTree();
    
   
    
}
    
}
