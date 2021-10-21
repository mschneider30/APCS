public class StatsDriver {

	public static void main(String[] args) {
		Stats Tester = new Stats();
		int a;
		a=10;
		int a2;
		a2=40;
		double c;
		c=10.00;
		double c2;
		c2=40.00;
		int meanOutput=Tester.mean(a,a2);
		double doublemeanOutput=Tester.mean(c,c2);
		int maxOutput=Tester.max(a,a2);
		double doublemaxOutput=Tester.max(c,c2);
		int geoMeanOutput=Tester.geoMean(a,a2);
		int geoMeanOutput2=Tester.geoMean(a,a2,11);
		double doublegeoMeanOutput=Tester.geoMean(c,c2);
		System.out.println("Correct Output:25   Actual Output: " + meanOutput);
		System.out.println("Correct Output: 25.0   Actual Output: " + doublemeanOutput);
		System.out.println("Correct Output: 40    Actual Output: " + maxOutput);
		System.out.println("Correct Output: 40.0   Actual Output: " + doublemaxOutput);
		System.out.println("Correct Output: 20    Actual Output: " + geoMeanOutput);
		System.out.println("Correct Output: 17   Actual Output: " + geoMeanOutput2);
		System.out.println("Correct Output: 20.0   Actual Output: " + doublegeoMeanOutput);
	}
} 
