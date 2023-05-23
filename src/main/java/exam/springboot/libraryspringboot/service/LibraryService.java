package exam.springboot.libraryspringboot.service;

import exam.springboot.libraryspringboot.model.Library;

import java.util.List;
import java.util.Map;

public interface LibraryService {

    Map<String, Object> readLibrary(int cpg);
    // int countLibrary();

}
