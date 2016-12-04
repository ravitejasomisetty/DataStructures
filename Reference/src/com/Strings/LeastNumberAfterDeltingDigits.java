package com.Strings;

public class LeastNumberAfterDeltingDigits {
	LeastNumberAfterDeltingDigits(){
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeastNumberAfterDeltingDigits a = new LeastNumberAfterDeltingDigits();
		String t = a.getLeastNumberDeletingDigits_2("72388",2);
		System.out.println(t);
	}
	
	    public static int nextStart;


	public String getLeastNumberDeletingDigits_2(String number, int k) {
	    String leastNumber = number;
	    int start = 0;
	    while(k > 0 && leastNumber.length() > 0) {
	        getNextDecreasing(leastNumber, start);
	        int firstDecreasing = 0;
			if(firstDecreasing >= 0) {
	            leastNumber = removeDigit(leastNumber, firstDecreasing);
	        }
	        else {
	            leastNumber = removeDigit(leastNumber, leastNumber.length() - 1);
	        }

	        start = nextStart;
	        --k;
	    }

	    return leastNumber;
	}

	private  void getNextDecreasing(String number, int start) {

	    int firstDecreasing = 0;
		for(int i = start; i < number.length() - 1; ++i) {
	        int curDigit = number.charAt(i) - '0';
	        int nextDigit = number.charAt(i + 1) - '0';
	        if(curDigit > nextDigit) {
	            firstDecreasing = i;
	            break;
	        }
	    }

	    if(firstDecreasing == 0) {
	        nextStart = 0;
	    }
	    else if (firstDecreasing > 0) {
	        nextStart = firstDecreasing - 1;
	    }
	    else {
	        nextStart = number.length();
	    }
	}
	private static String removeDigit(String number, int digitIndex) {
	    String result = "";
	    if(digitIndex > 0) {
	        result = number.substring(0, digitIndex);
	    }
	    if(digitIndex < number.length() - 1) {
	        result += number.substring(digitIndex + 1);
	    }

	    return result;
	}

}
