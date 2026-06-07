package com.mycompany.javapoo;

 public class ContaBancaria {
 protected String tipo;
 public String numero;
 private float saldo;
 private String nome;
 private boolean status;
    public ContaBancaria(){
        this.status = false;
        this.saldo = 0.0f;
    }
    public void EstadoAtual(){
        if (this.getStatus() == true){
            System.out.println ("\n conta de "+this.getNome()+" \n");
            if("cc".equals(tipo)){
                System.out.println("Conta corrente");
            }
            else{
                System.out.println("Conta poupança");
            }
            System.out.println("Numero:\n"+this.getNumero());
            System.out.println("saldo:\n"+this.getSaldo());
        }
    }
    public void AbrirConta(String nome1,String contatipo){
        this.setStatus(true);
        this.getNumero();
        this.setNome(nome1);
        this.setTipo(contatipo);
        if("cc".equals(contatipo)) {
            this.setSaldo(50);
        }
        else if("cp".equals(contatipo)){
            this.setSaldo(150);
        }
          System.out.println("Parabens "+this.getNome()+ " conta aberta com sucesso \n");
     
        
    }
   
    
    public void fecharConta(){
        if (this.getSaldo() < 0){
            System.out.println("nao e possivel fechar a conta pois ha um debito a ser quitado");  
        }
        else{
            this.setStatus(false);
            System.out.println("conta fechada");
        }
    }
    public void depositar(float valor){
        if (this.getStatus() == true){
            this.setSaldo(this.getSaldo() + valor) ;
            System.out.println ("deposito realizado,novo saldo da conta:" + this.getSaldo());
        } 
        else {System.out.println("conta inexistente");}
    }
    public void sacar(float valor){
        if (this.getStatus() == true){
            if(this.getSaldo()>=valor){
                this.setSaldo(this.getSaldo()-valor);
                System.out.println("\nsaque realizado, novo saldo:\n"+this.getSaldo());
            }
            else {System.out.println ("valor insuficiente");}
        }
        else{System.out.print("conta inexistente");}
    }
    public void pagarmensal(){
        if("cc".equals(this.getTipo())){
            this.setSaldo (this.getSaldo()-12);
        }  
        else if("cp".equals(tipo)){
            this.setSaldo (this.getSaldo() - 20);
        }
     System.out.println("pagamento mensal da conta de "+this.getNome()+ " realizado ");
    }
 
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo (String t){
        this.tipo =t;
    }
 
    public String getNumero(){ 
        int i = (int)(1000000 * Math.random());
        this.numero = Integer.toString(i);
        return this.numero;
    }
    public void setNumero(String n){
        this.numero = n;
    }
 
    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float s){
        this.saldo = s;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public boolean getStatus(){
        return this.status;
    }
    public void setStatus (boolean sta){
        this.status = sta;
    }
}