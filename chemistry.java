
//THIS HAS THE OLD FOR LOOP FOR MATCH CALCULATIONS.
public class chemistry {
		
		static String[] elements = {"H", "He",
		"Li", "Be", "B", "C", "N", "O", "F", "Ne",
		"Na", "Mg", "Al", "Si", "P", "S", "Cl", "Ar",
		"K", "Ca", "Sc", "Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Zn", "Ga", "Ge", "As", "Se", "Br", "Kr",
		"Rb", "Sr", "Y", "Zr", "Nb", "Mo", "Tc", "Ru", "Rh", "Pd", "Ag", "Cd",
		"In", "Sn", "Sb", "Te", "I", "Xe",
		"Cs", "Ba",
		"La", "Ce", "Pr", "Nd", "Pm", "Sm", "Eu", "Gd", "Tb", "Dy", "Ho", "Er", "Tm", "Yb", "Lu",
		"Hf", "Ta", "W", "Re", "Os", "Ir", "Pt", "Au", "Hg", "Tl", "Pb", "Bi", "Po", "At", "Rn",
		"Fr", "Ra",
		"Ac", "Th", "Pa", "U", "Np", "Pu", "Am", "Cm", "Bk", "Cf", "Es", "Fm", "Md", "No", "Lr",
		"Rf", "Db", "Sg", "Bh", "Hs", "Mt", "Ds", "Rg", "Cn",};//fix to do 3 letter symbols and add them in.
		static double[] masses = {1.008, 4.003,
		6.941, 9.012, 10.811, 12.011, 14.007, 15.999, 18.998, 20.180,
		22.990, 24.305, 26.982, 28.086, 30.974, 32.066, 35.453, 39.948,
		39.098, 40.078, 44.956, 47.88, 50.942, 51.996, 54.938, 55.933, 58.693, 63.546, 65.39, 69.732, 72.61, 74.922, 78.09, 79.904, 84.80,
		84.468, 87.62, 88.906, 91.224, 92.906, 95.94, 98.907, 101.07, 102.906, 106.42, 107.868, 112.411, 114.818, 118.71, 121.760, 127.6, 126.904, 131.29,
		132.905, 137.327,
		138.906, 140.115, 140.908, 144.24, 144.913, 150.36, 151.966, 157.25, 158.925, 162.50, 164.930, 167.26, 168.934, 173.04, 174.967,
		178.49, 180.948, 183.85, 168.207, 190.23, 192.22, 195.08, 196.967, 200.59, 204.383, 207.2, 208.980, 208.982, 209.987, 222.018,
		223.020, 226.025,
		227.028, 232.038, 231.036, 238.029, 237.048, 244.064, 243.061, 247.070, 247.070, 251.080, 254, 257.095, 258.1, 259.101, 262,
		261, 262, 266, 264, 269, 268, 269, 272, 277};

		public static double getMatches(String x) {
			String formula = x;
			char[] chars = formula.toCharArray();
			String[] match = new String[chars.length];
			int[] subs = new int[chars.length];
	
			int j = 0;
			int k = 0;
			for(int i=0; i<chars.length; i++) {
				if(Character.isUpperCase(chars[i])) {
					if((i+1)==chars.length) {
						match[k] = "" + chars[i];
						subs[j] = 49;
						// in case we are at the end. without this array index would be called out of bound.
				    }
					else if(Character.isLowerCase(chars[i+1])) {
						match[k] = "" + chars[i] + chars[i+1];
						k++;
					}
					else if(Character.isUpperCase(chars[i+1])) {
						match[k] = "" + chars[i];
						subs[j] = 49;
						//I had the number 1 here, when I went to print out the arrays at the end, it was printing the char version of 1, because all other numbers in array, were ascii values for chars 0-9.
						j++;
						k++;
					}
	
					else {
						match[k] = "" + chars[i];
						k++;
					}
				}
				else if(chars[i] > 47 && chars[i] < 58) {
					subs[j] = chars[i];
					j++;
				}
			}//end of for loop
			for(int i=0; i<3; i++)
				System.out.println(match[i]);
			System.out.println();
			for(int i=0; i<3; i++)
				System.out.println((char)subs[i]);
	
			System.out.println();
	
			//boolean f = match[0] == "Na";
			//System.out.println(f);
			//why is this false?? Something to do with line 22??
	
			//boolean f = match[0].equals("Na");
			//System.out.println(f);
			//This works.
	
			/* == tests for reference equality (whether they are the same object).
				.equals() tests for value equality (whether they are logically "equal").
				Objects.equals() checks for nulls before calling .equals() so you don't have to (available as of JDK7, also available in Guava).
				Consequently, if you want to test whether two strings have the same value you will probably want to use Objects.equals().
			*/
			
			double answer = getMass(match, subs, elements, masses);
			return answer;
		}

	public static double getMass(String[] elements, int [] subs, String[] pTable, double[] weights) {
		double mass = 0.0;
		for(int i = 0; i < elements.length; i++) {
			if(elements[i]==null||subs[i]==0)
				break;
			for(int j = 0; j < pTable.length; j++) {
				if(elements[i].equals(pTable[j])) {
					System.out.println(pTable[j] + ": " + weights[j]);
					mass = (subs[i]-48)*weights[j] + mass;
					break;
				}
			}
		}

		return mass;
	}//end of getMass


}//end of class chem
