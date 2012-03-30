//package headfirst.state.gumballstate;

import java.util.Random;

public class HasQuarterState implements State {
	StateController stateControll;
	TransitionController myTransition;
 
	public HasQuarterState(StateController stateControll) {
		this.stateControll = stateControll;
		myTransition = new TransitionController(this.stateControll);
	}
  
	public void insertQuarter(int check) {
		stateControll.gumballMachine.check= check;
		System.out.println("You can't insert another quarter");
		myTransition.insertQuarterTransition.HasQuarterState();
	}
 
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		myTransition.ejectQuarterTransition.HasQuarterState();
	}
 
	public void turnCrank() {		
		System.out.println("You turned...");
		myTransition.turnCrankTransition.HasQuarterState();
		
	}

    public void dispense() {
        System.out.println("No gumball dispensed");
        myTransition.dispenseTransition.HasQuarterState();
    }
 
	public String toString() {
		return "waiting for turn of crank";
	}
}
