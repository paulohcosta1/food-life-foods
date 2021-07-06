package com.foodlife.foodsservice.infra.db;

import com.foodlife.foodsservice.domain.models.Food;
import com.foodlife.foodsservice.domain.repositories.FoodRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class FoodRepositoryImpl implements FoodRepository {
    @Override
    public <S extends Food> S save(S s) {
        return null;
    }

    @Override
    public <S extends Food> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Food> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public List<Food> findAll() {
        return null;
    }

    @Override
    public Iterable<Food> findAllById(Iterable<String> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(Food food) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> iterable) {

    }

    @Override
    public void deleteAll(Iterable<? extends Food> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Food> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Food> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Food> S insert(S s) {
        return null;
    }

    @Override
    public <S extends Food> List<S> insert(Iterable<S> iterable) {
        return null;
    }

    @Override
    public <S extends Food> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Food> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Food> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Food> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Food> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Food> boolean exists(Example<S> example) {
        return false;
    }
}
