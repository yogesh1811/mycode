package DS.Tree;

public class TreeTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeNode root = new TreeNode(15);

		root.left = new TreeNode(12);
		root.left.left = new TreeNode(10);
		root.left.right = new TreeNode(13);

		root.right = new TreeNode(20);
		root.right.left = new TreeNode(18);
		root.right.right = new TreeNode(25);

		// Inorder traversal --- left->root->right
		//
		// inorderTraversal(root);
		// Preorder Traversal --- root->left->right
		// preorderTraversal(root);

		// Postorder Traversal ---left->right->root
		// postorderTraversal(root);

		// level order traversal

		levelOrderTraversal(root);

	}

	private static void levelOrderTraversal(TreeNode node) {
		int h = height(node);
		for (int i = 1; i <= h; i++) {
			System.out.println("Level#" + i);
			printGivenLevel(node, i);
		}

	}

	private static void printGivenLevel(TreeNode node, int level) {
		if (node == null) {
			return;
		}
		if (level == 1) {
			System.out.print(node.data + " ");
			System.out.println("\n");
		} else if (level > 1) {
			printGivenLevel(node.left, level - 1);
			printGivenLevel(node.right, level - 1);

		}

	}

	private static void postorderTraversal(TreeNode node) {
		if (node == null) {
			return;
		}
		postorderTraversal(node.left);
		postorderTraversal(node.right);
		System.out.println(node.data);

	}

	public static void preorderTraversal(TreeNode node) {
		if (node == null) {
			return;
		}
		System.out.println(node.data);
		preorderTraversal(node.left);
		preorderTraversal(node.right);

	}

	private static void inorderTraversal(TreeNode node) {
		if (node == null) {
			return;
		}
		inorderTraversal(node.left);
		System.out.println(node.data);
		inorderTraversal(node.right);
	}

	/*
	 * Compute the "height" of a tree -- the number of nodes along the longest
	 * path from the root node down to the farthest leaf node.
	 */
	static int height(TreeNode root) {
		if (root == null)
			return 0;
		else {
			/* compute height of each subtree */
			int lheight = height(root.left);
			int rheight = height(root.right);

			/* use the larger one */
			if (lheight > rheight)
				return (lheight + 1);
			else
				return (rheight + 1);
		}
	}

}
