package ArrayList;


/**
 * guardar os nomes de pessoas
 * 
 * @author RND
 * @version 2011
 */
import java.lang.System.*;
import java.util.*;

public class ArrayLPessoas{
  private String nmpessoa; 
  
  private ArrayList<String> pessoas; 
 
  //construtore sem parametros
  public ArrayLPessoas() {
      this.nmpessoa="";
      this.pessoas = new ArrayList();
  }
  
  //segundo construtor com parametros
  public ArrayLPessoas(String nm, String item) {
      this.nmpessoa=nm;  
      if (item != null) {
       for (int i=0; i<pessoas.size(); i++) {
           this.pessoas.add(item);
        }
       }
  } 
  
  //este tipo de construtor pode ser util para o clone
 // public Produto(Produto p) {
//   this(p.getCodigo(),p.getNome(), p.getQuant(), 
//        p.getPCompra(), p.getPVenda(), p.getMinimo());
//   } 
 
    
  //outra forma do segundo construtor com parametros
//  public ArrayLPessoas(String nm,ArrayList item) {   
//      this.nmpessoa=nm;
//      this.pessoas.add(item); 
//    }
  
      
 
  
   
  public void criarNmPessoa(String nome){
   pessoas.add(nome);
  }      
  
  public void listarPessoas(){
   System.out.println("Lista de nomes");
    for (String nome : pessoas)
     System.out.println(nome);
  }  
 
  public void tamanhoDaLista(){
   int a = pessoas.size();
   System.out.println("A lista tem "+a+" nomes");
   System.out.println("==========================");
  }
  
  public void existe(String nome){
   int i=0;
    for (String nm : pessoas) {
     if (nm.contains(nome)==true) {
      i++;}
    }
    if (i==0)
     System.out.println("Não Existe");
    if (i>0)
    // System.out.println("existem  "+i+"ocorrencias do nome "+nome);
     System.out.println("nr de ocorrencias: " +i+ " do nome: " +nome);
  }

  public boolean userExist(String userName) {
   boolean valid = false;
   String temp = null;
   valid = pessoas.contains(userName);
  return valid;
  }
  
  public boolean ExistNome(String userName) {
      return pessoas.contains(userName);
  }
   
  public void existeUser(String nome) {
  int i=0;
    for (String profs : pessoas) {
       if (profs.contains(nome)==true) {
         i++;
        }
     }
    if (i==0) System.out.println("Não Existe");
    if (i>0)  System.out.println("Foram encontradas "+i+" ocorrencias do nome "+nome);
   }

   
 public void apagarTudo() {
  pessoas.clear(); 
  System.out.println("Todos os registos foram apagados");
 }
 
 public void apagaElemento(String nome) { 
   pessoas.remove(nome);
 }

 public void verificarVazio() {
  if (pessoas.isEmpty()==true) System.out.println("Está Vazio");
   else if (pessoas.isEmpty()==false) System.out.println("Não está vazio");
   }
  
 
  
  //toString --converte para uma represenacao textual
  public String toString() {       
   StringBuilder sb = new StringBuilder("Pessoas:");
   for (String lista : pessoas) {
       sb.append(lista);
       sb.append("\t");
    }   
    return sb.toString();
  }
        
  //clone --Cria e devolve uma copia 
  public ArrayLPessoas clone() { 
    return new ArrayLPessoas(); 
  } 
     
 //class teste
  public static void main(String[] args) {
   ArrayLPessoas p1,p2,p3;
   boolean ii,ee,dd;
   p1=new ArrayLPessoas();
   
   //adicionar Pessoas
   p1.criarNmPessoa("aaa");  
   p1.criarNmPessoa("bbb");  
   p1.criarNmPessoa("ccc");  
   p1.criarNmPessoa("ddd");  
   p1.criarNmPessoa("eee");
   //Listar Pessoas
   p1.listarPessoas();  
   //verifica de vazio
   p1.verificarVazio();
   //tamanho da lista
   p1.tamanhoDaLista();
   //verifica de existe pessoa

   System.out.println("=================");
   
   ii=p1.userExist("aaa");
   ee=p1.ExistNome("ccc");
   dd=p1.userExist("ggg");
   
    System.out.println("existe pessoa aaa :" + ii);
    System.out.println("existe pessoa ccc :" + ee);
    System.out.println("existe pessoa ggg :" + dd);
    
   System.out.println("=================");
   
   //--------------------
   p1.existeUser("aaa");
   
   //apaga um elemento
   p1.apagaElemento("eee");
   System.out.println("=================");
   System.out.println("elemento eee removido");
   System.out.println("============");
   //Listar Pessoas
   p1.listarPessoas(); 
 
    
  
  }
  
}  
  