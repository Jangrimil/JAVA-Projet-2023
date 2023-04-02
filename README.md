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
Le but est d'attaquer le Basilic si on appartient à la maison Gryffondor on a un items et les autres ont un sort special appelée Acio qui inflige dégât de 35 hp à l'ennemie. j'ai créer deux combats séparement pour que le Gryffondor reçoit et les autres le sort. Dans le cas où les 2 personnages ont la même précision alors ennemie a l'avantage et a le choix d'infliger des dégâts à l'utilisateur ou d'avoir +10hp.

Chapitre 3:
Le but est de trouver le sort Expecto Patronus, pour cela j'ai fait en sorte qu'à chaque tour où l'utilisateur a la plus haute précision alors on affiche une lettre du sort pour qu'il puisse deviner. Pour cette fois nous avons 2 enemies dans le cas où les 2 personnages ont la même précision alors les ennmies a l'avantage et de manière aléatoire le 1er peut d'infliger des dégâts à l'utilisateur et le 2ème enemie a +10hp.

Chapitre 4 : 
Le but est de s'enfuir de Voldemort et Peter Pettigrow pour cela nous devons trouver le Porket. A chaque tour l'utilisateur a le choix entre Acio (qui permet de se rapproche de 25m du porket à chaque tour) et la potion. Si Voldemort a la plus haute précision alors il inflige -25 hp a l'utlisateur. Sinon Peter inflige un sort de -20hp à l'utilisateur récupère +10hp après le tour. 

Chapitre 5 : 
Le but est d'attaquer Dolores jusqu'à qu'on récupère le feu d'artifice dans l'inventaire pour pouvoir infliger une attaque de -50hp à Dolores.

Chapitre 6 : 
Le but est d'attaquer les Mangemorts mais les Serpentard ont le droit de s'allier avec les Mangemorts si il choisi ce cas de figure alors nous avons une battle entre le sorcier et Dumbledor, à chaque tour où le sorcier est plus précis il pousse du toit de 20m jusqu'à ce que Dumbledor tombe, ensuite il choisi entre "spell", "potion" ou "question spell learn" qui va poser une question une question aléatoire par rapport au sort utlisée dans les précèdents chapitre. Si sa réponse est bonne il inflige des dégats avec le sort répondu sinon il passe son tour. Dans le cas où les 2 personnages ont la même précision alors ennemie a l'avantage et a le choix d'infliger des dégâts à l'utilisateur ou d'avoir +10hp.

Pour les autres, vous attaquez les 2 Mangemorts et vous avez un nouveau sort appelée "Sectumsempra". Vous avez le choix sur qui vous voulez attaquer et lui infligez les dégats. 

Chapitre 7 :
Vous êtes face à Voldemort et Bellatrix Lestrange, votre but est de tuer Voldemort. Pour contrer l'attaque mortel de Voldemort vous devez utilisez Expelliarmus, vous ne pouvez pas l'utiliser dans le prochain tour si vous l'avez utiliser. Si le tour est pour Voldemort, l'utilisateur doit choisir un nommbre entre 1 à 6, s'il choisi 6 alors Voldemort utilise son ultime sort sinon il vous attaque avec 20 hp de dégat. Dans le cas où les 2 personnages ont la même précision alors l'utilisateur a l'avantage est récupère +50hp.

