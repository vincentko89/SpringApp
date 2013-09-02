package com.vincentko.feedaggregate.form;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="FEED_CHANNEL")
public class FeedChannel {

	@Id
	@Column(name="CHANNEL_ID")
	@GeneratedValue
	private Integer channel_id;
	
	@Column(name="CHANNEL_NAME")
	private String channel_name;	
	
    @OneToMany(cascade = {CascadeType.ALL})
    private List<FeedCategory> feedCategory;

	public Integer getChannel_id() {
		return channel_id;
	}

	public void setChannel_id(Integer channel_id) {
		this.channel_id = channel_id;
	}

	public String getChannel_name() {
		return channel_name;
	}

	public void setChannel_name(String channel_name) {
		this.channel_name = channel_name;
	}

	public List<FeedCategory> getFeedCategory() {
		return feedCategory;
	}

	public void setFeedCategory(List<FeedCategory> feedCategory) {
		this.feedCategory = feedCategory;
	}
    	
	
}
