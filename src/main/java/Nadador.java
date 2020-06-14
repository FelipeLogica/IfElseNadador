/**
 * @author Felipe Voigt
 * @version 1.0
 * @since 11/06/2020 - 21:02
 * @category Model
 */
public class Nadador {

    private String nome;
    private int idade;

    public Nadador() {
    }

    /**
     *
     * @param nome Recebe o nome do nadador
     * @param idade Recebe a idade Do nadador
     */
    public Nadador(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return Retorna se o usuario pode nadar ou não,
    e o coloca em uma categoria
     */
    public String verificarIdade() {
        if(this.idade <8){
            return "Muito novo para nadar.";
        } else if(this.idade >=8 && this.idade <=10) {
            return "Apto para natação infantil.";
        } else if(this.idade >=11 && this.idade <=17) {
            return "Apto para natação juvenil.";
        } else if(this.idade >=18 && this.idade <109) {
            return "Apto para natação adulta.";
        } else if(this.idade >=109) {
            return "Idade inválida.";
        } {
            return "Idade inválida";
        }
    }

    @Override
    public String toString() {
        return "\nNome do nadador: " + this.nome
                +"\nIdade do nadador: " + this.idade
                +"\nSituação: " + this.verificarIdade()
                ;
    }
}
