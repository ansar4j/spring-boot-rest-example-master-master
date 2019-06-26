package com.khoubyari.example.dao.jpa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.khoubyari.example.domain.Discount;

/**
 * Repository can be used to delegate CRUD operations against the data source: http://goo.gl/P1J8QH
 */
public interface DiscountRepository extends PagingAndSortingRepository<Discount, Long> {
  
}
