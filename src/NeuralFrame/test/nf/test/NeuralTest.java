package nf.test;

import nf.root.Layer;
import nf.root.NeuralNetwork;
import nf.root.Neuron;

public class NeuralTest {

	public static void main(String[] args) {
		
		NeuralNetwork network = new NeuralNetwork();
		
		//Create a 2, 3, 1
		
		//Input Layer
		Layer inputLayer = new Layer();
		
		inputLayer.AddNeuron(new Neuron());
		inputLayer.AddNeuron(new Neuron());
		
		//Hidden Layer
		Layer hiddenLayer = new Layer();
		
		hiddenLayer.AddNeuron(new Neuron());
		hiddenLayer.AddNeuron(new Neuron());
		hiddenLayer.AddNeuron(new Neuron());
		
		//Output Layer
		Layer outputLayer = new Layer();
		
		outputLayer.AddNeuron(new Neuron());
		
		//Add the layers
		network.AddLayer(inputLayer);
		network.AddLayer(hiddenLayer);
		network.AddLayer(outputLayer);
		
		//Set the input and output neurons
		network.setInputNeurons(inputLayer.getNeurons());
		network.setOutputNeurons(outputLayer.getNeurons());
		
		//Create the connections
		network.CreateConnections();

	}
}
