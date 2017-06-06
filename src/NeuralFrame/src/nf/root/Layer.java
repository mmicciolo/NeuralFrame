package nf.root;

import java.util.ArrayList;
import java.util.List;

public class Layer {
	
	private List<Neuron> neurons;
	
	public Layer() {
		neurons = new ArrayList<Neuron>();
	}
	
	public void AddNeuron(Neuron neuron) {
		neurons.add(neuron);
	}
	
	public List<Neuron> getNeurons() {
		return neurons;
	}

}
