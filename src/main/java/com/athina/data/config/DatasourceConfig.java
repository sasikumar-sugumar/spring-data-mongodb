/**
 * 
 */
package com.athina.data.config;

import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

/**
 * @author euro
 *
 */
public class DatasourceConfig extends AbstractMongoConfiguration {

	@Override
	protected String getDatabaseName() {
		return "test";
	}

	@Override
	public Mongo mongo() throws Exception {
		return new MongoClient("loclahost", 28128);
	}

	@Override
	protected String getMappingBasePackage() {
		return "com.athina.data.model";
	}
}
