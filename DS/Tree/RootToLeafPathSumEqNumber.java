package DS.Tree;

import java.util.Vector;

public class RootToLeafPathSumEqNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeNode a = new TreeNode(15);

		a.left = new TreeNode(12);
		a.left.left = new TreeNode(10);
		a.left.right = new TreeNode(13);

		a.right = new TreeNode(20);
		a.right.left = new TreeNode(18);
		a.right.right = new TreeNode(25);

		printRootToLeafPaths(a, new Vector<Integer>(), 0, 88);
	}

	private static int printRootToLeafPaths(TreeNode node,
			Vector<Integer> path, int sum, int k) {
		path.add(node.data);
		if (node.left == null && node.right == null) {
			sum += node.data;
			if (sum == k) {
				System.out.println(path);
			}
			return sum;
		} else {
			int lsum = printRootToLeafPaths(node.left, path, sum + node.data, k);

			return printRootToLeafPaths(node.right, path, lsum, k);
		}

	}

}
