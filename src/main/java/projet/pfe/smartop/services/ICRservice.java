package projet.pfe.smartop.services;

import projet.pfe.smartop.dtos.CRDTO;
import projet.pfe.smartop.dtos.OperationDTO;
import projet.pfe.smartop.dtos.UtilisateurDTO;

import java.util.List;

public interface ICRservice {
    CRDTO addCR(CRDTO crdto);
    CRDTO updateCR(Integer id,CRDTO crdto);
    String deleteCR(Integer id);
    CRDTO findCRbyIDOP(Integer id);
    CRDTO findCRbydemandeur(String demandeur);
    CRDTO findCRbycategorieop(String categorie);
    List<CRDTO> getCR();
    CRDTO exportCR();
}
