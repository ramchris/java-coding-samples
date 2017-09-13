package com.ram.java8.examples.codility;

public class BinaryTree {

        public int solution(Tree T) {
            // tree t is empty
            if (T == null)
                return -1;
                // get the maximum of the height of the left tree and the right tree,
                // and return the value plus 1 because of counting the current node.
            else
                return Math.max(solution(T.l) + 1, solution(T.r) + 1);
        }
}

class Tree {
    public int x;
    public Tree l;
    public Tree r;

    public Tree(int x) {
        this.x = x;
        l = r= null;
    }
}
