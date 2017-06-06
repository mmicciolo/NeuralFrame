package nf.root;

import java.util.ArrayList;
import java.util.List;

import nf.shared.NeuralNetworkType;

public class NeuralNetwork {
	
	private NeuralNetworkType type;
	
	private List<Layer> layers;
	
	private List<Neuron> inputNeurons;
	
	private List<Neuron> outputNeurons;
	
	public NeuralNetwork() {
		this.layers = new ArrayList<>();
        this.inputNeurons = new ArrayList<>();
        this.outputNeurons = new ArrayList<>();
	}
	
	public void CreateConnections() {
		for(int i = 0; i < layers.size() - 1; i++) {
			Layer currentLayer = layers.get(i);
			Layer nextLayer = layers.get(i + 1);
			for(Neuron currentLayerNeuron : currentLayer.getNeurons()) {
				for(Neuron nextLayerNeuron : nextLayer.getNeurons()) {
					currentLayerNeuron.AddOutputConnection(new Connection(currentLayerNeuron, nextLayerNeuron));
					nextLayerNeuron.AddInputConnection(new Connection(currentLayerNeuron, nextLayerNeuron));
				}
			}
			if(i == 0) {
				
			} else {
				
			}
		}
	}
	
	public void AddLayer(Layer layer) {
		layers.add(layer);
	}
	
	public void RemoveLayer(Layer layer) {
		layers.remove(layer);
	}
	
	public List<Layer> getLayers() {
		return layers;
	}
	
	public int getLayerCount() {
		return layers.size();
	}
	
	public List<Neuron> getInputNeurons() {
		return inputNeurons;
	}
	
	public List<Neuron> getOutputNeurons() {
		return outputNeurons;
	}
	
	public void setInputNeurons(List<Neuron> inputNeurons) {
		this.inputNeurons = inputNeurons;
	}
	
	public void setOutputNeurons(List<Neuron> outputNeurons) {
		this.outputNeurons = outputNeurons;
	}
}
