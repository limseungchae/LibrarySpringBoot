package exam.springboot.libraryspringboot.dao;

import exam.springboot.libraryspringboot.model.Library;

import java.util.List;

public interface LibraryDAO {

    List<Library> selectLibrary(int cpg);

}
