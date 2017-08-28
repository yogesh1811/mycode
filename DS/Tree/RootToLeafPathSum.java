package DS.Tree;

import java.util.Vector;

public class RootToLeafPathSum {

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

		printRootToLeafPaths(a, new Vector<Integer>(), 0);
	}

	private static int printRootToLeafPaths(TreeNode node,
			Vector<Integer> path, int sum) {
		path.add(node.data);
		if (node.left == null && node.right == null) {
			System.out.println(path);
			sum+=node.data;
			System.out.println(sum);
			return sum;
		} else {
			int lsum = printRootToLeafPaths(node.left, path, sum + node.data);
			
			return printRootToLeafPaths(node.right, path, lsum);
		}

	}

}
