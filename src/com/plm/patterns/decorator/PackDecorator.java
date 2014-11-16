package com.plm.patterns.decorator;

public abstract class PackDecorator implements IPart {
	
	protected IPart somePart;

	
	public PackDecorator(IPart somePart){
		this.somePart = somePart;
	}
	
	
	@Override
	public void packMe() {
		somePart.packMe();

	}

	public IPart getSomePart() {
		return somePart;
	}

	public void setSomePart(IPart somePart) {
		this.somePart = somePart;
	}

}
