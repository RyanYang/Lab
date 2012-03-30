import java.util.ArrayList;


public class GumballMachine {
	StateController stateControll;
	State state;
	int count = 0;
	int check = 1;
	
	public GumballMachine(int numberGumballs){
		stateControll= new StateController(this);
		state = stateControll.initState();
		this.count = numberGumballs;
		if (numberGumballs > 0) {
			state = stateControll.startState();
		} 
	}
	
	void setCheck(int check)
	{
		this.check = check;
	}
	
	public int getCheck(){
		return this.check;
	}
	void setState(State state) {
		this.state = state;
	}
	
	public State getState() {
        return state;
    }
	
	public void insertQuarter(int check) {
		this.setCheck(check);
		state.insertQuarter(check);
	}
 
	public void ejectQuarter() {
		state.ejectQuarter();
	}
 
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;
	}
 
	void refill(int count) {
		this.count = count;
		state = stateControll.initState();
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
	
}
