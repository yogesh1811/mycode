package DS.Tree;

public class DeepestLeftLeaf {

	static int maxLevel;
	static int retNode;

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
		root.right.right.left = new TreeNode(23);

		System.out.println("Deepest Left Leaf => " + findDeepestLeafTree(root));

	}

	private static int findDeepestLeafTree(TreeNode root) {

		return findDeepestLeafTreeUtil(root, false, 1);
	}

	private static int findDeepestLeafTreeUtil(TreeNode node, boolean isLeft,
			int level) {
		if (node == null) {
			return retNode;
		}
		if (isLeft && node.left == null && node.right == null
				&& level > maxLevel) {
			retNode = node.data;
			maxLevel = level;
		}
		findDeepestLeafTreeUtil(node.left, true, level + 1);
		findDeepestLeafTreeUtil(node.right, false, level + 1);

		return retNode;
	}

}
