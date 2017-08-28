package DS.Tree;

public class DiameterBST {

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

		System.out.println("Diameter => " + findDiameter(root));

		System.out.println("Diameter => "
				+ findDiameter_OofN(root, new TreeHeight()));

	}

	/**
	 * 
	 * @param root
	 *            Time Complexity: O(n)
	 * @return
	 */
	private static int findDiameter_OofN(TreeNode node, TreeHeight hieght) {

		if (node == null) {
			hieght.maxHeight = 0;
			return 0;
		}
		TreeHeight lh = new TreeHeight(), rh = new TreeHeight();
		lh.maxHeight++;
		rh.maxHeight++;
		int lDiem = findDiameter_OofN(node.left, lh);
		int rDiem = findDiameter_OofN(node.right, rh);
		hieght.maxHeight = Math.max(lh.maxHeight, rh.maxHeight) + 1;
		return Math
				.max(lh.maxHeight + rh.maxHeight + 1, Math.max(lDiem, rDiem));
	}

	/**
	 * 
	 * Time Complexity: O(n^2)
	 * 
	 * @param node
	 * @return
	 */
	private static int findDiameter(TreeNode node) {
		if (node == null) {
			return 0;
		}

		int lHeight = height(node.left);
		int rHeight = height(node.right);

		int lDiem = findDiameter(node.left);
		int rDiem = findDiameter(node.right);

		return Math.max(lHeight + rHeight + 1, Math.max(lDiem, rDiem));
	}

	private static int height(TreeNode node) {
		if (node == null) {
			return 0;
		}
		return 1 + Math.max(height(node.left), height(node.right));
	}

}

class TreeHeight {
	int maxHeight = 0;
}
