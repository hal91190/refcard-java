# Template pour un projet Java
Ce projet propose un modèle pour démarrer des projets Java.
Son usage nécessite bien sûr l'installation préalable du [JDK](http://www.oracle.com/technetwork/java/javase/downloads/index.html).

## Compiler le projet
Le projet se compile en utilisant [gradle](https://gradle.org/).

Sous Linux
```bash
$ ./gradlew build
```

Sous Windows
```
> gradlew.bat build
```

## Éxécuter l'application
1. Décompresser l'une des archives zip ou tar se trouvant dans le répertoire ``build/distributions``.
1. Lancer l'application.

Sous Linux
```bash
$ tpl-java/bin/tpl-java
```

Sous Windows
```
> tpl-java/bin/tpl-java.bat
```

## Créer un projet à partir du template
1. Changer le nom du projet dans
  * ``settings.gradle.kts``
  * ``build.gradle.kts`` (nom du package de la classe principale)
  * ``src/main/java/fr/uvsq/poo/tpljava`` (nom du package)
  * ``src/main/java/fr/uvsq/poo/tpljava/Application.java`` (nom du package)
  * ``src/test/java/fr/uvsq/poo/tpljava`` (nom du package)
  * ``src/test/java/fr/uvsq/poo/tpljava/ApplicationTest.java`` (nom du package)
1. Modifier le README.md

