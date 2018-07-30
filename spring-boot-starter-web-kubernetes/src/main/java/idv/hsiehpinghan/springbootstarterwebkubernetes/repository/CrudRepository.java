package idv.hsiehpinghan.springbootstarterwebkubernetes.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import idv.hsiehpinghan.springbootstarterwebkubernetes.entity.CrudEntity;

public interface CrudRepository extends PagingAndSortingRepository<CrudEntity, Integer> {
}
