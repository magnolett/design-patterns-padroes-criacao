package ObjectPool;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioPool implements Pool<Funcionario> {
	private List<Funcionario> funcionarios;

	
	public FuncionarioPool() {
		this.funcionarios = new ArrayList<Funcionario>();
		this.funcionarios.add(new Funcionario("Jaderson Berti"));
		this.funcionarios.add(new Funcionario("Deivide Possamai"));
		this.funcionarios.add(new Funcionario("Carlos Bonatti"));
		this.funcionarios.add(new Funcionario("Augusto Vieira"));
		this.funcionarios.add(new Funcionario("Marcelo Barbosa"));
		
	}
	
	public Funcionario acquire() {
		if(this.funcionarios.size() > 0) {
			return this.funcionarios.remove(0);
		}
		else {
			return null;
		}
	}

	public void release(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
	}
}
