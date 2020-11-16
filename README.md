# Aide-mémoire pour le langage Java

![Build](https://github.com/hal91190/refcard-java/workflows/Java%20CI%20with%20Gradle/badge.svg)

Ce projet contient un aide-mémoire pour le langage Java au format [Asciidoctor](https://asciidoctor.org/).
Il est disponible à l'adresse [https://hal91190.github.io/refcard-java/](https://hal91190.github.io/refcard-java/).
Il est accompagné d'un ensemble de codes sources illustrant les différents aspects du langage.
L'usage des exemples nécessite bien sûr l'installation préalable du [JDK](https://adoptopenjdk.net/).

## Construire le projet
Le projet se compile en utilisant [gradle](https://gradle.org/).

### Générer l'aide-mémoire
L'aide-mémoire est généré dans le répertoire `build/docs/asciidoc/`.

```bash
$ ./gradlew asciidoctor
```

Sous Windows
```
> gradlew.bat asciidoctor
```

### Compiler les exemples et lancer les tests
Sous Linux
```bash
$ ./gradlew build
```

Sous Windows
```
> gradlew.bat build
```
