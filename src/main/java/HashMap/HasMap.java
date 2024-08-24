package HashMap;// Java program to illustrate HashMap class
// of java.util package

// Importing HashMap class
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

// Main class
public class HasMap {

	// Main driver method
	public static void main(String[] args)
	{
		HashMap <String,Integer> map = new HashMap();
		
		map.put("Sanjeev", 29);
		map.put("Nitish", 30); //Add values in Map
		map.put("Nishant", 30);
		System.out.println("Size of Map is "+ map.size());
		
		int a =map.get("Sanjeev");    // Get Key values from Map
		int b =map.get("Nitish");
//		if (map.containsKey("vishal")) // Map Contains

		System.out.println("Value of Sanjeev is" +  a);
		System.out.println("Value of Nitish is" + b);  // Print Values of Map
		
		map.remove("Nitish"); // remove Values of Map
		System.out.println("Mapping of Map is" + map); //Print HashMap.HasMap
		
		map.put("Nishant", 4);
		System.out.println("Mapping of Map is" + map); //Update HashMap.HasMap
		
		// Iterate the map using
        // for-each loop
		
		for(Entry <String, Integer> e : map.entrySet())
			
		{
			System.out.println("Map Key is: " + e.getKey() + " " + "Map Value is " + e.getValue());
			
		}
		}
	}

