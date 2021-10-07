public class BigSib {
	String HelloMsg;
	public  void richard(){
		HelloMsg = "Word up";
	}
	public  void grizz(){
		HelloMsg = "Hey ya";
	}
	public  void dotCom(){
		HelloMsg = "Sup";
	}
	public void tracy(){
		HelloMsg = "Salutations";
	}
	public void BigSib(){
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
