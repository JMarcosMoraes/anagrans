
# Anagrans

## Primeira parte

### Gerador de anagrans

![img.png](img/img.png)

####  Write a Java program to solve the following problem:

>    You are tasked with creating a utility function for a
> text-processing application.
>     The function must generate all possible anagrams from a given group of distinct letters.
>      For  example, the input {a, b, c} should return the output: abc, acb, bac, bca, cab, cba.

**Additional Requirements:**

1. The program should accept any group of distinct letters as input and produce the correct result.

2. Optimize for readability and clarity.
3. Include basic validation (e.g., ensure the input is non-empty and contains only letters).
4. Write unit tests to validate your function with at least three different test cases, including edge cases (e.g., input with a single letter or empty input).
5. Document your code clearly, explaining the logic for generating anagrams.

## Segunda parte

### 1. Provide an example scenario where overriding the equals() method is necessary in Java.

>  Explain the key considerations when implementing this method, such as
> ensuring it    aligns with the hashCode() method. Include code
> examples if possible.



* Exemplo:  Usuario.java

**Pontos-chave ao implementar equals() e hashCode()**

1. Consistência entre equals() e hashCode() .
   *Se dois objetos são iguais segundo equals(), devem ter o mesmo hashCode().
   Isso é essencial para coleções como HashSet, HashMap, etc.*

2. Regras do contrato de equals():
- Reflexivo: x.equals(x) deve ser true
- Simétrico: x.equals(y) deve ser igual a y.equals(x)
- Transitivo: se x.equals(y) e y.equals(z), então x.equals(z)
- Consistente: múltiplas chamadas devem retornar o mesmo resultado
- Null-safe: x.equals(null) deve retornar false
- Evite erros comuns:
- Usar == para comparar objetos em vez de .equals()
- Esquecer de sobrescrever hashCode() ao sobrescrever equals()
- Não verificar null ou tipo da classe no equals()

### 2. Explain how you would use a design pattern to decouple your code from a third-party  library that might be replaced in the future.

> Describe the advantages and limitations of    your chosen approach,
> and provide a small code snippet illustrating its application.

Quando queremos desacoplar nosso código de uma biblioteca externa que pode ser substituída no futuro, um dos padrões mais eficazes é o **Adapter Pattern** (Padrão Adaptador). Ele permite que você crie uma camada intermediária entre sua aplicação e a biblioteca, tornando a substituição futura muito mais simples e segura.

**Por que usar o Adapter Pattern ?**

✅ Vantagens:

-   **Desacoplamento total**: seu código depende de uma interface, não da biblioteca.
-   **Facilidade de substituição**: trocar a biblioteca exige apenas criar um novo adaptador.
-   **Testabilidade**: você pode mockar a interface facilmente em testes.
-   **Organização**: separa a lógica de negócio da lógica de integração.

❌ Limitações:

-   **Sobrecarga de código**: exige criação de interfaces e classes extras.
-   **Manutenção duplicada**: se a biblioteca mudar, o adaptador precisa ser atualizado.
-   **Pode ocultar funcionalidades específicas** da biblioteca se não forem expostas pela interface.

📦 Exemplo prático: envio de e-mail

1. Interface comum da aplicação

        public interface EmailService {
             void sendEmail(String to, String subject, String body);
        }

2. Biblioteca externa (simulada)

       public class ExternalMailer {
       public void deliver(String recipient, String title, String content)  {
       // lógica de envio real
       }
       }

3. Adaptador que conecta a biblioteca à interface

       public class ExternalMailerAdapter implements EmailService { private
       final ExternalMailer mailer;
       
       public ExternalMailerAdapter(ExternalMailer mailer) {
       this.mailer = mailer; }
       
       @Override
       public void sendEmail(String to, String subject, String body) {
       mailer.deliver(to, subject, body);
       } }

4. Uso na aplicação

       public class NotificationService {
       private final EmailService emailService;
       public NotificationService(EmailService emailService) {
       this.emailService = emailService;
       }
       public void notifyUser(String email) {
       emailService.sendEmail(email, "Bem-vindo!", "Obrigado por se cadastrar.");
       } }
🔄 Substituindo a biblioteca

Se amanhã você quiser usar outra biblioteca, basta criar um novo adaptador que implemente `EmailService`. Nenhuma outra parte do sistema precisa mudar.

### 3. Describe your experience with Angular, including its core features and use cases.

> Provide an example of a practical application where you used Angular
> and include a code snippet  demonstrating a key feature, such as
> component communication, data binding, or  service integration.



### 4. Discuss the techniques you use to prevent SQL injection attacks in web applications.

> Provide examples of code showing secure implementations, such as using
> parameterized  queries or ORMs. Mention any additional measures you
> take to secure the database  layer.


### 5. Describe the steps you would take to diagnose and improve the performance of a batch  process that interacts with a database and an FTP server.

> Explain how you would identify  bottlenecks, optimize database
> queries, improve logic execution, and enhance file  transfer
> efficiency. Provide examples of tools or techniques you would use
> during the  analysis.



