import java.lang.Object;
public class Loopier {
	public static void populateArray(int[] x) {
		for (int i = 0; i < x.length; i ++) {
			int e =(int)(Math.random()* 100);
			x[i] = e;
		}
	}

	public static String arrayToString(int[] x) {
		String t = "{";
		for (int i = 0; i < x.length;i ++) {
			t += x[i];
			if (i-x.length != -1) {
				t += ", ";
			}
		}
		t+="}";
		return t;
	}

	public static int linSearch(int[] a,int target) {
		for (int i = 0;i < a.length;i++) {
			if (a[i]==target) {
				return i;
			}
		}
		return -1;
	}
	public static int linSearchR(int[] a, int target){
        	if (a.length == 0){
            	return -1;
        	}else{
            		if (a[0] == target){
                	return 0;
            		}else {
                		int[] copy = new int[a.length - 1];
                		for (int i = 1; i < a.length; i++){
                    			copy[i - 1] = a[i];
            			}
                		return 1 + linSearchR(copy, target);
			}
        	}
    	}
	public static int freq(int[] a, int target) {
		int counter = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == target) {
				counter++;
			}
		}
		return counter;
	}
	public static int freqRec(int[] a, int target) {
		if (a.length == 0) {
			return 0;
		}
		int[] newArray = new int[a.length-1];
		for (int i = 0; i < newArray.length;i++) {
			newArray[i]=a[i+1];
		}
		if (a[0] == target) {
			return 1 + freqRec(newArray,target);
		} else {
			return 0+freqRec(newArray,target);
		}
	}
	public static void main(String[] args) {
		int[] r = new int[150];
		populateArray(r);
		System.out.println(arrayToString(r));
		System.out.println(linSearch(r,55));
		System.out.println(linSearchR(r,55));
		System.out.println(freq(r,55));
		System.out.println(freqRec(r,55));
	}


}
