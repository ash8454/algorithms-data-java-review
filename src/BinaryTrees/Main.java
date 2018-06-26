package BinaryTrees;
class TreeNode {
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;


    public TreeNode(int data){
        this.data = data;
    }

    public void insert(int value){
        if (value == data){
            return;
        }
        if (value < data){
            if (leftChild == null){
                leftChild = new TreeNode(value);
            } else {
                leftChild.insert(value);
            }
        } else {
            if (rightChild == null){
                rightChild = new TreeNode(value);
            } else {
                rightChild.insert(value);
            }
        }
    }

    public TreeNode get(int value){
        if (value == data){
            return this;
        }
        if (value < data){
            if (leftChild != null){
                return leftChild.get(value);
            }
        } else {
            if (rightChild != null){
                return rightChild.get(value);
            }
        }
        return null;
    }

    public int getMin() {
        if (leftChild == null){
            return data;
        } else {
            return leftChild.getMin();
        }
    }

    public int getMax() {
        if (rightChild == null){
            return data;
        } else {
            return rightChild.getMax();
        }
    }

    public void traverseInOrder() {
        if (leftChild != null){
            leftChild.traverseInOrder();
        }
        System.out.print(data + ", ");
        if (rightChild != null){
            rightChild.traverseInOrder();
        }
    }

    public void traversePreOrder() {
        System.out.print(data + ", ");
        if (leftChild != null){
            leftChild.traversePreOrder();
        }
        if (rightChild != null){
            rightChild.traversePreOrder();
        }
    }

    public void traversePostOrder() {
        if (leftChild != null){
            leftChild.traversePostOrder();
        }
        if (rightChild != null){
            rightChild.traversePostOrder();
        }
        System.out.print(data + ", ");
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChid() {
        return leftChild;
    }

    public void setLeftChid(TreeNode leftChid) {
        this.leftChild = leftChid;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public String toString() {
        return "Data = " + data;
    }
}

class Tree {
    private TreeNode root;

    public void insert(int value){
        if (root == null){
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }

    public void traverseInOrder() {
        if (root != null){
            root.traverseInOrder();
        }
    }

    public void traversePreOrder() {
        if (root != null){
            root.traversePreOrder();
        }
    }

    public void traversePostOrder() {
        if (root != null){
            root.traversePostOrder();
        }
    }

    public TreeNode get(int value){
        if (root != null){
            return root.get(value);
        }
        return null;
    }

    public void delete(int value){
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subTreeRoot, int value){
        if (subTreeRoot == null){
            return subTreeRoot;
        }

        if (value < subTreeRoot.getData()){
            subTreeRoot.setLeftChid(delete(subTreeRoot.getLeftChid(), value));
        } else if (value > subTreeRoot.getData()){
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), value));
        } else {
            if (subTreeRoot.getLeftChid() == null){
                return subTreeRoot.getRightChild();
            } else if (subTreeRoot.getRightChild() == null){
                return subTreeRoot.getLeftChid();
            }
        }
        return subTreeRoot;


    }

    public int getMin(){
        if (root == null){
            return Integer.MIN_VALUE;
        } else {
            return root.getMin();
        }
    }

    public int getMax(){
        if (root == null){
            return Integer.MAX_VALUE;
        } else {
            return root.getMax();
        }
    }
}

public class Main {
    public static void main(String[] args){
        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);
        intTree.traverseInOrder();
        System.out.println();
        System.out.println(intTree.get(27));
        System.out.println(intTree.get(17));
        System.out.println(intTree.get(10000));
        System.out.println("Minimum Value: " + intTree.getMin());
        System.out.println("Maximum Value: " + intTree.getMax());
        intTree.traversePreOrder();
        System.out.println();
    }
}
