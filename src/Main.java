import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        String string = "bcdealmnop";
        char[] charArray=string.toCharArray();

        int maxString = MaxSubStringLength(charArray,0,charArray.length-1);

        System.out.println(maxString);
    }

    private static int MaxSubStringLength(char[] charArray, int l, int r) {

        if(l==r){
            return 1;
        }

        int m = (l+r)/2;

        return max(MaxSubStringLength(charArray, l, m),
                MaxSubStringLength(charArray, m+1, r),
                MaxCrossingStringLength(charArray, l, m, r));
    }

    // A utility funtion to find maximum of two integers
    static int max(int a, int b) { return (a > b)? a : b; }

    // A utility funtion to find maximum of three integers
    static int max(int a, int b, int c) { return max(max(a, b), c); }

    private static int MaxCrossingStringLength(char[] charArray, int l, int m, int r) {

        int length = 1;
        int maxSubLength = Integer.MIN_VALUE;

        for (int i = l;i<r;i++)
        {
            if(charArray[i]<charArray[i+1])
            {
                length++;
                if (length > maxSubLength)
                    maxSubLength = length;
            }
            else
                return 0;
        }
        return maxSubLength;
    }



    /*PERMUTATIONS OF A STRING*/

    static void permutations(String s, int l, int r){
        if(r==l)
            System.out.println(s);
        for(int i=l;i<=r;i++){
            s=swap(s,l,i);
            permutations(s,l+1,r);
            //s=swap(s,l,i);
        }
    }

    static String swap(String s, int i, int j){
        char[] sArray = s.toCharArray();
        char temp = sArray[i];
        sArray[i]=sArray[j];
        sArray[j]=temp;
        return new String(sArray);
    }




    /*PRINT THE LONGEST COMMON SUBSEQUENCE*/

    static void LCS (int[] X, int[] Y){
        int[][] L = new int[X.length+1][Y.length+1];
        /*BUILD THE 2D MATRIX DYNAMIC PROGRAMMING FOR LONGEST COMMON SUBSEQUENCE*/
        for(int i=0;i<=X.length;i++){
            for(int j=0;j<=Y.length;j++)
            {
                if(i==0 || j == 0)
                    L[i][j]=0;
                else if(X[i-1] == Y[j-1])
                    L[i][j] = 1 + L[i-1][j-1];
                else
                    L[i][j]= Math.max(L[i-1][j], L[i][j-1]);
            }
        }

        /*PRINT LONGEST COMMON SUBSEQUENCE*/
        int[] lcsArray = new int[L[X.length][Y.length]];
        int index = L[X.length][Y.length];
        int i=X.length, j=Y.length;
        while(i >0 && j>0){
            if(X[i-1] == Y[j-1])
            {
                lcsArray[index-1] = X[i-1];
                i--;
                j--;
                index--;
            }

            else if (L[i-1][j] > L[i][j-1])
                i--;

            else
                j--;
        }

        for(int k=0;k<lcsArray.length;k++){
            System.out.print(lcsArray[k]+" ");
        }
    }


    static void printArray(String[] array){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

    }

    /*SUBSEQUENCES OF A STRING*/
    static String[]  stringSubSequences(String s){
        int size=(int) Math.pow(2,s.length());
        String[] subSequences = new String[size-1];
        int k=0;
        for (int counter = 0; counter < size; counter++)
        {
            String binary=String.format("%"+s.length()+"s", Integer.toBinaryString(counter)).replace(' ', '0');
            StringBuilder sb=new StringBuilder();
            for (int j = 0; j < s.length(); j++)
            {
                if (binary.charAt(j)=='1')
                    sb.append(s.charAt(j));
            }
            if(!sb.toString().isEmpty())
                subSequences[k++]=sb.toString();
        }

        Arrays.sort(subSequences);

        return subSequences;
    }

    /**
     * LOWEST COMMON ANCESTOR
     * To be fixed*/
    static BinaryTreeNode LCA(BinaryTreeNode root, BinaryTreeNode n1, BinaryTreeNode n2){
        Stack<BinaryTreeNode> path1 = new Stack();
        Stack<BinaryTreeNode> path2 = new Stack();

        if(!findPath(root,n1,path1) || !(findPath(root, n2, path2)))
        {
            return null;}
        int i=0;
        for(;i<path1.size() && i<path2.size();i++)
            if(path1.elementAt(i).value!=path2.elementAt(i).value)
                break;
        return path1.elementAt(i-1);
    }

    static boolean findPath(BinaryTreeNode root, BinaryTreeNode node, Stack<BinaryTreeNode> path){
        path.push(root);

        if(root==null)
            return false;

        if(root.value == node.value)
            return true;

        if((findPath(node.left, node,path)) ||
                (findPath(node.right, node, path)))
            return true;

        path.pop();

        return false;
    }

    /*TWITTER CODING CHALLENGE
    * Input Format: <expression tree> / <sequence of operations>
    * Expected Input:
    * (AB)C/
    * (AB)C/S
    * (AB)C/RS
    * A(BC)/RS
    * A(BC)/RSR
    * Expected Output:
    * (AB)C
    * ABC
    * CBA
    * CBA
    * ABC*/
    static String expressionTreeOperations(String expressionTree, String operations){
        operations=preProcessOperations(operations);
        expressionTree=preProcessExpressionTree(expressionTree);

        char[] operationsArray = operations.toCharArray();
        for(int i=0;i<operationsArray.length;i++){
            switch (operationsArray[i]){
                case 'R':
                    expressionTree=ReverseExpression(expressionTree);
                    break;
                case 'S':
                    expressionTree=SimplifyExpression(expressionTree);
                    break;
            }
        }
        return expressionTree;
    }

    static String preProcessExpressionTree(String expressionTree){
        char[] expressionTreeArray = expressionTree.toCharArray();
        char[] expressionTreeArrayCopy = new char[expressionTreeArray.length];
        int j=0;
        for(int i=0;i<expressionTreeArray.length;i++){
            if(expressionTreeArray[i]==' ')
                continue;
            expressionTreeArrayCopy[j++]=expressionTreeArray[i];
        }
        return new String(expressionTreeArrayCopy).trim();
    }

    static String preProcessOperations(String operations){
        char[] operationsArray = operations.toCharArray();
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i<operationsArray.length){
            if(i<operationsArray.length-1 && operationsArray[i]=='R' && operationsArray[i+1] == 'R'){
                i=i+2;
                continue;
            }
            if(i<operationsArray.length-1 && operationsArray[i] == 'S' && operationsArray[i+1]=='S'){
                i=i+1;
                continue;
            }
            sb.append(operationsArray[i++]);
        }
        return sb.toString();
    }

    static String ReverseExpression(String expression){
        if(expression.length()<=1){
            return Character.toString(replaceParenthesis(expression.charAt(0)));
        }
        char appendingChar= replaceParenthesis(expression.charAt(0));
        return String.format("%s%s", ReverseExpression(expression.substring(1)),appendingChar);
    }

    static char replaceParenthesis(char appendingChar){
        if( appendingChar =='(')
            appendingChar=')';
        else if (appendingChar== ')')
            appendingChar='(';
        return appendingChar;
    }

    static String SimplifyExpression(String expression){
        char[] expressionArray = expression.toCharArray();
        char[] expressionArrayCopy = new char[expressionArray.length];
        boolean openParenthesisFound=false;
        int j=0;
        for(int i=0;i<expressionArray.length;i++){
            if(i==0 && expressionArray[i]=='(' && !openParenthesisFound)
            {
                openParenthesisFound=true;
                continue;
            }

            if(expressionArray[i]==')' && openParenthesisFound)
            {
                openParenthesisFound=false;
                continue;
            }

            expressionArrayCopy[j++]=expressionArray[i];

        }
        return new String(expressionArrayCopy).trim();
    }

