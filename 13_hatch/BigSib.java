public class BigSib {
	String HelloMsg;
	public BigSib (){
		HelloMsg = "Word up";
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
