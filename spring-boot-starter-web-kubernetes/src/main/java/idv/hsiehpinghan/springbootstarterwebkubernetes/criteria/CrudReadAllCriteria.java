package idv.hsiehpinghan.springbootstarterwebkubernetes.criteria;

import java.util.List;

import org.springframework.data.domain.Sort.Direction;

public class CrudReadAllCriteria {
	private int page;
	private int size;
	private List<Direction> directions;
	private List<String> properties;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public List<Direction> getDirections() {
		return directions;
	}

	public void setDirections(List<Direction> directions) {
		this.directions = directions;
	}

	public List<String> getProperties() {
		return properties;
	}

	public void setProperties(List<String> properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "CrudReadAllCriteria [page=" + page + ", size=" + size + ", directions=" + directions + ", properties="
				+ properties + "]";
	}

}
