[hugo]: https://github.com/HugoCarvalho99
[hugo-pic]: https://github.com/HugoCarvalho99.png?size=120
[nelson]: https://github.com/nelsonmestevao
[nelson-pic]: https://github.com/nelsonmestevao.png?size=120
[pedro]: https://github.com/pedroribeiro22
[pedro-pic]: https://github.com/pedroribeiro22.png?size=120

# Java Project Template

> A Project Template for programs written in the Java programming language.

## :rocket: Getting Started

These instructions will get you a copy of the project up and running on your
local machine for development and testing purposes.

Start by filling out the environment variables defined in the `.env` file. Use
the `.env.sample` as a starting point.

```bash
bin/setup
```

After this, you must fill in the fields correctly and export them in your
environment. Checkout [direnv](https://direnv.net/) for your shell and
[EnvFile](https://github.com/Ashald/EnvFile) for IntelliJ.

### :inbox_tray: Prerequisites

The following software is required to be installed on your system:

- [Java SDK 11](https://openjdk.java.net/)
- [Maven](https://maven.apache.org/maven-features.html)

### :hammer: Development

Start a server instance.

```
bin/server
```

Start a client instance.

```
bin/client
```

Run the project.

```
bin/run
```

Run an interactive Java shell for quick testing.

```
bin/jshell
```

Build the project.

```
bin/build
```

Run the tests.

```
bin/test
```

Format the code accordingly to common [guide lines](https://github.com/google/google-java-format).

```
bin/format
```

Lint your code with _checkstyle_.

```
bin/lint
```

Generate the documentation.

```
bin/docs
```

Clean the repository.

```
bin/clean
```

### :whale: Docker

If you want to setup the required databases using docker containers you can
easily do it with [docker-compose](https://docs.docker.com/compose/install/).

Create and start the containers.

```
docker-compose up
```

Start the previously created containers.

```
docker-compose start
```

Stop the containers.

```
docker-compose stop
```

Destroy the containers created.

```
docker-compose down
```

### :package: Deployment

Deploy the application.

```
bin/deploy
```

### :hammer_and_wrench: Tools

The recommended Integrated Development Environment (IDE) is IntelliJ IDEA.

## :busts_in_silhouette: Team

| [![Hugo][hugo-pic]][hugo] | [![Nelson][nelson-pic]][nelson] | [![Pedro][pedro-pic]][pedro] |
| :-----------------------: | :-----------------------------: | :--------------------------: |
|   [Hugo Carvalho][hugo]   |    [Nelson Estevão][nelson]     |    [Pedro Ribeiro][pedro]    |
