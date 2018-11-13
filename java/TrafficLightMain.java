package hw_8_10;
public class TrafficLightMain {

	public static void main(String[] args)
	{
    System.out.println("Light\tDuration(s)");
        
        for(TrafficLightEnumeration light : TrafficLightEnumeration.values())
            System.out.printf("%s\t%d\n", light, light.getDuration());

	}
	

}
