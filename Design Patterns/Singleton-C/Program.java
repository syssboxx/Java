package lesson27_Singleton;

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
		
		Logger l1 = Logger.getInstance();
		Logger l2 = Logger.getInstance();
		
		l1.setUpperCase(true);
		
		l2.log("First Message");
		
		EnumLogger el = EnumLogger.INSTANCE;
		el.setUpperCase(true);
		el.log("warning");
		
		
	}
}
