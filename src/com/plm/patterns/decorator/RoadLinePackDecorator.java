package com.plm.patterns.decorator;

public class RoadLinePackDecorator extends PackDecorator {
	
	public RoadLinePackDecorator(IPart somePart){
		
		super(somePart);
	}
	
	public void packMe(){
		
		//do the foundation work
		somePart.packMe();
		
		//put additional logic for Road Transport
		 System.out.println("Road specific container!");
		
		//
		
		//
		
		//
		
	}

}
