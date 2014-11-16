package com.plm.patterns.decorator;

public class AirFreightPackDecorator extends PackDecorator {
	
	public AirFreightPackDecorator(IPart somePart){
		
		super(somePart);
	}
	
	public void packMe(){
		
		//do the foundation work
		somePart.packMe();
		
		//put additional logic for Air Transport
		System.out.println("Make sure to use special lightweight container!");
		
		//
		
		//
		
		//
		
	}

}
