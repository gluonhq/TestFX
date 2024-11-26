# TestFX 4

[![TestFX 4 CI](https://github.com/TestFX/TestFX/actions/workflows/entry.yml/badge.svg)](https://github.com/TestFX/TestFX/actions/workflows/entry.yml)
[![Maven Central](https://img.shields.io/maven-central/v/org.testfx/testfx-core.svg?label=maven&style=flat-square)](https://search.maven.org/#search|ga|1|org.testfx)
[![Chat on Gitter](https://img.shields.io/gitter/room/testfx/testfx-core.svg?style=flat-square)](https://gitter.im/TestFX/TestFX)

Simple and clean testing for JavaFX 23, or higher.

TestFX 4 requires Java version of 21, or higher.

## Documentation

* See the [Javadocs](https://testfx.github.io/TestFX/docs/javadoc/) for latest `master`.
* See the changelog [CHANGES.md](https://github.com/TestFX/TestFX/blob/master/CHANGES.md) for latest released version.

## Features

- A fluent and clean API.
- Flexible setup and cleanup of JavaFX test fixtures.
- Simple robots to simulate user interactions.
- Rich collection of matchers and assertions to verify expected states of JavaFX scene-graph nodes.

**Support for:**

- Java 21+
- JavaFX 23+
- Multiple testing frameworks ([JUnit 4](https://junit.org/junit4/), [JUnit 5](https://junit.org/junit5/), and [Spock](http://spockframework.org/)).
- [Hamcrest](http://hamcrest.org/) matchers or [AssertJ](https://assertj.github.io/doc/) assertions (or both!).
- Screenshots of failed tests.
- Headless testing using the experimental [Headless platform](https://github.com/openjdk/jfx-sandbox/tree/johanvos-headless).

## Gradle

To add a dependency on TestFX using Gradle, use the following:

```gradle
dependencies {
    testCompile "org.testfx:testfx-core:4.0.19-gluon-SNAPSHOT"
}
```
and include the repository:

```gradle
    repositories {
        maven() {
            url "https://nexus.gluonhq.com/nexus/content/repositories/public-snapshots"
        }
    }

```

### JavaFX
The easiest way to add the JavaFX libraries to your Gradle project is to use the [JavaFX Gradle Plugin](https://github.com/openjfx/javafx-gradle-plugin).

After following the README for the JavaFX Gradle Plugin you will end up with something like:

```gradle
plugins {
    id 'org.openjfx.javafxplugin' version '0.1.0'
}

javafx {
    version = '23.0.1'
    modules = [ 'javafx.controls', 'javafx.fxml' ]
}
```

### Test Framework
Next add a dependency corresponding to the testing framework you are using in your project. TestFX currently supports JUnit 4, JUnit 5, and Spock.

#### JUnit 4

```gradle
dependencies {
    testCompile "junit:junit:4.13.2"
    testCompile "org.testfx:testfx-junit:4.0.19-gluon-SNAPSHOT"
}
```

#### JUnit 5

```gradle
dependencies {
    testCompile 'org.junit.jupiter:junit-jupiter-api:5.11.3'
    testCompile "org.testfx:testfx-junit5:4.0.19-gluon-SNAPSHOT"
}
```

#### Spock

```gradle
dependencies {
    testCompile "org.spockframework:spock-core:2.4-M4-groovy-4.0"
    testCompile "org.testfx:testfx-spock:4.0.19-gluon-SNAPSHOT"
}
```

### Matcher/Assertions Library

Finally, you must add a dependency corresponding to the matcher/assertions libraries that you want to use with TestFX. TestFX currently supports Hamcrest matchers or AssertJ assertions.

#### Hamcrest
```gradle
testCompile group: 'org.hamcrest', name: 'hamcrest', version: '3.0'
```

#### AssertJ
```gradle
testCompile group: 'org.assertj', name: 'assertj-core', version: '3.26.3'
```

## Maven

To add a dependency on TestFX using Maven, use the following in your pom:

```xml
<dependency>
    <groupId>org.testfx</groupId>
    <artifactId>testfx-core</artifactId>
    <version>4.0.19-gluon-SNAPSHOT</version>
    <scope>test</scope>
</dependency>
```

and include the repository:

```xml
<repositories>
    <repository>
        <id>Gluon Snapshots</id>
        <url>https://nexus.gluonhq.com/nexus/content/repositories/public-snapshots/</url>
    </repository>
</repositories>
```

### JavaFX
The easiest way to add the JavaFX libraries to your Maven project is to use the [JavaFX Maven Plugin](https://github.com/openjfx/javafx-maven-plugin).

After following the README for the JavaFX Maven Plugin you will end up with something like:

```xml
<dependencies>
    <dependency>
        <groupId>org.openjfx</groupId>
        <artifactId>javafx-controls</artifactId>
        <version>23.0.1</version>
    </dependency>
</dependencies>

<plugins>
    <plugin>
        <groupId>org.openjfx</groupId>
        <artifactId>javafx-maven-plugin</artifactId>
        <version>0.0.8</version>
        <configuration>
            <mainClass>hellofx/org.openjfx.App</mainClass>
        </configuration>
    </plugin>
</plugins>
```

Have a look at [Maven Central's org.openjfx](https://mvnrepository.com/artifact/org.openjfx) entry for an overview of available modules.

### Test Framework
Next add a dependency corresponding to the testing framework you are using in your project. TestFX currently supports JUnit 4, JUnit 5, and Spock.

#### JUnit 4

```xml
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.2</version>
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>org.testfx</groupId>
    <artifactId>testfx-junit</artifactId>
    <version>4.0.19-gluon-SNAPSHOT</version>
    <scope>test</scope>
</dependency>
```

#### JUnit 5

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-api</artifactId>
    <version>5.11.3</version>
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>org.testfx</groupId>
    <artifactId>testfx-junit5</artifactId>
    <version>4.0.19-gluon-SNAPSHOT</version>
    <scope>test</scope>
</dependency>
```

#### Spock

```xml
<dependency>
    <groupId>org.spockframework</groupId>
    <artifactId>spock-core</artifactId>
    <version>2.4-M4-groovy-4.0</version>
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>org.testfx</groupId>
    <artifactId>testfx-spock</artifactId>
    <version>4.0.19-gluon-SNAPSHOT</version>
    <scope>test</scope>
</dependency>
```

### Matcher/Assertions Library
Finally, you must add a dependency corresponding to the matcher/assertions libraries that you want to use with TestFX. TestFX currently supports Hamcrest matchers or AssertJ assertions.

#### Hamcrest
```xml
<dependency>
    <groupId>org.hamcrest</groupId>
    <artifactId>hamcrest</artifactId>
    <version>3.0</version>
    <scope>test</scope>
</dependency>
```

#### AssertJ
```xml
<dependency>
    <groupId>org.assertj</groupId>
    <artifactId>assertj-core</artifactId>
    <version>3.26.3</version>
    <scope>test</scope>
</dependency>
```

## Headless Platform (Experimental)

### Install

Download the latest JavaFX SDK that includes the experimental headless platform from here:

- Linux AArch64 [SDK](https://download2.gluonhq.com/openjfx/forks/johan/headless/openjfx-24+872_headless_linux-aarch64_bin-sdk.zip)
- Linux x86_64 [SDK](https://download2.gluonhq.com/openjfx/forks/johan/headless/openjfx-24+871_headless_linux-x86_64_bin-sdk.zip)
- macOS AArch64 [SDK](https://download2.gluonhq.com/openjfx/forks/johan/headless/openjfx-24+874_headless_mac-aarch64_bin-sdk.zip)
- macOS x86_64 [SDK](https://download2.gluonhq.com/openjfx/forks/johan/headless/openjfx-24+873_headless_mac-x86_64_bin-sdk.zip)
- Windows x86_64 [SDK](https://download2.gluonhq.com/openjfx/forks/johan/headless/openjfx-24+875_headless_windows-x86_64_bin-sdk.zip)

Then extract the zip file to a path of your convenience, and set the following environmental variable:

```
export JAVAFX_HOME=your.path.to/javafx-sdk-24
```

### Run TestFX tests

With JDK 22+, you can run the set of tests included in TestFX in headless mode with:

```
export _JAVA_OPTIONS=-Dtestfx.headless=true
sh gradlew test
```

## Examples

### Hamcrest Matchers
TestFX brings along a couple of custom Hamcrest matchers in package `org.testfx.matcher.*`.

### AssertJ based Assertions
TestFX uses its own AssertJ based assertion implementation class: `org.testfx.assertions.api.Assertions`.

#### JUnit 4 with Hamcrest Matchers

```java
import org.junit.Test;
import org.testfx.api.FxAssert;
import org.testfx.framework.junit.ApplicationTest;
import org.testfx.matcher.control.LabeledMatchers;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ClickableButtonTest_JUnit4Hamcrest extends ApplicationTest {

    private Button button;

    /**
     * Will be called with {@code @Before} semantics, i. e. before each test method.
     */
    @Override
    public void start(Stage stage) {
        button = new Button("click me!");
        button.setOnAction(actionEvent -> button.setText("clicked!"));
        stage.setScene(new Scene(new StackPane(button), 100, 100));
        stage.show();
    }

    @Test
    public void should_contain_button_with_text() {
        FxAssert.verifyThat(".button", LabeledMatchers.hasText("click me!"));
    }

    @Test
    public void when_button_is_clicked_text_changes() {
        // when:
        clickOn(".button");

        // then:
        FxAssert.verifyThat(".button", LabeledMatchers.hasText("clicked!"));
    }
}
```

#### JUnit 4 with AssertJ based Assertions 

```java
import org.junit.Test;
import org.testfx.assertions.api.Assertions;
import org.testfx.framework.junit.ApplicationTest;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ClickableButtonTest_JUnit4AssertJ extends ApplicationTest {

    private Button button;

    /**
     * Will be called with {@code @Before} semantics, i. e. before each test method.
     */
    @Override
    public void start(Stage stage) {
        button = new Button("click me!");
        button.setOnAction(actionEvent -> button.setText("clicked!"));
        stage.setScene(new Scene(new StackPane(button), 100, 100));
        stage.show();
    }

    @Test
    public void should_contain_button_with_text() {
        Assertions.assertThat(button).hasText("click me!");
    }

    @Test
    public void when_button_is_clicked_text_changes() {
        // when:
        clickOn(".button");

        // then:
        Assertions.assertThat(button).hasText("clicked!");
    }
}
```

### JUnit 5 
TestFX uses [JUnit5's new extension mechanism](https://junit.org/junit5/docs/current/user-guide/#extensions) via `org.junit.jupiter.api.extension.ExtendWith`. By using this, implementors are not forced anymore to inherit from `ApplicationTest` and are free to choose their own super classes. 
  
It does also make use of [JUnit5's new dependency injection mechanism](https://junit.org/junit5/docs/current/user-guide/#writing-tests-dependency-injection). By using this, test methods have access to the `FxRobot` instance that must be used in order to execute actions within the UI.

##### JUnit 5 with Hamcrest Matchers

```java
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxAssert;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;
import org.testfx.matcher.control.LabeledMatchers;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

@ExtendWith(ApplicationExtension.class)
class ClickableButtonTest_JUnit5Hamcrest {

    private Button button;

    /**
     * Will be called with {@code @Before} semantics, i. e. before each test method.
     *
     * @param stage - Will be injected by the test runner.
     */
    @Start
    private void start(Stage stage) {
        button = new Button("click me!");
        button.setId("myButton");
        button.setOnAction(actionEvent -> button.setText("clicked!"));
        stage.setScene(new Scene(new StackPane(button), 100, 100));
        stage.show();
    }

    /**
     * @param robot - Will be injected by the test runner.
     */
    @Test
    void should_contain_button_with_text(FxRobot robot) {
        FxAssert.verifyThat(button, LabeledMatchers.hasText("click me!"));
        // or (lookup by css id):
        FxAssert.verifyThat("#myButton", LabeledMatchers.hasText("click me!"));
        // or (lookup by css class):
        FxAssert.verifyThat(".button", LabeledMatchers.hasText("click me!"));
    }

    /**
     * @param robot - Will be injected by the test runner.
     */
    @Test
    void when_button_is_clicked_text_changes(FxRobot robot) {
        // when:
        robot.clickOn(".button");

        // then:
        FxAssert.verifyThat(button, LabeledMatchers.hasText("clicked!"));
        // or (lookup by css id):
        FxAssert.verifyThat("#myButton", LabeledMatchers.hasText("clicked!"));
        // or (lookup by css class):
        FxAssert.verifyThat(".button", LabeledMatchers.hasText("clicked!"));
    }
}
```

#### JUnit 5 with AssertJ Assertions

```java
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.assertions.api.Assertions;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

@ExtendWith(ApplicationExtension.class)
class ClickableButtonTest_JUnit5AssertJ {

    private Button button;

    /**
     * Will be called with {@code @Before} semantics, i. e. before each test method.
     *
     * @param stage - Will be injected by the test runner.
     */
    @Start
    private void start(Stage stage) {
        button = new Button("click me!");
        button.setId("myButton");
        button.setOnAction(actionEvent -> button.setText("clicked!"));
        stage.setScene(new Scene(new StackPane(button), 100, 100));
        stage.show();
    }

    /**
     * @param robot - Will be injected by the test runner.
     */
    @Test
    void should_contain_button_with_text(FxRobot robot) {
        Assertions.assertThat(button).hasText("click me!");
        // or (lookup by css id):
        Assertions.assertThat(robot.lookup("#myButton").queryAs(Button.class)).hasText("click me!");
        // or (lookup by css class):
        Assertions.assertThat(robot.lookup(".button").queryAs(Button.class)).hasText("click me!");
        // or (query specific type):
        Assertions.assertThat(robot.lookup(".button").queryButton()).hasText("click me!");
    }

    /**
     * @param robot - Will be injected by the test runner.
     */
    @Test
    void when_button_is_clicked_text_changes(FxRobot robot) {
        // when:
        robot.clickOn(".button");

        // then:
        Assertions.assertThat(button).hasText("clicked!");
        // or (lookup by css id):
        Assertions.assertThat(robot.lookup("#myButton").queryAs(Button.class)).hasText("clicked!");
        // or (lookup by css class):
        Assertions.assertThat(robot.lookup(".button").queryAs(Button.class)).hasText("clicked!");
        // or (query specific type)
        Assertions.assertThat(robot.lookup(".button").queryButton()).hasText("clicked!");
    }
}
```

### Spock with Hamcrest Matchers

```java
import org.testfx.framework.spock.ApplicationSpec;

class ClickableButtonSpec extends ApplicationSpec {
    @Override
    void init() throws Exception {
        FxToolkit.registerStage { new Stage() }
    }

    @Override
    void start(Stage stage) {
        Button button = new Button('click me!')
        button.setOnAction { button.setText('clicked!') }
        stage.setScene(new Scene(new StackPane(button), 100, 100))
        stage.show()
    }

    @Override
    void stop() throws Exception {
        FxToolkit.hideStage()
    }

    def "should contain button"() {
        expect:
        verifyThat('.button', hasText('click me!'))
    }

    def "should click on button"() {
        when:
        clickOn(".button")

        then:
        verifyThat('.button', hasText('clicked!'))
    }
}
```

## Chat

Head over to our [gitter chat](https://gitter.im/TestFX/TestFX) for discussion and questions.

Thanks to all of the [contributors of TestFX](https://github.com/TestFX/TestFX/graphs/contributors)!
