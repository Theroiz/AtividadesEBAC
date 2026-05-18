package heitor.enan.com;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class Principal {
	public static void main(String[]args)
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		Produto produto = new Produto();
		produto.setNome("Headset");
		produto.setPreco(800d);
		produto.setQntd(12);
		produto.setMarca("Havit");
		session.persist(produto);
		session.getTransaction().commit();
		session.close();
		factory.close();
	}
}