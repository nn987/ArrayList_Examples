package ArrayList;

 /**
* Programa que usa uma ArrayList para guardar os nomes
* dos professores.
* Permite a utilização de vários métodos nessa
* ArrayList.
*
* @author 
* @version 1.0
*/
import java.util.*;
import static java.lang.System.out; 

public class List
{
//Declaração da ArrayList
ArrayList<String> professores = new ArrayList<String>();
//Adiciona 3 professores à lista
public void adicionaProfs()
{
professores.add("Jorge");
professores.add("Paulo");
professores.add("Silvio");
out.println("Foram adicionados automaticamente 3 professores");
out.println("==============================================");
}
//Adiciona à lista um professor com nome definido pelo utilizador
public void criarNovoProf(String nome)
{
professores.add(nome);
out.println ("Foi adicionado um professor com o nome "+nome);
out.println ("===========================================");
}
public void listarProfessores()
{
out.println("Lista de Professores");
for (String nome : professores)
out.println(nome);
out.println("========================================");
}
public void tamanhoDaLista()
{
int a = professores.size();
out.println("A lista tem "+a+" elementos");
out.println("==========================");
}
public void existe(String nome)
{
int i=0;
for (String profs : professores)
{
if (profs.contains(nome)==true)
{
i++;
}
}
if (i==0)
out.println("Não Existe");
if (i>0)
out.println("Foram encontradas "+i+" ocorrencias do nome "+nome);
out.println("=================================================");
}
public void apagarTudo()
{
professores.clear();
out.println("Todos os registos foram apagados");
}
public void apagaElemento(String nome)
{
professores.remove(nome);
}
public void verificarVazio()
{
if (professores.isEmpty()==true)
out.println("Está Vazio");
else if (professores.isEmpty()==false)
out.println("Não está vazio");
}
}

//Bom, espero que tenham gostado, dúvidas e questões nos comentários. Obrigado.