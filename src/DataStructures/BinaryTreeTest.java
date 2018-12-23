package DataStructures;

public class BinaryTreeTest {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(25);
        binaryTree.insert(20);
        binaryTree.insert(15);
        binaryTree.insert(27);
        binaryTree.insert(30);
        binaryTree.insert(29);
        binaryTree.insert(26);
        binaryTree.insert(24);
        binaryTree.insert(32);
        binaryTree.insert(23);
        binaryTree.insert(2);

        System.out.println("Below is Inorder traversal ");
        binaryTree.inOrderTraversal();
        System.out.println("Below is preorder traversal ");
        binaryTree.preOrderTraversal();
        System.out.println("Below is POSTorder traversal ");
        binaryTree.postOrderTraversal();

//        find a value
        System.out.println("Got " + binaryTree.get(23).getData());

//        find min
        System.out.println("Minimum value in tree is " + binaryTree.getMin());

        System.out.println("Maximum value in the tree is "+ binaryTree.getMax());
    }
}
