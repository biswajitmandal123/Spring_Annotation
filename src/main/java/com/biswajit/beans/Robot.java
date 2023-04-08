package com.biswajit.beans;

import org.springframework.stereotype.Component;

@Component
public class Robot {

	private Chip chip;

	public Robot() {
		System.out.println("Robot:: Constructor...");

	}
	
	public void doWork() {
		String type=chip.chipType();
		if(type.equals("32-Bit")) {
			System.out.println("Performance is slow....");
			
		}
	}
	
	
}
