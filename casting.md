# Casting 

## double pra int

```java
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a temperatura");
        double temperatura = entrada.nextDouble();

        //casting
        int celsius = (int) (temperatura);

        double formula = (temperatura * 1.8) + 32;

        int fahrenheit = (int) (formula);

        System.out.println(celsius + "°C"+ " = " + fahrenheit + "°F");
    }
}
```

## int pra double

```java

public class MinhaClasse {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int numero = entrada.nextInt();

        //casting
        double novoNumero = numero;

        System.out.println("Em int: " + numero+"\n"+ "Em double: "+ novoNumero);
    }
}
```
