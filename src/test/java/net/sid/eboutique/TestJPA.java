package net.sid.eboutique;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.sid.eboutique.entities.Categorie;
import net.sid.eboutique.entities.Produit;
import net.sid.eboutique.metier.IAdminCategoriesMetier;

public class TestJPA {
	
	ClassPathXmlApplicationContext context;
	@Before
	public void setUp()  throws Exception{
		
	context=new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
		
		
	}
	
	

	@Test
	public void test1() {
		
				
				try {
					

					IAdminCategoriesMetier metier=(IAdminCategoriesMetier) context.getBean("metier");
					List<Categorie> lisCat1 = metier.listCategories();
					metier.ajouterCategorie(new Categorie("Ordinateurs", "Ordnmmmmmmm", null, "image.jpg"));
					metier.ajouterCategorie(new Categorie("Imprimente", "imprrrrrrrr", null, "image.jpg"));
					List<Categorie> lisCat2 = metier.listCategories();
					assertTrue(lisCat1.size() + 2 == lisCat2.size());
					
				} catch(Exception e ) {
					assertTrue(e.getMessage(), false);
				}
				
				
	}
	
	
	@Test
	public void testDAO()
	{
		try{
			
			
			
			IAdminCategoriesMetier metier = (IAdminCategoriesMetier) context.getBean("metier");
			List<Produit> prods1 = metier.listProduits();
			metier.ajouterProduit(new Produit("HP Compat","HP7890",6000,true,"image1.jpg",50),1L);
			metier.ajouterProduit(new Produit("AZERTY","HP7890",6000,true,"image1.jpg",50),1L);
			List<Produit> prods2 = metier.listProduits();
			assertTrue(prods1.size() + 2 == prods2.size());
			
			}catch(Exception e)
			{
				assertTrue(e.getMessage() , false);
			}
	}
	
	

}
