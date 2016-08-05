
public class forLoop2 {

static double mass = 0.0;

public static double getMatches(String x) {
		Element[] periodic = new Element[118];
		populateArray(periodic);
		//Scanner kbd = new Scanner(System.in);
		String formula = x;
		//kbd.close();
		char[] chars = formula.toCharArray();
		String[] match = new String[chars.length];
		int[] subs = new int[chars.length];

		int j = 0;
		int k = 0;
		System.out.println(chars.length);
		System.out.println();
		for(int i=0; i<chars.length; i++) {

			if(Character.isUpperCase(chars[i])) {
				if((i+1)==chars.length) {
					match[k] = "" + chars[i];
					subs[j] = 1;
					j++;
					// in case we are at the end. without this array index would be called out of bound.
			    }

				else if(Character.isLowerCase(chars[i+1])) {
					if(i+2 < chars.length) {

						if(Character.isLowerCase(chars[i+2])){
							match[k] = "" + chars[i] + chars[i+1] + chars[i+2];
							k++;
							k++;
							i++;
							continue;
							//this is for 3 letter symbols.
						}
					}

					match[k] = "" + chars[i] + chars[i+1];
					k++;




				}

				else if(Character.isUpperCase(chars[i+1])) {
					match[k] = "" + chars[i];
					subs[j] = 1;
					j++;
					k++;
				}

				else {
					match[k] = "" + chars[i];
					k++;
				}
			}

			else if(chars[i] > 47 && chars[i] < 58) {
				if(i+1 < chars.length){
					if(chars[i+1] > 47 && chars[i+1] < 58){
						String temp = "" + chars[i] + chars[i+1];
						subs[j] = Integer.parseInt(temp);
						j++;
						i++;
						continue;
						//this is for double digit subscripts.

				    }
				}

				subs[j] = (int)chars[i] - 48;
				j++;

			}
			else if(Character.isLowerCase(chars[i]) && Character.isUpperCase(chars[i+1])){
				subs[j] = 1;
				j++;
			}

		}//end of for

		for(int i=0; i<match.length; i++){
			if(match[i]!=null)
				System.out.println(match[i]);
		}
			System.out.println();
		for(int i=0; i<match.length; i++){
			if(subs[i]!=0)
				System.out.println(subs[i]);
		}

		return getMass(match, subs, periodic);
	}//end of main

