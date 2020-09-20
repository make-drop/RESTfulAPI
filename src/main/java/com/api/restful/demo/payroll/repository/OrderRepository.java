package com.api.restful.demo.payroll.repository;

import com.api.restful.demo.payroll.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {}
