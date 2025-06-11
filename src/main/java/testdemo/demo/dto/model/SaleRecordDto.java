package com.worldline.dts.sale.model;

import java.math.BigInteger;
import java.util.Date;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@JacksonXmlRootElement(localName = "SaleRecordDto")
@Data
public class SaleRecordDto {
	
	public BigInteger id;
	public BigInteger cid;
	public BigInteger tid;
	public BigInteger rid;
	public BigInteger pid;
	public BigInteger nid;
	public BigInteger lid;
	public String original_id;
	public String machine_type;
	public String machine;
	public String user_id;
	public Date last_updated;
	public String sale;
	public String ctr_reference;
	public String surname;
	public String postcode;
	public String refund_reference;
	public String refund_status;
	public String issue_machine;
	public String issue_date;
	public String transaction_number;
	public String business_code;
	public String tis_type;
	public int sequence_number;
	private long loyaltyCardId;
	public String business_group;
	public String refund_created_date;
	private String isrn;
	private String ipeInstanceId;
	public Long contact_booking_ref;

	public long ticketingRecordId;
	public String travel_date;



}
