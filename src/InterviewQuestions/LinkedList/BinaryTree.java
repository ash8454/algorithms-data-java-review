package InterviewQuestions.LinkedList;


import Stacks.LinkedStack;
import jdk.nashorn.api.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    private TreeNode root;

    public class TreeNode {
        private int data;
        private TreeNode leftNode;
        private TreeNode rightNode;

        public TreeNode(int v){
            this.data = v;
        }
    }

    class Stack {
        private Node top;
        private int length;

        public Stack(){
            top = null;
            length = 0;
        }

        public void push(int v){
            Node newNode = new Node(v);
            newNode.next = top;
            top = newNode;
            length++;
        }

        public int pop(){
            int result = top.value;
            top = top.next;
            length--;
            return result;
        }
    }

    public void createBinaryTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);

        root = first;
        first.leftNode = second;
        first.rightNode = third;
        second.leftNode = fourth;
        second.rightNode = fifth;
        third.leftNode = sixth;
        third.rightNode = seventh;
    }


    public void createBinarySearchTree(){
//        TreeNode first = new TreeNode(4);
//        first.leftNode = new TreeNode(2);
//        first.rightNode = new TreeNode(6);
//        first.leftNode.leftNode = new TreeNode(1);
//        first.leftNode.rightNode = new TreeNode(3);
//        first.rightNode.leftNode =  new TreeNode(5);
//        first.rightNode.rightN        TreeNode first = new TreeNode(4);
//        first.leftNode = new TreeNode(2);
//        first.rightNode = new TreeNode(6);
//        first.leftNode.leftNode = new TreeNode(1);
//        first.leftNode.rightNode = new TreeNode(3);
//        first.rightNode.leftNode =  new TreeNode(5);
//        first.rightNode.rightNode = new TreeNode(6);ode = new TreeNode(6);

        root = new TreeNode(4);
        root.leftNode = new TreeNode(2);
        root.rightNode = new TreeNode(6);
        root.leftNode.leftNode = new TreeNode(3);
        root.leftNode.rightNode = new TreeNode(1);
        root.rightNode.leftNode =  new TreeNode(5);
        root.rightNode.rightNode = new TreeNode(6);

    }


    //Recursive Preorder traversal
     // print the root data
     // traverse the left one
    // traverse the right one
    public void preOrder(TreeNode root){
        if (root == null){
            return ;
        }
        System.out.print(root.data + " -  ");
        preOrder(root.leftNode);
        preOrder(root.rightNode);
    }

    public void preOrderIterative(TreeNode root){
        if (root == null){
            return ;
        }

        LinkedList<TreeNode> linkedStack = new LinkedList<>();
        linkedStack.push(root);
        while (!linkedStack.isEmpty()){
            TreeNode temp = linkedStack.pop();
            System.out.print(temp.data + " ----- ");
            if (temp.rightNode != null){
                linkedStack.push(temp.rightNode);
            }
            if (temp.leftNode != null)  {
                linkedStack.push(temp.leftNode);
            }
        }
    }


    public void preOrderAgain(TreeNode root){
        if (root == null){
            return ;
        }

        System.out.print(root.data + "-->");
        preOrderAgain(root.leftNode);
        preOrderAgain(root.rightNode);

    }

    public void preOrderIterativeAgain(TreeNode root){
        if (root == null){
            return ;
        }
        LinkedList<TreeNode> linkedStack = new LinkedList<>();
        linkedStack.push(root);
        while (!linkedStack.isEmpty()){
            TreeNode temp = linkedStack.pop();
            System.out.print(temp.data + " ----- ");
            if (temp.rightNode  != null){
                linkedStack.push(temp.rightNode);
            }
            if (temp.leftNode != null){
                linkedStack.push(temp.leftNode);
            }

        }
    }

    public void inOrderTraversal(TreeNode root){
        if (root == null){
            return ;
        }
        inOrderTraversal(root.leftNode);
        System.out.print(root.data + "-->");
        inOrderTraversal(root.rightNode);

    }

    public void postOrderTraversal(TreeNode root){
        if (root == null){
            return ;
        }
        postOrderTraversal(root.leftNode);
        postOrderTraversal(root.rightNode);
        System.out.print(root.data + "-->");

    }

    public void levelOnOrderTraversal(TreeNode root){
        if (root == null){
            return ;
        }
        //create a queue
        Queue<TreeNode> queueList = new LinkedList<>();
        //add the root in the queue
        queueList.offer(root);
        //while loop to traverse in the queue
        while (!queueList.isEmpty()){
            //create a temp node and get the value from the root
            TreeNode temp = queueList.poll();
            System.out.print(temp.data + "--");
            if (temp.leftNode != null){
                queueList.offer(temp.leftNode);
            }
            if (temp.rightNode != null){
                queueList.offer(temp.rightNode);
            }
        }
    }

    public int size(TreeNode root) {
        if (root == null){
            return 0;
        }
        int leftSize = size(root.leftNode);
        int rightSize = size(root.rightNode);
        return leftSize + rightSize + 1;
    }

    //Find height of the tree
    public int findHeightOfTree(TreeNode root){
        if (root == null){
            return 0;
        }
        int rightHeight = findHeightOfTree(root.rightNode);
        int leftHeight =  findHeightOfTree(root.leftNode);
        int height = Math.max(rightHeight, leftHeight) + 1;
        return height;


    }


    public int findMaxInTree(TreeNode root){
        if (root == null){
            return Integer.MIN_VALUE;
        }
        int max = root.data;
        int right = findMaxInTree(root.rightNode);
        int left = findMaxInTree(root.leftNode);
        if (right > max){
            max = right;
        }
        if (left > max){
            max = left;
        }
        return max;
    }


    public int findMaxinBST(TreeNode root){
        if (root == null){
            return Integer.MIN_VALUE;
        }
        while (root.rightNode != null){
            root = root.rightNode;
        }
        return root.data;
    }


    public int findMinInTree(TreeNode root){
        if (root == null){
            return Integer.MAX_VALUE;
        }
        int min = root.data;
        int right = findMinInTree(root.rightNode);
        int left = findMinInTree(root.leftNode);
        if (right < min){
            min = right;
        }
        if (left < min){
            min = left;
        }
        return min;
    }


    public boolean findNodeInTree(TreeNode root, int v){
        boolean left, right;
        if (root == null){
            return false;
        }
        if (root.data == v) return true;
        left = findNodeInTree(root.leftNode, v);
        if (left) return true;
        right  = findNodeInTree(root.rightNode, v);
        if (right) return true;
        return false;

    }

    public int findMinInBST(TreeNode root){
        if (root == null){
            return Integer.MAX_VALUE;
        }
        while (root.leftNode != null){
            root = root.leftNode;
        }
        return root.data;
    }

    public boolean isBST(TreeNode root, int minInBST, int maxinBST) {
        if (root == null) return true;
        int min = findMinInBST(root);
        int max = findMaxinBST(root);
        if (root.data < findMinInBST(root) || root.data > findMaxinBST(root))
            return false;
        return isBST(root.leftNode, min, root.data) && isBST(root.rightNode, root.data, max);

    }





    public static void main(String[] args){
//        BinaryTree tree = new BinaryTree();
//        tree.createBinaryTree();
//        tree.preOrder(tree.root);
//        System.out.println("--------");
//        tree.preOrderIterative(tree.root);
//        System.out.println("--------");
//        tree.preOrderAgain(tree.root);
//        System.out.println("--------");
//        tree.preOrderIterativeAgain(tree.root);
//        System.out.println();
//        tree.inOrderTraversal(tree.root);
//        System.out.println();
//        tree.postOrderTraversal(tree.root);
//        System.out.println();
//        tree.levelOnOrderTraversal(tree.root);
//        System.out.println(tree.size(tree.root));
//        System.out.println(tree.findHeightOfTree(tree.root));
//        System.out.println(tree.findMaxInTree(tree.root));
//        System.out.println(tree.findMinInTree(tree.root));
//        System.out.println(tree.findNodeInTree(tree.root, 6));
//        System.out.println(tree.isBST(tree.root, Integer.MIN_VALUE, Integer.MAX_VALUE));
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.createBinarySearchTree();
        System.out.println(binaryTree.isBST(binaryTree.root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    //    System.out.println(tree.isBST(binaryTree.root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}
