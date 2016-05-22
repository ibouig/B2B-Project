package ma.jemla.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@NamedQueries({
	@NamedQuery(name="findMessageById",query="select m from Message m where m.id=:id")
	,@NamedQuery(name="findMessageBySender",query="select m from Message m where m.sender=:sender")
	,@NamedQuery(name="findMessageByReceiver",query="select m from Message m where m.receiver=:receiver")
	,@NamedQuery(name="findMessageAll",query="select m from Message m ")
	,@NamedQuery(name="findMessageByStatus",query="select m from Message m where m.messageStatus=:messageStatus")

})
@Entity
public class Message {
	
	@Id
	@GeneratedValue
	private long id;
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
	private Date sendDate;
	
	private String object;
	
	@Column(nullable = false, length = 5000)
	private String messageContent;
	
	@Enumerated
	private MessageStatus messageStatus;

	@ManyToOne(cascade = {CascadeType.ALL })
	private Entreprise sender;
	
	@ManyToOne(cascade = {CascadeType.ALL })
	private Entreprise receiver;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Entreprise getReciever() {
		return receiver;
	}

	public void setReciever(Entreprise reciever) {
		this.receiver = reciever;
	}

	public Entreprise getSender() {
		return sender;
	}

	public void setSender(Entreprise sender) {
		this.sender = sender;
	}

	public Date getSendDate() {
		return sendDate;
	}

	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public String getMessageContent() {
		return messageContent;
	}

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}

	public MessageStatus getMessageStatus() {
		return messageStatus;
	}

	public void setMessageStatus(MessageStatus messageStatus) {
		this.messageStatus = messageStatus;
	} 
	
	
	

}
