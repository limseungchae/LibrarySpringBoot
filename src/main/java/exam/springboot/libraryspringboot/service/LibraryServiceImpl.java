package exam.springboot.libraryspringboot.service;

import exam.springboot.libraryspringboot.dao.LibraryDAO;
import exam.springboot.libraryspringboot.model.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("lbsrv")
public class LibraryServiceImpl implements LibraryService{

    @Autowired
    LibraryDAO lbdao;

    @Override
    public List<Library> readLibrary(int cpg) {
        return lbdao.selectLibrary(cpg - 1);
    }
}
