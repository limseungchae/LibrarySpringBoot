package exam.springboot.libraryspringboot.service;

import exam.springboot.libraryspringboot.model.Library;

import java.util.List;

public interface LibraryService {

    List<Library> readLibrary(int cpg);

}
