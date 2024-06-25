package projet.pfe.smartop.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import projet.pfe.smartop.entites.Utilisateur;

public interface UtilisateurDAO extends JpaRepository<Utilisateur,Integer> {
}
