package tree;
public class Tree {
    
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
                if(root.getRigth().getRigth() != null && root.getRigth().getLeft() != null){
                    Inteiros aux = this.getSmallest(root.getRigth().getRigth());
                    this.remove(aux.getValue());
                    aux.setRigth(root.getRigth().getRigth());
                    aux.setLeft(root.getRigth().getLeft());
                    root.setRigth(aux);
                }
                else if(root.getRigth().getRigth() == null && root.getRigth().getLeft() == null){
                    root.setRigth(null);
                }
                else{
                    if(root.getRigth().getRigth() != null){
                        root.setRigth(root.getRigth().getRigth());
                    }
                    else{
                        root.setRigth(root.getRigth().getLeft());
                    }
                }
            }
            else{
                remove(root.getRigth(), value);
        }
        }
        else if(value < root.getValue()){
            if(value == root.getLeft().getValue()){
                if(root.getLeft().getRigth() != null && root.getLeft().getLeft() != null){
                    Inteiros aux = this.getSmallest(root.getLeft().getRigth());
                    this.remove(aux.getValue());
                    aux.setRigth(root.getLeft().getRigth());
                    aux.setLeft(root.getLeft().getLeft());
                    root.setLeft(aux);
                }
                else if(root.getLeft().getRigth() == null && root.getLeft().getLeft() == null){
                    root.setLeft(null);
                }
                else{
                    if(root.getLeft().getRigth() != null){
                        root.setLeft(root.getLeft().getRigth());
                    }
                    else{
                        root.setLeft(root.getLeft().getLeft());
                    }
                }
                
            }
            else{
               remove(root.getLeft(), value);
        }
        }
        else{
            Inteiros aux = this.getSmallest(root.getRigth());
            this.remove(aux.getValue());
            aux.setRigth(root.getRigth());
            aux.setLeft(root.getLeft());
            this.root = aux;
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
    public Inteiros getSmallest(){
        return getSmallest(root);
    }
    private Inteiros getSmallest(Inteiros root){
        if(root.getLeft() == null){
            return root;
        }
        return getSmallest(root.getLeft());
    }
    
    public Inteiros getBiggest(){
        return getBiggest(root);
    }
    private Inteiros getBiggest(Inteiros root){
        if(root.getRigth() == null){
            return root;
        }
        return getBiggest(root.getRigth());
    }
}
