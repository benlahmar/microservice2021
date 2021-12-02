package com.store.repos;

import java.time.LocalDate;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.SingularAttribute;

import org.springframework.data.jpa.domain.Specification;

import com.store.entities.Account;

public class CustomerSpecifications  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
//	public static Specification<Account> customerHasBirthday() {
//	    return new Specification<Account>() {
//
//			@Override
//			public Predicate toPredicate(Root<Account> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
//				// TODO Auto-generated method stub
//				LocalDate today=LocalDate.now();
//				return cb.equal(root.get(Account_), today);
//				return null;
//			}
//	    	
//	    }
//		};
//	  public static Specification<Account> isLongTermCustomer() {
//	    return new Specification<Account>() {
//
//			@Override
//			public Predicate toPredicate(Root<Account> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
//				// TODO Auto-generated method stub
//				return null;
//			}
//		};
//

}
