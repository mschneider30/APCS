public class BigSib {
	String HelloMsg;
	public richard(){
		HelloMsg = "Word up";
	}
	public grizz(){
		HelloMsg = "Hey ya";
	}
	public doCom(){
		HelloMsg = "Sup";
	}
	public tracy(){
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
