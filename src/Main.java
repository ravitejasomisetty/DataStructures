import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder inputString = new StringBuilder();
        String s;
        while ((s = in.readLine()) != null) {
            inputString.append(s);
        }

        char[] stringArray= inputString.toString().toCharArray();
        char[] outputArray = new char[stringArray.length];
        int k=0;
        for(int i=0;i<stringArray.length;i++){
            if(!((int)stringArray[i]>=97 && (int)stringArray[i]<=122 && stringArray[i]!=' '))
                continue;
            outputArray[k++]=stringArray[i];
        }

        System.out.println(new String(outputArray).trim());
    }

    private static String WordReverse(String word){
        char[] wordArray=word.toCharArray();
        char[] reverseWordArray=new char[wordArray.length];
        int k=reverseWordArray.length-1;
        for(int i=wordArray.length-1;i>=0;i--){
            if(i==0)
                reverseWordArray[k--]=(char)((int)wordArray[i]-65);
            else
                reverseWordArray[k--]=wordArray[i];
        }

        return new String(reverseWordArray);
    }


    //Utility method to compare containment of each passage
    private static boolean VerifyContainment(String[] arrayOfPassages, String passage, int index){
       String[] passageWords = passage.split(" ");
        for(int i=0;i<arrayOfPassages.length;i++){
            if(i==index)
                continue;
            String[] compareWithPassage = arrayOfPassages[i].split(" ");

            int j=0, k=0;
            while(j<passageWords.length && k<compareWithPassage.length)
            {
                if(!passageWords[i].equalsIgnoreCase(compareWithPassage[k]))
                    return false;
            }
        }
        return true;
    }
}