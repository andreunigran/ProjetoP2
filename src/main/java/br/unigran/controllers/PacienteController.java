package br.unigran.controllers;

import br.unigran.dto.DTO;
import br.unigran.dto.PacienteDTO;
import br.unigran.models.Paciente;
import java.util.List;
import br.unigran.persistencia.paciente.PacienteDao;
import br.unigran.persistencia.paciente.PacienteImpl;
import java.text.SimpleDateFormat;

public class PacienteController implements Controller {

    PacienteDao dao = new PacienteImpl();

    @Override
    public void salvar(DTO paciente) throws Exception {

        dao.atualiza(paciente.builder());
    }
   
    @Override
    public String[] getTitulosColunas() {
        return new String[]{"Nome","Data de Nascimento"};
    }

    @Override
    public Object[] getDados(DTO o) {
        PacienteDTO dto = (PacienteDTO) o;
        return new Object[]{dto.nomePaciente, new SimpleDateFormat("dd/MM/yyyy").format(dto.data)};
    }

    @Override
    public List getListaDados() {
        List<Paciente> dados = dao.listar();
        PacienteDTO pacienteionarioDTO = new PacienteDTO();
        return pacienteionarioDTO.getListaDados(dados);
    }

    @Override
    public void remover(DTO dto) {
        dao.remove(((PacienteDTO) dto).builder());
    }
}
