
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.proj.data.HibernateUtil;
import com.proj.entitties.RestoMenu;
import com.proj.data.RestoMenuDao;

public class Application {
	
	public static void main(String[] args) {
		System.out.println("In Main");
		
		if (args[0].equals("Upload")) {
			new RestoMenuDao().upload(args[1]);
		} else if(args[0].equals("getMenu")) {
			List<RestoMenu> menuItems = new RestoMenuDao().getMenuItems();
			System.out.println("Got " + menuItems.size() + " Items");
		}

//		Session sess = HibernateUtil.getSessionFactory().openSession();
//		System.out.println("Got Session");
//		sess.beginTransaction();
//		System.out.println("Began transaction");
//
//		RestoMenu rm = (RestoMenu) sess.get(RestoMenu.class, 1);
//		System.out.println(rm.getName());
//		
//		sess.close();
		
	}

}
