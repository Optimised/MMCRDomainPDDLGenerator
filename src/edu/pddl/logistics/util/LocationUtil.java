package edu.pddl.logistics.util;

import edu.pddl.logistics.model.Location;

public class LocationUtil {

	private LocationUtil() {
		
	}
	
	public static Location getLocationByName(String name, Iterable<Location> locations) {
		for (Location location : locations) {
			if (location.getName().equals(name)) {
				return location;
			}
		}
		return null;
	}
}
