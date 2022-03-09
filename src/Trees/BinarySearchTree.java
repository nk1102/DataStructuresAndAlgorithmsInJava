package Trees;

public class BinarySearchTree {
    private TreeNode root;

    private class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public TreeNode insert(TreeNode root,int value) {
        if(root == null){
            root = new TreeNode(value);
            return root;
        }
        if(value<root.data){
            root.left = insert(root.left,value);
        }
        else{
            root.right = insert(root.right,value);
        }
        return root;
    }
    public void insert(int value)
    {
        root= insert(root,value);
    }

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(5);
        binarySearchTree.insert(3);
        binarySearchTree.insert(4);
        binarySearchTree.insert(7);
        System.out.println();



    }
}
