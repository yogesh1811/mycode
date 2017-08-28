package DS.Tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class LeftMostNRigtMostNode {

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

		getLeftMostNode(a);

	}

	private static void getLeftMostNode(TreeNode node) {
		printLeft_RightMostNodes(node, 0);
	}

	private static void printLeft_RightMostNodes(TreeNode node, int level) {

		Queue<QItem_> queue = new LinkedList<QItem_>();
		QItem_ qItem = new QItem_(node, 0);
		Map<Integer, Integer> m = new TreeMap<Integer, Integer>();

		queue.add(qItem);

		while (!queue.isEmpty()) {

			QItem_ p = queue.remove();

			if (m.containsKey(p.level)) {

			} else {
				System.out.println(p.node.data);
				m.put(p.level, p.node.data);
			}

			if (p.node.left != null) {
				queue.add(new QItem_(p.node.left, p.level - 1));
			}
			if (p.node.right != null) {
				queue.add(new QItem_(p.node.right, p.level + 1));
			}
		}
	}
}

class QItem_ {
	TreeNode node;
	int level;

	QItem_(TreeNode tNode, int level) {
		this.node = tNode;
		this.level = level;
	}
}
