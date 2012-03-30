//package headfirst.state.gumballstate;

public class SoldState implements State {
 
	StateController stateControll;
    TransitionController myTransition;
 
    public SoldState(StateController stateControll,GumballMachine gumballMachine) {
        this.stateControll = stateControll;
        myTransition = new TransitionController(this.stateControll);
    }
       
	public void insertQuarter(int check) {
		System.out.println("Please wait, we're already giving you a gumball");
		myTransition.insertQuarterTransition.SoldState();
	}
 
	public void ejectQuarter() {
		System.out.println("Sorry, you already turned the crank");
		myTransition.ejectQuarterTransition.SoldState();
	}
 
	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another gumball!");
		myTransition.turnCrankTransition.SoldState();
	}
 
	public void dispense() {
		myTransition.dispenseTransition.SoldState();
		
		stateControll.gumballMachine.releaseBall();
		
	}
 
	public String toString() {
		return "dispensing a gumball";
	}
}


