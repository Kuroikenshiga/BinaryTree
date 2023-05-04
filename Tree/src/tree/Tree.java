package tree;
public class Tree {
    //Funcionou
    private Inteiros root;

    public boolean isEmpty(){
        if(root == null){
            return true;
        }
        return false;
    }
    
    public Inteiros getRoot() {
        return root;
    }

    public void setRoot(Inteiros root) {
        this.root = root;
    }
    
    public void insert(Inteiros i){
        if(i != null){
            if(this.isEmpty()){
                this.root = i;
            }
            else{
                insert(i, this.root);
            }
    }
    }
    private void insert(Inteiros i, Inteiros r){
        
        if(i.getValue() != r.getValue()){
            
            if(i.getValue() > r.getValue()){
                if(r.getRigth() == null){
                    r.setRigth(i);
                }
                else{
                    insert(i, r.getRigth());
                }
            }
            else{
                if(r.getLeft() == null){
                    r.setLeft(i);
                }
                else{
                    insert(i, r.getLeft());
                }
            }
        }
    }
    
    public void remove(int value){
        remove(root, value);
    }
    private void remove(Inteiros root,int value){
        if(value > root.getValue()){
            if(value == root.getRigth().getValue()){
                Inteiros left = root.getRigth().getLeft(),right = root.getRigth().getRigth();
                root.setRigth(null);
                this.insert(left);
                this.insert(right);
            }
            else{
                remove(root.getRigth(), value);
        }
        }
        else if(value < root.getValue()){
            if(value == root.getLeft().getValue()){
                Inteiros left = root.getLeft().getLeft(),rigth = root.getLeft().getRigth();
                root.setLeft(null);
                this.insert(left);
                this.insert(rigth);
            }
            else{
               remove(root.getLeft(), value);
        }
        }
        else{
            Inteiros rigth = root.getRigth(),left = root.getLeft();
            this.root = left;
            this.insert(rigth);
            
        }
    }
    
    public void readTree(){
        if(!this.isEmpty()){
            readTree(this.root);
        }
    }
    private void readTree(Inteiros i){
        if(i.getLeft()!=null) readTree(i.getLeft());
        
        System.out.println(i.getValue());
        
        if(i.getRigth()!=null) readTree(i.getRigth());
    }
    
    public boolean search(int value){
        if(!this.isEmpty()){
            return this.search(root, value);
        }
        return false;
    } 
    private boolean search(Inteiros root,int value){
        
        if(root == null){
            return false;
        }
        
        if(value > root.getValue()){
            return search(root.getRigth(), value);
        }
        
        if(value < root.getValue()){
            return search(root.getLeft(), value);
        }
        return true;
        
    }
}
