package exam.springboot.libraryspringboot.service;

import exam.springboot.libraryspringboot.dao.LibraryDAO;
import exam.springboot.libraryspringboot.model.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("lbsrv")
public class LibraryServiceImpl implements LibraryService{

    @Autowired
    LibraryDAO lbdao;

    @Override
    public Map<String, Object> readLibrary(int cpg) {
        return lbdao.selectLibrary(cpg - 1);
    }

    /*@Override
    public int countLibrary() {
        return  lbdao.countLibrary();
    }*/
}
