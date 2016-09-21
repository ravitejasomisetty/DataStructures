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
                MaxCrossingString(charArray, l, m, r));
    }

    // A utility funtion to find maximum of two integers
    static int max(int a, int b) { return (a > b)? a : b; }

    // A utility funtion to find maximum of three integers
     static int max(int a, int b, int c) { return max(max(a, b), c); }

    private static int MaxCrossingString(char[] charArray, int l, int m, int r) {

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
}