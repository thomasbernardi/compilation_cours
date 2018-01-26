##compilateur.lisp

Pour compiler un fichier on charge le fichier "copmilateur.lisp" et on utilise la fonction "comp-file" de la façon suivante:

```
(comp-file <src-path : string> <dest-path : string>)
```

##VM.lisp

```
(make-vm <vm-name> <size : int>)
```

Pour charger des grands fichiers d'assembleur il faut compiler la fonction ```load-instructions``` (pour profiter du récurrence terminal).

Puis, pour charger l'assembleur fait:
```
(load-file <vm-name : symbol> <src-path : string>)
```

###Démarrer une fonction
```
(call-function <vm-name : symbol> <function-name : symbol> <liste-de-params : liste>)
```
par exemple
```
(call-function 'toto 'fibo '(5))
```
##chargeur.lisp

Ce fichier sert à charger des fichiers de lisp pour que le compilateur compilé puisse marcher. ```(write-bytecode <object : object> <dest-path : string>)``` écrit l'objet ```<object : object>``` dans le fichier ```<dest-path : string>```. ```(load-lisp <src-path : string>)``` charge un fichier lisp. Donc, pour démarrer le compilateur compilé sur du code lisp, faites le suivant:
```
(write-bytecode (call-function <vm-name : symbol> 'compile-expressions (list (load-lisp <fichier-lisp : string>))) <dest-path : string>) 
```