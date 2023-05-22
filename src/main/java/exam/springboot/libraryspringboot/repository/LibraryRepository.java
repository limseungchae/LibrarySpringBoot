package exam.springboot.libraryspringboot.repository;

import exam.springboot.libraryspringboot.model.Library;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface LibraryRepository extends PagingAndSortingRepository<Library, Long> {

    Page findAll(Pageable paging);
}
