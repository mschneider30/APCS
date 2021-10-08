public class BigSib {
	String HelloMsg;
	public BigSib(){
		HelloMsg = "No way its you!";
	}
	String greet(String ss) {
		ss=(HelloMsg+' '+ss);
		return ss;
	}
}
