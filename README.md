# Escalonamento de Intervalos

O Problema

Um *intervalo* é um conjunto de números naturais consecutivos.  Um intervalo como  *{s,s+1,…,f−1,f}*  será denotado por  *(s,f)*. O primeiro número do par é o início do intervalo e o segundo é o término.  (As letras *s* e *f* lembram *start* e *finish* respectivamente.)

Se temos vários intervalos, numerados de 1 a n, o início de um intervalo *i* será denotado por *s<sub>i</sub>* e o término por *f<sub>i</sub>*.  Suporemos sempre que *s<sub>i</sub> ≤ f<sub>i</sub>*.

Um intervalo i é anterior a um intervalo j se  *f<sub>i</sub> < s<sub>j</sub>*.  Analogamente, i é posterior a j se  *s<sub>i</sub> > f<sub>j</sub>*.   Dois intervalos i e j são disjuntos se e somente se i é posterior a j ou anterior a j.   Uma coleção de intervalos é disjunta se os intervalos da coleção são disjuntos dois a dois.

## Problema do escalonamento de intervalos

Dada uma coleção S de intervalos, encontrar uma subcoleção disjunta máxima de S.

Uma subcoleção disjunta X de S é *máxima* se não existe outra maior.  Em outras palavras, se não existe subcoleção disjunta *X′* de *S* tal que *|X′| > |X|*.

Usaremos a abreviatura *SDM* para a expressão subcoleção disjunta máxima.  Nosso problema consiste, portanto, em encontrar uma *SDM* de uma coleção de intervalos dada.  Se os intervalos são numerados de 1 a n, uma *SDM* pode ser representada por um subconjunto de * *{1,2,…,n}*.

**Exemplo** 
A figura abaixo especifica uma coleção de intervalos e uma sdm da coleção.  A SDM é indicada pelos 1 do seu vetor característico x:

