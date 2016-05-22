package ma.jemla.daoimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ma.jemla.model.Account;
import ma.jemla.model.Message;
import ma.jemla.model.MessageStatus;

@NamedQueries({
	@NamedQuery(name="findMessageById",query="select m from Message m where m.id=:id")
	,@NamedQuery(name="findMessageBySender",query="select m from Message m where m.sender=:sender")
	,@NamedQuery(name="findMessageByReceiver",query="select m from Message m where m.receiver=:receiver")
	,@NamedQuery(name="findMessageAll",query="select m from Message m ")
	,@NamedQuery(name="findMessageByStatus",query="select m from Message m where m.messageStatus=:messageStatus")

})

public class MessageDaoImpl {
	
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("B2B-Project");
	private EntityManager em = emf.createEntityManager();
	
	public boolean addMessage(Message message) {
		try{
			em.getTransaction().begin();
			em.persist(message);
			em.getTransaction().commit();
			
		}catch(Exception exp){
			exp.printStackTrace();
			return false;
		}
		
		return true;
	}
	
	public Message findMessageById(long id){
		
		Message message;
		try{
			
			Query query = em.createNamedQuery("findMessageById");
			query.setParameter("id", id);
			message = (Message)query.getSingleResult();
			
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
		return message;
	}
	
	
	public List<Message> findMessageBySender(Account account ){
		
		List<Message> messages;
		try{
			
			Query query = em.createNamedQuery("findMessageBySender");
			query.setParameter("sender", account);
			messages = (List<Message>)query.getResultList();
			
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
		return messages;
	}
	
	
	public List<Message> findMessageByReceiver(Account account ){
		
		List<Message> messages;
		try{
			
			Query query = em.createNamedQuery("findMessageByReceiver");
			query.setParameter("receiver", account);
			messages = (List<Message>)query.getResultList();
			
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
		return messages;
	}
	
	public List<Message> findMessageByStatus(MessageStatus messageStatus ){
		
		List<Message> messages;
		try{
			
			Query query = em.createNamedQuery("findMessageByStatus");
			query.setParameter("messageStatus", messageStatus);
			messages = (List<Message>)query.getResultList();
			
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
		return messages;
	}
	
public List<Message> findMessageAll( ){
		
		List<Message> messages;
		try{
			
			Query query = em.createNamedQuery("findMessageAll");
			messages = (List<Message>)query.getResultList();
			
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
		return messages;
	}
	
	
	
	
	
	
	
	
	
}
