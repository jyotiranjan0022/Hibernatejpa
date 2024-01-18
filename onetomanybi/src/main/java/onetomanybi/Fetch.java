package onetomanybi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetch {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		User user=manager.find(User.class, 1);
		List<Post> psot=user.getPost();
		for(Post p:psot)
		{
			System.out.println(p.getCaption());
		}
	}

}
