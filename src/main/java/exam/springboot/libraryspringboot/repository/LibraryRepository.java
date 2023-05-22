package exam.springboot.libraryspringboot.repository;

import exam.springboot.libraryspringboot.model.Library;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface LibraryRepository extends PagingAndSortingRepository<Library, Long> {

    Page findAll(Pageable paging);

    @Query("select ceil(count(lbno)/25) from Library")
    int countLibrariesBy();
}
