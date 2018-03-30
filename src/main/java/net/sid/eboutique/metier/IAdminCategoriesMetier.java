package net.sid.eboutique.metier;

import net.sid.eboutique.entities.Categorie;
import net.sid.eboutique.entities.Role;
import net.sid.eboutique.entities.User;

public interface IAdminCategoriesMetier extends IAdminProduitsMetier{
	
	public Long ajouterCategorie(Categorie c );
	public void supprimerCategorie(Long idCat);
	public void modifierCategorie(Categorie c);
	
	public void ajouterUser(User u );
	public void attribueRole( Role r , Long userID);

}
