## Passo a passo

1) fazer build/gerar o arquivo .war do projeto

2) criar a imagem no Docker com

  `docker build -t natarajan/payara-example1 . `

3) Iniciar a imagem seguindo a orientação contida em <https://hub.docker.com/r/payara/server-web/>, ou seja, executando o comando

  `docker run -p 8080:8080 natarajan/payara-example1 bin/asadmin start-domain -v`

  a imagem criada com base no payara é iniciada e realiza um autodeploy do arquivo `.war` no domain1.
