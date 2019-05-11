
package singleton;

import java.util.ArrayList;
import pojo.Roupa;

public class CarrinhoDeRoupas {
    
  private static CarrinhoDeRoupas instance;
  
  private ArrayList<Roupa> listaRoupas = null;
          
  private CarrinhoDeRoupas(){  
      listaRoupas = new ArrayList<Roupa>();
     
  } 
  
  public static CarrinhoDeRoupas getInstance(){
      if (CarrinhoDeRoupas.instance == null){  
          CarrinhoDeRoupas.instance = new CarrinhoDeRoupas();
      }    
      return CarrinhoDeRoupas.instance;
  }
 
  public ArrayList<Roupa> getListRoupas(){
      return this.listaRoupas;
  }
  
  public void addRoupas(String descricao, String marca, String tamanho, String cor, int quantidade){
      listaRoupas.add(new  Roupa(descricao, marca, tamanho, cor, quantidade));
      
  }
    
}


