package projet.pfe.smartop.services.impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import projet.pfe.smartop.dtos.CRDTO;
import projet.pfe.smartop.services.ICRservice;

import java.util.List;

@Service
@Slf4j
@Transactional
@RequiredArgsConstructor
public class ICRserviceimpl implements ICRservice {
    @Override
    public CRDTO addCR(CRDTO crdto) {
        return null;
    }

    @Override
    public CRDTO updateCR(Integer id, CRDTO crdto) {
        return null;
    }

    @Override
    public String deleteCR(Integer id) {
        return null;
    }

    @Override
    public CRDTO findCRbyIDOP(Integer id) {
        return null;
    }

    @Override
    public CRDTO findCRbydemandeur(String demandeur) {
        return null;
    }

    @Override
    public CRDTO findCRbycategorieop(String categorie) {
        return null;
    }

    @Override
    public List<CRDTO> getCR() {
        return null;
    }

    @Override
    public CRDTO exportCR() {
        return null;
    }
}
