# Escalonamento de Intervalos

O Problema

Um *intervalo* é um conjunto de números naturais consecutivos.  Um intervalo como  *{s,s+1,…,f−1,f}*  será denotado por  *(s,f)*. O primeiro número do par é o início do intervalo e o segundo é o término.  (As letras *s* e *f* lembram *start* e *finish* respectivamente.)

Se temos vários intervalos, numerados de 1 a n, o início de um intervalo *i* será denotado por *s<sub>i</sub>* e o término por *f<sub>i</sub>*.  Suporemos sempre que *s<sub>i</sub> ≤ f<sub>i</sub>*.

Um intervalo i é anterior a um intervalo j se  *f<sub>i</sub> < s<sub>j</sub>*.  Analogamente, i é posterior a j se  *s<sub>i</sub> > f<sub>j</sub>*.   Dois intervalos i e j são disjuntos se e somente se i é posterior a j ou anterior a j.   Uma coleção de intervalos é disjunta se os intervalos da coleção são disjuntos dois a dois.
