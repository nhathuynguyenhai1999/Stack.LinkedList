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
        public class BinarySearchTree {
            TreeNode root;

            // Constructor
            public BinarySearchTree() {
                root = null;
            }

        // Thêm một phần tử vào cây
        public void insert(int key) {
            root = insertRec(root, key);
        }
        private TreeNode insertRec(TreeNode root, int key) {
            if (root == null) {
                root = new TreeNode(key);
                return root;
            }
            if (key < root.data) {
                root.left = insertRec(root.left, key);
            } else if (key > root.data) {
                root.right = insertRec(root.right, key);
            }
            return root;
        }
        // Tìm kiếm một phần tử trong cây
        public boolean search(int key) {
            return searchRec(root, key);
        }
        private boolean searchRec(TreeNode root, int key) {
            if (root == null || root.data == key) {
                return root != null; // Trả về true nếu phần tử được tìm thấy, false nếu cây con trống
            }

            if (key < root.data) {
                return searchRec(root.left, key);
            } else {
                return searchRec(root.right, key);
            }
        }
    }
    public void main(String[] args) {
        BinaryTreeTraversal tree = new BinaryTreeTraversal();

        BinarySearchTree tree1 = new BinarySearchTree();

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

        //
        // Thêm các phần tử vào cây
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Tìm kiếm phần tử trong cây
        int keyToSearch = 40;
        if (tree.search(keyToSearch)) {
            System.out.println(keyToSearch + " được tìm thấy trong cây.");
        } else {
            System.out.println(keyToSearch + " không có trong cây.");
        }

        keyToSearch = 90;
        if (tree.search(keyToSearch)) {
            System.out.println(keyToSearch + " được tìm thấy trong cây.");
        } else {
            System.out.println(keyToSearch + " không có trong cây.");
        }
    }

        private void insert(int i) {
        }

        private boolean search(int keyToSearch) {
            return false;
        }
    }
}
