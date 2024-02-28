import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DriverAppDemo {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		System.out.println(factory);

	}

}
