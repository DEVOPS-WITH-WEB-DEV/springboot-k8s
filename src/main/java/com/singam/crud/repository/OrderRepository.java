package com.singam.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.singam.crud.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
