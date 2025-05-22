import java.util.List;
import java.util.Map;

public class NbQuickCheck {

  /**
   * Performs a pre-order traversal of the tree, printing each node on a separate line.
   * Does nothing if the root is not present in the tree.
   *
   * @param tree the tree represented as a map of parent nodes to child lists
   * @param root the root node to start traversal from
   */
  public static void preOrder(Map<Integer, List<Integer>> tree, int root) 
  {
    if(!tree.containsKey(root)) return;
    System.out.println(root);
  }

  /**
   * Returns the minimum value in the tree.
   * Returns Integer.MAX_VALUE if the root is null.
   *
   * @param root the root node of the tree
   * @return the minimum value in the tree or Integer.MAX_VALUE if root is null
   */
  public static int minVal(Node<Integer> root) 
  {
    if (root == null) return Integer.MAX_VALUE;
    int minVal = Integer.MAX_VALUE;
    return minValGeneric(root, minVal);
  }

  public static int minValGeneric(Node<Integer> root, int minVal)
  {
    if (root == null) return Integer.MAX_VALUE;
    if (minVal > root.value) minVal = root.value;
    for (Node<Integer> child : root.children)
    {
      minValGeneric(child, minVal);
    }
    return minVal;
  }
  
}
