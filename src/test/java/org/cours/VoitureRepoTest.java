package org.cours;

import static org.assertj.core.api.Assertions.assertThat;

import org.cours.modele.Proprietaire;
import org.cours.modele.ProprietaireRepo;
import org.cours.modele.Voiture;
import org.cours.modele.VoitureRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;

@DataJpaTest
public class VoitureRepoTest {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    VoitureRepo voitureRepo;

    @Autowired
    ProprietaireRepo proprietaireRepo;

    @Test
    public void ajouterVoiture() {
        Proprietaire proprietaire = new Proprietaire("John", "Doe");
        proprietaireRepo.save(proprietaire);
        Voiture voiture = new Voiture("MiolaCar", "Uber", "Blanche", "M-2020", 2021, 180000, proprietaire);
        voitureRepo.save(voiture); // Persist the Voiture object

    }
    @Test
    public void supprimerVoiture() {
        Proprietaire proprietaire = new Proprietaire("John", "Doe");
        proprietaireRepo.save(proprietaire);
        voitureRepo.save(new Voiture("MiolaCar", "Uber", "Blanche", "M-2020", 2021, 180000, proprietaire));
        voitureRepo.save(new Voiture("MiniCooper", "Uber", "Rouge", "C-2020", 2021, 180000, proprietaire));
        voitureRepo.deleteAll();

    }
}
