package lesson27_Builder;

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
		
		Dialog dialog = new Dialog.Builder()
		.setTitle("Title Dialog")
		.setMessage("Message")
		.setOkButtonText("OK")
		.setCancelButtonText("Cancel")
		.build();

	}
}
