package foodorder;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManagerFactory;

import foodorder.dao.FoodOrderDao;

public class SaveOrder {
	public static void main(String[] args) {
		Foodorder order=new Foodorder();
//		order.setDeliverytime(LocalDateTime.now());
//		order.setDistance(30);
//		order.setOrderTime(LocalDateTime.now());
//		order.setNme("pinku");
//		order.setPrice(66767);
		FoodOrderDao dao=new FoodOrderDao();
//		order=dao.saveFoodOrder(order);
//		System.out.println("order with id"+order.getId());
//		System.out.println("order with id "+order.getPrice());
	List<Foodorder>order1=dao.fetchFoodOrder(order);
	System.out.println(order1.get(0).getDistance());
		
		
	}

}
