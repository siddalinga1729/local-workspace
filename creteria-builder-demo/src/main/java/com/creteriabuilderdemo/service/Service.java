package com.creteriabuilderdemo.service;

import org.springframework.data.jpa.repository.Query;

import com.creteriabuilderdemo.entity.Person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import jakarta.persistence.criteria.Subquery;

@org.springframework.stereotype.Service
public class Service {
	private EntityManager entityManager;
	public void getCreteria() {
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		 CriteriaQuery<Object> createQuery = criteriaBuilder.createQuery();
		 Root<String> from = createQuery.from(String.class);
		 final CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		 final CriteriaQuery<Person> cq = cb.createQuery(Person.class);
		 final Root<Person> root = cq.from(Person.class);
		 cq.select(root);

		 final Subquery<Integer> subquery = cq.subquery(Integer.class);
		 final Root<Person> validityIDSQ = subquery.from(Person.class);

	
	}
}
