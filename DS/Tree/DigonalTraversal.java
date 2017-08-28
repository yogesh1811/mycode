package DS.Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

public class DigonalTraversal {

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

		System.out.println("Digonal Traversal=>");
		digonalTravelsal(root);

	}

	private static void digonalTravelsal(TreeNode root) {
		Map<Integer, Integer> digonalMap = new HashMap<Integer, Integer>();

		populateDigonalMap(root, digonalMap, 0);

		Set<Entry<Integer, Integer>> keys = digonalMap.entrySet();

		for (Entry<Integer, Integer> entry : keys) {
			System.out.println(entry.getValue());
		}

	}

	private static void populateDigonalMap(TreeNode node,
			Map<Integer, Integer> digonalMap, int d) {
		if (node == null) {
			return;
		}

		Integer k = digonalMap.get(d) == null ? 0 : digonalMap.get(d);

		digonalMap.put(d, k + node.data);
		populateDigonalMap(node.left, digonalMap, d + 1);
		populateDigonalMap(node.right, digonalMap, d);

	}

}
