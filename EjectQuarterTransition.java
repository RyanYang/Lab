
public class EjectQuarterTransition implements Transition {

	StateController stateControll;
	
	public EjectQuarterTransition(StateController stateControll){
		this.stateControll = stateControll;
	}
	
	public void HasQuarterState(){
		stateControll.setState(stateControll.getNoQuarterState());
	}
	
	public void NoQuarterState(){
		
	}
	
	public void SoldState(){
		
	}
	
	public void SoldOutState(){
		
	}
}
