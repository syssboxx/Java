package lesson27_Strategy;

import java.util.ArrayList;
import java.util.List;

import lesson27_Singleton.Logger;
import lesson27_Strategy.QuickSort;
import lesson27_Strategy.Sorter;
import lesson27_Strategy.SortingAlgorithm;
import lesson27_Templatemethod.DecidedGame;
import lesson27_Templatemethod.Game;
import lesson27_Templatemethod.Player;
import lesson27_Builder.Dialog;


public class Program {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
		
		Sorter sorter = new Sorter(l);
		sorter.sort(new QuickSort());
		
		sorter.sort(new SortingAlgorithm() {
			
			@Override
			public void sort(List<Integer> list) {
				//our code to sort
			}
		});
		
		
	}
}
