package main.java.seedsbanks;

import java.util.ArrayList;

public class RemoveAll implements Strategy {

	@Override
	public void handle(ArrayList list) {
		list.removeAll(list);
	}

}
