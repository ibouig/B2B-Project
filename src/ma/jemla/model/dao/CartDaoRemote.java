package ma.jemla.model.dao;

import java.util.HashMap;

import javax.ejb.Remote;
import javax.ejb.Remove;

import ma.jemla.model.OrderLine;

@Remote
public interface CartDaoRemote {
	public void addOrderLine(OrderLine order);
	public void removeOrderLine(OrderLine order);
	@Remove
	public void remove();
	public HashMap<Long, OrderLine> getLines();
	public HashMap<Long, OrderLine> getOrderLine();
}
