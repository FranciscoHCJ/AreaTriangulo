package control;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

/** * @author FranciscoHC */
@Named(value = "ctrlArea")
@RequestScoped
public class CtrlArea {
    
    private float areaTriangulo;
    private int base;
    private int altura;

    public float getAreaTriangulo() {
        return areaTriangulo;
    }

    public void setAreaTriangulo(float areaTriangulo) {
        this.areaTriangulo = areaTriangulo;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void calcularArea() {
        
        setAreaTriangulo((float) getBase() * getAltura() / 2);
        
        final String resultado = "El área del triangulo es: " +getAreaTriangulo(); 
        
        FacesContext.getCurrentInstance()
                .addMessage(null, new FacesMessage(resultado));
    }
    
}
