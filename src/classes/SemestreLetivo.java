package classes;

import java.time.Month;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class SemestreLetivo {
    

    private int ano;
    private int semestre;
    private YearMonth  dataInicio;
    private YearMonth  dataFim;
    private List<Disciplina> listaDisciplina;

    //construtor iniciando um semestre, sem a lista das disciplinas
    public SemestreLetivo(int ano, int semestre, YearMonth dataIncio, YearMonth dataFim) {
        this.ano = ano;
        this.semestre = semestre;
        this.dataInicio = dataIncio;
        this.dataFim = dataFim;
        //cria lista de disciplinas deste semestre
        listaDisciplina = new LinkedList<>();
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public YearMonth getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(YearMonth dataInicio) {
        this.dataInicio = dataInicio;
    }

    public YearMonth getDataFim() {
        return dataFim;
    }

    public void setDataFim(YearMonth dataFim) {
        this.dataFim = dataFim;
    }

    public List<Disciplina> getListaDisciplina() {
        return listaDisciplina;
    }

    public void setListaDisciplina(List<Disciplina> listaDisciplina) {
        this.listaDisciplina = listaDisciplina;
    }
    
    public LinkedList getNomeDisciplina(){
        LinkedList nomes = new LinkedList();
        for (Disciplina disciplina : listaDisciplina) {
             nomes.add(disciplina.getNome());
        }
        return nomes;
    }

    @Override
    public String toString() {
        return "SemestreLetivo{" + "ano=" + ano + ", semestre=" + semestre + ", dataInicio=" + dataInicio + ", dataFim=" + dataFim + ", listaDisciplina=" + listaDisciplina + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SemestreLetivo other = (SemestreLetivo) obj;
        if (this.ano != other.ano) {
            return false;
        }
        if (this.semestre != other.semestre) {
            return false;
        }
        if (!Objects.equals(this.dataInicio, other.dataInicio)) {
            return false;
        }
        if (!Objects.equals(this.dataFim, other.dataFim)) {
            return false;
        }
        return Objects.equals(this.listaDisciplina, other.listaDisciplina);
    }
    
}
