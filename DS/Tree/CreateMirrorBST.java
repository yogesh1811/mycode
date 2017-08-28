package DS.Tree;

public class CreateMirrorBST {

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

		TreeNode mirror = getMirorTree(root);

		TreeTraversal.preorderTraversal(mirror);

	}

	public static TreeNode getMirorTree(TreeNode node) {
		if (node == null) {
			return null;
		}
		TreeNode right = node.right;
		TreeNode left = node.left;
		node.right = getMirorTree(left);
		node.left = getMirorTree(right);
		return node;
	}

}
