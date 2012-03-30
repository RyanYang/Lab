import java.util.ArrayList;

public class StateController {
	
	GumballMachine gumballMachine;
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	
	State state;
	
	public StateController(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this,this.gumballMachine);
	}
	
	public State initState(){
		return soldOutState;
	}
	
	public State startState(){
		return noQuarterState;
	}

	void setState(State state) {
		this.state = state;
		gumballMachine.setState(this.state);
	}
	
	public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }
}
