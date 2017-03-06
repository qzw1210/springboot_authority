package net.sppan.base.service.support;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

import java.io.Serializable;
import java.util.List;

public interface IBaseService<T, ID extends Serializable> {
    public abstract T find(ID id);

    public abstract List<T> findAll();

    public abstract List<T> findList(ID[] ids);

    public abstract List<T> findList(Iterable<ID> ids);

    public abstract Page<T> findAll(Pageable pageable);

    public abstract Page<T> findAll(Specification<T> spec, Pageable pageable);

    public abstract long count();

    public abstract long count(Specification<T> spec);

    public abstract boolean exists(ID id);

    public abstract void save(T entity);

    public abstract T update(T entity);

    public abstract void delete(ID id);

    public abstract void deleteByIds(@SuppressWarnings("unchecked") ID... ids);

    public abstract void delete(T[] entitys);

    public void delete(Iterable<T> entitys);

    public abstract void delete(T entity);

    public List<T> findList(Specification<T> spec, Sort sort);
}