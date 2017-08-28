package DS.Tree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class TopViewBST {

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

		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(2);
		root1.right = new TreeNode(3);
		root1.left.right = new TreeNode(4);
		root1.left.right.right = new TreeNode(5);
		root1.left.right.right.right = new TreeNode(6);

		topView(root, 0);

	}

	private static void topView(TreeNode root, int level) {
		Map<Integer, Integer> ht = new TreeMap<Integer, Integer>();

		if (root == null)
			return;
		// create a queue for level order traversal
		Queue<QItem> queue = new LinkedList<QItem>();
		// add root with level 0 (create a queue item pack)
		queue.add(new QItem(root, level));

		while (!queue.isEmpty()) {

			QItem p = queue.remove();
			TreeNode node = p.node;
			int lvl = p.level;

			if (ht.containsKey(lvl)) {

			} else {// print it, its the first element at his level
				System.out.print(node.data + "   ");
				ht.put(lvl, node.data);
			}

			// add the left and right children of visiting nodes to the queue
			if (node.left != null) {
				queue.add(new QItem(node.left, lvl - 1));
			}
			if (node.right != null) {
				queue.add(new QItem(node.right, lvl + 1));
			}

		}

	}
}

class QItem {
	TreeNode node;
	int level;

	QItem(TreeNode node, int level) {
		this.node = node;
		this.level = level;
	}

}
