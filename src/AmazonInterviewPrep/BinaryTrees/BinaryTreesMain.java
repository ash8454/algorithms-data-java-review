package AmazonInterviewPrep.BinaryTrees;

import InterviewQuestions.LinkedList.BinaryTree;
import jdk.nashorn.api.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreesMain {

    private TreeNode root;



   class TreeNode {
       private int data;
       private TreeNode left;
       private TreeNode right;

       public TreeNode(int v){
           this.data = v;
       }
   }


    //Create Binary Tree
    public void createBinaryTree(){
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
    }

    //print list
    public void preOrderTraversal(TreeNode root){
       if (root == null){
           return ;
       }
       System.out.print(root.data + "-->");
       preOrderTraversal(root.left);
       preOrderTraversal(root.right);
    }

    public void onOrderTraversal(TreeNode root){
        if (root == null){
            return ;
        }
        preOrderTraversal(root.left);
        System.out.print(root.data + "-->");
        preOrderTraversal(root.right);
    }

    public void postOrderTraversal(TreeNode root){
        if (root == null){
            return ;
        }
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
        System.out.print(root.data + "-->");
    }


    public void levelOrderTraversal(TreeNode root){
       if (root == null){
           return ;
       }

        Queue<TreeNode> qr = new LinkedList<>();
        qr.offer(root);
        while (!qr.isEmpty()){
            TreeNode temp = qr.poll();
            System.out.print(temp.data + "-->");
            if (temp.right != null){
                qr.offer(temp.right);
            }
            if (temp.left != null){
                qr.offer(temp.left);
            }

        }
    }



    public static void main(String[] args){
        BinaryTreesMain binaryTree = new BinaryTreesMain();
        binaryTree.createBinaryTree();
//        binaryTree.preOrderTraversal(binaryTree.root);
//        System.out.println();
//        binaryTree.onOrderTraversal(binaryTree.root);
//        System.out.println();
//        binaryTree.postOrderTraversal(binaryTree.root);
//        System.out.println();
        binaryTree.levelOrderTraversal(binaryTree.root);
    }
}
