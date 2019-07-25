package org.springframework.data.cassandra.examples.core.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;


@PrimaryKeyClass
public class VisitorProfileChangeLogPK implements Serializable {
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PrimaryKeyColumn(name = "user_id", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
	  private String user_id;

	  @PrimaryKeyColumn(name = "creation_date", ordinal = 1, type = PrimaryKeyType.CLUSTERED, ordering = Ordering.DESCENDING)
	  private Date creation_date;

	public VisitorProfileChangeLogPK(String user_id, Date creation_date) {
		super();
		this.user_id = user_id;
		this.creation_date = creation_date;
	}

	@Override
	public String toString() {
		return "VisitorProfileChangeLogPK [user_id=" + user_id + ", creation_date=" + creation_date + "]";
	}
	  
	  
	  
}
