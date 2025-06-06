# Roteiro_Sala
Aluna: Ludmila Maria Pereira da Silva

Roteiro de sala:
1. Encontre os problemas e faça um relatório indicando problemas e soluções - OK
2. Corrija o código - ok
3. Apresente a versão corrigida - OK

Na classe ```DoublyLinkedList.java``` existem dois erros:
* Comparação errada no ```insertOrdered:```
  O ```>=``` imprime na ordem decrescente. Para corrigir, deve-se substituir por ```<=```

* printBackward nunca imprime:
  O primeiro loop vai chumbar o current como ```null```, dessa forma o segundo nunca vai executar. para corrigir, iterar até o último 'nó' ```(current.next == null)``` e só a partir disso iterar 'voltando'.


Na classe ```Node.java``` existe um erro:
* Ponteiro ```prev``` apontando para o próprio nó, isso não faz sentido. A correção deve usar ```this.prev = null;```

Na classe ```Main.java```:
* ```printBackward()``` é invocado mas não é printado. Para solucionar deve colocar um print ```System.out.print(list.printBackward());```

Na classe ```DoublyLinkedListTest.java```:
* Teste ```test_printForward_when``` sem validação (assertEquals). Para um teste ser útil, ele precisa fazer verificações na saída. A correção feita usa ```assertEquals("Lista (frente): 10 20 30 40\n", list.printForward());```