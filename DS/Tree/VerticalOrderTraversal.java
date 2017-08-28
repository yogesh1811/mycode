package DS.Tree;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Vector;

public class VerticalOrderTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 15 / \ 12 20 / \ / \ 10 13 18 25
		 */
		TreeNode root = new TreeNode(15);

		root.left = new TreeNode(12);
		root.left.left = new TreeNode(10);
		root.left.right = new TreeNode(13);

		root.right = new TreeNode(20);
		root.right.left = new TreeNode(18);
		root.right.right = new TreeNode(25);

		Map<Integer, Vector<Integer>> verticalMap = new TreeMap<Integer, Vector<Integer>>();

		getVerticalMap(root, verticalMap, 0);

		for (Entry<Integer, Vector<Integer>> entry : verticalMap.entrySet()) {
			System.out.println(entry.getValue());
		}
	}

	private static void getVerticalMap(TreeNode node,
			Map<Integer, Vector<Integer>> verticalMap, int vert) {

		if (node == null)
			return;

		Vector<Integer> k = verticalMap.get(vert);

		if (k == null) {
			k = new Vector<Integer>();
			k.add(node.data);
		} else {
			k.add(node.data);
		}
		verticalMap.put(vert, k);
		getVerticalMap(node.left, verticalMap, vert - 1);
		getVerticalMap(node.right, verticalMap, vert + 1);

	}

}
