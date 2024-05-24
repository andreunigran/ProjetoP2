
package br.unigran.persistencia.paciente;

import br.unigran.models.Paciente;
import java.util.List;

/**
 *
 * @author andre
 */
public class PacienteImpl implements PacienteDao {

    @Override
    public List<Paciente> listar() {

        return listar(Paciente.class);
    }

}
