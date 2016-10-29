/**
 * Definition of ParentTreeNode:
 * 
 * class ParentTreeNode {
 * public ParentTreeNode parent, left, right;
 * }
 */
public class Solution {
 /**
 * @param root: The root of the tree
 * @param A, B: Two node in the tree
 * @return: The lowest common ancestor of A and B
 */
 public ParentTreeNode lowestCommonAncestorII(ParentTreeNode root,
											  ParentTreeNode A,
											  ParentTreeNode B) {
	// Write your code here
	if (root == null || root == A || root == B){
		return root;
	}

	ArrayList<ParentTreeNode> pathA = getPath(A);
	ArrayList<ParentTreeNode> pathB = getPath(B);

	indexA = pathA.size() - 1;
	indexB = pathB.size() - 1;

	ParentTreeNode lowestAncestor = null;
	while (indexA >= 0 && indexB >= 0){
		if (pathA[indexA] != pathB[indexB]){
			break;
		}
		lowestAncestor = pathA.get[indexA];
		indexA--;
		indexB--;
	}

	return lowestAncestor;
 }

 private ArrayList<ParentTreeNode> getPath(ParentTreeNode node){
 	ArrayList<ParentTreeNode> path = new ArrayList<>();
 	while (node != null){
 		path.add(node);
 		node = node.parent;
 	}

 	return path;
 }
}
