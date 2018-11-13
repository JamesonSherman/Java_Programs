package hw_8_10;

public enum TrafficLightEnumeration
{
	
	    RED(100), YELLOW(40), GREEN(80);
	    
	    private int duration;
	    
	    
	    
	    
	    
	    TrafficLightEnumeration(int durationSecs)
	    {
	        duration = durationSecs;
	    }
	    
	    
	    
	    
	    public int getDuration()
	    {
	        return duration;
	    }
}


	


