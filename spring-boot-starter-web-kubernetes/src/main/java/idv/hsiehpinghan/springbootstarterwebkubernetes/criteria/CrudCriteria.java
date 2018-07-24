package idv.hsiehpinghan.springbootstarterwebkubernetes.criteria;

public abstract class CrudCriteria {
	private Integer id;
	private String string;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	@Override
	public String toString() {
		return "CrudCriteria [id=" + id + ", string=" + string + "]";
	}

}
