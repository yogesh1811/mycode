package DS.Tree;

public class GetLevelOfNodeBT {

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

		System.out.println(findLevelOfNode(root, 200));

	}

	private static int findLevelOfNode(TreeNode root, int data) {
		findLevel(root, data, 1);
		return findLevel(root, data, 1);
	}

	private static int findLevel(TreeNode node, int data, int level) {
		if (node == null) {
			return -1;
		}
		if (node.data == data) {
			return level;
		} else {
			int downLevel = findLevel(node.left, data, level + 1);
			if (downLevel != -1) {
				return downLevel;
			}
			downLevel = findLevel(node.right, data, level + 1);
			return downLevel;
		}
	}

}
