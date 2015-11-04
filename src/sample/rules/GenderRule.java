package sample.rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Priority;
import org.easyrules.annotation.Rule;

@Rule
public class GenderRule {

	
	private boolean isMale;
	
	public GenderRule(boolean isMale){
		this.isMale = isMale;	
	}
	
	
	@Condition
	public boolean checkIsMale(){
		System.out.println(" ==> Inside Gender Condition <== ");
		return this.isMale;
	}
	
	@Action
	public void print(){
		System.out.println(" Gender --> "+ this.isMale);
	}
	
	 @Priority
	 public int getPriority() {
	        return 1;
	 }
	
}
