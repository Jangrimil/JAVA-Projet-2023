# JAVA-Projet-2023
A1 ISEP

CALIMOUTTOUPOULLE Cynthia

Vous trouverez le jeu Harry Potter la dernière version sur ce main, intitulée Main2,
Ci dessous vous trouverez les classes créer et leur fonction : 

///EXPLICATION DES CLASSES
- Wizzard : cette classe contient les caractéristiques que notre utilisateur (sorcier) a, au tout debut nous avons les variables utilisée pour créer le constructeur Wizzard comme son nom, sa maison, sa vie, son niveau... Il y a aussi les différents sort utilisé comme en général le sort normal appelée "spell" et les items et sorts spéciaux comme "GryffindorSword", "Expelliarmus" etc... j'ai aussi mis des methode getters et setters pour pouvoir récupérer mes variables xp et maxhp.
- Enemy : cette classe contient ses caractéristiques comme l'attaque, son nom et son niveau. Il y a aussi la classe DeathEaters qui a les mêmes que l'ennemie car je n'arrivais pas à différencier les deux lorsque l'héros devait combattre 2 ennemies.
- Boss : la classe a les mêmes caractéristiques que la classe ennemie 
- Pet : liste d'animaux à choisir par l'utilisateur
- Core : liste de plusieurs coeurs d'une baguette

///EXPLICATION DU MAIN 
Le main permet de lancer le code : 
      - 1ère étape du code : L'utilisateur initialiase le caractère du sorcier avec : son nom, sa baguette (la longueur et le coeur), un quizz pour definir sa maison et il choisi un animal.
      - 2ème étape les combats : 
J'ai utilisée 2 méthodes à chaque niveau : Chap --> permet de vérifier si le joueur a gagné ou perdu le niveau et s'il a gagné il accède au prochain niveau
                                           Combat ---> programmation des combats avec plusieurs round. Les tours sont définis en fonction de la précision des personnages. Le personnage avec la précision la plus élevée attaque en premier. Si deux personnages ont la même précision, celui qui attaque en premier est choisi au hasard. Une fois que l'utilisateur à son tour, il a le choix entre 3 actions : 
                                           - "spell" inflige 10 dégat à l'adversaire, 
                                           - "potion" : ajoute 10 de pv à l'utilisateur  
                                           - le "special spell" (souvent avec le nom du sort dirrectement) inflige un dégat spécifique à l'adversaire. 

Si le tour appartient à l'adversaire alors qui attaque à son tour l'utilisateur. Dans le cas où les 2 personnages ont la même précision alors ennemie à souvent l'avantage. 

//EXPLICATION DES CHAPITRES

Chapitre 1 : 
Le but est d'attaquer le Troll pour pouvoir passer au prochain niveau, l'attaque spécial est "Wigardium Leviosa" qui inflige un dégât de 30 hp à l'adversaire. Dans le cas où les 2 personnages ont la même précision alors ennemie a l'avantage et inflige des dégâts à l'utilisateur.

Chapitre 2 :
Le but est d'attaquer le Basilic si on appartient à la maison Gryffondor on a un items et les autres ont un sort special appelée Acio qui inflige dégât de 35 hp à l'ennemie. j'ai créer deux combats séparement pour que le Gryffondor reçoit et les autres le sort. Dans le cas où les 2 personnages ont la même précision alors ennemie a l'avantage a le choix d'infliger des dégâts à l'utilisateur ou d'avoir +10hp.


Chapitre 4 : 
Le but est de s'enfuir de Voldemort
