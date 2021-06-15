package com.java.phone;

public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	String ring = getClass().getSimpleName() + " " + getVersion() +" "+ "says" +" "+ getRingTone();
    	return ring;
    }
    @Override
    public String unlock() {
        String unlock = "Unlocking via finger print";
        return unlock;
    }
    @Override
    public void displayInfo() {
    	System.out.printf("%s %s from %s\n",getClass().getSimpleName(),getVersion(),getCarrier());        
    }
}
