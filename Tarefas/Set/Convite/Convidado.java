package Tarefas.Set.Convite;

public class Convidado {
    private String nome;
    private int codConvite;

    
    public Convidado(String nome, int codConvite) {
        this.nome = nome;
        this.codConvite = codConvite;
    }

    public String getNome() {
        return this.nome;
    }


    public int getCodConvite() {
        return this.codConvite;
    }

    
   @Override
   public boolean equals(Object obj) {
        if (this == obj) return true;
        if(!(obj instanceof Convidado convidado)) return false;
        
       return getCodConvite() == convidado.getCodConvite();
   }

   @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + getCodConvite();
        return result;
    }


    @Override
    public String toString() {
        return "Convidado {" +
            " nome='" + getNome() + "'" +
            ", codConvite='" + getCodConvite() + "'" +
            "}";
    }


    
}
