//package csce247.assignments.observer;

import java.util.ArrayList;

public class Baby implements Subject {

	public enum Cry {
		ANGRY,HUNGRY,WET
	}
	protected Cry cry;
	protected ArrayList<Observer> observers;

	public Baby() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}


	@Override
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(cry);
		}
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}	
	
	public void wetCry() {
		System.out.println("This baby is wet");
		this.cry = Cry.WET;
		notifyObservers();
	}
	
	public void hungryCry() {
		System.out.println("This baby is hungry");
		this.cry = Cry.HUNGRY;
		notifyObservers();
	}
	
	public void angryCry() {
		System.out.println("This baby is angry!");
		this.cry = Cry.ANGRY;
		notifyObservers();
	}
}