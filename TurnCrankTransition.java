
public class TurnCrankTransition implements Transition {
	StateController stateControll;
	
	public TurnCrankTransition(StateController stateControll){
		this.stateControll = stateControll;
	}
	
	public void HasQuarterState(){
		if(this.stateControll.gumballMachine.getCheck() == 1)
			stateControll.setState(stateControll.getSoldState());
		else{
			System.out.println("The quarter can not be recognized!");
			stateControll.setState(stateControll.getNoQuarterState());
		}
	}
	
	public void NoQuarterState(){
		
	}
	
	public void SoldState(){
		
	}
	
	public void SoldOutState(){
		
	}
}
