package br.edu.ifpb.pos.service;

import br.edu.ifpb.pos.entity.Pessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by natarajan on 18/10/16.
 */
public class PessoaService {

    private static List<Pessoa> pessoas;

    private static PessoaService ourInstance = new PessoaService();

    public static PessoaService getInstance() {

        return ourInstance;
    }

    private PessoaService() {

        if (this.pessoas == null) {
            this.pessoas = new ArrayList<Pessoa>();
        }
    }

    public void add (Pessoa p){
        this.pessoas.add(p);
    }

    public List<Pessoa> getAll(){
        return Collections.unmodifiableList(this.pessoas);
    }

}
