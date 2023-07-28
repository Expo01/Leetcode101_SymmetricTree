import javax.swing.tree.TreeNode;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }

    class Solution {
        public boolean isSymmetric(TreeNode root) {
            isMirror(root.left, root.right);
        }

        private boolean isMirror(TreeNode branchOne, TreeNode branchTwo){
            if(branchOne == null && branchTwo == null){
                return true;
            }
            if(branchOne == null || branchTwo == null){
                return false;
            }
//            if(branchOne.val != branchTwo.val){ // right idea but it all has to be one return which is funky
//                return false;
//            }
//            isMirror(branchOne.left, branchTwo.right);???

            return node1.val == node2.val && isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);

        }
    }


// if both L.L and R.RR != null. recursively call isSymmetric until null found for both L and R
// if L.L and RR.R == null then base case
// else return false since unequal heights
    // problem is frorm the first rcursive call, wee arer only searching half the orriginal tree
    // the whole point is divide and conquer, so how to we explore both sides concurrently?
}