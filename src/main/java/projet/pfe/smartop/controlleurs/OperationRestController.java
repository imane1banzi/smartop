package projet.pfe.smartop.controlleurs;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import projet.pfe.smartop.dtos.OperationDTO;
import projet.pfe.smartop.dtos.UtilisateurDTO;
import projet.pfe.smartop.services.IOperationservice;

import java.util.ArrayList;
import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("SmartOP/")
@Slf4j
@RequiredArgsConstructor
public class OperationRestController {

    private final IOperationservice iOperationservice;

    @PostMapping("nouvelleOP")
    void creerNouvelleOP(@RequestBody OperationDTO operationDTO){

        OperationDTO operation = iOperationservice.addOP(operationDTO);
    }
    @GetMapping("listOP")
    public List<OperationDTO> getListOP() {
        log.info("Liste OP ");
        return new ArrayList<>(this.iOperationservice.getOP());

    }
    @PutMapping("updateOP")
    void updateuser(@RequestBody OperationDTO operationDTO, @RequestParam Integer id){
        OperationDTO operation = iOperationservice.updateOP(id,operationDTO);
    }

    @GetMapping("findOPbyIDOP")
    public OperationDTO getListOPBYID(@RequestParam Integer id) {
        log.info("Liste OP ");
        return this.iOperationservice.findOPbyIDOP(id);

    }
    @GetMapping("findOPbydemandeur")
    public OperationDTO getListOPBYDemandeur(@RequestParam String demandeur) {
        log.info("Liste OP ");
        return this.iOperationservice.findOPbydemandeur(demandeur);

    }

    @GetMapping("findOPbycategorie")
    public OperationDTO getListOPBYcategorie(@RequestParam String categorie) {
        log.info("Liste OP ");
        return this.iOperationservice.findOPbycategorieop(categorie);

    }
    @DeleteMapping("deleteOP")
    public String deleteOP(@RequestParam Integer id) {
        return this.iOperationservice.deleteOP(id);

    }
}
