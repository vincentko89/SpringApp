package com.vincentko.feedaggregate.form;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name="FEED")
public class Feed {

	@Id
	@Column(name="ITEM_ID")
	@GeneratedValue
	private Integer item_id;

	@Column(name="TITLE")
	private String title;
	
	@Column(name="GUID")
	private String guid;
	
	@Column(name="LINK")
	private String link;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="pubDate")
	private String pubDate;
	
	@Column(name="pubDate_converted")
	private Timestamp pubDate_converted;
		
    @ManyToOne
    @JoinColumn(name="channel_id")
	private FeedChannel feedChannel;
    
    @ManyToOne
    @JoinColumn(name="category_id")
	private FeedCategory feedCategory;

	public Integer getItem_id() {
		return item_id;
	}

	public void setItem_id(Integer item_id) {
		this.item_id = item_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPubDate() {
		return pubDate;
	}

	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}

	public Timestamp getPubDate_converted() {
		return pubDate_converted;
	}

	public void setPubDate_converted(Timestamp pubDate_converted) {
		this.pubDate_converted = pubDate_converted;
	}

	public FeedChannel getFeedChannel() {
		return feedChannel;
	}

	public void setFeedChannel(FeedChannel feedChannel) {
		this.feedChannel = feedChannel;
	}

	public FeedCategory getFeedCategory() {
		return feedCategory;
	}

	public void setFeedCategory(FeedCategory feedCategory) {
		this.feedCategory = feedCategory;
	}

}
