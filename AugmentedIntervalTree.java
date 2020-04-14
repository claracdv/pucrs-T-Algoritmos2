public class AugmentedIntervalTree {
    /*
    private Interval root;

    public static Interval insertNode(Interval tmp, Interval newNode) {
        if (tmp == null) {
            tmp = newNode;
            return tmp;
        }
        
        // Update of the maximum extreme of the subtree
        // during insertion
        if (newNode.getEnd() > tmp.getMax()) {
            tmp.setMax(newNode.getEnd());
        }

        if (tmp.compareTo(newNode) <= 0) {

            if (tmp.getRight() == null) {
                tmp.setRight(newNode);
            }
            else {
                insertNode(tmp.getRight(), newNode);
            }
        }
        else {
            if (tmp.getLeft() == null) {
                tmp.setLeft(newNode);
            }
            else {
                insertNode(tmp.getLeft(), newNode);
            }
        }
        return tmp;
    }

    // In-Order Tree Traversal
    public static void printTree(Interval tmp) {
        if (tmp == null) {
            return;
        }

        if (tmp.getLeft() != null) {
            printTree(tmp.getLeft());
        }

        System.out.print(tmp);

        if (tmp.getRight() != null) {
            printTree(tmp.getRight());
        }
    }
    */
}