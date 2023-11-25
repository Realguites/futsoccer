package org.acme.resource;

import java.util.List;
import org.acme.model.Equipe;
import org.acme.service.EquipeService;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/equipes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EquipeResource {

    @Inject
    EquipeService equipeService;

    @GET
    public List<Equipe> getEquipes() {
        return equipeService.getAllEquipes();
    }

    @GET
    @Path("/{id}")
    public Equipe getEquipeById(@PathParam("id") Long id) {
        return equipeService.getEquipeById(id);
    }

    @POST
    public void createEquipe(Equipe equipe) {
        equipeService.createEquipe(equipe);
    }

    @PUT
    @Path("/{id}")
    public void updateEquipe(@PathParam("id") Long id, Equipe equipe) {
        equipeService.updateEquipe(id, equipe);
    }

    @DELETE
    @Path("/{id}")
    public void deleteEquipe(@PathParam("id") Long id) {
        equipeService.deleteEquipe(id);
    }
}