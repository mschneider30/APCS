public class BigSib {
	String HelloMsg;
	public  void BigSib.Richard(){
		HelloMsg = "Word up";
	}
	public  void BigSib.Grizz(){
		HelloMsg = "Hey ya";
	}
	public  void BigSib.dotCom(){
		HelloMsg = "Sup";
	}
	public void BigSib.Tracy(){
		HelloMsg = "Salutations";
	}
	public BigSib(){
		HelloMsg = "No way its you!";
	}
	/*
	public BigSib(){
		
		if (BigSib == richard){
			HelloMsg = "Word up";
		}
		else if (BigSib == grizz){
			HelloMsg = "Hey ya";
		}
		else if (BigSib == dotCom){
			HelloMsg = "Sup";
		}
		else if (BigSib == tracy){
			HelloMsg = "Salutations";
		}
		else {
			HelloMsg= "No way, its you!";
		}
	}
	*/
	String greet(String ss) {
		ss=(HelloMsg+' '+ss);
		return ss;
	}
}
