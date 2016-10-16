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


}