package tree;

public class Inteiros {
    
    private int value;
    private Inteiros left,rigth;
    
    Inteiros(int i){
        this.value = i;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Inteiros getLeft() {
        return left;
    }

    public void setLeft(Inteiros left) {
        this.left = left;
    }

    public Inteiros getRigth() {
        return rigth;
    }

    public void setRigth(Inteiros rigth) {
        this.rigth = rigth;
    }
    
    
}
