package idv.hsiehpinghan.springbootstarterwebkubernetes.criteria;

public class CrudUpdateCriteria {
	private String string;

	public CrudUpdateCriteria() {
		super();
	}

	public CrudUpdateCriteria(String string) {
		super();
		this.string = string;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	@Override
	public String toString() {
		return "CrudUpdateCriteria [string=" + string + "]";
	}

}
