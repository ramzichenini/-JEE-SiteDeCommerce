package net.sid.eboutique.dao;

import java.util.List;

import net.sid.eboutique.entities.Categorie;
import net.sid.eboutique.entities.Client;
import net.sid.eboutique.entities.Commande;
import net.sid.eboutique.entities.Panier;
import net.sid.eboutique.entities.Produit;
import net.sid.eboutique.entities.Role;
import net.sid.eboutique.entities.User;



public interface IBoutiqueDAO {

	/* CATEGORIE  */
	public Long ajouterCategorie(Categorie c );
	public List<Categorie> listCategories();
	public Categorie getCategorie(Long idCat);
	public void supprimerCategorie(Long idcat);
	public void modifierCategorie(Categorie c);
	/* PRODUIT  */
	public Long ajouterProduit(Produit p, Long  IdCat);
	public List<Produit> listProduits();
	public List<Produit> listProduitsParMc(String mc);
	public List<Produit> listProduitsSelectionnes();
	public List<Produit> listProduitsParCategorie(Long idCat);
	public Produit getProduit(Long idPro);
	public void supprimerProduit(Long idPro);
	public void modifierProduit(Produit p);
	
	/* USER  */
	public void ajouterUser(User u );
	public void attribuerRole(Role r, Long userID );
	
	public Commande enrigistrerCommande(Panier p , Client c);
	
	
	
}
