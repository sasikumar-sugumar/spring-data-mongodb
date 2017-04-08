/**
 * 
 */
package com.athina.data.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.mongodb.DBObject;
import com.mongodb.util.JSON;

/**
 * @author euro
 *
 */
@Document(collection = "entitydocuments")
public class EntityDocument {

	@Id
	private String id;

	@Indexed
	private String documentUID;

	private String entityState;

	private DBObject data;

	public EntityDocument(String documentUID, String entityState, String data) {
		super();
		this.documentUID = documentUID;
		this.entityState = entityState;
		this.data = (DBObject) JSON.parse(data);
		this.timestamp = new Date();
		this.timestampUTC = new Date();

	}

	public EntityDocument() {
		super();
	}

	@DateTimeFormat(iso = ISO.DATE_TIME)
	private Date timestamp;

	@DateTimeFormat(iso = ISO.DATE)
	private Date timestampUTC;

	public String getDocumentUID() {
		return documentUID;
	}

	public void setDocumentUID(String documentUID) {
		this.documentUID = documentUID;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Date getTimestampUTC() {
		return timestampUTC;
	}

	public void setTimestampUTC(Date timestampUTC) {
		this.timestampUTC = timestampUTC;
	}

	public DBObject getData() {
		return data;
	}

	public void setData(DBObject data) {
		this.data = data;
	}

}
