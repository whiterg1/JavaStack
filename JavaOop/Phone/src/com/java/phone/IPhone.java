package com.java.phone;

public class IPhone extends Phone implements Ringable{
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	String ring = getClass().getSimpleName() +" "+ getVersion() +" "+ "says" +" "+ getRingTone();
    	return ring;
    }
    @Override
    public String unlock() {
        String unlock = "Unlocking via facial recognition";
        return unlock;
    }
    @Override
    public void displayInfo() {
    	System.out.printf("%s %s from %s\n",getClass().getSimpleName(),getVersion(),getCarrier());            
    }
}
