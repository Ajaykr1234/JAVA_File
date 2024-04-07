package parametre_OF_Function_for_Gen_Spec_lization;

abstract class Vegitable {
	abstract void cook();
}

class PannerVeg extends Vegitable {
	@Override
	void cook() {
		System.out.println("Panner is cooked be paisance ready to move ");
		System.out.println("=======Done==============");
	}
}

class AalluVeg extends Vegitable {

	@Override
	void cook() {
		System.out.println("Aallu vegitable is ready to serve");
		System.out.println("=======Done==============");
	}
}

class bhindi extends Vegitable {
	@Override
	void cook() {
		System.out.println("bhindi (ladisfingers) vegeitable is ready to serve");
		System.out.println("=======Done==============");
	}
}

class vegSimulator {

	void cookveg(Vegitable veg) {
		veg.cook();
	}
}

public class P6_genConcept {

	public static void main(String[] args) {

		PannerVeg pveg = new PannerVeg();
		AalluVeg aveg = new AalluVeg();
		bhindi bveg = new bhindi();
		vegSimulator vegsim = new vegSimulator();

		vegsim.cookveg(pveg);
		vegsim.cookveg(aveg);
		vegsim.cookveg(bveg);

	}

}
