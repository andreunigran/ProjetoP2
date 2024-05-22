package br.unigran.controllers;

import br.unigran.dto.FuncionarioDTO;
import br.unigran.models.Funcionario;
import br.unigran.persistencia.funcionario.FuncionarioDao;
import br.unigran.persistencia.funcionario.FuncionarioImpl;
import org.json.JSONObject;


public class FuncionarioController {
    
    FuncionarioDao dao = new FuncionarioImpl();
    public void salvar(FuncionarioDTO func) throws Exception{
        
        dao.salvar(func.builder());
        
        
        
    }

     public void salvar(String[] func) throws Exception{
        
        dao.salvar(builder(func));
        
        
    }
     
     public void salvar(JSONObject func) throws Exception{
        
        dao.salvar(builderJSOn(func));
        
        
    }
     
     
    
    private Funcionario builder(String[] valores) throws Exception {
        
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(valores[0]);
        
        
        if(funcionario.getNome()==null){
            throw new Exception("Nome invalido");
        }
        return funcionario;

    }

    private Object builderJSOn(JSONObject func) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(func.get("nome").toString());
            
        return func;
            
    }
}
