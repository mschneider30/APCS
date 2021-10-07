public class BigSib {
	String HelloMsg;
	public BigSib (String S){
		HelloMsg = S;
}
	public void setHelloMsg(String s){
		if (HelloMsg == "Word up"){
			HelloMsg=s;
		}
	}
	String greet(String ss) {
		ss=(HelloMsg+' '+ss);
		return ss;
	}
}


