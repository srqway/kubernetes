package idv.hsiehpinghan.springbootstarterwebkubernetes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import idv.hsiehpinghan.springbootstarterwebkubernetes.entity.CrudEntity;
import idv.hsiehpinghan.springbootstarterwebkubernetes.repository.CrudRepository;

@Service
@Transactional
public class CrudService {
	@Autowired
	private CrudRepository repository;

	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	public List<CrudEntity> findAll() {
		return repository.findAll();
	}

	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	public CrudEntity getOne(Integer id) {
		return repository.getOne(id);
	}

	public void save(CrudEntity entity) {
		Integer id = entity.getId();
		CrudEntity oldEntity = repository.getOne(id);
		if (oldEntity != null) {
			throw new RuntimeException(String.format("oldEntity(%s) exists !!!", oldEntity));
		}
		repository.save(entity);
	}

	public void update(CrudEntity entity) {
		Integer id = entity.getId();
		CrudEntity oldEntity = repository.getOne(id);
		if (oldEntity == null) {
			throw new RuntimeException(String.format("entity(%s) not exists !!!", entity));
		}
		repository.save(entity);
	}

	public void delete(Integer id) {
		CrudEntity oldEntity = repository.getOne(id);
		if (oldEntity == null) {
			throw new RuntimeException(String.format("oldEntity(%s) not exists !!!", oldEntity));
		}
		repository.deleteById(id);
	}
}