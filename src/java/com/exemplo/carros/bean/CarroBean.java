package com.exemplo.carros.bean;

import com.exemplo.carros.dao.CarroDAO;
import com.exemplo.carros.entidade.Carro;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class CarroBean {
    
    private Carro carro = new Carro();
    private List<Carro> carros = new ArrayList<>();
    private CarroDAO carroDAO = new CarroDAO();
    
    public void adicionar(){
        carroDAO.salvar(carro);
        carro = new Carro();
    }
    
    public void listar(){
        carros = carroDAO.buscar();
    }
    
    public void editar(Carro c){
        carro = c;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

}