/*END TWITTER CODING CHALLENGE*/

    /**
     * Depth of a binary tree*/
    static int depth(BinaryTreeNode root){
        if(root == null) return 0;
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }

    /**
     * Print In Order Traversal of Binary Tree*/
    static void printInOrder (BinaryTreeNode root){
        if(root == null)
            return;

        printInOrder(root.left);
        System.out.print(root.value+" ");
        printInOrder(root.right);
    }

    /**
     * Validate BST*/
    static boolean validBST(int prev, BinaryTreeNode root){
        if(root == null)
            return true;

        return validBST(prev,root.left) && (prev<=root.value) && validBST(root.value,root.right);
    }

    /**
     * Copy a Binary Tree*/
    static BinaryTreeNode copyBinaryTree(BinaryTreeNode root){
        if(root == null)
            return null;
        BinaryTreeNode node = new BinaryTreeNode(root.value);
        node.left=copyBinaryTree(root.left);
        node.right = copyBinaryTree(root.right);
        return node;
    }

    /**
     * BFS or Level Order on a Binary Tree*/
    static void bfsLevelOrder(BinaryTreeNode root){
        Queue<BinaryTreeNode> nodes = new LinkedList();
        nodes.add(root);
        while(!nodes.isEmpty()){
            BinaryTreeNode node = nodes.poll();
            if(node == null)
                continue;
            System.out.print(node.value+" ");
            nodes.add(node.left);
            nodes.add(node.right);
        }
    }

    /**
     * Prints nodes at the given level of given binary tree using Queue
     * @param root root node of the binary tree
     * @param level level of the nodes
     * Similarly we can print nodes between given 2 levels
     */
    static void nodesAtLevel(BinaryTreeNode root, int level){
        java.util.Queue<BinaryTreeNode> nodes = new LinkedList();
        nodes.add(root);
        int currentLevel=0;
        int levelNodes;
        while(!nodes.isEmpty()){
            levelNodes = nodes.size();
            while(levelNodes>0){
                BinaryTreeNode node = nodes.poll();
                if(currentLevel==level)
                    System.out.print(node.value+" ");
                if(node.left!=null) nodes.add(node.left);
                if(node.right!=null) nodes.add(node.right);
                levelNodes--;
            }
            if(currentLevel==level)
                System.out.println();
            currentLevel++;
        }
    }

    /**
     * DFS on a Binary Tree*/
    static void dfs(BinaryTreeNode root){
        Stack<BinaryTreeNode> nodes = new Stack();
        nodes.add(root);
        while(!nodes.isEmpty()){
            BinaryTreeNode node = nodes.pop();
            if(node == null)
                continue;
            System.out.print(node.value+" ");
            nodes.add(node.left);
            nodes.add(node.right);
        }
    }

    /**
     * DFS using recursion*/
    static void dfsRecursive(BinaryTreeNode root){
        if(root == null)
            return;
        dfsRecursive(root.left);
        dfsRecursive(root.right);
        System.out.print(root.value+" ");
    }

    /**
     * Mirror of a Binary Tree*/
    static void mirrorMe(BinaryTreeNode root){
        if(root == null)
            return;

        BinaryTreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        mirrorMe(root.left);
        mirrorMe(root.right);
    }

    /**
     * Mirror of a BT iteratively*/
    static void mirrorMeIterative(BinaryTreeNode root){
        Queue<BinaryTreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while(!nodes.isEmpty()){
            BinaryTreeNode node = nodes.poll();
            if(node == null){
                continue;
            }
            //Swapping
            BinaryTreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;

            nodes.add(node.left);
            nodes.add(node.right);
        }
    }

    /**
     * Reverse a single linked list*/
    static SLLNode reverseLinkedList(SLLNode head){
        SLLNode prev=null, current, next;
        current=head;
        while(current!=null){
            next=current.next;
            current.next = prev;
            prev=current;
            current=next;
        }
        return prev;
    }

    /**
     * Reverse linked list using recursion*/
    static SLLNode reverseLLRecursion(SLLNode head){
        if(head == null || head.next == null)
            return head;

        SLLNode f = head;
        SLLNode r = f.next;
        SLLNode rest = reverseLLRecursion(r);
        f.next.next=f;
        f.next=null;
        return rest;
    }


    rest.next=first;
}

    /**
     * Find and remove loop in linkedlist*/
    static boolean detectLoop(SLLNode root){
        SLLNode slowIterator = root;
        SLLNode fastIterator=root;
        while(slowIterator!=null && fastIterator!=null && fastIterator.next!=null){
            slowIterator=slowIterator.next;
            fastIterator=fastIterator.next.next;
            if(slowIterator==fastIterator)
            {
                removeLoop(slowIterator,fastIterator,root);
                return true;
            }
        }
        return false;
    }

    /**
     * Remove loop in linked list
     * 1. Count K nodes in loop: increment slow iterator until it again meets the fast iterator
     * 2. Initialize a new iterator from root and another from Kth node from root
     * 3. Increment them both at same pace and they meet at loop start node
     * 4. Get to the loop end node and point its next to NULL
     */
    static void removeLoop(SLLNode slowIterator, SLLNode fastIterator, SLLNode root){
        //Count K nodes in loop
        int k=0;
        do{
            slowIterator=slowIterator.next;
            k++;
        }while (slowIterator!=fastIterator);

        //Find the loop start node
        SLLNode iteratorFromRoot = root;
        SLLNode iteratorKthFromRoot=root;
        for(int i=0;i<k;i++)
            iteratorKthFromRoot=iteratorKthFromRoot.next;

        while(iteratorFromRoot!=iteratorKthFromRoot)
        {
            iteratorFromRoot=iteratorFromRoot.next;
            iteratorKthFromRoot=iteratorKthFromRoot.next;
        }

        SLLNode loopStartNode = iteratorFromRoot;
        SLLNode loopEndNode = iteratorKthFromRoot;
        while(loopEndNode.next!=loopStartNode){
            loopEndNode=loopEndNode.next;
        }
        loopEndNode.next=null;
    }

    static int preIndex=0;

    /**
     * Construct BT from InOrder and PreOrder*/
    static BinaryTreeNode constructBT(char[] inArray, char[] preArray, int inStart, int inEnd){
        if(inStart>inEnd)
            return null;
        BinaryTreeNode root = new BinaryTreeNode(preArray[preIndex++]);
        if(inStart==inEnd)
            return root;
        int inIndex = search(inArray,(char)root.value);
        root.left = constructBT(inArray,preArray,inStart,inIndex-1);
        root.right=constructBT(inArray,preArray,inIndex+1,inEnd);
        return root;
    }

    /**
     * Array search*/
    static int search(char[] array, char searchChar){
        for(int i=0;i<array.length;i++){
            if(array[i]==searchChar)
                return i;
        }
        return -1;
    }

    /**
     * Utility method to print the single linked list*/
    static void printLinkedList(SLLNode head){
        while(head!=null){
            System.out.print(head.data+"->");
            head=head.next;
        }
    }

    /**
     * SORTINGS*/

    /**
     * MIN-HEAP:
     * 1. Heapify: Build min heap bottom up for upper half (excluding leaves)
     * 2. MinHeap top down*/
    static void buildMinHeap(int[] a){
        for(int i=(a.length-1)/2;i>=0i--)
            minHeap(a,i,a.length-1);
    }
    static void minHeap(int[] a, int i, int n){
        int left = 2i+1;
        int right = 2i+2;
        if(left<=n && a[i]>a[left])
        {
            swap(a,i,left);
            minHeap(a,left,n);
        }
        if(right<=n && a[i]>a[right])
        {
            swap(a,i,right);
            minHeap(a,right,n);
        }
    }

    static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    /**
     * MERGE SORT*/
    static void mergeSort(int[] b) {
        if (b.length < 2) {
            return;
        }
        int[] left = new int[b.length / 2];
        int[] right = new int[b.length - b.length / 2];
        for (int i = 0; i < b.length/2; i++) {
            left[i] = b[i];
        }
        for (int i =  b.length / 2; i < b.length; i++) {
            right[i-b.length/2] = b[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left, right, b);
    }

    static void merge(int[] left, int[] right, int[] b){
        int i=0,j=0,k=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j])
                b[k++]=left[i++];
            else
                b[k++]=right[j++];
        }

        while(i<left.length)
            b[k++]=left[i++];
        while(j<right.length)
            b[k++]=right[j++];
    }
}


class BinaryTreeNode{
    BinaryTreeNode left, right;
    int value;
    public BinaryTreeNode(int value){
        this.value=value;
    }
}

class SLLNode{
    int data;
    SLLNode next;
    public SLLNode(int data){
        this.data=data;
        this.next=null;
    }
}