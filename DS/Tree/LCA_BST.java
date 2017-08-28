package DS.Tree;

public class LCA_BST {

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

		System.out.println("LCA => " + findLCA(root, 10, 13).data);

	}

	private static TreeNode findLCA(TreeNode node, int n1, int n2) {
		if (node == null)
			return null;

		// If both n1 and n2 are smaller than root, then LCA lies in left
		if (node.data > n1 && node.data > n2)
			return findLCA(node.left, n1, n2);

		// If both n1 and n2 are greater than root, then LCA lies in right
		if (node.data < n1 && node.data < n2)
			return findLCA(node.right, n1, n2);

		return node;
	}

}
