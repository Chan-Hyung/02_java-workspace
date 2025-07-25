package com.kh.chap02_ingerit.model.vo;

public class Airplane extends Vehicle {
	private int tire;
	private int wing;
	
	public Airplane() {
		
	}
	
	public Airplane(String name, double mileage, String kind, int tire, int wing) {
		super(name, mileage, kind);
		this.tire = tire;
		this.wing = wing;
	}
	
	public int getTire() {
		return tire;
	}
	
	public void setTire(int tire) {
		this.tire = tire;
	}
	
	public int getWing() {
		return wing;
	}
	
	public void setWing(int wing) {
		this.wing =wing;
	}
	
	public String information() {
		return super.information() + " tire : " + tire + " wing : " + wing;
	}

	@Override
	public void howToMove() {
		System.out.println("바퀴를 굴리다가 날개를 휘저으며 날라간다.");
	}
	
	@Override
	public String toString() {
		return super.information() + " tire : " + tire + " wing : " + wing;
	}
	
	
	
}
