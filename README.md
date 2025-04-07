# rabbitmq-demo

## Subindo RabbitMQ com Docker

Execute o comando:

`
docker run -d --hostname my-rabbit --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3-management
`

## Acessando o RabbitMQ:
Acesse o painel em: `http://localhost:15672`

Usuário: `guest`
Senha: `guest`

O que esperar ao rodar

### Ao rodar o projeto:

O CommandLineRunner vai enviar uma mensagem.

O consumidor vai recebê-la e imprimir no console.