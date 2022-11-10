package com.yash.food.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.food.model.Contact;

public interface ContactDao extends JpaRepository<Contact,Integer> {
}
