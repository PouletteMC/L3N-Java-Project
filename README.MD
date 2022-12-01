# L3N Java Project - Real Estate

This is a project for the L3N Java course at EFREI Paris.

![TeamCity build status](https://city.lostanddead.co.uk/app/rest/builds/buildType:id:Poulette_L3nJavaProject_Build/statusIcon.svg) ![TeamCity build status](https://city.lostanddead.co.uk/app/rest/builds/buildType:id:Poulette_L3nJavaProject_Test/statusIcon.svg)

## Initial setup

If you're using IntelliJ IDEA, you can import the project by opening the `pom.xml` file.

If nothing happens, open the "maven" tab on the right, right-click on the project and select "Download sources and documentation".

## Testing

This project uses JUnit 5. You can run the tests by right-clicking on the `src/test/java` folder and selecting "Run 'All Tests'" or by running the "test" script in the maven tab.

All the test are in the `src/test/java` folder.

## Building

You can build the project by running the "package" script in the maven tab. The output will be in the `target` folder.