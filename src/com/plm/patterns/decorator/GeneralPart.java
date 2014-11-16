package com.plm.patterns.decorator;

public class GeneralPart implements IPart {
	
	private String partId;
	
	public GeneralPart (String partId){
		this.partId = partId;
	}
	
	public void packMe(){
		
		//common logic with respect to packing the part
		System.out.println((new StringBuffer(" Basic packaging done for ").append(partId)).toString());
	}

	public String getPartId() {
		return partId;
	}

	public void setPartId(String partId) {
		this.partId = partId;
	}

}
