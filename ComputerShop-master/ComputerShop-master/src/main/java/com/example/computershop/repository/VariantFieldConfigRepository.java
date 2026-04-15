package com.example.computershop.repository;

import com.example.computershop.entity.VariantFieldConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VariantFieldConfigRepository extends JpaRepository<VariantFieldConfig, String> {
    List<VariantFieldConfig> findByIsActiveTrueOrderByDisplayOrder();
    boolean existsByFieldKey(String fieldKey);
    List<VariantFieldConfig> findAllByOrderByDisplayOrder();
} 