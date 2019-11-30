import java.util.Map;

public interface AcademicoIF {

	public Aluno cadastrarALuno(String matricula, String cpf, String nome) throws CPFInvalidoException;
	
	public Map<String, Integer> boletim(String matricula, int ano, int bimestre, String curso) throws SemNotaException;

}
