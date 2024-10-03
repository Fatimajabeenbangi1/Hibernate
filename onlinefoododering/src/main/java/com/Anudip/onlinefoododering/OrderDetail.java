package com.Anudip.onlinefoododering;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id") // Ensure this matches your DB schema
    private FoodOrder order;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public FoodOrder getOrder() {
		return order;
	}

	public void setOrder(FoodOrder order) {
		this.order = order;
	}

	

	public void setFoodItem(FoodItem foodItem) {
		// TODO Auto-generated method stub
		
	}

	public void setQuantity(int quantity) {
		// TODO Auto-generated method stub
		
	}

    // other fields, getters, and setters
    
}

