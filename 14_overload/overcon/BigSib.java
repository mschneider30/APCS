public class BigSib {
	String HelloMsg;
	public  void richard.BigSib(){
		HelloMsg = "Word up";
	}
	public  void grizz.BigSib(){
		HelloMsg = "Hey ya";
	}
	public  void dotCom.BigSib(){
		HelloMsg = "Sup";
	}
	public void tracy.BigSib(){
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
