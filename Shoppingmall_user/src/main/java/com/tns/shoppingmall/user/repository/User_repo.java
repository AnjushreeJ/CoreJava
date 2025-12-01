package com.tns.shoppingmall.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tns.shoppingmall.user.entity.User_entity;

@Repository
public interface User_repo extends JpaRepository<User_entity , Integer>{


}
