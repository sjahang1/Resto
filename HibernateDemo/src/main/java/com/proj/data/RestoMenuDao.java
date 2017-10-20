package com.proj.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.proj.entitties.RestoMenu;
import com.proj.util.CSVReader;

public class RestoMenuDao {

	public List<RestoMenu> getMenuItems() {

		List<RestoMenu> menuItems = new ArrayList<>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction txn = session.beginTransaction();

		try {
			Query<RestoMenu> query = session.createQuery("select m from RestoMenu m " 
						+ " where coalesce(m.activeInd,'Y') = 'Y'", RestoMenu.class);
			menuItems = query.getResultList();

			for (RestoMenu menuItem : menuItems) {
				System.out.println(menuItem.getName());
			}
			txn.commit();
			
			return menuItems;
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
			throw new RuntimeException("Error in RestoMenuDao.getMenuItems");
		} finally {
			session.close();
		}

	}
	
	public void upload(String fileToUpload) {
		ArrayList<String[]> menuItems = CSVReader.read(fileToUpload, 1);
		
		System.out.println("Uploading " + menuItems.size() + " Items");
		
		int count = 0;		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		for(String[] a: menuItems) {
			count++;
				// process new menu item
				RestoMenu rm = new RestoMenu();
				
				System.out.println("Processing row " + (count));
				Arrays.toString(a);
				
				for (int j=0; j<a.length; j++) {
					System.out.println("column " + j + " value " + a[j]);

					switch(j) {
					case 0: rm.setCategory(a[j]); break;
					case 1: rm.setName(a[j]); break;
					case 2: rm.setDescription(a[j]); break;
					case 3: rm.setImage(a[j]); break;
					case 4: rm.setServingSize(a[j]); break;
					case 5: rm.setPrice(Double.parseDouble(a[j])); break;
					case 6: rm.setActiveInd(a[j]); break;
					case 7: {	if (a[j]==null || a[j].length()==0) rm.setRecipeId(null);
								else rm.setRecipeId(Integer.parseInt(a[j])); 
							break;
							}
					case 8: rm.setRestaurantSpecialInd(a[j]); break;
					case 9: rm.setVegetarianInd(a[j]); break;
					case 10: rm.setNotes(a[j]); break;
					}
				}
				
				session.save(rm);
		}					
		transaction.commit();	
	}


}
