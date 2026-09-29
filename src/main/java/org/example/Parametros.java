package org.example;

public class Parametros {

    private Parametros() {};

    private static Parametros instance = new Parametros();

    public static Parametros getInstance() {
        return instance;
    }

    private String empresa;
    private String usuarioLogado;

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(String usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }
}