package desafio.dominio;

public class Curso {
    private String titulo;
    private String descricao;
    private int cargaHorária;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHorária() {
        return cargaHorária;
    }

    public void setCargaHorária(int cargaHorária) {
        this.cargaHorária = cargaHorária;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo = '" + titulo + '\'' +
                ", descricao = '" + descricao + '\'' +
                ", cargaHorária = " + cargaHorária +
                '}';
    }
}
