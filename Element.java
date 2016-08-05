public class Element {
	double mass = 0.0;
	String element = "element";
	String symbol = "E";

	public Element()
	{
	}

	public Element(String e, String s, double m)
	{
		element = e;
		symbol = s;
		mass = m;
	}

	public String getElement()
	{
		return element;
	}

	public String getSymbol()
	{
		return symbol;
	}

	public double getMass()
	{
		return mass;
	}

}//end of class element.
