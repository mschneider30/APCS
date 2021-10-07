public class BigSib {
	String HelloMsg;
	public BigSib (String S){
		HelloMsg = S;
	}
	String greet(String ss) {
		ss=(HelloMsg+' '+ss);
		return ss;
	}
}


