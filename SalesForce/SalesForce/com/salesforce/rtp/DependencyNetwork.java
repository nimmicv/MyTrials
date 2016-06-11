package com.salesforce.rtp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class DependencyNetwork {

	/**
	 * @Nimmi on 05.12.2016 Program to install and remove components based on
	 *        dependencies
	 */

	/*
	 * DEPEND TELNET TCPIP NETCARD TELNET -> TCPIP,NETCARD // TELNET
	 * dependsOn(needs) TCPIP and NETCARD
	 */
	HashMap<String, HashSet<String>> dependsOnHashMap = new HashMap<String, HashSet<String>>();

	/*
	 * DEPEND TELNET TCPIP NETCARD TCPIP ->TELNET NETCARD -> TELNET // TCPIP is
	 * needed by TELNET, NETCARD is needed by TELNET eg : we cannot remove
	 * netcard as it is needed by TELNET
	 * 
	 * Create self dependency for explicit install INSTALL NETCARD [NETCARD ->
	 * NETCARD]
	 */
	HashMap<String, HashSet<String>> dependantHashMap = new HashMap<String, HashSet<String>>();

	/*
	 * Set of all currently installed systems
	 */
	HashSet<String> curr_installs = new HashSet<String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DependencyNetwork dpn = new DependencyNetwork();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));

			String input = null;
			String[] values = null;
			int flag = 0;
			while ((input = br.readLine()) != null && flag == 0) {
				System.out.println("\n" + input);
				values = input.split(" +");

				String value = values[0].trim();
				switch (value) {
				case "DEPEND":
					try {
						dpn.dependencyCreation(values);
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case "INSTALL":
					for (int i = 1; i < values.length; i++) {
						dpn.install(values[i], true);
						String key = values[1];
						HashSet<String> current_list;
						/*
						 * Create self dependency for explicit install INSTALL
						 * NETCARD [NETCARD -> NETCARD]
						 */
						if (!dpn.dependantHashMap.containsKey(key)) {
							current_list = new HashSet<String>();
							dpn.dependantHashMap.put(key, current_list);
						} else {
							current_list = dpn.dependantHashMap.get(key);
						}
						current_list.add(key);
					}
					break;
				case "REMOVE":
					for (int i = 1; i < values.length; i++) {
						dpn.remove(values[i]);

					}
					break;
				case "LIST":
					dpn.list();
					break;
				case "END":
					flag = 1;
					break;
				default:
					System.out.println("Error Command");
					break;

				}
			}

		} catch (IOException io) {
			io.printStackTrace();
		}
	}

	/*
	 * DEPEND TELNET TCPIP NETCARD 1. Add TELNET -> TCPIP,NETCARD in
	 * dependsOnHashMap hashmap 2. Add TCPIP -> TELNET , NETCARD -> TELNET in
	 * dependantHashMap hashmap
	 */
	public void dependencyCreation(String[] values) throws Exception {
		try {

			if (values.length <= 1) {
				throw new InvalidInputExcpetion("Invalid Input for DEPEND");
			}
			String key = values[1];
			HashSet<String> current_list;
			if (!dependsOnHashMap.containsKey(key)) {
				current_list = new HashSet<String>();
				dependsOnHashMap.put(key, current_list);
			} else {
				current_list = dependsOnHashMap.get(key);
			}
			for (int i = 2; i < values.length; i++) {

				// Adding to depends List
				current_list.add(values[i]);

				// Chicken and egg problem , so erroring out !!!
				if (dependantHashMap.containsKey(values[i])) {
					if (dependantHashMap.get(values[i]).contains(key)) {
						throw new InvalidInputExcpetion(
								"Invalid Input - Circular Dependency ");
					}
				}
				HashSet<String> list;

				// Adding to dependent list, the key
				if (!dependantHashMap.containsKey(values[i])) {
					list = new HashSet<String>();
					list.add(key);
					dependantHashMap.put(values[i], list);
				} else {
					dependantHashMap.get(values[i]).add(key);
				}

			}
			return;
		} catch (Exception ex) {
			throw ex;
		}

	}

	// Assuming there is no circular dependency

	/*
	 * Install with all its dependencies
	 */

	public void install(String value, boolean print) {

		if (curr_installs.contains(value)) {
			if (print)
				System.out.println(value + " is already installed");
			return;
		}
		if (dependsOnHashMap.containsKey(value)) {
			HashSet<String> set = dependsOnHashMap.get(value);
			for (String s : set) {
				install(s, false);
			}
		}
		System.out.println("Installing " + value);
		curr_installs.add(value);

		return;
	}

	public void remove(String value) {
		if (!curr_installs.contains(value)) {
			System.out.println(value + " is not installed");
			return;
		}
		/*
		 * If present in dependantHashMap and there is a component depending on
		 * this which is not self, then return
		 */
		if (dependantHashMap.containsKey(value)) {
			HashSet<String> set = dependantHashMap.get(value);
			for (String s : set) {
				if (curr_installs.contains(s) && !s.equals(value)) {
					System.out.println(value + " is still needed");
					return;
				}
			}
		}
		System.out.println("Removing " + value);
		curr_installs.remove(value);
		/*
		 * Recursively call remove for all components it depends on
		 */
		if (dependsOnHashMap.containsKey(value)) {
			for (String s : dependsOnHashMap.get(value)) {
				removeDepenencies(s);
			}
		}

		return;
	}

	public void removeDepenencies(String value) {
		if (!curr_installs.contains(value)) {
			return;
		}
		if (dependantHashMap.containsKey(value)) {
			HashSet<String> set = dependantHashMap.get(value);
			for (String s : set) {
				if (curr_installs.contains(s)) {
					return;
				}
			}
		}
		System.out.println("Removing " + value);
		curr_installs.remove(value);
		if (dependsOnHashMap.containsKey(value)) {
			for (String s : dependsOnHashMap.get(value)) {
				removeDepenencies(s);
			}
		}
		return;
	}

	public void list() {
		for (String s : curr_installs) {
			System.out.println(s);
		}
	}

	class InvalidInputExcpetion extends Exception {

		// Parameterless Constructor
		public InvalidInputExcpetion() {
		}

		// Constructor that accepts a message
		public InvalidInputExcpetion(String message) {
			super(message);
		}
	}

}
