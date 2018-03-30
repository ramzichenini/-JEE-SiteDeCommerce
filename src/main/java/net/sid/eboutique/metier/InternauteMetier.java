package net.sid.eboutique.metier;

import java.util.List;

import net.sid.eboutique.entities.*;

public interface InternauteMetier {
	
	
	public List<Categorie> listCategories();
	public Categorie getCategorie(Long idCat);
	public List<Produit> listProduits();
	public List<Produit> listProduitsParMotCle(String mc);
	public List<Produit> listProduitsSelectionnes();
	public List<Produit> listProduitsParCategorie(Long idCat);
	public Produit getProduit(Long idPro);
	public Commande enrigistrerCommande(Panier p , Client c);

}
