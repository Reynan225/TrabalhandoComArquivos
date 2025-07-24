# README - Manipulação de Arquivos em Java

Este projeto exemplifica o uso básico das classes Java para leitura e escrita de arquivos de texto, com foco em CSV, usando streams de caracteres.

---

## Classes principais usadas

### FileWriter
- Stream para escrita de caracteres em arquivos.
- Cria ou recria o arquivo.
- Para criar/recriar:  
  `new FileWriter(path)`
- Para acrescentar no arquivo existente:  
  `new FileWriter(path, true)`
- Documentação oficial:  
  [https://docs.oracle.com/javase/10/docs/api/java/io/FileWriter.html](https://docs.oracle.com/javase/10/docs/api/java/io/FileWriter.html)

---

### BufferedWriter
- Envolve `FileWriter` para melhorar desempenho com buffer.
- Usado para escrita eficiente.
- Documentação oficial:  
  [https://docs.oracle.com/javase/10/docs/api/java/io/BufferedWriter.html](https://docs.oracle.com/javase/10/docs/api/java/io/BufferedWriter.html)

---

### FileReader
- Stream para leitura de caracteres a partir de arquivos.
- Documentação oficial:  
  [https://docs.oracle.com/javase/10/docs/api/java/io/FileReader.html](https://docs.oracle.com/javase/10/docs/api/java/io/FileReader.html)

---

### BufferedReader
- Envolve `FileReader` para melhorar desempenho com buffer.
- Usado para leitura eficiente linha a linha.
- Documentação oficial:  
  [https://docs.oracle.com/javase/10/docs/api/java/io/BufferedReader.html](https://docs.oracle.com/javase/10/docs/api/java/io/BufferedReader.html)  
- Diferença entre `BufferedReader` e `FileReader`:  
  [https://stackoverflow.com/questions/9648811/specific-difference-between-bufferedreader-and-filereader](https://stackoverflow.com/questions/9648811/specific-difference-between-bufferedreader-and-filereader)

---

### File
- Representação abstrata de um arquivo ou diretório.
- Usado para manipular caminhos, criar pastas, etc.
- Documentação oficial:  
  [https://docs.oracle.com/javase/10/docs/api/java/io/File.html](https://docs.oracle.com/javase/10/docs/api/java/io/File.html)

---

### Scanner
- Classe para leitura de texto a partir de diversas fontes, incluindo arquivos.
- Útil para ler dados formatados.
- Documentação oficial:  
  [https://docs.oracle.com/javase/10/docs/api/java/util/Scanner.html](https://docs.oracle.com/javase/10/docs/api/java/util/Scanner.html)

---

### IOException
- Exceção lançada para erros de entrada/saída.
- É necessário tratar (try-catch) ao trabalhar com arquivos.
- Documentação oficial:  
  [https://docs.oracle.com/javase/10/docs/api/java/io/IOException.html](https://docs.oracle.com/javase/10/docs/api/java/io/IOException.html)

---
