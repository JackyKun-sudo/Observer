//package csce247.assignments.observer;



public class Dad implements Observer {

	Subject baby;

	public Dad(Subject baby) {

		this.baby = baby;

		baby.registerObserver(this);
	}

	public void update(Baby.Cry cry) {
		if(cry == Baby.Cry.HUNGRY) {
			System.out.println("Dad feeds baby");
		}
		else if (cry == Baby.Cry.ANGRY) {
			 System.out.println("Dad puts in earplugs");
		}
		else {
			System.out.println("Dad calls mom");
		}
	}
}