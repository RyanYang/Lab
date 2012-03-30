import java.util.ArrayList;


public class TransitionController{
	StateController stateControll;
	Transition insertQuarterTransition;
	Transition ejectQuarterTransition;
	Transition turnCrankTransition;
	Transition dispenseTransition;
	
	public TransitionController(StateController stateControll){
		this.stateControll = stateControll;
		insertQuarterTransition = new InsertQuarterTransistion(this.stateControll);
		ejectQuarterTransition = new EjectQuarterTransition(this.stateControll);
		turnCrankTransition = new TurnCrankTransition(this.stateControll);
		dispenseTransition = new DispenseTransition(this.stateControll);
	}
}