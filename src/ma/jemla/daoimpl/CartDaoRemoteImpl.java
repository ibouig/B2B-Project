package ma.jemla.daoimpl;

import java.util.HashMap;

import javax.ejb.Stateful;

import ma.jemla.model.OrderLine;
import ma.jemla.model.dao.CartDaoRemote;

//@Stateful
public class CartDaoRemoteImpl /*implements CartDaoRemote*/{
	private HashMap<Long , OrderLine > lines;
	private double total;
	
	
	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public void setLines(HashMap<Long, OrderLine> lines) {
		this.lines = lines;
	}

	public CartDaoRemoteImpl(){
		lines = new HashMap<Long, OrderLine>();
	}
	
	//@Override
	public void addOrderLine(OrderLine order) {
		OrderLine odr = lines.get(order.getProduct().getId());
		if(odr!=null){
			odr.setQuantity(odr.getQuantity()+order.getQuantity());
		}else{
			lines.put(order.getProduct().getId(), new OrderLine(order.getProduct(),order.getQuantity()));
		}
	}
	
	public HashMap<Long, OrderLine> getLines() {
		return lines;
	}

	//@Override
	public HashMap<Long, OrderLine> getOrderLine() {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	public void removeOrderLine(OrderLine order) {
		// TODO Auto-generated method stub
		
	}

	//@Override
	public void remove() {
		lines = null;
		
	}

}
