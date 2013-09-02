package com.vincentko.feedaggregate.dao;

import java.util.List;

import com.vincentko.feedaggregate.form.Feed;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FeedDAOImpl implements FeedDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public List<Feed> listFeed() {
	
		return sessionFactory.getCurrentSession().createQuery("from Feed ORDER BY pubDate_converted DESC")
				.list();
	}

}
