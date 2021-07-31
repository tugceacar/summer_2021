package day30exceptionsinterfacesiteratorscollections;

public class RunnerDay30 {

	public static void main(String[] args) {
		
		HondaCivic hc1 = new HondaCivic();
		
		hc1.accelerate();
		hc1.climate();
		hc1.gasUsage();
		
		//There is a difference in usage, static methods in a classs and static methods in an interface?
		//To call a static method from an interface use "interface name"
		Music.volume();

	}

}
