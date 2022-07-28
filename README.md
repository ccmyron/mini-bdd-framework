# mini-bdd-framework &middot; [![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg?style=flat-square)](http://makeapullrequest.com)
> For learning purposes

A small project with the scope of learning BDD style of testing using cucumber and TestNG
## Developing

### Built With
* Java 11
* Maven 3.8.6

### Prerequisites
* Cucumber-TestNG 7.3.3
* Selenium 4.3.0
* A browser driver (ChromeDriver used in this project)

### Setting up Dev

```shell
git clone https://github.com/pelm3wka/mini-bdd-framework
cd mini-bdd-framework/
mvn clean install
```

### Building

```shell
cd /mini-bdd-framework
mvn test
```

The code above will launch the set of tests

## Configuration
The browser can be changed in the properties. Only Chrome is supported at the moment
