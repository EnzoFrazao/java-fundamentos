class Solicitacao {
    private static int contadorId = 1;
    private final int id;
    private String descricao;
    private String status;
    private String responsavel;

    public Solicitacao(String descricao) {
        this.id = contadorId++;
        this.descricao = descricao;
        this.status = "Pendente";
        this.responsavel = "Não atribuído";
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Descrição: " + descricao + ", Status: " + status + ", Responsável: " + responsavel;
    }
}

