package exam.springboot.libraryspringboot.dao;

import exam.springboot.libraryspringboot.model.Library;

import java.util.List;
import java.util.Map;

public interface LibraryDAO {

    Map<String, Object> selectLibrary(int cpg);
    //int countLibrary();
}
