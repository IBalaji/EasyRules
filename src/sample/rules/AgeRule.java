package sample.rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

@Rule (name = "ageRule" )
public class AgeRule {
    
	private int age;
	
	public AgeRule(int age){
		this.age = age;
	}
	
	@Condition
    public boolean when() {
        System.out.println(" ==> Inside Age Condition <== ");
		return this.age > 40;
    }
    
	@Action
    public void then() {
        System.out.println("Unacceptable Age");
    }
}
