package idv.hsiehpinghan.springbootstarterwebkubernetes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import idv.hsiehpinghan.springbootstarterwebkubernetes.entity.CrudEntity;

public interface CrudRepository extends JpaRepository<CrudEntity, Integer> {
}
