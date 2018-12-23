package DataStructures;

public class BinaryTree {

    private BinaryTreeNode root;

    public void insert(int value) {
        if (root == null) {
            root = new BinaryTreeNode(value);
        } else {
            root.insert(value);
        }
    }

    public void inOrderTraversal() {
        if (root != null) {
            root.inOrderTraversal();
        }
    }

    public void preOrderTraversal() {
        if (root != null) {
            root.preOrderTraversal();
        }
    }

    public void postOrderTraversal() {
        if (root != null) {
            root.postOrderTraversal();
        }
    }

    public BinaryTreeNode get(int value) {
        if (root != null) {
            return root.get(value);
        } else {
            return null;
        }
    }

    public int getMin() {
        if (root != null) {
            return root.getMin();
        } else {
            return Integer.MIN_VALUE;
        }
    }

    public int getMax() {
        if (root != null) {
            return root.getMax();
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public void delete(int value){
        root = delete(root, value);
    }

    private BinaryTreeNode delete(BinaryTreeNode subTreeRoot, int value) {
        if(subTreeRoot == null){
            return subTreeRoot;
        }

        if(value < subTreeRoot.getData()){
            subTreeRoot.setLeftChild(delete(subTreeRoot,value));
        }
        else if(value > subTreeRoot.getData()){
            subTreeRoot.setRightChild(delete(subTreeRoot,value));
        }
        else {
//            cases 1 and 2: node to delete has 0 or 1 child(ren)
            if(subTreeRoot.getLeftChild() == null){
                return subTreeRoot.getRightChild();
            }
            else if(subTreeRoot.getRightChild() == null){
                return subTreeRoot.getLeftChild();
            }
        }

        return subTreeRoot;
    }
}
