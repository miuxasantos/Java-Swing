/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho;

/**
 *
 * @author miuxa
 */
public class Aluno implements Comparable<Aluno> {
    
    private String nome;
    private Double notaUm;
    private Double notaDois;
    private Double media;
    private String situacao;
    
    public Aluno(String nome, Double notaUm, Double notaDois) {
		super();
		this.nome = nome;
		this.notaUm = notaUm;
		this.notaDois = notaDois;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getNotaUm() {
		return notaUm;
	}
	public void setNotaUm(Double notaUm) {
		this.notaUm = notaUm;
	}
	
	public Double getNotaDois() {
		return notaDois;
	}
	public void setNotaDois(Double notaDois) {
		this.notaDois = notaDois;
	}
	
	public Double getMedia() {
		return media;
	}
	public void setMedia(Double media) {
		this.media = media;
	}
	
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	@Override
	public String toString() {
		return "Aluno nome" + nome + ", notaUm" + notaUm + ", notaDois" + notaDois + ", media "
				+ media + ", situação " + situacao;
	}
	
	public int compareTo(Aluno aluno) {
		return nome.compareTo(aluno.getNome());
	}
	
	public void calculaMedia() {
		media = (notaUm + notaDois) / 2;
	}
	
	public void aprovado() {
            if(media >= 60) {
		this.situacao = "aprovado";
            } else {
		this.situacao = "reprovado";
            }
        }
        
        
}
