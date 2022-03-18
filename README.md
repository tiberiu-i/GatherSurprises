# GatherSurprises
Un scurt proiect Java care implementeaza conceptele OOP Java (Abstractizare, Incapsulare, Mostenire, Polimorfism)

Aplicatia urmatoare are ca scop aprofundarea conceptelor de design a ierarhiei de clase, studiate pana in prezent. Concret, in cadrul exercitiului se urmareste punerea in practica a urmatoarelor notiuni:
1. reutilizarea functionalitatii prin diverse procedee, precum:
2. mostenire
3. compunere si agregare
4. ascunderea functionalitatii si a datelor prin incapsulare
5. implementarea de metode wrapper si utilizarea delegarii
6. continuarea dezvoltarii abilitatilor practice de design si proiectare a unei arhitecturi de clase, nivel mediu de complexitate
7. organizarea corecta a codului in functie de aplicabilitate, clase, metode
8. lucru cu obiecte de tipuri diferite dintr-o perspectiva comuna, folosind upcasting
9. proiectarea si utilizarea interfetelor in comunicarea dintre componente
10. familiarizarea cu conceptul de genericitate in dezvoltarea software

Scop final:
Scopul final este de a obtine un sistem generic capabil sa:

1. utilizeze mai multe tipuri de surprize (i.e. ce implementeaza o interfata comuna)
2. implementeze diversi algoritmi de stocare si daruire a surprizelor
3. foloseasca un mecanism puternic, aleator de generare a unui set (nou) de surprize

Considerand scopul final al aplicatiei dorim sa putem:

1. defini cu usurinta noi tipuri de dorinte, care pot fi usor integrate cu cele deja existente
2. crea noi algoritmi de gestiune a unei colectii de surprize, care ulterior sa poata inlocui sau extinde setul existent fara modificari majore in codul existent
3. lucra in mod comun cu orice tipuri de surprize
4. gestiona surprizele intr-un mod generic, indiferent de tipul (actual) de container
