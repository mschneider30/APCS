public class BigSib {
	String HelloMsg;
	public  BigSib Richard(){
		HelloMsg = "Word up";
	}
	public  BigSib Grizz(){
		HelloMsg = "Hey ya";
	}
	public  BigSib dotCom(){
		HelloMsg = "Sup";
	}
	public BigSib Tracy(){
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
