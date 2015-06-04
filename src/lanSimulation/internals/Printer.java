package lanSimulation.internals;

public class Printer extends Node{
	public Printer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public Printer(String name, Node nextNode) {
		super(name, nextNode);
		// TODO Auto-generated constructor stub
	}
	
	public void printOnAppend(StringBuffer buf) {
		
		buf.append("Printer ");
		buf.append(this.name_);
		buf.append(" [Printer]");
		
		//return buf;
	}
	
	public void printXMLOnAppend(StringBuffer buf) {
		buf.append("<printer>");
		buf.append(this.name_);
		buf.append("</printer>");
	}

}
