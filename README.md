# Aide-mémoire pour le langage Java
Ce projet contient un aide-mémoire pour le langage Java au format [Asciidoctor](https://asciidoctor.org/).
Il est disponible à l'adresse [https://hal91190.github.io/refcard-java/](https://hal91190.github.io/refcard-java/).
Il est accompagné d'un ensemble de codes sources illustrant les différents aspects du langage.
L'usage des exemples nécessite bien sûr l'installation préalable du [JDK](https://adoptopenjdk.net/).

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

L'aide-mémoire se trouve dans le répertoire ...

## Éxécuter l'application

## Générer l'aide-mémoire
L'aide-mémoire est généré dans le répertoire `build/docs/asciidoc/`.

```bash
$ ./gradlew asciidoctor
```
