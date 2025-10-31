package entities;

import java.util.Objects;

public class ApiVotacao {
	private String name;
	private Integer quantity;
	
	ApiVotacao(){
		
	}

	public ApiVotacao(String name, Integer quantity) {
		this.name = name;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApiVotacao other = (ApiVotacao) obj;
		return Objects.equals(name, other.name);
	}

}
