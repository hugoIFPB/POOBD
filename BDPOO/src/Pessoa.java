import java.util.Date;
import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Transient;

//@Inheritance(strategy=InheritanceType.JOINED)
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@Entity
public class Pessoa {

	@Id
	private Long id;
	@Column(nullable=false, length=50)
	private String nome;
	@Column(unique=true)
	private String cpf;
	private Date nascimento;
	@Transient
	private Integer idade;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
