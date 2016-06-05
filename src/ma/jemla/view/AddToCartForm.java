package ma.jemla.view;

import org.apache.struts.action.ActionForm;

public class AddToCartForm extends ActionForm{
	private long id;
	private long quatity;
	
	
	public long getQuatity() {
		return quatity;
	}

	public void setQuatity(long quatity) {
		this.quatity = quatity;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	
}
