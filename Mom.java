//package csce247.assignments.observer:

public class Mom implements Observer{

	Subject baby;

	public Mom(Subject baby) {

		this.baby = baby;

		baby.registerObserver(this);
	}

	public void update(Baby.Cry cry) {
		if(cry == Baby.Cry.HUNGRY) {
			System.out.println("Mom cuddles and feeds baby" + "\n");
		}
		else if (cry == Baby.Cry.ANGRY) {
			 System.out.println("Mom hugs and rocks baby, maybe spoiling" + "\n");
		}
		else {
			System.out.println("Mom changes baby" + "\n");
		}
	}
}