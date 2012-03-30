//package headfirst.state.gumballstate;

public class NoQuarterState implements State {
	StateController stateControll;
	TransitionController myTransition;
    public NoQuarterState(StateController stateControll) {
        this.stateControll = stateControll;
        myTransition = new TransitionController(this.stateControll);
    }
 
	public void insertQuarter(int check) {
		System.out.println("You inserted a quarter");
		myTransition.insertQuarterTransition.NoQuarterState();
		//stateControll.setState(stateControll.getHasQuarterState());
	}
 
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
		myTransition.ejectQuarterTransition.NoQuarterState();
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there's no quarter");
		myTransition.turnCrankTransition.NoQuarterState();
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
		myTransition.dispenseTransition.NoQuarterState();
	} 
 
	public String toString() {
		return "waiting for quarter";
	}
}
