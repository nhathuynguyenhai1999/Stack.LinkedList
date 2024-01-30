package James_Module2;

public class TreeNode {
    TreeNode left, right;
    int data;

    public TreeNode(int item) {
        data = item;
        left = right = null;
    }

    TreeNode root;

    static class BinaryTreeTraversal {
        TreeNode root;

        // Constructor
        public BinaryTreeTraversal() {
            root = null;
        }

        // Duyệt cây theo thuật toán đã mô tả
        public void traverseTree(TreeNode node) {
            if (node == null) {
                return;
            }

            // Bước 1: Duyệt cây con bên trái đệ qui
            traverseTree(node.left);

            // Bước 2: Duyệt cây con bên phải đệ qui
            traverseTree(node.right);

            // Bước 3: Truy cập nút gốc
            System.out.print(node.data + " ");

            // Bước 1: Truy cập nút gốc
            System.out.print(node.data + " ");

            // Bước 2: Duyệt cây con bên trái đệ qui
            traverseTree(node.left);

            // Bước 3: Duyệt cây con bên phải đệ qui
            traverseTree(node.right);
        }
    }
    public static void main(String[] args) {
        BinaryTreeTraversal tree = new BinaryTreeTraversal();

        // Tạo cây ví dụ
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.right.left = new TreeNode(6);
        tree.root.right.right = new TreeNode(7);

        System.out.println("Duyệt cây theo thuật toán đã mô tả:");
        tree.traverseTree(tree.root);

        // Tạo cây ví dụ
        tree.root = new TreeNode(4);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(6);
        tree.root.left.left = new TreeNode(1);
        tree.root.left.right = new TreeNode(3);
        tree.root.right.left = new TreeNode(5);
        tree.root.right.right = new TreeNode(7);

        System.out.println("Duyệt cây theo thuật toán đã mô tả:");
        tree.traverseTree(tree.root);
    }
}
