## Aula 

1. Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.

```java
      double precoProduto = 7.50;
      int quantidade;
      
      System.out.println(String.format("O produto é R$ %.2f", precoProduto));
      System.out.println("digite a quantidade:");
      Scanner entrada = new Scanner(System.in);
      quantidade = entrada.nextInt();
      
      double total = precoProduto * quantidade;
      
      System.out.println(String.format("O total fica R$ %.2f",total));
```
