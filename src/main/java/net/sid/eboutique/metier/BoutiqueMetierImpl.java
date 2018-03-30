package net.sid.eboutique.metier;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import net.sid.eboutique.dao.IBoutiqueDAO;
import net.sid.eboutique.entities.Categorie;
import net.sid.eboutique.entities.Client;
import net.sid.eboutique.entities.Commande;
import net.sid.eboutique.entities.Panier;
import net.sid.eboutique.entities.Produit;
import net.sid.eboutique.entities.Role;
import net.sid.eboutique.entities.User;

@Transactional
public class BoutiqueMetierImpl implements IAdminCategoriesMetier{

	private IBoutiqueDAO dao;
	
	
	
	public void setDao(IBoutiqueDAO dao) {
		this.dao = dao;
	}

	@Override
	public Long ajouterProduit(Produit p, Long IdCat) {
		return dao.ajouterProduit(p,IdCat);
		
	}

	@Override
	public void supprimerProduit(Long idP) {
		dao.supprimerProduit(idP);
		
	}

	@Override
	public void modifierProduit(Produit p) {
		dao.modifierProduit(p);
		
	}

	@Override
	public List<Categorie> listCategories() {
		return dao.listCategories();
	}

	@Override
	public Categorie getCategorie(Long idCat) {
		
		return dao.getCategorie(idCat);
	}

	@Override
	public List<Produit> listProduits() {
		
		return dao.listProduits();
	}

	@Override
	public List<Produit> listProduitsParMotCle(String mc) {
		
		return dao.listProduitsParMc(mc);
	}

	@Override
	public List<Produit> listProduitsSelectionnes() {
		
		return dao.listProduitsSelectionnes();
	}

	@Override
	public List<Produit> listProduitsParCategorie(Long idCat) {
		
		return dao.listProduitsParCategorie(idCat);
	}

	@Override
	public Produit getProduit(Long idPro) {
		// TODO Auto-generated method stub
		return dao.getProduit(idPro);
	}

	@Override
	public Commande enrigistrerCommande(Panier p, Client c) {
		// TODO Auto-generated method stub
		return dao.enrigistrerCommande(p, c);
	}

	@Override
	public Long ajouterCategorie(Categorie c) {
		// TODO Auto-generated method stub
		return dao.ajouterCategorie(c);
	}

	@Override
	public void supprimerCategorie(Long idCat) {
		// TODO Auto-generated method stub
		dao.supprimerCategorie(idCat);
	}

	@Override
	public void modifierCategorie(Categorie c) {
		// TODO Auto-generated method stub
		dao.modifierCategorie(c);
	}

	@Override
	public void ajouterUser(User u) {
		// TODO Auto-generated method stub
		dao.ajouterUser(u);
	}

	@Override
	public void attribueRole(Role r, Long userID) {
		// TODO Auto-generated method stub
		dao.attribuerRole(r, userID);
	}
	
	

}
