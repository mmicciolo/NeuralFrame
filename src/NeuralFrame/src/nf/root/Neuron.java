package nf.root;

import java.util.ArrayList;
import java.util.List;

public class Neuron {
	
	private List<Connection> inputConnections;
	
	private List<Connection> outputConnections;
	
	private double inputValue;
	
	private double outputValue;
	
	public Neuron() {
		this.inputConnections = new ArrayList<Connection>();
		this.outputConnections = new ArrayList<Connection>();
	}
	
	public void AddInputConnection(Connection connection) {
		inputConnections.add(connection);
	}
	
	public void AddOutputConnection(Connection connection) {
		outputConnections.add(connection);
	}

}
