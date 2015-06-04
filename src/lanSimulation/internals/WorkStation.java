package lanSimulation.internals;

public class WorkStation extends Node {

	public WorkStation(byte type, String name) {
		super(type, name);
		// TODO Auto-generated constructor stub
	}
	
	public WorkStation(byte type, String name, Node nextNode) {
		super(type, name, nextNode);
		// TODO Auto-generated constructor stub
	}
	
	
	public void printOnAppend(StringBuffer buf) {
		buf.append("Workstation ");
		buf.append(this.name_);
		buf.append(" [Workstation]");
		
		//return buf;
	}
	
	public void printXMLOnAppend(StringBuffer buf) {
		buf.append("<workstation>");
		buf.append(this.name_);
		buf.append("</workstation>");
	}

}
