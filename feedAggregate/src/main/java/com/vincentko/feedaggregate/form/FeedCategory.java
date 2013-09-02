package com.vincentko.feedaggregate.form;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.CascadeType;


@Entity
@Table(name="FEED_CATEGORY")
public class FeedCategory {
	
	@Id
	@Column(name="CATEGORY_ID")
	@GeneratedValue
	private Integer category_id;

	@Column(name="category_name")
	private String category_name;

    @ManyToOne
    @JoinColumn(name="channel_id")
	private FeedChannel feedChannel;

	@Column(name="file_name")
	private String file_name;	
	
    @OneToMany(cascade = {CascadeType.ALL})
    private List<Feed> feed;

	public Integer getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public String getFile_name() {
		return file_name;
	}

	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}

	public FeedChannel getFeedChannel() {
		return feedChannel;
	}

	public void setFeedChannel(FeedChannel feedChannel) {
		this.feedChannel = feedChannel;
	}

	public List<Feed> getFeed() {
		return feed;
	}

	public void setFeed(List<Feed> feed) {
		this.feed = feed;
	}
    
}
