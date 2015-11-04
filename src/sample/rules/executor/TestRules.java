package sample.rules.executor;

import org.easyrules.api.RulesEngine;
import org.easyrules.core.RulesEngineBuilder;

import sample.rules.AgeRule;
import sample.rules.GenderRule;

public class TestRules {

	
	public static void main(String[] args) {
		
		RulesEngine re = RulesEngineBuilder.aNewRulesEngine().build();
		
		re.registerRule(new AgeRule(41));
		re.registerRule(new GenderRule(false));
		
		re.fireRules();
		
	}

	
}
