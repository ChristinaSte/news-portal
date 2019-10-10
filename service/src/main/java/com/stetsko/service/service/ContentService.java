package com.stetsko.service.service;

import com.querydsl.core.types.Predicate;
import com.stetsko.database.dto.ContentDto;
import com.stetsko.database.entity.Content;
import com.stetsko.database.repository.ContentRepository;
import com.stetsko.service.mapper.ContentMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Service
@Transactional
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ContentService {

    private ContentRepository contenrRepository;
    private ContentMapper contentMapper;

    public Optional<ContentDto> findById(Long id) {
        Optional<Content> content = contenrRepository.findById(id);
        ContentDto contentDto = content.map(contentMapper::toContentDto).orElse(null);
        return Optional.ofNullable(contentDto);
    }

    public List<ContentDto> findAll() {
        Iterable<Content> iterable = contenrRepository.findAll();
        Stream<Content> stream = StreamSupport.stream(iterable.spliterator(), false);
        return stream.map(contentMapper::toContentDto).collect(Collectors.toList());
    }

    public List<ContentDto> findAll(Predicate predicate, Pageable pageable) {
        Page<Content> page = contenrRepository.findAll(predicate, pageable);
        return page.stream().map(contentMapper::toContentDto).collect(Collectors.toList());
    }
}