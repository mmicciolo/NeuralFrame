package nf.root;

public class Connection {
	
	private Neuron in;
	
	private Neuron out;
	
	private Weight weight;
	
	public Connection(Neuron in, Neuron out) {
		this.in = in;
		this.out = out;
		this.weight = new Weight();
	}

}
