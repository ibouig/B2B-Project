package ma.jemla.model;

import java.io.Serializable;
import java.util.HashMap;

public class Cart implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private HashMap<Long , OrderLine > lines;

	public HashMap<Long, OrderLine> getLines() {
		return lines;
	}

	public void setLines(HashMap<Long, OrderLine> lines) {
		this.lines = lines;
	}
	
	

}
