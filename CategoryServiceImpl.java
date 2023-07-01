package com.system.Fashionhive.services.impl;

import com.system.Fashionhive.entity.Category;

import com.system.Fashionhive.repo.CategoryRepo;
import com.system.Fashionhive.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepo categoryRepo;

    @Override
    public List<Category> fetchAll() {
        return categoryRepo.findAll();
    }

