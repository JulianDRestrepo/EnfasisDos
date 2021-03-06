package udem.edu.co.controller;

import java.io.Serializable;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import udem.edu.co.entities.Users;

@Named
@ViewScoped
public class PlantillaController implements Serializable{
    
    public void verificarSesion(){
        try {
            Users us = (Users) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
            
            if (us == null) {
                FacesContext.getCurrentInstance().getExternalContext().redirect("permisos");
            }
            
        } catch (Exception e) {
            //error
        }
    }
}
