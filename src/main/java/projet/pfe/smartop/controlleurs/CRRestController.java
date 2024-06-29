package projet.pfe.smartop.controlleurs;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import projet.pfe.smartop.dtos.CRDTO;
import projet.pfe.smartop.services.ICRservice;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("SmartOP/")
@Slf4j
@RequiredArgsConstructor
public class CRRestController {
    private final ICRservice icRservice;

    @PostMapping("nouveauCR")
    void creerNouveauCR(@RequestBody CRDTO crdto){

        CRDTO cr = icRservice.addCR(crdto);
    }

    @GetMapping("listCR")
    public List<CRDTO> getListCR() {
        log.info("Liste CR ");
        return new ArrayList<>(this.icRservice.getCR());

    }
    @PutMapping("updateCR")
    void updateCR(@RequestBody CRDTO crdto, @RequestParam Integer id){
        CRDTO cr = icRservice.updateCR(id,crdto);
    }

    @GetMapping("findCRbyIDOP")
    public List<CRDTO> getListCRBYID(@RequestParam Integer id) {
        log.info("Fetching CR list for operation ID: {}", id);
        List<CRDTO> crList = this.icRservice.findCRbyIDOP(id);
        log.info("Fetched {} CR(s) for operation ID: {}", crList.size(), id);
        return new ArrayList<>(crList);

    }
    @GetMapping("findCRbydemandeur")
    public List<CRDTO> getListCRBYdemandeur(@RequestParam String demandeur) {
        log.info("Fetching CR list for operation demandeur: {}", demandeur);
        List<CRDTO> crList = this.icRservice.findCRbydemandeur(demandeur);
        log.info("Fetched {} CR(s) for operation demandeur: {}", crList.size(), demandeur);
        return new ArrayList<>(crList);

    }
    @GetMapping("findCRbycategorie")
    public List<CRDTO> getListCRBYcategorie(@RequestParam String categorie) {
        log.info("Fetching CR list for operation categorie: {}", categorie);
        List<CRDTO> crList = this.icRservice.findCRbycategorieop(categorie);
        log.info("Fetched {} CR(s) for operation categorie: {}", crList.size(), categorie);
        return new ArrayList<>(crList);

    }
    @DeleteMapping("deleteCR")
    public String deleteCR(@RequestParam Integer id) {
        return this.icRservice.deleteCR(id);

    }
}
