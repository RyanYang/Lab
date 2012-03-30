
public class InsertQuarterTransistion implements Transition {

	StateController stateControll;
	
	public InsertQuarterTransistion(StateController stateControll){
		this.stateControll = stateControll;
	}
	
	public void HasQuarterState(){
		
	}
	
	public void NoQuarterState(){
		stateControll.setState(stateControll.getHasQuarterState());
	}
	
	public void SoldState(){
		
	}
	
	public void SoldOutState(){
		
	}
	
}
