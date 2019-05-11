
package singleton;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       
        CarrinhoDeRoupas carrinho = CarrinhoDeRoupas.getInstance();
        
        int op;
        boolean verificarRoupa = false;
        
        do {
        System.out.println("\n-------------------- MENU DE ROUPAS -------------------------");
       
        System.out.println("\n 1 - Adicionar uma Roupa ao Carrinho ");
        System.out.println("\n 2 - Verificar a Quantidade de Roupas Disponível");
        System.out.println("\n 3 - Consultar todas as Roupas do Carrinho ");
        System.out.println("\n 4 - Consultar uma Roupa ");
        System.out.println("\n 5 - Limpar Carrinho ");
        System.out.println("\n 6 - Sair do Menu ");
        
        Scanner input = new Scanner(System.in);
        System.out.print("\n\nDigite um número para escolher uma opção do MENU: ");
        op = input.nextInt();
    
        switch(op){
            
            case 1:   
                
                System.out.println("\n-------------------- ADICIONAR UMA ROUPA -------------------------\n");
                
                System.out.print("\nDigite uma Descrição: ");
                String descricao = input.next();

                System.out.print("\nDigite uma Marca: ");
                String marca = input.next();
                
                System.out.print("\nDigite um Tamanho: ");
                String tamanho = input.next();
                
                System.out.print("\nDigite uma Cor: ");
                String cor = input.next();
                
                System.out.print("\nDigite a Quantidade: ");
                int quantidade = input.nextInt();
                
                carrinho.addRoupas(descricao, marca, tamanho, cor, quantidade);

              break;
             
            case 2:
                
                System.out.println("\n-------------------- CARRINHO DE ROUPAS -------------------------\n");
                
                Scanner scanVerficar = new Scanner(System.in);
                
                System.out.print("\nQuantidade de Roupas Disponível: "+carrinho.getListRoupas().size());
                
                System.out.print("\n\nPressione ENTER para continuar.");
                scanVerficar.nextLine();
                break;
                
            case 3:     
                
                System.out.println("\n-------------------- CARRINHO DE ROUPAS -------------------------\n");
                
                System.out.print("\nQuantidade de Roupas Disponível: "+carrinho.getListRoupas().size()+ "\n");
                
                Scanner scanCarrinho = new Scanner(System.in);
                
                if (carrinho.getListRoupas().isEmpty()){
                    System.out.print("\nSeu carrinho está Vazio!! \nPressione ENTER para continuar. ");
                     scanCarrinho.nextLine();    
                }
                else {
                for (int i = 0; i < carrinho.getListRoupas().size(); i++){
                     System.out.println("\n----------------------------------------------------------------");
                     System.out.println("Descrição: "+carrinho.getListRoupas().get(i).getDescricao());
                     System.out.println("Marca: "+carrinho.getListRoupas().get(i).getMarca());
                     System.out.println("Tamanho: "+carrinho.getListRoupas().get(i).getTamanho());
                     System.out.println("Cor: "+carrinho.getListRoupas().get(i).getCor());
                     System.out.println("Quantidade Disponível: "+carrinho.getListRoupas().get(i).getQuantidade());  
                }
                
                    System.out.print("\nPressione ENTER para continuar. ");
                    scanCarrinho.nextLine();

                }
                break;
                
            case 4:
                
                System.out.println("\n-------------------- CONSULTAR UMA ROUPA -------------------------\n");
                Scanner scanConsulta = new Scanner(System.in);
 
                if (!carrinho.getListRoupas().isEmpty()) {
                        System.out.print("\nDigite uma descrição da roupa para CONSULTAR:  ");
                        String pesq = input.next();
                    for (int i = 0; i < carrinho.getListRoupas().size(); i++) {
                         while (carrinho.getListRoupas().get(i).getDescricao().equalsIgnoreCase(pesq)){
                                System.out.println("\n----------------------------------------------------------------");
                                System.out.println("Descrição: "+ carrinho.getListRoupas().get(i).getDescricao());
                                System.out.println("Marca: "+carrinho.getListRoupas().get(i).getMarca());
                                System.out.println("Tamanho: "+carrinho.getListRoupas().get(i).getTamanho());
                                System.out.println("Cor: "+carrinho.getListRoupas().get(i).getCor());
                                System.out.println("Quantidade Disponível: "+carrinho.getListRoupas().get(i).getQuantidade());    
                                
                                verificarRoupa = carrinho.getListRoupas().get(i).getDescricao().equals(pesq);    
                                break;
                            }
                         
                        if (!verificarRoupa){
                            System.out.print("\nRoupa não Encontrada!! ");  
                            break;
                        }  
 
                    }
                } else {
                    System.out.print("\nSeu Carrinho está Vazio !! ");
                           scanConsulta.nextLine();   
                           break;
                }
  
                    System.out.print("\nPressione ENTER para continuar. ");
                           scanConsulta.nextLine();   
                           break;

            case 5:
                
                Scanner scanRemove = new Scanner(System.in);
                
                if (carrinho.getListRoupas().isEmpty()){
                    System.out.print("\nSeu Carrinho está Vazio !! ");
                    scanRemove.nextLine();   
                    break;
                } 
            
                System.out.print("\nVocê realmente deseja limpar o carrinho? (sim) ou (nao) ");
                String resp = input.next(); 
                
                if(resp.equals("sim")){
                
                    for (int i = 0; i < carrinho.getListRoupas().size(); i++) {
                            while(!carrinho.getListRoupas().isEmpty()) {        
                                   carrinho.getListRoupas().remove(i);
                            }
                         }  
                        break;
                    } else {
                            break;  
                        }
            
            case 6:
                   
                System.out.print("\nVocê realmente deseja sair do MENU? (sim) ou (nao) ");
                String sair = input.next(); 
                
                if(sair.equals("sim")){
                    
                    return;            
                } else {
                    
                    break;
                }
            
            default: 
                
                 Scanner scanInvalido = new Scanner(System.in);
                 System.out.print("\nNúmero Inválido!. Pressione ENTER para voltar ao MENU");
                 scanInvalido.nextLine();
                 break;
            }
        
        } while(op != 7);
   
    }
}
    