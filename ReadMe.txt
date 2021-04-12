Membres du Groupe: 

Yacine HAMMAOUI
Marc-Vincent SEUANES PEREIRA
Elhadj THIAM

Ci-joint nos trois livrables en HTML, Java et ScriptShell.

Partie1: Java et ScriptShell
Nous avons fait un programme qui demande à l'utilisateur de rentrer les cotés d'un triangle et lui dit si ce triangle est Isocèle, équilatéral
ou scalène. 

En plus, si l'utilisateur saisi des nombres négatifs ou nuls, le programme lui indique qu'il a rentré des valeurs non prises en charge et lui demande de
resaisir les valeurs (positives et suppérieures à 0, pour le guider).


Partie2: HTML
En plus de ce qui est fait dans la partie 1, quand l'utilisateur entre une valeure négative, nulle ou un caractère, le programme lui indique l'erreur et lui demande d'indiquer les valeurs prises en charges.
Nous avons réussi à rediriger vers une nouvelle page les résultats correspondant à chaque type de triangle. Le texte est accompagné d'une illustration, ainsi qu'un lien pour revenir au
formulaire.


Nous avons testé nos 3 programmes. Il semble que celui en HTML/Javascript n'accepte que les nombres entiers positifs. Les programmes Java et Shell quand à eux retournent des erreurs quand
une des valeure saisie est une chaîne de caractères ou un flottant(tout ce qui n'est pas un integer à cause du scanner qui attend un int). Nous aurions pu gérer les exceptions avec des try catch en Java.