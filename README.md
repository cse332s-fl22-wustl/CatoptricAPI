## Usage
It should be used with appropriate hardware set up, for detail: see Professor Chamberlain
To Start the server:
    ```md
    cd CatoptricServer
    ./gradlew run
    ```
    
## CodeDirectory
The following files contain the code you should be concerned with:
1. Python Script that control the motor movement: 
    ```md
    CatoptricController.py
    ```
2. Micronaut server controller that handles http request and calls Python script:
    ```md
    /CatoptricServer/src/main/java/codes/recursive/controller/DefaultController.java
    ```
