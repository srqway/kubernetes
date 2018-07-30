package idv.hsiehpinghan.springbootstarterwebkubernetes.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
	public Optional<CrudEntity> getOne(Integer id) {
		return repository.findById(id);
	}

	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	public boolean existsById(Integer id) {
		return repository.existsById(id);
	}

	public void save(CrudEntity entity) {
		Integer id = entity.getId();
		Optional<CrudEntity> oldEntity = repository.findById(id);
		if (oldEntity.isPresent() == true) {
			throw new RuntimeException(String.format("oldEntity(%s) exists !!!", oldEntity));
		}
		repository.save(entity);
	}

	public void update(CrudEntity entity) {
		Integer id = entity.getId();
		Optional<CrudEntity> oldEntity = repository.findById(id);
		if (oldEntity.isPresent() == false) {
			throw new RuntimeException(String.format("entity(%s) not exists !!!", entity));
		}
		repository.save(entity);
	}

	public void delete(Integer id) {
		Optional<CrudEntity> oldEntity = repository.findById(id);
		if (oldEntity.isPresent() == false) {
			throw new RuntimeException(String.format("oldEntity(%s) not exists !!!", oldEntity));
		}
		repository.deleteById(id);
	}

	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	public Page<CrudEntity> findAll(Pageable pageable) {
		return repository.findAll(pageable);
	}
}