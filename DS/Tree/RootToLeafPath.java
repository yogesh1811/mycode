package DS.Tree;

import java.util.Vector;

public class RootToLeafPath {

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

		printRootToLeafPaths(a, new Vector<Integer>());
	}

	private static void printRootToLeafPaths(TreeNode node, Vector<Integer> path) {
		path.add(node.data);
		if (node.left == null && node.right == null) {
			System.out.println(path);
			return;
		} else {
			printRootToLeafPaths(node.left, path);
			printRootToLeafPaths(node.right, path);
		}

	}

}
