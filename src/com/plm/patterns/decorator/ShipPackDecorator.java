package com.plm.patterns.decorator;

public class ShipPackDecorator extends PackDecorator {
	
	public ShipPackDecorator(IPart somePart){
		
		super(somePart);
	}
	
	public void packMe(){
		
		//do the foundation work
		somePart.packMe();
		
		//put additional logic for Ship Transport
		System.out.println("Pack for humid conditions!");

		//
		
		//
		
		//
		
	}

}
