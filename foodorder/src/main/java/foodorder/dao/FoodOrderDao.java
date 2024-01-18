package foodorder.dao;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import foodorder.Foodorder;

public class FoodOrderDao {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
	EntityManager manager=factory.createEntityManager();
	
	public Foodorder saveFoodOrder(Foodorder order) {
		// TODO Auto-generated method stub
		manager.persist(order);
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
	transaction.commit();
		return order;
	}

	public List<Foodorder> fetchFoodOrder(Foodorder order) {
		String hql="select order from Foodorder order";
	Query q=manager.createQuery(hql);
	
			           
	return q.getResultList(); 

	}


}
