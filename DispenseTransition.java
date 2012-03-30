
public class DispenseTransition implements Transition{
	StateController stateControll;
	
	public DispenseTransition(StateController stateControll){
		this.stateControll = stateControll;
	}
	
	public void HasQuarterState(){
		
	}
	
	public void NoQuarterState(){
		
	}
	
	public void SoldState(){
		if (stateControll.gumballMachine.getCount() > 0) {
			stateControll.setState(stateControll.getNoQuarterState());
		} else {
			System.out.println("Oops, out of gumballs!");
			stateControll.setState(stateControll.getSoldOutState());
		}
	}
	
	public void SoldOutState(){
		
	}
}
