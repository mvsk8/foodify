package ch.zhaw.springboot.models;

import java.sql.Timestamp;

public class PurchaseRequest {
	public Timestamp createTs;
	public Timestamp purchaseTs;
	public String street;
	public int postcodeId;
	public int delivererId;
	public int customerId;
	
	public PurchaseRequest(Timestamp createTs, Timestamp purchaseTs, String street, int postcodeId, int delivererId,
			int customerId) {
		super();
		this.createTs = createTs;
		this.purchaseTs = purchaseTs;
		this.street = street;
		this.postcodeId = postcodeId;
		this.delivererId = delivererId;
		this.customerId = customerId;
	}
}
