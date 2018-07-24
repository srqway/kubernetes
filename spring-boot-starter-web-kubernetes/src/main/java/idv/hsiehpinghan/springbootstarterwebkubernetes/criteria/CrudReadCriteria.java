package idv.hsiehpinghan.springbootstarterwebkubernetes.criteria;

public abstract class CrudReadCriteria {
	private int pageSize;

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	@Override
	public String toString() {
		return "CrudReadCriteria [pageSize=" + pageSize + "]";
	}

}
