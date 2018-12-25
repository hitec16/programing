package DataStructures;

public class BinaryTreeNode {

    private int data;
    private BinaryTreeNode leftChild;
    private BinaryTreeNode rightChild;

    public BinaryTreeNode(int data) {
        this.data = data;
    }

    public void insert(int value) {

        if (data == value) {
//            do not store duplicate values
            return;
        }

        if (value < this.data) {
            if (leftChild != null) {
                leftChild.insert(value);
            } else {
//                null so insert
                leftChild = new BinaryTreeNode(value);
            }
        } else {
            if (rightChild != null) {
                rightChild.insert(value);
            } else {
//                null so insert value here
                rightChild = new BinaryTreeNode(value);
            }
        }

    }

    public BinaryTreeNode get(int value) {

        if (value == data) {
            return this;
        }
        if (value < data) {
            if (leftChild != null)
                return leftChild.get(value);
        } else {
            if (rightChild != null)
                return rightChild.get(value);
        }

        return null;
    }

    public int getMin(){
        if(leftChild != null){
            return leftChild.getMin();
        }
        else {
            return data;
        }
    }

    public int getMax(){
        if(rightChild != null){
            return rightChild.getMax();
        }
        else {
            return data;
        }
    }


    public void inOrderTraversal() {

        if (leftChild != null) {
            leftChild.inOrderTraversal();
        }

        System.out.print(data + ", ");


        if (rightChild != null) {
            rightChild.inOrderTraversal();
        }

    }

    public void preOrderTraversal() {
        System.out.print(data + ", ");

        if (leftChild != null) {
            leftChild.preOrderTraversal();
        }

        if (rightChild != null) {
            rightChild.preOrderTraversal();
        }
    }

    public void postOrderTraversal() {

        if (leftChild != null) {
            leftChild.postOrderTraversal();
        }

        if (rightChild != null) {
            rightChild.postOrderTraversal();
        }
        System.out.print(data + ", ");

    }


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinaryTreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BinaryTreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public BinaryTreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(BinaryTreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
