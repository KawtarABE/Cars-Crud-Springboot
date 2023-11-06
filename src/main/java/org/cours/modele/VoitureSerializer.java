package org.cours.modele;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;

@JsonComponent
public class VoitureSerializer extends JsonSerializer<Voiture> {

    @Override
    public void serialize(Voiture voiture, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        // Customize the serialization of the Voiture entity here.
        // You can access the properties of the Voiture and explicitly write them to the JSON generator.
        jsonGenerator.writeStartObject();
        jsonGenerator.writeNumberField("id", voiture.getId());
        jsonGenerator.writeStringField("annee", String.valueOf(voiture.getAnnee()));
        jsonGenerator.writeStringField("couleur", voiture.getCouleur());
        jsonGenerator.writeStringField("immatricule", voiture.getImmatricule());
        jsonGenerator.writeStringField("marque", voiture.getMarque());
        jsonGenerator.writeStringField("modele", voiture.getModele());
        jsonGenerator.writeNumberField("prix", voiture.getPrix());

        // If you have more properties, add them here.

        jsonGenerator.writeEndObject();
    }
}
