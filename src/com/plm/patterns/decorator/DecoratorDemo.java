package com.plm.patterns.decorator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecoratorDemo {
	
	public static void main(String[] args){
		
		IPart part1 = new GeneralPart("x1-10001");
		
		//send part1 by road
		PackDecorator packedPart = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Options");
        System.out.println("Express Delivery    - 1");
        System.out.println("Normal Delivery     - 2");
        System.out.println("Economical Delivery - 3");
        try{

				int option = Integer.parseInt(br.readLine());
				switch (option){
					case 1:
					packedPart = new AirFreightPackDecorator(part1);
					break;
					
					case 2:
					packedPart = new RoadLinePackDecorator(part1);
					break;
					
					case 3:
					packedPart = new ShipPackDecorator(part1);
					break;
					
					default:
					System.out.println("Wrong Option!");
					return;
				}
				packedPart.packMe();
        }
        catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        catch(NumberFormatException nfe){
            System.err.println("Invalid Format!");
        }
	
		
	}

}
