package com.vincentko.feedaggregate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vincentko.feedaggregate.dao.FeedDAO;
import com.vincentko.feedaggregate.form.Feed;

@Service
public class FeedServiceImpl implements FeedService {

	@Autowired
	private FeedDAO FeedDAO;

	@Transactional
	public List<Feed> listFeed() {

		return FeedDAO.listFeed();
	}

}