	public static double getMass(String[] elements, int [] subs, Element[] periodic) {
						for(int i = 0; i < elements.length; i++) {
							if(elements[i]==null||subs[i]==0)
								break;
							for(int j = 0; j < periodic.length; j++) {
								if(elements[i].equals(periodic[j].getSymbol())) {
									System.out.println(periodic[j].getSymbol() + " - " + periodic[j].getElement() + ": " + periodic[j].getMass());
									mass = subs[i]*periodic[j].getMass() + mass;
									Frame1.textArea.append(periodic[j].getSymbol() + " - " + periodic[j].getElement() + ": " + periodic[j].getMass() + "\n");
									break;
								}
							}
						}

						return mass;
	}
	public static void populateArray(Element[] x) {
		x[0] = new Element("Sodium", "Na", 22.990);
		x[1] = new Element("Sulfur", "S", 32.066);
		x[2] = new Element("Oxygen", "O", 15.999);
		x[3] = new Element("Carbon", "C", 12.011);
		x[4] = new Element("Hydrogen", "H", 1.008);
		x[5] = new Element("Hydrogen", "H", 1.008);
		x[6] = new Element("Hydrogen", "H", 1.008);
		x[7] = new Element("Hydrogen", "H", 1.008);
		x[8] = new Element("Hydrogen", "H", 1.008);
		x[9] = new Element("Hydrogen", "H", 1.008);
		x[10] = new Element("Hydrogen", "H", 1.008);
		x[11] = new Element("Hydrogen", "H", 1.008);
		x[12] = new Element("Hydrogen", "H", 1.008);
		x[13] = new Element("Hydrogen", "H", 1.008);
		x[14] = new Element("Hydrogen", "H", 1.008);
		x[15] = new Element("Hydrogen", "H", 1.008);
		x[16] = new Element("Hydrogen", "H", 1.008);
		x[17] = new Element("Hydrogen", "H", 1.008);
		x[18] = new Element("Hydrogen", "H", 1.008);
		x[19] = new Element("Hydrogen", "H", 1.008);
		x[20] = new Element("Hydrogen", "H", 1.008);
		x[21] = new Element("Hydrogen", "H", 1.008);
		x[22] = new Element("Hydrogen", "H", 1.008);
		x[23] = new Element("Hydrogen", "H", 1.008);
		x[24] = new Element("Hydrogen", "H", 1.008);
		x[25] = new Element("Hydrogen", "H", 1.008);
		x[26] = new Element("Hydrogen", "H", 1.008);
		x[27] = new Element("Hydrogen", "H", 1.008);
		x[28] = new Element("Hydrogen", "H", 1.008);
		x[29] = new Element("Hydrogen", "H", 1.008);
		x[30] = new Element("Hydrogen", "H", 1.008);
		x[31] = new Element("Hydrogen", "H", 1.008);
		x[32] = new Element("Hydrogen", "H", 1.008);
		x[33] = new Element("Hydrogen", "H", 1.008);
		x[34] = new Element("Hydrogen", "H", 1.008);
		x[35] = new Element("Hydrogen", "H", 1.008);
		x[36] = new Element("Hydrogen", "H", 1.008);
		x[37] = new Element("Hydrogen", "H", 1.008);
		x[38] = new Element("Hydrogen", "H", 1.008);
		x[39] = new Element("Hydrogen", "H", 1.008);
		x[40] = new Element("Hydrogen", "H", 1.008);
		x[41] = new Element("Hydrogen", "H", 1.008);
		x[42] = new Element("Hydrogen", "H", 1.008);
		x[43] = new Element("Hydrogen", "H", 1.008);
		x[44] = new Element("Hydrogen", "H", 1.008);
		x[45] = new Element("Hydrogen", "H", 1.008);
		x[46] = new Element("Hydrogen", "H", 1.008);
		x[47] = new Element("Hydrogen", "H", 1.008);
		x[48] = new Element("Hydrogen", "H", 1.008);
		x[49] = new Element("Hydrogen", "H", 1.008);
		x[50] = new Element("Hydrogen", "H", 1.008);
		x[51] = new Element("Hydrogen", "H", 1.008);
		x[52] = new Element("Hydrogen", "H", 1.008);
		x[53] = new Element("Hydrogen", "H", 1.008);
		x[54] = new Element("Hydrogen", "H", 1.008);
		x[55] = new Element("Hydrogen", "H", 1.008);
		x[56] = new Element("Hydrogen", "H", 1.008);
		x[57] = new Element("Hydrogen", "H", 1.008);
		x[58] = new Element("Hydrogen", "H", 1.008);
		x[59] = new Element("Hydrogen", "H", 1.008);
		x[60] = new Element("Hydrogen", "H", 1.008);
		x[61] = new Element("Hydrogen", "H", 1.008);
		x[62] = new Element("Hydrogen", "H", 1.008);
		x[63] = new Element("Hydrogen", "H", 1.008);
		x[64] = new Element("Hydrogen", "H", 1.008);
		x[65] = new Element("Hydrogen", "H", 1.008);
		x[66] = new Element("Hydrogen", "H", 1.008);
		x[67] = new Element("Hydrogen", "H", 1.008);
		x[68] = new Element("Hydrogen", "H", 1.008);
		x[69] = new Element("Hydrogen", "H", 1.008);
		x[70] = new Element("Hydrogen", "H", 1.008);
		x[71] = new Element("Hydrogen", "H", 1.008);
		x[72] = new Element("Hydrogen", "H", 1.008);
		x[73] = new Element("Hydrogen", "H", 1.008);
		x[74] = new Element("Hydrogen", "H", 1.008);
		x[75] = new Element("Hydrogen", "H", 1.008);
		x[76] = new Element("Hydrogen", "H", 1.008);
		x[77] = new Element("Hydrogen", "H", 1.008);
		x[78] = new Element("Hydrogen", "H", 1.008);
		x[79] = new Element("Hydrogen", "H", 1.008);
		x[80] = new Element("Hydrogen", "H", 1.008);
		x[81] = new Element("Hydrogen", "H", 1.008);
		x[82] = new Element("Hydrogen", "H", 1.008);
		x[83] = new Element("Hydrogen", "H", 1.008);
		x[84] = new Element("Hydrogen", "H", 1.008);
		x[85] = new Element("Hydrogen", "H", 1.008);
		x[86] = new Element("Hydrogen", "H", 1.008);
		x[87] = new Element("Hydrogen", "H", 1.008);
		x[88] = new Element("Hydrogen", "H", 1.008);
		x[89] = new Element("Hydrogen", "H", 1.008);
		x[90] = new Element("Hydrogen", "H", 1.008);
		x[91] = new Element("Hydrogen", "H", 1.008);
		x[92] = new Element("Hydrogen", "H", 1.008);
		x[93] = new Element("Hydrogen", "H", 1.008);
		x[94] = new Element("Hydrogen", "H", 1.008);
		x[95] = new Element("Hydrogen", "H", 1.008);
		x[96] = new Element("Hydrogen", "H", 1.008);
		x[97] = new Element("Hydrogen", "H", 1.008);
		x[98] = new Element("Hydrogen", "H", 1.008);
		x[99] = new Element("Hydrogen", "H", 1.008);
		x[100] = new Element("Hydrogen", "H", 1.008);
		x[101] = new Element("Hydrogen", "H", 1.008);
		x[102] = new Element("Hydrogen", "H", 1.008);
		x[103] = new Element("Hydrogen", "H", 1.008);
		x[104] = new Element("Hydrogen", "H", 1.008);
		x[105] = new Element("Hydrogen", "H", 1.008);
		x[106] = new Element("Hydrogen", "H", 1.008);
		x[107] = new Element("Hydrogen", "H", 1.008);
		x[108] = new Element("Hydrogen", "H", 1.008);
		x[109] = new Element("Hydrogen", "H", 1.008);
		x[110] = new Element("Hydrogen", "H", 1.008);
		x[111] = new Element("Hydrogen", "H", 1.008);
		x[112] = new Element("Hydrogen", "H", 1.008);
		x[113] = new Element("Hydrogen", "H", 1.008);
		x[114] = new Element("Hydrogen", "H", 1.008);
		x[115] = new Element("Hydrogen", "H", 1.008);
		x[116] = new Element("Hydrogen", "H", 1.008);
		x[117] = new Element("Hydrogen", "H", 1.008);
		System.out.println(x[4].getElement());
	} //end of pop array




}//end of class