//package headfirst.state.gumballstate;

public class SoldOutState implements State {
	StateController stateControll;
	TransitionController myTransition;
	
    public SoldOutState(StateController stateControll) {
        this.stateControll = stateControll;
        myTransition = new TransitionController(this.stateControll);
    }
 
	public void insertQuarter(int check) {
		System.out.println("You can't insert a quarter, the machine is sold out");
		myTransition.insertQuarterTransition.SoldOutState();
	}
 
	public void ejectQuarter() {
		System.out.println("You can't eject, you haven't inserted a quarter yet");
		myTransition.ejectQuarterTransition.SoldOutState();
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there are no gumballs");
		myTransition.turnCrankTransition.SoldOutState();
	}
 
	public void dispense() {
		System.out.println("No gumball dispensed");
		myTransition.dispenseTransition.SoldOutState();
	}
 
	public String toString() {
		return "sold out";
	}
}
