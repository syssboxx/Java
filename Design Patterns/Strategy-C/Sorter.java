package lesson27_Strategy;

import java.util.List;

public class Sorter {

	private List<Integer> list;
	
	public Sorter(List<Integer> list) {
		this.list = list;
	}
	
	public void sort(SortingAlgorithm algorithm) {
		algorithm.sort(list);
	}
	
	public void setList(List<Integer> list) {
		this.list = list;
	}
}
